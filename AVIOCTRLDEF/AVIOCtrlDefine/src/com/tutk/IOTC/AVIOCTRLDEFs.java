package com.tutk.IOTC;

import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;


public class AVIOCTRLDEFs {

    /* AVAPIs IOCTRL Message Type */
    public static final int IOTYPE_USER_IPCAM_START = 0x01FF;
    public static final int IOTYPE_USER_IPCAM_STOP = 0x02FF;

    public static final int IOTYPE_USER_IPCAM_AUDIOSTART = 0x0300;
    public static final int IOTYPE_USER_IPCAM_AUDIOSTOP = 0x0301;

    public static final int IOTYPE_USER_IPCAM_SPEAKERSTART = 0x0350;
    public static final int IOTYPE_USER_IPCAM_SPEAKERSTOP = 0x0351;

    public static final int IOTYPE_USER_IPCAM_SETSTREAMCTRL_REQ = 0x0320;
    public static final int IOTYPE_USER_IPCAM_SETSTREAMCTRL_RESP = 0x0321;
    public static final int IOTYPE_USER_IPCAM_GETSTREAMCTRL_REQ = 0x0322;
    public static final int IOTYPE_USER_IPCAM_GETSTREAMCTRL_RESP = 0x0323;

    public static final int IOTYPE_USER_IPCAM_SETMOTIONDETECT_REQ = 0x0324;
    public static final int IOTYPE_USER_IPCAM_SETMOTIONDETECT_RESP = 0x0325;
    public static final int IOTYPE_USER_IPCAM_GETMOTIONDETECT_REQ = 0x0326;
    public static final int IOTYPE_USER_IPCAM_GETMOTIONDETECT_RESP = 0x0327;

    public static final int IOTYPE_USER_IPCAM_GETSUPPORTSTREAM_REQ = 0x0328;
    public static final int IOTYPE_USER_IPCAM_GETSUPPORTSTREAM_RESP = 0x0329;

    public static final int IOTYPE_USER_IPCAM_GETAUDIOOUTFORMAT_REQ = 0x032A;
    public static final int IOTYPE_USER_IPCAM_GETAUDIOOUTFORMAT_RESP = 0x032B;

    public static final int IOTYPE_USER_IPCAM_CHECKSUPPORTMESSAGETYPE_REQ = 0x032C;
    public static final int IOTYPE_USER_IPCAM_CHECKSUPPORTMESSAGETYPE_RESP = 0x032D;

    public static final int IOTYPE_USER_IPCAM_DEVINFO_REQ = 0x0330;
    public static final int IOTYPE_USER_IPCAM_DEVINFO_RESP = 0x0331;

    public static final int IOTYPE_USER_IPCAM_SETPASSWORD_REQ = 0x0332;
    public static final int IOTYPE_USER_IPCAM_SETPASSWORD_RESP = 0x0333;

    public static final int IOTYPE_USER_IPCAM_LISTWIFIAP_REQ = 0x0340;
    public static final int IOTYPE_USER_IPCAM_LISTWIFIAP_RESP = 0x0341;
    public static final int IOTYPE_USER_IPCAM_SETWIFI_REQ = 0x0342;
    public static final int IOTYPE_USER_IPCAM_SETWIFI_RESP = 0x0343;
    public static final int IOTYPE_USER_IPCAM_GETWIFI_REQ = 0x0344;
    public static final int IOTYPE_USER_IPCAM_GETWIFI_RESP = 0x0345;
    public static final int IOTYPE_USER_IPCAM_SETWIFI_REQ_2 = 0x0346;
    public static final int IOTYPE_USER_IPCAM_GETWIFI_RESP_2 = 0x0347;

    public static final int IOTYPE_USER_IPCAM_SETRECORD_REQ = 0x0310;
    public static final int IOTYPE_USER_IPCAM_SETRECORD_RESP = 0x0311;
    public static final int IOTYPE_USER_IPCAM_GETRECORD_REQ = 0x0312;
    public static final int IOTYPE_USER_IPCAM_GETRECORD_RESP = 0x0313;

    public static final int IOTYPE_USER_IPCAM_SETRCD_DURATION_REQ = 0x0314;
    public static final int IOTYPE_USER_IPCAM_SETRCD_DURATION_RESP = 0x0315;
    public static final int IOTYPE_USER_IPCAM_GETRCD_DURATION_REQ = 0x0316;
    public static final int IOTYPE_USER_IPCAM_GETRCD_DURATION_RESP = 0x0317;

    public static final int IOTYPE_USER_IPCAM_LISTEVENT_REQ = 0x0318;
    public static final int IOTYPE_USER_IPCAM_LISTEVENT_RESP = 0x0319;
    public static final int IOTYPE_USER_IPCAM_LISTFILE_REQ = 0x031C;
    public static final int IOTYPE_USER_IPCAM_LISTFILE_RESP = 0x031D;

    public static final int IOTYPE_USER_IPCAM_RECORD_PLAYCONTROL = 0x031A;
    public static final int IOTYPE_USER_IPCAM_RECORD_PLAYCONTROL_RESP = 0x031B;

    public static final int IOTYPE_USER_IPCAM_GET_EVENTCONFIG_REQ = 0x0400;
    public static final int IOTYPE_USER_IPCAM_GET_EVENTCONFIG_RESP = 0x0401;
    public static final int IOTYPE_USER_IPCAM_SET_EVENTCONFIG_REQ = 0x0402;
    public static final int IOTYPE_USER_IPCAM_SET_EVENTCONFIG_RESP = 0x0403;

    public static final int IOTYPE_USER_IPCAM_SET_ENVIRONMENT_REQ = 0x0360;
    public static final int IOTYPE_USER_IPCAM_SET_ENVIRONMENT_RESP = 0x0361;
    public static final int IOTYPE_USER_IPCAM_GET_ENVIRONMENT_REQ = 0x0362;
    public static final int IOTYPE_USER_IPCAM_GET_ENVIRONMENT_RESP = 0x0363;

    public static final int IOTYPE_USER_IPCAM_SET_VIDEOMODE_REQ = 0x0370;
    public static final int IOTYPE_USER_IPCAM_SET_VIDEOMODE_RESP = 0x0371;
    public static final int IOTYPE_USER_IPCAM_GET_VIDEOMODE_REQ = 0x0372;
    public static final int IOTYPE_USER_IPCAM_GET_VIDEOMODE_RESP = 0x0373;

    public static final int IOTYPE_USER_IPCAM_FORMATEXTSTORAGE_REQ = 0x380;
    public static final int IOTYPE_USER_IPCAM_FORMATEXTSTORAGE_RESP = 0x381;

    public static final int IOTYPE_USER_IPCAM_PTZ_COMMAND = 0x1001;

    public static final int IOTYPE_USER_IPCAM_EVENT_REPORT = 0x1FFF;

    public static final int IOTYPE_USER_IPCAM_RECEIVE_FIRST_IFRAME = 0x1002; // Send from client,
    // used to talk to
    // device that

    public static final int IOTYPE_USER_IPCAM_GET_FLOWINFO_REQ = 0x0390;
    public static final int IOTYPE_USER_IPCAM_GET_FLOWINFO_RESP = 0x0391;
    public static final int IOTYPE_USER_IPCAM_CURRENT_FLOWINFO = 0x0392;

    public static final int IOTYPE_USER_IPCAM_GET_TIMEZONE_REQ = 0x3A0;
    public static final int IOTYPE_USER_IPCAM_GET_TIMEZONE_RESP = 0x3A1;
    public static final int IOTYPE_USER_IPCAM_SET_TIMEZONE_REQ = 0x3B0;
    public static final int IOTYPE_USER_IPCAM_SET_TIMEZONE_RESP = 0x3B1;

    // dropbox section
    public static final int IOTYPE_USER_IPCAM_GET_SAVE_DROPBOX_REQ = 0x500;
    public static final int IOTYPE_USER_IPCAM_GET_SAVE_DROPBOX_RESP = 0x501;
    public static final int IOTYPE_USER_IPCAM_SET_SAVE_DROPBOX_REQ = 0x502;
    public static final int IOTYPE_USER_IPCAM_SET_SAVE_DROPBOX_RESP = 0x503;

    /* AVAPIs IOCTRL Event Type */
    public static final int AVIOCTRL_EVENT_ALL = 0x00;
    public static final int AVIOCTRL_EVENT_MOTIONDECT = 0x01;
    public static final int AVIOCTRL_EVENT_VIDEOLOST = 0x02;
    public static final int AVIOCTRL_EVENT_IOALARM = 0x03;
    public static final int AVIOCTRL_EVENT_MOTIONPASS = 0x04;
    public static final int AVIOCTRL_EVENT_VIDEORESUME = 0x05;
    public static final int AVIOCTRL_EVENT_IOALARMPASS = 0x06;
    public static final int AVIOCTRL_EVENT_MOVIE = 0x07;
    public static final int AVIOCTRL_EVENT_TIME_LAPSE = 0x08;
    public static final int AVIOCTRL_EVENT_EMERGENCY = 0x09;
    public static final int AVIOCTRL_EVENT_EXPT_REBOOT = 0x10;
    public static final int AVIOCTRL_EVENT_SDFAULT = 0x11;
	public static final int AVIOCTRL_EVENT_FULLTIME_RECORDING = 0x12;
	
    /* AVAPIs IOCTRL Play Record Command */
    public static final int AVIOCTRL_RECORD_PLAY_PAUSE = 0x00;
    public static final int AVIOCTRL_RECORD_PLAY_STOP = 0x01;
    public static final int AVIOCTRL_RECORD_PLAY_STEPFORWARD = 0x02;
    public static final int AVIOCTRL_RECORD_PLAY_STEPBACKWARD = 0x03;
    public static final int AVIOCTRL_RECORD_PLAY_FORWARD = 0x04;
    public static final int AVIOCTRL_RECORD_PLAY_BACKWARD = 0x05;
    public static final int AVIOCTRL_RECORD_PLAY_SEEKTIME = 0x06;
    public static final int AVIOCTRL_RECORD_PLAY_END = 0x07;
    public static final int AVIOCTRL_RECORD_PLAY_START = 0x10;

    // AVIOCTRL PTZ Command Value
    public static final int AVIOCTRL_PTZ_STOP = 0;
    public static final int AVIOCTRL_PTZ_UP = 1;
    public static final int AVIOCTRL_PTZ_DOWN = 2;
    public static final int AVIOCTRL_PTZ_LEFT = 3;
    public static final int AVIOCTRL_PTZ_LEFT_UP = 4;
    public static final int AVIOCTRL_PTZ_LEFT_DOWN = 5;
    public static final int AVIOCTRL_PTZ_RIGHT = 6;
    public static final int AVIOCTRL_PTZ_RIGHT_UP = 7;
    public static final int AVIOCTRL_PTZ_RIGHT_DOWN = 8;
    public static final int AVIOCTRL_PTZ_AUTO = 9;
    public static final int AVIOCTRL_PTZ_SET_POINT = 10;
    public static final int AVIOCTRL_PTZ_CLEAR_POINT = 11;
    public static final int AVIOCTRL_PTZ_GOTO_POINT = 12;
    public static final int AVIOCTRL_PTZ_SET_MODE_START = 13;
    public static final int AVIOCTRL_PTZ_SET_MODE_STOP = 14;
    public static final int AVIOCTRL_PTZ_MODE_RUN = 15;
    public static final int AVIOCTRL_PTZ_MENU_OPEN = 16;
    public static final int AVIOCTRL_PTZ_MENU_EXIT = 17;
    public static final int AVIOCTRL_PTZ_MENU_ENTER = 18;
    public static final int AVIOCTRL_PTZ_FLIP = 19;
    public static final int AVIOCTRL_PTZ_START = 20;

    public static final int AVIOCTRL_LENS_APERTURE_OPEN = 21;
    public static final int AVIOCTRL_LENS_APERTURE_CLOSE = 22;
    public static final int AVIOCTRL_LENS_ZOOM_IN = 23;
    public static final int AVIOCTRL_LENS_ZOOM_OUT = 24;
    public static final int AVIOCTRL_LENS_FOCAL_NEAR = 25;
    public static final int AVIOCTRL_LENS_FOCAL_FAR = 26;

    public static final int AVIOCTRL_AUTO_PAN_SPEED = 27;
    public static final int AVIOCTRL_AUTO_PAN_LIMIT = 28;
    public static final int AVIOCTRL_AUTO_PAN_START = 29;

    public static final int AVIOCTRL_PATTERN_START = 30;
    public static final int AVIOCTRL_PATTERN_STOP = 31;
    public static final int AVIOCTRL_PATTERN_RUN = 32;

    public static final int AVIOCTRL_SET_AUX = 33;
    public static final int AVIOCTRL_CLEAR_AUX = 34;
    public static final int AVIOCTRL_MOTOR_RESET_POSITION = 35;

    /* AVAPIs IOCTRL Quality Type */
    public static final int AVIOCTRL_QUALITY_UNKNOWN = 0x00;
    public static final int AVIOCTRL_QUALITY_MAX = 0x01;
    public static final int AVIOCTRL_QUALITY_HIGH = 0x02;
    public static final int AVIOCTRL_QUALITY_MIDDLE = 0x03;
    public static final int AVIOCTRL_QUALITY_LOW = 0x04;
    public static final int AVIOCTRL_QUALITY_MIN = 0x05;

    /* AVAPIs IOCTRL WiFi Mode */
    public static final int AVIOTC_WIFIAPMODE_ADHOC = 0x00;
    public static final int AVIOTC_WIFIAPMODE_MANAGED = 0x01;

    /* AVAPIs IOCTRL WiFi Enc Type */
    public static final int AVIOTC_WIFIAPENC_INVALID = 0x00;
    public static final int AVIOTC_WIFIAPENC_NONE = 0x01;
    public static final int AVIOTC_WIFIAPENC_WEP = 0x02;
    public static final int AVIOTC_WIFIAPENC_WPA_TKIP = 0x03;
    public static final int AVIOTC_WIFIAPENC_WPA_AES = 0x04;
    public static final int AVIOTC_WIFIAPENC_WPA2_TKIP = 0x05;
    public static final int AVIOTC_WIFIAPENC_WPA2_AES = 0x06;
    public static final int AVIOTC_WIFIAPENC_WPA_PSK_TKIP = 0x07;
    public static final int AVIOTC_WIFIAPENC_WPA_PSK_AES = 0x08;
    public static final int AVIOTC_WIFIAPENC_WPA2_PSK_TKIP = 0x09;
    public static final int AVIOTC_WIFIAPENC_WPA2_PSK_AES = 0x0A;

    /* AVAPIs IOCTRL Recording Type */
    public static final int AVIOTC_RECORDTYPE_OFF = 0x00;
    public static final int AVIOTC_RECORDTYPE_FULLTIME = 0x01;
    public static final int AVIOTC_RECORDTYPE_ALAM = 0x02;
    public static final int AVIOTC_RECORDTYPE_MANUAL = 0x03;

    public static final int AVIOCTRL_ENVIRONMENT_INDOOR_50HZ = 0x00;
    public static final int AVIOCTRL_ENVIRONMENT_INDOOR_60HZ = 0x01;
    public static final int AVIOCTRL_ENVIRONMENT_OUTDOOR = 0x02;
    public static final int AVIOCTRL_ENVIRONMENT_NIGHT = 0x03;

    /* AVIOCTRL VIDEO MODE */
    public static final int AVIOCTRL_VIDEOMODE_NORMAL = 0x00;
    public static final int AVIOCTRL_VIDEOMODE_FLIP = 0x01;
    public static final int AVIOCTRL_VIDEOMODE_MIRROR = 0x02;
    public static final int AVIOCTRL_VIDEOMODE_FLIP_MIRROR = 0x03;

    /* AVIOCTRL FILE TYPE */
    public static final byte  AVIOCTRL_VIDEO_FILE = 0;
    public static final byte  AVIOCTRL_PHOTO_FILE = 1;

    /* AVIOCTRL Battery State */
    public static final int BATTERY_FULL = 0;
    public static final int BATTERY_MED = 1;
    public static final int BATTERY_LOW = 2;
    public static final int BATTERY_EMPTY = 3;
    public static final int BATTERY_EXHAUSTED = 4;
    public static final int BATTERY_CHARGE = 5;

    /* AVIOCTRL Time Lapse Interval */
    public static final int TIME_LAPSE_1SEC = 1;
    public static final int TIME_LAPSE_5SEC = 2;
    public static final int TIME_LAPSE_10SEC = 3;
    public static final int TIME_LAPSE_30SEC = 4;
    public static final int TIME_LAPSE_1MIN = 5;
    public static final int TIME_LAPSE_5MIN = 6;
    public static final int TIME_LAPSE_10MIN = 7;
    public static final int TIME_LAPSE_30MIN = 8;
    public static final int TIME_LAPSE_1HR = 9;
    public static final int TIME_LAPSE_2HR = 10;
    public static final int TIME_LAPSE_3HR = 11;
    public static final int TIME_LAPSE_1DAY = 12;

    /* AVIOCTRL VIDEO MODE */
    public static final int IOTYPE_USER_SETAMBZOOMSET_REQ = 0xFF001002;
    public static final int IOTYPE_USER_SETAMBZOOMSET_RESP = 0xFF001003;
    public static final int IOTYPE_USER_SETAMBPTEX_REQ = 0xFF001000;
    public static final int IOTYPE_USER_SETAMBPTEX_RESP = 0xFF001001;

    /* AVIOCTRL Preset settings */
    public static final int IOTYPE_PRESET_SETPRESET_REQ = 0x440;
    public static final int IOTYPE_PRESET_SETPRESET_RESP = 0x441;
    public static final int IOTYPE_PRESET_GETPRESET_REQ = 0x442;
    public static final int IOTYPE_PRESET_GETPRESET_RESP = 0x443;

    /* AVIOCTRL Cruise Mode */
    public static final int IOTYPE_CRUISEMODE_CRUISE_START = 0x0600;
    public static final int IOTYPE_CRUISEMODE_CRUISE_STOP = 0x0601;
    public static final byte AVIOCTRL_CRUISEMODE_VERTICAL = 0x00;
    public static final byte AVIOCTRL_CRUISEMODE_HORIZONTAL = 0x01;

    /* AVIOCTRL Brightness Settings */
    public static final int IOTYPE_BRIGHT_GETBRIGHT_REQ = 0x602;
    public static final int IOTYPE_BRIGHT_GETBRIGHT_RESP = 0x603;
    public static final int IOTYPE_BRIGHT_SETBRIGHT_REQ = 0x604;
    public static final int IOTYPE_BRIGHT_SETBRIGHT_RESP = 0x605;
    public static final byte AVIOCTRL_BRIGHT_MAX = 0x01;
    public static final byte AVIOCTRL_BRIGHT_HIGH = 0x02;
    public static final byte AVIOCTRL_BRIGHT_MIDDLE = 0x03;
    public static final byte AVIOCTRL_BRIGHT_LOW = 0x04;
    public static final byte AVIOCTRL_BRIGHT_MIN = 0x05;

    /* AVIOCTRL Contrast Settings */
    public static final int IOTYPE_CONTRAST_GETCONTRAST_REQ = 0x606;
    public static final int IOTYPE_CONTRAST_GETCONTRAST_RESP = 0x607;
    public static final int IOTYPE_CONTRAST_SETCONTRAST_REQ = 0x608;
    public static final int IOTYPE_CONTRAST_SETCONTRAST_RESP = 0x609;
    public static final byte AVIOCTRL_CONTRAST_MAX = 0x01;
    public static final byte AVIOCTRL_CONTRAST_HIGH = 0x02;
    public static final byte AVIOCTRL_CONTRAST_MIDDLE = 0x03;
    public static final byte AVIOCTRL_CONTRAST_LOW = 0x04;
    public static final byte AVIOCTRL_CONTRASTT_MIN = 0x05;

    /* AVIOCTRL Independent Event Settings */
    public static final int IOTYPE_USER_IPCAM_GETGUARD_REQ = 0x420;
    public static final int IOTYPE_USER_IPCAM_GETGUARD_RESP = 0x421;
    public static final int IOTYPE_USER_IPCAM_SETGUARD_REQ = 0x422;
    public static final int IOTYPE_USER_IPCAM_SETGUARD_RESP = 0x423;

    /* AVIOCTRL FTP Settings */
    public static final int IOTYPE_USER_IPCAM_SET_FTP_REQ = 0x055A;
    public static final int IOTYPE_USER_IPCAM_SET_FTP_RESP = 0x055B;
    public static final int IOTYPE_USER_IPCAM_GET_FTP_REQ = 0x055C;
    public static final int IOTYPE_USER_IPCAM_GET_FTP_RESP = 0x055D;

    /* AVIOCTRL Mail Settings */
    public static final int IOTYPE_USER_IPCAM_GET_SMTP_REQ = 0x4005;
    public static final int IOTYPE_USER_IPCAM_GET_SMTP_RESP = 0x4006;
    public static final int IOTYPE_USER_IPCAM_SET_SMTP_REQ = 0x4007;
    public static final int IOTYPE_USER_IPCAM_SET_SMTP_RESP = 0x4008;

    /* AVIOCTRL Magic Zoom */
    public static final int IOTYPE_USER_SETAMBCROPSET_REQ = 0xFF001004;
    public static final int IOTYPE_USER_SETAMBCROPSET_RESP = 0xFF001005;

    /* AVIOCTRL WiFi command */
    public static final int IOTYPE_USER_WIFICMD_REQ = 0x7F000000;
    public static final int IOTYPE_USER_WIFICMD_RESP = 0x7F000001;

    /* AVIOCTRL WiFi command ID */
    public static final int AVIOCTRL_WIFICMD_GET_WDR = 2020;
    public static final int AVIOCTRL_WIFICMD_GET_TIME_LAPSE = 2021;
    public static final int AVIOCTRL_WIFICMD_GET_BATTERY = 3019;

    /* AVIOCTRL Transport Large Data */
    public static final int IOTYPE_USER_SETCLIENTRECVREADY_REQ = 0x7F000002;
    public static final int IOTYPE_USER_SETCLIENTRECVREADY_RESP = 0x7F000003;

    /* AVIOCTRL Download files */
    public static final int IOTYPE_USER_IPCAM_DOWNLOAD_FILE_REQ = 0x7F000004;
    public static final int IOTYPE_USER_IPCAM_DOWNLOAD_FILE_RESP = 0x7F000005;
    public static final byte  AVIOCTRL_DOWNLOAD_FILE = 0;
    public static final byte  AVIOCTRL_VIEW_FILE = 1;

    public static final int IOTYPE_USER_IPCAM_UPLOAD_FILE_REQ = 0x7F000006;
//    public static final int IOTYPE_USER_IPCAM_UPLOAD_FILE_RESP = 0x7F000007;

    public static final int IOTYPE_USER_IPCAM_LIVEVIEW_OPTIONS_REQ = 0x3C0;
    public static final int IOTYPE_USER_IPCAM_LIVEVIEW_OPTIONS_RESP = 0x3C1;

    public static class SFrameInfo {

        short codec_id;
        byte flags;
        byte cam_index;
        byte onlineNum;
        byte[] reserved = new byte[3];
        int reserved2;
        int timestamp;

        public static byte[] parseContent (short codec_id, byte flags, byte cam_index, byte online_num, int timestamp) {

            byte[] result = new byte[16];

            byte[] codec = Packet.shortToByteArray_Little(codec_id);
            System.arraycopy(codec, 0, result, 0, 2);

            result[2] = flags;
            result[3] = cam_index;
            result[4] = online_num;

            byte[] time = Packet.intToByteArray_Little(timestamp);
            System.arraycopy(time, 0, result, 12, 4);

            return result;
        }
    }

    public static class SMsgAVIoctrlAVStream {
        int channel = 0; // camera index
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel) {
            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlEventConfig {
        long channel; // Camera Index
        byte mail; // enable send email
        byte ftp; // enable ftp upload photo
        byte localIO; // enable local io output
        byte p2pPushMsg; // enable p2p push msg
    }

    public static class SMsgAVIoctrlPtzCmd {
        byte control; // ptz control command
        byte speed; // ptz control speed
        byte point;
        byte limit;
        byte aux;
        byte channel; // camera index
        byte[] reserved = new byte[2];

        public static byte[] parseContent (byte control, byte speed, byte point, byte limit, byte aux, byte channel) {
            byte[] result = new byte[8];

            result[0] = control;
            result[1] = speed;
            result[2] = point;
            result[3] = limit;
            result[4] = aux;
            result[5] = channel;

            return result;
        }
    }

    public static class SMsgAVIoctrlSetStreamCtrlReq {
        int channel; // Camera Index
        byte quality; // AVIOCTRL_QUALITY_XXXX
        byte[] reserved = new byte[3];

        public static byte[] parseContent (int channel, byte quality) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);
            result[4] = quality;

            return result;
        }
    }

    public class SMsgAVIoctrlGetStreamCtrlResp {
        int channel; // Camera Index
        byte quality; // AVIOCTRL_QUALITY_XXXX
        byte[] reserved = new byte[3];
    }

    public class SMsgAVIoctrlSetStreamCtrlResp {
        int result;
        byte[] reserved = new byte[4];
    }

    public static class SMsgAVIoctrlGetStreamCtrlReq {
        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public static class SMsgAVIoctrlSetMotionDetectReq {
        int channel; // Camera Index
        int sensitivity; /* 0(disbale) ~ 100(MAX) */

        public static byte[] parseContent (int channel, int sensitivity) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            byte[] sen = Packet.intToByteArray_Little(sensitivity);

            System.arraycopy(ch, 0, result, 0, 4);
            System.arraycopy(sen, 0, result, 4, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlSetMotionDetectResp {
        byte result;
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlGetMotionDetectReq {
        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlGetMotionDetectResp {
        int channel; // Camera Index
        int sensitivity; /* 0(disbale) ~ 100(MAX) */
    }

    public static class SMsgAVIoctrlDeviceInfoReq {

		static byte[] reserved = new byte[4];;

        public static byte[] parseContent () {
            return reserved;
        }
    }

    public class SMsgAVIoctrlDeviceInfoResp {
        byte[] model = new byte[16];
        byte[] vendor = new byte[16];
        int version;
        int channel;
        int total; /* MByte */
        int free; /* MByte */
        byte[] reserved = new byte[8];
    }

    public static class SMsgAVIoctrlSetPasswdReq {
        byte[] oldPasswd = new byte[32];
        byte[] newPasswd = new byte[32];

        public static byte[] parseContent (String oldPwd, String newPwd) {

            byte[] oldpwd = oldPwd.getBytes();
            byte[] newpwd = newPwd.getBytes();
            byte[] result = new byte[64];

            System.arraycopy(oldpwd, 0, result, 0, oldpwd.length);
            System.arraycopy(newpwd, 0, result, 32, newpwd.length);

            return result;
        }
    }

    public class SMsgAVIoctrlSetPasswdResp {
        byte result;
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlListWifiApReq {

        static byte[] reserved = new byte[4];

        public static byte[] parseContent () {

            return reserved;
        }
    }

    public static class SWifiAp {
        public byte[] ssid = new byte[32];
        public byte mode;
        public byte enctype;
        public byte signal;
        public byte status;

        public static int getTotalSize () {
            return 36;
        }

        public SWifiAp (byte[] data) {

            System.arraycopy(data, 1, ssid, 0, data.length);
            mode = data[32];
            enctype = data[33];
            signal = data[34];
            status = data[35];
        }

        public SWifiAp (byte[] bytsSSID, byte bytMode, byte bytEnctype, byte bytSignal, byte bytStatus) {

            System.arraycopy(bytsSSID, 0, ssid, 0, bytsSSID.length);
            mode = bytMode;
            enctype = bytEnctype;
            signal = bytSignal;
            status = bytStatus;
        }
    }

    public class SMsgAVIoctrlListWifiApResp {
        int number; // MAX: 1024/36= 28
        SWifiAp stWifiAp;
    }

    public static class SMsgAVIoctrlSetWifiReq {
        byte[] ssid = new byte[32];
        byte[] password = new byte[32];
        byte mode;
        byte enctype;
        byte[] reserved = new byte[10];

        public static byte[] parseContent (byte[] ssid, byte[] password, byte mode, byte enctype) {

            byte[] result = new byte[76];

            System.arraycopy(ssid, 0, result, 0, ssid.length);
            System.arraycopy(password, 0, result, 32, password.length);
            result[64] = mode;
            result[65] = enctype;

            return result;
        }

        public static byte[] parseContent (byte[] ssid, byte[] password, byte mode, byte enctype, byte[] reserved) {

            byte[] result = new byte[76];

            System.arraycopy(ssid, 0, result, 0, ssid.length);
            System.arraycopy(password, 0, result, 32, password.length);
            result[64] = mode;
            result[65] = enctype;
            System.arraycopy(reserved, 0, result, 66, reserved.length);

            return result;
        }

    }

    public class SMsgAVIoctrlSetWifiResp {
        byte result;
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlGetWifiReq {

        static byte[] reserved = new byte[4];

        public static byte[] parseContent () {
            return reserved;
        }
    }

    public class SMsgAVIoctrlGetWifiResp {
        byte[] ssid = new byte[32];
        byte[] password = new byte[32];
        byte mode;
        byte enctype;
        byte signal;
        byte status;
    }

    public static class SMsgAVIoctrlSetRecordReq {
        int channel; // Camera Index
        int recordType;
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel, int recordType) {

            byte[] result = new byte[12];
            byte[] ch = Packet.intToByteArray_Little(channel);
            byte[] type = Packet.intToByteArray_Little(recordType);

            System.arraycopy(ch, 0, result, 0, 4);
            System.arraycopy(type, 0, result, 4, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlSetRecordResp {
        byte result;
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlGetRecordReq {
        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlGetRecordResp {
        int channel; // Camera Index
        int recordType;
    }

    public class SMsgAVIoctrlSetRcdDurationReq {
        int channel; // Camera Index
        int presecond;
        int durasecond;
    }

    public class SMsgAVIoctrlSetRcdDurationResp {
        byte result;
        byte[] reserved = new byte[3];
    }

    public class SMsgAVIoctrlGetRcdDurationReq {
        int channel; // Camera Index
        byte[] reserved = new byte[4];
    }

    public class SMsgAVIoctrlGetRcdDurationResp {
        int channel; // Camera Index
        int presecond;
        int durasecond;
    }

    public static class STimeDay{

        private byte[] mBuf;
        public short year;
        public byte month;
        public byte day;
        public byte wday;
        public byte hour;
        public byte minute;
        public byte second;

        public STimeDay (byte[] data) {

            mBuf = new byte[8];
            System.arraycopy(data, 0, mBuf, 0, 8);

            year = Packet.byteArrayToShort_Little(data, 0);
            month = data[2];
            day = data[3];
            wday = data[4];
            hour = data[5];
            minute = data[6];
            second = data[7];
        }

        public long getTimeInMillis () {

            Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            cal.set(year, month - 1, day, hour, minute, second);

            return cal.getTimeInMillis();
        }

        public String getLocalTimeYearMonth () {

            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            calendar.setTimeInMillis(getTimeInMillis());
            // calendar.add(Calendar.MONTH, -1);

            SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd,yyyy");
            dateFormat.setTimeZone(TimeZone.getDefault());

            return dateFormat.format(calendar.getTime());
        }

        public String getLocalTimeSecond () {

            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            calendar.setTimeInMillis(getTimeInMillis());
            // calendar.add(Calendar.MONTH, -1);

            SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
            dateFormat.setTimeZone(TimeZone.getDefault());

            return dateFormat.format(calendar.getTime());
        }


        public String getLocalTime () {

            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            calendar.setTimeInMillis(getTimeInMillis());
            // calendar.add(Calendar.MONTH, -1);

            SimpleDateFormat dateFormat = new SimpleDateFormat();
            dateFormat.setTimeZone(TimeZone.getDefault());

            return dateFormat.format(calendar.getTime());
        }

        public byte[] toByteArray () {
            return mBuf;
        }

        public static byte[] parseContent (int year, int month, int day, int wday, int hour, int minute, int second) {

            byte[] result = new byte[8];

            byte[] y = Packet.shortToByteArray_Little((short) year);
            System.arraycopy(y, 0, result, 0, 2);

            result[2] = (byte) month;
            result[3] = (byte) day;
            result[4] = (byte) wday;
            result[5] = (byte) hour;
            result[6] = (byte) minute;
            result[7] = (byte) second;

            return result;
        }
    }

    public static class SMsgAVIoctrlListEventReq {

        int channel; // Camera Index
        byte[] startutctime = new byte[8];
        byte[] endutctime = new byte[8];
        byte event;
        byte status;
        byte[] reversed = new byte[2];

        public static byte[] parseConent (int channel, long startutctime, long endutctime, byte event, byte status) {

            Calendar startCal = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            Calendar stopCal = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            startCal.setTimeInMillis(startutctime);
            stopCal.setTimeInMillis(endutctime);

            System.out.println("search from " + startCal.get(Calendar.YEAR) + "/" + startCal.get(Calendar.MONTH) + "/" + startCal.get(Calendar
                    .DAY_OF_MONTH) + " " + startCal.get(Calendar.HOUR_OF_DAY) + ":" + startCal.get(Calendar.MINUTE) + ":" + startCal.get(Calendar
                    .SECOND));
            System.out.println("       to   " + stopCal.get(Calendar.YEAR) + "/" + stopCal.get(Calendar.MONTH) + "/" + stopCal.get(Calendar
                    .DAY_OF_MONTH) + " " + stopCal.get(Calendar.HOUR_OF_DAY) + ":" + stopCal.get(Calendar.MINUTE) + ":" + stopCal.get(Calendar
                    .SECOND));

            byte[] result = new byte[24];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            byte[] start = STimeDay.parseContent(startCal.get(Calendar.YEAR), startCal.get(Calendar.MONTH) + 1,
                    startCal.get(Calendar.DAY_OF_MONTH), startCal.get(Calendar.DAY_OF_WEEK), startCal.get(Calendar.HOUR_OF_DAY),
                    startCal.get(Calendar.MINUTE), 0);
            System.arraycopy(start, 0, result, 4, 8);

            byte[] stop = STimeDay.parseContent(stopCal.get(Calendar.YEAR), stopCal.get(Calendar.MONTH) + 1, stopCal.get(Calendar.DAY_OF_MONTH),
                    stopCal.get(Calendar.DAY_OF_WEEK), stopCal.get(Calendar.HOUR_OF_DAY), stopCal.get(Calendar.MINUTE), 0);
            System.arraycopy(stop, 0, result, 12, 8);

            result[20] = event;
            result[21] = status;

            return result;
        }
    }

    public static class SAvEvent {
        byte[] utctime = new byte[8];
        byte event;
        byte status;
        byte[] reserved = new byte[2];

        public static int getTotalSize () {
            return 12;
        }
    }

    public class SMsgAVIoctrlListEventResp {
        int channel; // Camera Index
        int total;
        byte index;
        byte endflag;
        byte count;
        byte reserved;
        SAvEvent stEvent;
    }

    public static class SMsgAVIoctrlPlayRecord {
        int channel; // Camera Index
        int command; // play record command
        int Param;
        byte[] stTimeDay = new byte[8];
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel, int command, int param, long time) {

            byte[] result = new byte[24];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            byte[] cmd = Packet.intToByteArray_Little(command);
            System.arraycopy(cmd, 0, result, 4, 4);

            byte[] p = Packet.intToByteArray_Little(param);
            System.arraycopy(p, 0, result, 8, 4);

            Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            cal.setTimeInMillis(time);
            cal.add(Calendar.DAY_OF_MONTH, - 1);
            cal.add(Calendar.DATE, 1);
            byte[] timedata = STimeDay.parseContent(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),
                    cal.get(Calendar.DAY_OF_WEEK), cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
            System.arraycopy(timedata, 0, result, 12, 8);

            return result;
        }

        public static byte[] parseContent (int channel, int command, int param, byte[] time) {

            byte[] result = new byte[24];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            byte[] cmd = Packet.intToByteArray_Little(command);
            System.arraycopy(cmd, 0, result, 4, 4);

            byte[] p = Packet.intToByteArray_Little(param);
            System.arraycopy(p, 0, result, 8, 4);

            System.arraycopy(time, 0, result, 12, 8);

            return result;
        }
    }

    // only for play record start command
    public class SMsgAVIoctrlPlayRecordResp {
        int channel;
        int result;
        byte[] reserved = new byte[4];
    } // only for play record start command

    public class SMsgAVIoctrlEvent {
        STimeDay stTime; // 8 bytes
        int channel; // Camera Index
        int event; // Event Type
        byte[] reserved = new byte[4];
    }

    public static class SMsgAVIoctrlSetVideoModeReq {
        int channel; // Camera Index
        byte mode; // Video mode
        byte[] reserved = new byte[3];

        public static byte[] parseContent (int channel, byte mode) {
            byte[] result = new byte[8];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            result[4] = mode;

            return result;
        }
    }

    public class SMsgAVIoctrlSetVideoModeResp {
        int channel; // Camera Index
        byte result; // 1 - succeed, 0 - failed
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlGetVideoModeReq {
        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel) {
            byte[] result = new byte[8];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlGetVideoModeResp {
        int channel; // Camera Index
        byte mode; // Video Mode
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlSetEnvironmentReq {
        int channel; // Camera Index
        byte mode; // Environment mode
        byte[] reserved = new byte[3];

        public static byte[] parseContent (int channel, byte mode) {

            byte[] result = new byte[8];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            result[4] = mode;

            return result;
        }
    }

    public class SMsgAVIoctrlSetEnvironmentResp {

        int channel; // Camera Index
        byte result; // 1 - succeed, 0 - failed
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlGetEnvironmentReq {
        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel) {

            byte[] result = new byte[8];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlGetEnvironmentResp {
        int channel; // Camera Index
        byte mode; // Environment Mode
        byte[] reserved = new byte[3];
    }

    public static class SMsgAVIoctrlFormatExtStorageReq {

        int storage; // Storage index (ex. sdcard slot = 0, internal flash = 1,
        // ...)
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int storage) {

            byte[] result = new byte[8];

            byte[] ch = Packet.intToByteArray_Little(storage);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public class SMsgAVIoctrlFormatExtStorageResp {

        int storage; // Storage index
        byte result; // 0: success;
        // -1: format command is not supported.
        // otherwise: failed.

        byte[] reserved = new byte[3];
    }

    public static class SStreamDef {

        public int index; // the stream index of camera
        public int channel; // the channel index used in AVAPIs

        public SStreamDef (byte[] data) {

            index = Packet.byteArrayToShort_Little(data, 0);
            channel = Packet.byteArrayToShort_Little(data, 2);
        }

        public String toString () {
            return ("CH" + String.valueOf(index + 1));
        }
    }

    public static class SMsgAVIoctrlGetSupportStreamReq {

        public static byte[] parseContent () {

            return new byte[4];
        }

        public static int getContentSize () {
            return 4;
        }
    }

    // Zoom Set �ܵJ�\��
    public static class SMsgAVIoctrlSetAmbZoomSetReq {

        static byte[] result = new byte[5];

        public static byte[] parseContent (int channel, int level, char reserved) {

//			byte[] channel_byte = Packet.intToByteArray_Big(Integer.parseInt(channel));
            byte[] channel_byte = Packet.intToByteArray_Little(channel);
            System.arraycopy(channel_byte, 0, result, 0, 1);

            byte[] level_byte = Packet.intToByteArray_Little(level);
            System.arraycopy(level_byte, 0, result, 1, 1);

            String reserved_str = String.valueOf(reserved);
            byte[] reserved_byte = reserved_str.getBytes();
            System.arraycopy(reserved_byte, 0, result, 2, 1);

            return result;
        }
    }

    // Pan / Tilt �i���\�� �I��e������,���Y�N������
    public static class SMsgAVIoctrlSetambptexReq {

        static byte[] result = new byte[12];

        public static byte[] parseContent (long offset_x, long offset_y, int channel, char reserved) {

            byte[] center_x = Packet.longToByteArray_Little(offset_x);
            System.arraycopy(center_x, 0, result, 0, 4);

            byte[] center_y = Packet.longToByteArray_Little(offset_y);
            System.arraycopy(center_y, 0, result, 4, 4);

//			String channel_str = String.valueOf(channel);
//			byte[] channel_byte = channel_str.getBytes();
            byte[] channel_byte = Packet.intToByteArray_Little(channel);
            System.arraycopy(channel_byte, 0, result, 8, 1);

            String reserved_str = String.valueOf(reserved);
            byte[] reserved_byte = reserved_str.getBytes();
            System.arraycopy(reserved_byte, 0, result, 9, 1);

            return result;
        }
    }

    public class SMsgAVIoctrlGetSupportStreamResp {

        public SStreamDef mStreamDef[];
        public long number;
    }

    public static class SMsgAVIoctrlGetAudioOutFormatReq {

        public static byte[] parseContent () {
            return new byte[8];
        }
    }

    public class SMsgAVIoctrlGetAudioOutFormatResp {
        public int channel;
        public int format;
    }

    // IOTYPE_USER_IPCAM_GET_FLOWINFO_REQ = 0x390
    public static class SMsgAVIoctrlGetFlowInfoReq {
        public int channel;
        public int collect_interval;

    }

    // IOTYPE_USER_IPCAM_GET_FLOWINFO_RESP = 0x391
    public static class SMsgAVIoctrlGetFlowInfoResp {
        public int channel;
        public int collect_interval;

        public static byte[] parseContent (int channel, int collect_interval) {

            byte[] result = new byte[8];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            byte[] col = Packet.intToByteArray_Little(collect_interval);
            System.arraycopy(col, 0, result, 4, 4);

            return result;
        }
    }

    // IOTYPE_USER_IPCAM_CURRENT_FLOWINFO = 0x392
    public static class SMsgAVIoctrlCurrentFlowInfo {
        public int channel;
        public int total_frame_count;
        public int lost_incomplete_frame_count;
        public int total_expected_frame_size;
        public int total_actual_frame_size;
        public int elapse_time_ms;

        public static byte[] parseContent (int channel, int total_frame_count, int lost_incomplete_frame_count, int total_expected_frame_size,
                                           int total_actual_frame_size, int elapse_time_ms) {

            byte[] result = new byte[32];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            byte[] total_frame = Packet.intToByteArray_Little(total_frame_count);
            System.arraycopy(total_frame, 0, result, 4, 4);

            byte[] lost_incomplete = Packet.intToByteArray_Little(lost_incomplete_frame_count);
            System.arraycopy(lost_incomplete, 0, result, 8, 4);

            byte[] total_expected = Packet.intToByteArray_Little(total_expected_frame_size);
            System.arraycopy(total_expected, 0, result, 12, 4);

            byte[] total_actual = Packet.intToByteArray_Little(total_actual_frame_size);
            System.arraycopy(total_actual, 0, result, 16, 4);

            byte[] elapse_time = Packet.intToByteArray_Little(elapse_time_ms);
            System.arraycopy(elapse_time, 0, result, 20, 4);

            return result;
        }
    }

    /* IOTYPE_USER_IPCAM_GET_TIMEZONE_REQ = 0x3A0 IOTYPE_USER_IPCAM_GET_TIMEZONE_RESP = 0x3A1
     * IOTYPE_USER_IPCAM_SET_TIMEZONE_REQ = 0x3B0 IOTYPE_USER_IPCAM_SET_TIMEZONE_RESP = 0x3B1 */
    public static class SMsgAVIoctrlTimeZone {
        public int cbSize;
        public int nIsSupportTimeZone;
        public int nGMTDiff;
        public byte[] szTimeZoneString = new byte[256];

        public static byte[] parseContent () {

            return new byte[268];
        }

        public static byte[] parseContent (int cbSize, int nIsSupportTimeZone, int nGMTDiff, byte[] szTimeZoneString) {

            byte[] result = new byte[12 + 256];

            byte[] size = Packet.intToByteArray_Little(cbSize);
            System.arraycopy(size, 0, result, 0, 4);

            byte[] isSupportTimeZone = Packet.intToByteArray_Little(nIsSupportTimeZone);
            System.arraycopy(isSupportTimeZone, 0, result, 4, 4);

            byte[] GMTDiff = Packet.intToByteArray_Little(nGMTDiff);
            System.arraycopy(GMTDiff, 0, result, 8, 4);

            System.arraycopy(szTimeZoneString, 0, result, 12, szTimeZoneString.length);

            return result;
        }
    }

    public static class SMsgAVIoctrlReceiveFirstIFrame {
        int channel; // Camera Index
        int recordType;
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel, int recordType) {

            byte[] result = new byte[12];
            byte[] ch = Packet.intToByteArray_Little(channel);
            byte[] type = Packet.intToByteArray_Little(recordType);

            System.arraycopy(ch, 0, result, 0, 4);
            System.arraycopy(type, 0, result, 4, 4);

            return result;
        }
    }

    public static class SMsgAVIoctrlGetDropbox { // for resp
        public short nSupportDropbox;
        public short nLinked;
        public String szLinkUDID;

        public SMsgAVIoctrlGetDropbox (byte[] data) {
            nSupportDropbox = Packet.byteArrayToShort_Little(data, 0);
            nLinked = Packet.byteArrayToShort_Little(data, 2);

            int position = 0;
            for (int i = 4 ; i < data.length ; i++) {
                if (data[i] == 0) {
                    break;
                }

                position++;
            }
            byte[] temp = new byte[position];
            System.arraycopy(data, 4, temp, 0, position);
//			szLinkUDID = new String(data, 4, data.length-4).replace("\0","");
            szLinkUDID = new String(temp);
        }
    }

	/*// dropbox support IOTYPE_USER_IPCAM_SET_SAVE_DROPBOX_REQ = 0x502,
     * IOTYPE_USER_IPCAM_SET_SAVE_DROPBOX_RESP = 0x503, typedef struct { unsigned short nLinked; //
	 * 0:no link/ 1:linked char szLinkUDID[64]; // UDID for App //use mac address + device id char
	 * szAccessToken[32]; // Oauth token char szAccessTokenSecret[32]; // Oauth token secret char
	 * szAppKey[32]; // App Key (reserved) char szSecret[32]; // Secret (reserved) char reserved[4];
	 * }SMsgAVIoctrlSetDropbox; */

    public static class SMsgAVIoctrlSetDropbox {
        public short nLinked;
        byte[] szLinkUDID = new byte[64];
        byte[] szAccessToken = new byte[128];
        byte[] szAccessTokenSecret = new byte[128];
        byte[] szAppKey = new byte[128];
        byte[] szSecret = new byte[128];
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int nLinked, String szLinkUDID, String szAccessToken, String szAccessTokenSecret, String szAppKey,
                                           String szSecret, String reserved) {
            byte[] ret = new byte[(2 + 64 + 128 + 128 + 128 + 128 + 4)];
            int index = 0;
            byte[] nLink = Packet.intToByteArray_Little(nLinked);
            System.arraycopy(nLink, 0, ret, index, 2);
            index += 2;

            byte[] UDID = szLinkUDID.getBytes();
            byte[] tempszLinkUDID = new byte[64];
            System.arraycopy(UDID, 0, tempszLinkUDID, 0, UDID.length);

            byte[] Token = szAccessToken.getBytes();
            byte[] tempszAccessToken = new byte[128];
            System.arraycopy(Token, 0, tempszAccessToken, 0, Token.length);

            byte[] TokenSecret = szAccessTokenSecret.getBytes();
            byte[] tempszAccessTokenSecret = new byte[128];
            System.arraycopy(TokenSecret, 0, tempszAccessTokenSecret, 0, TokenSecret.length);

            byte[] AppKey = szAppKey.getBytes();
            byte[] tempszAppKey = new byte[128];
            System.arraycopy(AppKey, 0, tempszAppKey, 0, AppKey.length);

            byte[] Secret = szSecret.getBytes();
            byte[] tempszSecret = new byte[128];
            System.arraycopy(Secret, 0, tempszSecret, 0, Secret.length);

            System.arraycopy(tempszLinkUDID, 0, ret, index, tempszLinkUDID.length);
            index += tempszLinkUDID.length;

            System.arraycopy(tempszAccessToken, 0, ret, index, tempszAccessToken.length);
            index += tempszAccessToken.length;

            System.arraycopy(tempszAccessTokenSecret, 0, ret, index, tempszAccessTokenSecret.length);
            index += tempszAccessTokenSecret.length;

            System.arraycopy(tempszAppKey, 0, ret, index, tempszAppKey.length);
            index += tempszAppKey.length;

            System.arraycopy(tempszSecret, 0, ret, index, tempszSecret.length);
            index += tempszSecret.length;

//			byte[] reserve = reserved.getBytes();
//			System.arraycopy(reserve, 0, ret,index , reserve.length);
//			index += reserve.length;

            return ret;
        }
    }

    public static class SMsgAVIoctrlSetPresetReq {
        int channel;
        int nPresetIdx;

        public static byte[] parseContent (int channel, int nPresetIdx) {
            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            byte[] sen = Packet.intToByteArray_Little(nPresetIdx);
            System.arraycopy(ch, 0, result, 0, 4);
            System.arraycopy(sen, 0, result, 4, 4);
            return result;
        }

    }

    public static class SMsgAVIoctrlGetPresetReq {
        int channel;
        int nPresetIdx;

        public static byte[] parseContent (int channel, int nPresetIdx) {
            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            byte[] sen = Packet.intToByteArray_Little(nPresetIdx);
            System.arraycopy(ch, 0, result, 0, 4);
            System.arraycopy(sen, 0, result, 4, 4);
            return result;
        }
    }

    public static class SMsgAVIoctrlGetPresetResp {
        int channel;
        int nPresetIdx;
    }

    public static class SMsgAVIoctrlSetPresetResp {
        int result; // 0: success; otherwise: failed
        byte[] reserved = new byte[4];
    }

    public static class SMsgAVIoctrlCruiseStart {
        int channel; // Camera Index
        byte mode;
        byte[] reserved = new byte[3];

        public static byte[] parseContent (int channel, byte mode) {
            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);
            result[4] = mode;
            return result;
        }

    }

    public static class SMsgAVIoctrlCruiseStop {
        int channel;
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);
            return result;
        }
    }

    public static class SMsgAVIoctrlGetBrightReq {

        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public static class SMgAVIoctrlGetBrightResp {
        int channel; // Camera Index
        byte bright;
        byte[] reserved = new byte[3];

    }

    public static class SMsgAVIoctrlSetBrightReq {
        int channel; // Camera Index
        byte bright;
        byte[] reserved = new byte[3];

        public static byte[] parseContent (int channel, byte bright) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);
            result[4] = bright;
            return result;
        }

    }

    public static class SMsgAVIoctrSeltBrightResp {
        int result; // 0: success; otherwise: failed.
        byte[] reserved = new byte[4];
    }

    public static class SMsgAVIoctrlGetContrastReq {
        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public static class SMgAVIoctrlGetContrastResp {
        int channel;
        byte contrast;
        byte[] reserved = new byte[3];

    }

    public static class SMsgAVIoctrSetContrastReq {

        int channel;
        byte contrast;
        byte[] reserved = new byte[3];

        public static byte[] parseContent (int channel, byte contrast) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);
            result[4] = contrast;
            return result;
        }
    }

    public static class SMsgAVIoctrSetContrastResp {
        int result; // 0: success; otherwise: failed.
        byte[] reserved = new byte[4];
    }

    public static class SMsgAVIoctrlGetGuardReq {
        int channel; // AvServer Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel) {
            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public static class SMsgAVIoctrlGetGuardResp {
        int channel; // AvServer Index
        byte alarm_motion_armed; // motion switch 0:off, 1:on
        byte alarm_motion_sensitivity; // 1(min) ~ 100 (max)
        byte alarm_preset; // 0:off, 1~4: preset's position
        byte alarm_mail; // 0:off, 1:on
        int alarm_upload_interval; // FTP's upload interval (with sec). 0:off
    }

    public static class SMsgAVIoctrlSetGuardReq {
        int channel; // AvServer Index
        byte alarm_motion_armed; // motion switch 0:off, 1:on
        byte alarm_motion_sensitivity; // 1(min) ~ 100 (max)
        byte alarm_preset; // 0:off, 1~4: preset's position
        byte alarm_mail; // 0:off, 1:on
        int alarm_upload_interval; // FTP's upload interval (with sec). 0:off

        public static byte[] parseContent (int channel, byte alarm_motion_armed, byte alarm_motion_sensitivity, byte alarm_preset, byte alarm_mail,
                                           int alarm_upload_interval) {
            byte[] result = new byte[12];
            byte[] ch = Packet.intToByteArray_Little(channel);
            byte[] interval = Packet.intToByteArray_Little(alarm_upload_interval);
            System.arraycopy(ch, 0, result, 0, 4);
            result[4] = alarm_motion_armed;
            result[5] = alarm_motion_sensitivity;
            result[6] = alarm_preset;
            result[7] = alarm_mail;
            System.arraycopy(interval, 0, result, 8, 4);
            return result;
        }
    }

    public static class SMsgAVIoctrlSetGuardResp {
        int result;
        byte[] reserved = new byte[4];
    }

    public static class SMsgAVIoctrlSetFtpReq {
        int channel; // Camera Index
        byte[] ftpServer = new byte[68];
        int ftpPort;
        byte[] userName = new byte[20];
        byte[] password = new byte[20];
        byte[] path = new byte[68];
        int passiveMode; // 0 - off, 1 - on

        // total 188 bytes
        public static byte[] parseContent (int nchannel, String ftpServer, int nftpPort, String userName, String password, String path,
                                           int passiveMode) {
            byte[] result = new byte[188];
            byte[] ch = Packet.intToByteArray_Little(nchannel);
            byte[] port = Packet.intToByteArray_Little(nftpPort);
            byte[] mode = Packet.intToByteArray_Little(passiveMode);
            System.arraycopy(ch, 0, result, 0, 4);
            System.arraycopy(ftpServer.getBytes(), 0, result, 4, ftpServer.getBytes().length);
            System.arraycopy(port, 0, result, 72, 4);
            System.arraycopy(userName.getBytes(), 0, result, 76, userName.getBytes().length);
            System.arraycopy(password.getBytes(), 0, result, 96, password.getBytes().length);
            System.arraycopy(path.getBytes(), 0, result, 116, path.getBytes().length);
            System.arraycopy(mode, 0, result, 184, 4);
            return result;
        }
    }

    public static class SMsgAVIoctrlGetFtpResp {
        int channel; // Camera Index
        byte[] ftpServer = new byte[68]; // 10.1.1.1
        int ftpPort; // 21
        byte[] userName = new byte[20];
        byte[] password = new byte[20];
        byte[] path = new byte[68];
        int passiveMode;// 0 - off, 1 - on
        // total 188 bytes

    }

    public static class SMsgAVIoctrlSetFtpResp {
        int channel; // Camera Index
        int result; // 0: ok ; 1: failed
    }

    public static class SMsgAVIoctrlGetFtpReq {
        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public static class SMsgAVIoctrlExGetSmtpReq {

        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }

    }

    public static class SMsgAVIoctrlExSetSmtpReq {
        int channel; // Camera Index
        byte[] sender = new byte[64];   //email address
        byte[] receiver1 = new byte[64];  //email address
        byte[] server = new byte[64];  //mail server
        int port;
        int mail_tls;  //  protocol  0:No, 1:TLS, 2:STARTLS
        byte[] user = new byte[32];
        byte[] pwd = new byte[32];

        public static byte[] parseContent (int channel, String sender, String receiver1, String server, int port, int mail_tls, String user,
                                           String pwd) {

            byte[] result = new byte[268];
            byte[] ch = Packet.intToByteArray_Little(channel);
            byte[] arrayport = Packet.intToByteArray_Little(port);
            byte[] arraymail_tls = Packet.intToByteArray_Little(mail_tls);

            System.arraycopy(ch, 0, result, 0, 4);
            System.arraycopy(sender.getBytes(), 0, result, 4, sender.getBytes().length);
            System.arraycopy(receiver1.getBytes(), 0, result, 68, receiver1.getBytes().length);
            System.arraycopy(server.getBytes(), 0, result, 132, server.getBytes().length);
            System.arraycopy(arrayport, 0, result, 196, 4);
            System.arraycopy(arraymail_tls, 0, result, 200, 4);
            System.arraycopy(user.getBytes(), 0, result, 204, user.getBytes().length);
            System.arraycopy(pwd.getBytes(), 0, result, 236, pwd.getBytes().length);

            return result;
        }

    }

    public static class SMsgAVIoctrlExGetSmtpResp {

        int channel; // Camera Index
        byte[] sender = new byte[64];  //email address
        byte[] receiver1 = new byte[64];  //email address
        byte[] server = new byte[64];  //mail server
        int port;
        int mail_tls;   //  protocol  0:No, 1:TLS, 2:STARTLS
        byte[] user = new byte[32];
        byte[] pwd = new byte[32];

    }

    public static class SMsgAVIoctrlExSetSmtpResp {
        int result; // 0: ok ; 1: failed
        byte[] reserved = new byte[4];
    }

    public static class SMsgAVIoctrlSetAmbCropSetReq {
        int x;  // x-axis from left
        int y;  // u-axis from top
        int width;  // the width of cropped area
        int height;  // the height of cropped area
        float zoomScale;
        byte channel;  // camera index
        byte[] reserved = new byte[3];

        public static byte[] parseContent (int x, int y, int width, int height, float zoomScale, byte channel) {

            byte[] result = new byte[21];
            byte[] axisX = Packet.intToByteArray_Little(x);
            byte[] axisY = Packet.intToByteArray_Little(y);
            byte[] w = Packet.intToByteArray_Little(width);
            byte[] h = Packet.intToByteArray_Little(height);
            ByteBuffer scaleBuf = ByteBuffer.allocate(4);
            scaleBuf.putFloat(zoomScale);
            byte[] scale = scaleBuf.array();

            System.arraycopy(axisX, 0, result, 0, 4);
            System.arraycopy(axisY, 0, result, 4, 4);
            System.arraycopy(w, 0, result, 8, 4);
            System.arraycopy(h, 0, result, 12, 4);
            System.arraycopy(scale, 0, result, 16, 4);
            result[20] = channel;

            return result;
        }
    }

    public static class SMsgAVIoctrlSetAmbCropSetResp {
        long result;  // 0 : success; otherwise : failed
        byte[] reserved = new byte[4];
    }

    public static class SMsgAVIoctrlListFileReq {

        int channel; // Camera Index
        byte[] startutctime = new byte[8];
        byte[] endutctime = new byte[8];
        byte event;
        byte status;
        byte type;  // type of file 0:video, 1:photo
        byte[] reserved = new byte[9];

        public static byte[] parseConent (int channel, long startutctime, long endutctime, byte event, byte status, byte type) {

            Calendar startCal = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            Calendar stopCal = Calendar.getInstance(TimeZone.getTimeZone("gmt"));
            startCal.setTimeInMillis(startutctime);
            stopCal.setTimeInMillis(endutctime);

            System.out.println("search from " + startCal.get(Calendar.YEAR) + "/" + startCal.get(Calendar.MONTH) + "/" + startCal.get(Calendar
                    .DAY_OF_MONTH) + " " + startCal.get(Calendar.HOUR_OF_DAY) + ":" + startCal.get(Calendar.MINUTE) + ":" + startCal.get(Calendar
                    .SECOND));
            System.out.println("       to   " + stopCal.get(Calendar.YEAR) + "/" + stopCal.get(Calendar.MONTH) + "/" + stopCal.get(Calendar
                    .DAY_OF_MONTH) + " " + stopCal.get(Calendar.HOUR_OF_DAY) + ":" + stopCal.get(Calendar.MINUTE) + ":" + stopCal.get(Calendar
                    .SECOND));

            byte[] result = new byte[32];

            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            byte[] start = STimeDay.parseContent(startCal.get(Calendar.YEAR), startCal.get(Calendar.MONTH) + 1,
                    startCal.get(Calendar.DAY_OF_MONTH), startCal.get(Calendar.DAY_OF_WEEK), startCal.get(Calendar.HOUR_OF_DAY),
                    startCal.get(Calendar.MINUTE), 0);
            System.arraycopy(start, 0, result, 4, 8);

            byte[] stop = STimeDay.parseContent(stopCal.get(Calendar.YEAR), stopCal.get(Calendar.MONTH) + 1, stopCal.get(Calendar.DAY_OF_MONTH),
                    stopCal.get(Calendar.DAY_OF_WEEK), stopCal.get(Calendar.HOUR_OF_DAY), stopCal.get(Calendar.MINUTE), 0);
            System.arraycopy(stop, 0, result, 12, 8);

            result[20] = event;
            result[21] = status;
            result[22] = type;

            return result;
        }
    }

    public static class SAvFile {
        byte[] utctime = new byte[8];
        byte event;
        byte status;
        byte type;
        byte length;
        byte[] path = new byte[72];

        public static int getTotalSize () {
            return 84;
        }
    }

    public class SMsgAVIoctrlListFileResp {
        int channel; // Camera Index
        int total;
        byte index;
        byte endflag;
        byte count;
        byte type;
        SAvFile stFile;
    }

    public static class SMsgAVIoctrlWifiCmdReq {
        int channel;  // AV Server Index
        int nCmdIdentify;  // (Option) a number let app can distinguish the response;  0 : disable
        int nAVChannel4LongReq;     // (Option) if large sent data transfer required when request;  0 : disable
        int nCmdID;      // The same as Command ID value defined in param's cmd.
        int nTotalCount;    // The total amount of io command transfer times for this wifi command.
        int nIndex;     // The index of io command transfer times for this wifi command
        int nDataLength;    // The valid data length in bytes of the param
        byte[] param = new byte[972];    // The parameter string

        public static byte[] parseContent (int channel, int nCmdIdentify, int nAVChannel4LongReq, int nCmdID, int nTotalCount, int nIndex,
                                           int nDataLength, String param) {

            byte[] result = new byte[1000];
            byte[] ch = Packet.intToByteArray_Little(channel);
            byte[] cmdId = Packet.intToByteArray_Little(nCmdIdentify);
            byte[] longReq = Packet.intToByteArray_Little(nAVChannel4LongReq);
            byte[] cmdID = Packet.intToByteArray_Little(nCmdID);
            byte[] count = Packet.intToByteArray_Little(nTotalCount);
            byte[] index = Packet.intToByteArray_Little(nIndex);
            byte[] length = Packet.intToByteArray_Little(nDataLength);

            System.arraycopy(ch, 0, result, 0, 4);
            System.arraycopy(cmdId, 0, result, 4, 4);
            System.arraycopy(longReq, 0, result, 8, 4);
            System.arraycopy(cmdID, 0, result, 12, 4);
            System.arraycopy(count, 0, result, 16, 4);
            System.arraycopy(index, 0, result, 20, 4);
            System.arraycopy(length, 0, result, 24, 4);
            System.arraycopy(param.getBytes(), 0, result, 28, param.getBytes().length);

            return result;
        }
    }

    public static class SMsgAVIoctrlWifiCmdResp {
        public static int channel;  // AV Server Index
        public static int nCmdIdentify;  // (Option) a number let app can distinguish the response;  0 : disable
        public static int nAVChannel4LongReq;     // (Option) if large sent data transfer required when request;  0 : disable
        public static int nCmdID;      // The same as Command ID value defined in param's cmd.
        public static int nTotalCount;    // The total amount of io command transfer times for this wifi command.
        public static int nIndex;     // The index of io command transfer times for this wifi command
        public static int nDataLength;    // The valid data length in bytes of the param
        public static byte[] response = new byte[972];    // The response  string

        public static void fillContent (byte[] buf){
            channel = Packet.byteArrayToInt_Little(buf, 0);
            nCmdIdentify = Packet.byteArrayToInt_Little(buf, 4);
            nAVChannel4LongReq = Packet.byteArrayToInt_Little(buf, 8);
            nCmdID = Packet.byteArrayToInt_Little(buf, 12);
            nTotalCount = Packet.byteArrayToInt_Little(buf, 16);
            nIndex = Packet.byteArrayToInt_Little(buf, 20);
            nDataLength = Packet.byteArrayToInt_Little(buf, 24);
            System.arraycopy(buf, 28, response, 0, nDataLength);
        }
    }

    public static class SMsgAVIoctrlSetClientRecvReadyReq {

        int channel; // Camera Index
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int channel) {

            byte[] result = new byte[8];
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(ch, 0, result, 0, 4);

            return result;
        }
    }

    public static class SMsgAVIoctrlDownloadReq {

        int channel; // Camera Index
        int length; // path length
        byte[] path = new byte[72];
        byte purpose;  // 0 : for download file,  1 : for show photo
        byte[] reserved = new byte[7];

        public static byte[] parseContent (int channel, String path, byte purpose) {

            byte[] result = new byte[88];
            int length = path.getBytes().length;
            byte[] ch = Packet.intToByteArray_Little(channel);
            byte[] path_length = Packet.intToByteArray_Little(length);
            System.arraycopy(ch, 0, result, 0, 4);
            System.arraycopy(path_length, 0, result, 4, 4);
            System.arraycopy(path.getBytes(), 0, result, 8, length);
            result[80] = purpose;

            return result;
        }
    }

    public static class SMsgAVIoctrlDownloadResp {
        int channel; // Camera Index
        int result; // the channel which avServStart
    }

    public static class SMsgAVIoctrlUploadReq{
        int channel;   // Camera Index
        int result; // the channel which avServStart

        public static byte[] parseContent (int avIndex, int channel) {

            byte[] result = new byte[8];

            byte[] index = Packet.intToByteArray_Little(avIndex);
            byte[] ch = Packet.intToByteArray_Little(channel);
            System.arraycopy(index, 0, result, 0, 4);
            System.arraycopy(ch, 0, result, 4, 4);

            return result;
        }
    }

    public static class SMsgAVIoctrlCheckSupportMessageTypeReq{
        int channel;  // avIndex
        int messageType;  // cmd ID
        byte[] reserved = new byte[8];

        public static byte[] parseContent (int avIndex, int cmd) {

            byte[] result = new byte[16];

            byte[] channel = Packet.intToByteArray_Little(avIndex);
            byte[] messageType = Packet.intToByteArray_Little(cmd);
            System.arraycopy(channel, 0, result, 0, 4);
            System.arraycopy(messageType, 0, result, 4, 4);

            return result;
        }
    }

    public static class SMsgAVIoctrlCheckSupportMessageTypeResp{
        int channel;
        int messageType;
        byte support;    // 0:not support, 1:support
        byte[] reserved = new byte[7];
    }

    public static class SMsgAVIoctrlLiveviewOptionsReq{
        int channel;
        byte[] reserved = new byte[4];

        public static byte[] parseContent (int avIndex) {

            byte[] result = new byte[8];

            byte[] index = Packet.intToByteArray_Little(avIndex);
            System.arraycopy(index, 0, result, 0, 4);

            return result;
        }
    }

    public static class SMsgAVIoctrlLiveviewOptionsResp{
        int channel;
        byte quality;    // IOTYPE_USER_IPCAM_GETSTREAMCTRL_RESP
        byte envMode;    // IOTYPE_USER_IPCAM_GET_ENVIRONMENT_RESP
        byte contrast;   // IOTYPE_CONTRAST_GETCONTRAST_RESP
        byte brightness; // IOTYPE_BRIGHT_GETBRIGHT_RESP
        byte videoMode;  // IOTYPE_USER_IPCAM_GET_VIDEOMODE_RESP
        byte battery;    // custom=1&cmd=3019
        byte wdr;        // custom=1&cmd=2020
        byte timelapse;  // custom=1&cmd=2021
        byte[] reserved = new byte[4];
    }

}
