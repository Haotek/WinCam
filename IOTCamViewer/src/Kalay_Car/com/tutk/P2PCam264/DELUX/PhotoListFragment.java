package com.tutk.P2PCam264.DELUX;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.BinaryHttpResponseHandler;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import com.tutk.IOTC.AVIOCTRLDEFs;
import com.tutk.IOTC.Camera;
import com.tutk.IOTC.IOTCAPIs;
import com.tutk.IOTC.IRegisterIOTCListener;
import com.tutk.IOTC.LargeDownloadListener;
import com.tutk.IOTC.SingelDownloadListener;
import com.tutk.IOTC.st_LanSearchInfo2;
import com.tutk.Kalay.general.R;
import com.tutk.Logger.Glog;
import com.tutk.P2PCam264.MyCamera;
import com.tutk.customized.command.CustomCommand;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import cz.msebera.android.httpclient.Header;

/**
 * Created by James Huang on 2015/4/3.
 */
//public class PhotoListFragment extends Fragment implements IRegisterIOTCListener, SingelDownloadListener, LargeDownloadListener {
public class PhotoListFragment extends Fragment implements IRegisterIOTCListener {
    private static final String TAG = PhotoListFragment.class.getSimpleName();
    private final int STORAGE_NUM = 50;

    private MyCamera mCamera;
    private Context mContext;
    private Activity mActivity;
    private Timer timer = new Timer();
    private TimerTask timerTask;
    private GridView gvPhoto;
    private PhotoAdapter adapter;

    private ProgressBar progressLoading;
    private RelativeLayout layoutNull;
    private RelativeLayout layoutBottom;
    private ImageButton btnRemove;
    private ImageButton btnDownload;

    public static List<PhotoInfo> photo_list = new ArrayList<PhotoInfo>();
    private List<Bitmap> thumb_list = new ArrayList<Bitmap>();
    private String mDevUUID;
    private String mDevUID;
    private String mDevNickName;
    private String mViewAcc;
    private String mViewPwd;
    private String temp_path;
    private int mCameraChannel;
    private int mThumbBuffNum = STORAGE_NUM;
    private boolean mIsSearchingPhoto = false;
    private boolean mIsNotify = false;
    private boolean mIsEdit = false;

    private String mIP;

    private boolean mLocal=false;

    private clickMode mClickMode = clickMode.Download;

    private enum clickMode {
        Download, Remove;
    }

    public PhotoListFragment(Context context) {
        mContext = context;
        mActivity = (Activity) context;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Bundle bundle = mActivity.getIntent().getExtras();
        mDevUUID = bundle.getString("dev_uuid");
        mDevUID = bundle.getString("dev_uid");
        mDevNickName = bundle.getString("dev_nickname");
        mCameraChannel = bundle.getInt("camera_channel");
        mViewAcc = bundle.getString("view_acc");
        mViewPwd = bundle.getString("view_pwd");
        st_LanSearchInfo2[] searchSSID = IOTCAPIs.IOTC_Lan_Search2(new int[20], 100);
        if (searchSSID != null && searchSSID.length > 0) {
            for (st_LanSearchInfo2 info : searchSSID) {
                if (new String(info.UID).equalsIgnoreCase(mDevUID)) {
                    mIP = new String(info.IP);
                    Log.d(TAG,"Show IP : "+mIP);
                    mLocal=true;
                    break;
                }
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.remote_photo_activity, container, false);





        progressLoading = (ProgressBar) view.findViewById(R.id.progress);
        layoutNull = (RelativeLayout) view.findViewById(R.id.layoutNull);
        layoutBottom = (RelativeLayout) view.findViewById(R.id.layoutBottom);
        gvPhoto = (GridView) view.findViewById(R.id.gridview);
        btnRemove = (ImageButton) view.findViewById(R.id.btnRemove);
        btnDownload = (ImageButton) view.findViewById(R.id.btnDownload);

		/* register recvIOCtrl listener */
        for (MyCamera camera : MultiViewActivity.CameraList) {

            if (mDevUUID.equalsIgnoreCase(camera.getUUID())) {
                mCamera = camera;

                mCamera.registerIOTCListener(this);
                mCamera.resetEventCount();
                break;
            }
        }

        if (mCamera != null) {
//            mCamera.initSingleDownloadManager(mCameraChannel, this);
        }

        if (mLocal){
            initPhotoList();
        }else {
            Toast.makeText(mContext, getString(R.string.tips_cloud_mode), Toast.LENGTH_SHORT).show();
            if (progressLoading !=null){
                progressLoading.setVisibility(View.GONE);
            }
        }
        adapter = new PhotoAdapter(getActivity(), photo_list);
        gvPhoto.setAdapter(adapter);

        btnRemove.setOnClickListener(mClickListener);
        btnDownload.setOnClickListener(mClickListener);

        return view;
    }

//    @Override
//    public void getDownload(byte[] buf, int size) {
////        int thumbNo = 0;
////
////        if (size > 0) {
////
////            int stringLength = 0;
////            for (int i = 0; i < 72; i++) {
////                if (buf[i] == 0) {
////                    stringLength = i;
////                    break;
////                }
////            }
////
////            String path = new String(buf, 0, stringLength);
////            for (int i = 0; i < photo_list.size(); i++) {
//////                Log.d(TAG, " IOTC path : " + photo_list.get(i).path);
//////                Log.d(TAG, " path : " + path);
////                if (photo_list.get(i).path.equals(path)) {
////                    thumbNo = i;
////                    break;
////                }
////            }
////
////            int i = 0;
////            for (String photoPath : mCamera.getSingleDownloadList()) {
////                if (path.equals(photoPath)) {
////                    mCamera.getSingleDownloadList().remove(i);
////                    break;
////                }
////                i++;
////            }
////
////
////            Bitmap bmp = BitmapFactory.decodeByteArray(buf, 72, (buf.length - 72));
////            if (thumbNo >= 0) {
////                thumb_list.set(thumbNo, bmp);
////                getActivity().runOnUiThread(new Runnable() {
////                    @Override
////                    public void run() {
////                        adapter.notifyDataSetChanged();
////                        mIsNotify = true;
////                        handler.postDelayed(new Runnable() {
////                            @Override
////                            public void run() {
////                                mIsNotify = false;
////                            }
////                        }, 500);
////                    }
////                });
////            }
////        }
//
//
//    }

    @Override
    public void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if (mCamera != null) {
            mCamera.unregisterIOTCListener(this);
//            mCamera.unregisterSingleDownload();
//            mCamera.unregisterLargeDownload(this);
        }
    }

    private void initPhotoList() {
        if (mCamera != null) {
            long stopTime = System.currentTimeMillis();

            mCamera.sendIOCtrl(Camera.DEFAULT_AV_CHANNEL, AVIOCTRLDEFs.IOTYPE_USER_IPCAM_LISTFILE_REQ, AVIOCTRLDEFs.SMsgAVIoctrlListFileReq
                    .parseConent(mCameraChannel, 0, stopTime, (byte) 0, (byte) 0, AVIOCTRLDEFs.AVIOCTRL_PHOTO_FILE));
            mIsSearchingPhoto = true;
            photo_list.clear();
            thumb_list.clear();
        }
    }

    public class PhotoInfo {

        public static final int EVENT_UNREADED = 0;
        public static final int EVENT_READED = 1;
        public static final int EVENT_NORECORD = 2;

        public int EventType;
        public AVIOCTRLDEFs.STimeDay EventTime;
        public int EventStatus;
        public String path;
        public boolean mHasFile = false;
        public boolean mIsSelect = false;

        public PhotoInfo(int eventType, AVIOCTRLDEFs.STimeDay eventTime, int eventStatus, String photoPath, boolean hasFile) {

            EventType = eventType;
            EventTime = eventTime;
            EventStatus = eventStatus;
            path = photoPath;
            mHasFile = hasFile;
        }

        public void setHasFile(boolean hasFile) {
            mHasFile = hasFile;
        }

        public void selectItem(boolean select) {
            mIsSelect = select;
        }
    }

    private class PhotoAdapter extends BaseAdapter {

        private LayoutInflater mInflater;
        private Context mContext;
        private List<PhotoInfo> FILES = new ArrayList<PhotoInfo>();
        private Picasso sPicasso;

        private Picasso getPicasso(Context context) {
            if (sPicasso == null) {
                sPicasso = Picasso.with(context);
            }
            return sPicasso;
        }

        public PhotoAdapter(Context c, List<PhotoInfo> files) {
            this.mInflater = LayoutInflater.from(c);
            mContext = c;
            FILES = files;
        }

        @Override
        public int getCount() {

            return FILES.size();
        }

        @Override
        public Object getItem(int position) {
            return FILES.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            convertView = new RelativeLayout(mContext);
            final ViewHolder holder = new ViewHolder();

            View view = mInflater.inflate(R.layout.gridview_photo_item, null);
//			view.setPadding(8, 8, 8, 8);
            ((ViewGroup) convertView).addView(view);

            if (holder != null) {
                final ViewHolder f_holder = holder;
                holder.thumb = (ImageView) convertView.findViewById(R.id.video_image);
                holder.imgDownload = (ImageView) convertView.findViewById(R.id.imgDownload);
                holder.layoutCheck = (RelativeLayout) convertView.findViewById(R.id.video_image_check);
               final String path = "http://"+mIP+FILES.get(position).path;
                Log.d(TAG, " Show on Item Click replace path : " + path);

                getPicasso(convertView.getContext()).load(path).resize(1080, 1920).onlyScaleDown().into(holder.thumb);
                holder.thumb.setTag(path);
                holder.thumb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String path = (String) holder.thumb.getTag();
                        String[] out = path.split("PHOTO");
                        final String copyfile = Environment.getExternalStorageDirectory() + "/" + out[1].replace("\\", "");
//                        Target target = new Target() {
//                            @Override
//                            public void onPrepareLoad(Drawable arg0) {
//                                return;
//                            }
//
//                            @Override
//                            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom arg1) {
//                                try {
//                                    File file = null;
//                                    file = new File(copyfile);
//                                    file.createNewFile();
//                                    FileOutputStream ostream = new FileOutputStream(file);
//                                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, ostream);
//                                    ostream.close();
//                                } catch (Exception e) {
//                                    e.printStackTrace();
//                                }
//                            }
//
//                            @Override
//                            public void onBitmapFailed(Drawable arg0) {
//                                return;
//                            }
//                        };
//                        getPicasso(holder.thumb.getContext()).load(path).into(target);
                        final AsyncHttpClient client = new AsyncHttpClient();
                        String[] allowedTypes = new String[]{"image/jpeg"};
                        client.get(path, new BinaryHttpResponseHandler(allowedTypes) {
                            @Override
                            public void onSuccess(int statusCode, Header[] headers, byte[] imageData) {
                                Log.d(TAG, "onSuccess");

                                OutputStream f = null;
                                try {
                                    f = new FileOutputStream(new File(copyfile));
                                    f.write(imageData);
                                    f.close();
                                    Log.d(TAG, "file close");
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }

                            @Override
                            public void onFailure(int statusCode, Header[] headers, byte[] imageData, Throwable error) {
                                Log.d(TAG, "onFailure statusCode : " + statusCode + "__" + error);
                            }

                        });

                    }
                });
//                if (thumb_list.get(position) != null) {
//                    Drawable drawable = new BitmapDrawable(thumb_list.get(position));
//                    holder.thumb.setBackground(drawable);
//                } else {
//                    holder.thumb.setBackgroundResource(R.color.video_bg);
//                }

//                holder.thumb.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        if (!mIsEdit) {
//                            Intent intent = new Intent(getActivity(), ViewRemotePhotoActivity.class);
//                            Bundle bundle = new Bundle();
//                            bundle.putString("dev_uuid", mDevUUID);
//                            bundle.putInt("pos", position);
//                            bundle.putInt("channel", mCameraChannel);
//                            intent.putExtras(bundle);
//                            startActivity(intent);
//                            getActivity().overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
//                        } else {
//                            if (photo_list.get(position).mIsSelect) {
//                                f_holder.layoutCheck.setVisibility(View.GONE);
//                                photo_list.get(position).selectItem(false);
//                            } else {
//                                f_holder.layoutCheck.setVisibility(View.VISIBLE);
//                                photo_list.get(position).selectItem(true);
//                            }
//                        }
//                    }
//                });

                int thumb_num_min = mThumbBuffNum - STORAGE_NUM;
                if (position > mThumbBuffNum) {
                    if (thumb_list.get(thumb_num_min) != null) {
                        thumb_list.get(thumb_num_min).recycle();
                        thumb_list.set(thumb_num_min, null);
                    }
                    mThumbBuffNum = position;
                } else if (position < thumb_num_min) {
                    if (thumb_list.get(position + STORAGE_NUM) != null) {
                        thumb_list.get(position + STORAGE_NUM).recycle();
                        thumb_list.set(position + STORAGE_NUM, null);
                    }
                    mThumbBuffNum = position + STORAGE_NUM;
                }

                if (!mIsNotify && thumb_list.get(position) == null) {
//                    if (timerTask != null) {
//                        timerTask.cancel();
//                    }
//                    timerTask = new TimerTask() {
//                        @Override
//                        public void run() {
//                            int endPos = mThumbBuffNum - STORAGE_NUM;
//
//                            mCamera.getSingleDownloadList().clear();
//                            mCamera.RemoveAllSingleDownloadReqList();
//                            if (endPos <= 0) {
//                                for (int i = 0; i < photo_list.size(); i++) {
//                                    getThumbnail(FILES.get(i).path);
//                                }
//                            } else {
//                                for (int i = endPos; i < mThumbBuffNum; i++) {
//                                    getThumbnail(FILES.get(i).path);
//                                }
//                            }
//                        }
//                    };
//                    timer.schedule(timerTask, 2000);
                }

                if (photo_list.get(position).mHasFile) {
                    holder.imgDownload.setVisibility(View.VISIBLE);
                } else {
                    holder.imgDownload.setVisibility(View.GONE);
                }

                if (photo_list.get(position).mIsSelect) {
                    holder.layoutCheck.setVisibility(View.VISIBLE);
                } else {
                    holder.layoutCheck.setVisibility(View.GONE);
                }
            }

            return convertView;
        }


        public final class ViewHolder {
            public ImageView thumb;
            public ImageView imgDownload;
            public RelativeLayout layoutCheck;

        }
    }

    private void getThumbnail(String path) {
        if (mCamera != null && temp_path != path) {
//            mCamera.getSingleDownloadList().add(path);
//            mCamera.EnqueueSingleDownloadReqList(path);
//            mCamera.StartSingleDownload();
        }
        temp_path = path;
    }

    public void showHideBar() {
        if (mIsEdit) {
            if (((RemoteFileActivity) getActivity()).isOnFocus(RemoteFileActivity.MyMode.PHOTO)) {
                Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.bottombar_slide_hide);
                layoutBottom.startAnimation(anim);
            }
            layoutBottom.setVisibility(View.GONE);
            mIsEdit = false;
            refreshSelect();
            adapter.notifyDataSetChanged();
        } else {
            Animation anim = AnimationUtils.loadAnimation(getActivity(), R.anim.bottombar_slide_show);
            layoutBottom.startAnimation(anim);
            layoutBottom.setVisibility(View.VISIBLE);
            mIsEdit = true;
        }
    }

    private void refreshSelect() {
        for (int i = 0; i < photo_list.size(); i++) {
            photo_list.get(i).selectItem(false);
        }
    }

    private View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            boolean check = false;
            for (int i = 0; i < photo_list.size(); i++) {
                if (photo_list.get(i).mIsSelect) {
                    check = true;
                    break;
                }
            }

            if (check) {
                switch (v.getId()) {
                    case R.id.btnRemove:
                        mClickMode = clickMode.Remove;

                        Custom_OkCancle_Dialog dlg = new Custom_OkCancle_Dialog(getActivity(), getText(R.string.dlgAreYouSureToDeleteThisSnapshot)
                                .toString());
                        dlg.setCanceledOnTouchOutside(false);
                        Window window = dlg.getWindow();
                        window.setWindowAnimations(R.style.setting_dailog_animstyle);
                        dlg.show();
                        break;

                    case R.id.btnDownload:
                        mClickMode = clickMode.Download;

                        dlg = new Custom_OkCancle_Dialog(getActivity(), getText(R.string.tips_download_photo).toString());
                        dlg.setCanceledOnTouchOutside(false);
                        window = dlg.getWindow();
                        window.setWindowAnimations(R.style.setting_dailog_animstyle);
                        dlg.show();
                        break;
                }
            }
        }
    };

    public void DialogOK() {
        switch (mClickMode) {
            case Download:
                for (int i = 0; i < photo_list.size(); i++) {
                    if (photo_list.get(i).mIsSelect && !photo_list.get(i).mHasFile) {

                        String[] filter = photo_list.get(i).path.split("\\\\");
                        int path_end = filter.length;
                        File rootFolder = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download/");
                        if (!rootFolder.exists()) {
                            try {
                                rootFolder.mkdir();
                            } catch (SecurityException se) {
                            }
                        }
                        File appFolder = new File(rootFolder.getAbsolutePath() + "/KalayCar/");
                        if (!appFolder.exists()) {
                            try {
                                appFolder.mkdir();
                            } catch (SecurityException se) {
                            }
                        }

                        String store_path = appFolder.getAbsolutePath() + "/" + filter[path_end - 1];

//                        mCamera.initLargeDownloadManager(mCameraChannel);
//                        mCamera.EnqueueLargeDownloaReqList(photo_list.get(i).path, store_path);
//                        mCamera.StartMultiLargeDownload(PhotoListFragment.this);
                    }
                }

                showHideBar();
                ((RemoteFileActivity) getActivity()).cancleEdit();
                break;

            case Remove:
                for (int i = 0; i < photo_list.size(); i++) {
                    if (photo_list.get(i).mIsSelect) {
                        String req = "custom=1&cmd=4003&str=" + photo_list.get(i).path;
                        mCamera.sendIOCtrl(Camera.DEFAULT_AV_CHANNEL, CustomCommand.IOTYPE_USER_WIFICMD_REQ, CustomCommand.SMsgAVIoctrlWifiCmdReq
                                .parseContent(mCameraChannel, 0, 0, 4003, 1, 0, req.length(), req));

                        photo_list.remove(i);
                        i--;
                    }
                }

                adapter.notifyDataSetChanged();
                showHideBar();
                ((RemoteFileActivity) getActivity()).cancleEdit();
                break;
        }
    }

    @Override
    public void receiveFrameData(Camera camera, int avChannel, Bitmap bmp) {

    }

    @Override
    public void receiveFrameDataForMediaCodec(Camera camera, int avChannel, byte[] buf, int length, int pFrmNo, byte[] pFrmInfoBuf, boolean
            isIframe, int codecId) {

    }

    @Override
    public void receiveFrameInfo(Camera camera, int avChannel, long bitRate, int frameRate, int onlineNm, int frameCount, int incompleteFrameCount) {

    }

    @Override
    public void receiveSessionInfo(Camera camera, int resultCode) {
        if (mCamera == camera) {
            Bundle bundle = new Bundle();
            Message msg = handler.obtainMessage();
            msg.what = resultCode;
            msg.setData(bundle);
            handler.sendMessage(msg);
        }
    }

    @Override
    public void receiveChannelInfo(Camera camera, int avChannel, int resultCode) {
        if (mCamera == camera) {
            Bundle bundle = new Bundle();
            bundle.putInt("sessionChannel", avChannel);

            Message msg = handler.obtainMessage();
            msg.what = resultCode;
            msg.setData(bundle);
            handler.sendMessage(msg);
        }
    }

    @Override
    public void receiveIOCtrlData(Camera camera, int avChannel, int avIOCtrlMsgType, byte[] data) {

        if (mCamera == camera) {
            Bundle bundle = new Bundle();
            bundle.putInt("sessionChannel", avChannel);
            bundle.putByteArray("data", data);

            Message msg = new Message();
            msg.what = avIOCtrlMsgType;
            msg.setData(bundle);
            handler.sendMessage(msg);
//            handler.post(new Runnable() {
//                @Override
//                public void run() {
//                    Toast.makeText(mContext, "get Tutk  req Data ", Toast.LENGTH_SHORT).show();
//                }
//            });
        }
    }

//    @Override
//    public void getDownload(byte[] buf, int size, boolean start, boolean end) {
//
//    }
//
//    @Override
//    public void getFinish(String path) {
//        for (int i = 0; i < photo_list.size(); i++) {
//            if (path.equals(photo_list.get(i).path)) {
//                photo_list.get(i).setHasFile(true);
//
//                getActivity().runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        adapter.notifyDataSetChanged();
//                    }
//                });
//                break;
//            }
//        }
//    }

    private Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {

            Bundle bundle = msg.getData();
            byte[] data = bundle.getByteArray("data");
            int sessionChannel = bundle.getInt("sessionChannel");
            boolean mClientStart = false;

            switch (msg.what) {

                case Camera.CONNECTION_STATE_CONNECTING:
                    break;

                case AVIOCTRLDEFs.IOTYPE_USER_IPCAM_LISTFILE_RESP:

                    if (data.length >= 12 && mIsSearchingPhoto) {

                        // int idx = data[8];
                        int end = data[9];
                        int cnt = data[10];
                        byte type = data[11];

                        if (cnt > 0 && type == AVIOCTRLDEFs.AVIOCTRL_PHOTO_FILE) {
//                            Toast.makeText(mContext, "get Tutk  PHOTO_FILE ", Toast.LENGTH_SHORT).show();
                            int pos = 12;
                            int size = AVIOCTRLDEFs.SAvFile.getTotalSize();

                            for (int i = 0; i < cnt; i++) {

                                byte[] t = new byte[8];
                                System.arraycopy(data, i * size + pos, t, 0, 8);
                                AVIOCTRLDEFs.STimeDay time = new AVIOCTRLDEFs.STimeDay(t);

                                byte event = data[i * size + pos + 8];
                                byte status = data[i * size + pos + 9];
//                                type = data[i * size + pos + 10];
                                byte length = data[i * size + pos + 11];
                                String path = new String(data, i * size + pos + 12, length);
//                                Toast.makeText(mContext, path, Toast.LENGTH_SHORT).show();
                                boolean hasFile = false;
                                String[] filter = path.split("\\\\");
                                int path_end = filter.length;
                                File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download/KalayCar/" +
                                        filter[path_end - 1]);
                                if (file.exists()) {
                                    hasFile = true;
                                } else {
                                    hasFile = false;
                                }

                                photo_list.add(new PhotoInfo(event, time, status, path, hasFile));
                                Log.d(TAG, "add photo list path : " + path);
                                thumb_list.add(null);
                            }

                            progressLoading.setVisibility(View.GONE);
                            gvPhoto.setVisibility(View.VISIBLE);
                            adapter.notifyDataSetChanged();
                        }

                        if (end == 1 && type == AVIOCTRLDEFs.AVIOCTRL_PHOTO_FILE) {
                            mIsSearchingPhoto = false;
                            if (photo_list.size() == 0) {
                                progressLoading.setVisibility(View.GONE);
                                layoutNull.setVisibility(View.VISIBLE);
                            } else {
                                ((RemoteFileActivity) getActivity()).ListFinished(RemoteFileActivity.MyMode.PHOTO);
                            }
                        }
                    }

                    break;
            }
        }
    };
}
