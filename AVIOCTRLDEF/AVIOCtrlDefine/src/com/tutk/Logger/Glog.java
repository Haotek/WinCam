package com.tutk.Logger;

import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by Gavin on 2014/1/10.
 */
public class Glog {

	/* ����亙�頦������哨蕭�����部嚙賢�頦������哨蕭嚙踝蕭����剖�頦����都嚙賢�頦����郭嚙賢�頦������剖�頦���� ��剖�嚙�
	 * ��閉嚙�����苛erbose (lowest priority) ���嚙賢�頦��Debug ���嚙�����背nfo ��閉嚙�����苦arning
	 * ��閉嚙�����胥rror ���嚙賢�頦��Fatal ��閉嚙�����范ilent (highest priority, on which nothing is ever
	 * printed) */

	static boolean mIsLogOn = true;

	public static void D(String tag, String message) {
		if (!mIsLogOn)
			return;

		if (tag.equals("RECORD")) {
			try {
				File rootFolder = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/James_says_HELLO/");
				if (!rootFolder.exists()) {
					rootFolder.mkdir();
				}
				
				FileOutputStream output = new FileOutputStream(rootFolder.getAbsolutePath() + "/Log_file.txt",true);
				output.write(message.getBytes());
				output.write("\n".getBytes());
				output.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(tag.equals("EasyWiFi")){
			try {
				File rootFolder = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/James_says_HELLO/");
				if (!rootFolder.exists()) {
					rootFolder.mkdir();
				}

				FileOutputStream output = new FileOutputStream(rootFolder.getAbsolutePath() + "/Log_easyWiFi.txt",true);
				output.write(message.getBytes());
				output.write("\n".getBytes());
				output.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		Log.d(tag, message);
	}

	public static void D(String tag, String message, Throwable tr) {
		if (!mIsLogOn)
			return;

		Log.d(tag, message, tr);
	}

	public static void E(String tag, String message) {
		if (!mIsLogOn)
			return;

		Log.e(tag, message);
	}

	public static void E(String tag, String message, Throwable tr) {
		if (!mIsLogOn)
			return;

		Log.e(tag, message, tr);
	}

	public static void I(String tag, String message) {
		if (!mIsLogOn)
			return;

		Log.i(tag, message);
	}

	public static void I(String tag, String message, Throwable tr) {
		if (!mIsLogOn)
			return;

		Log.i(tag, message, tr);
	}

	public static void V(String tag, String message) {
		if (!mIsLogOn)
			return;

		Log.v(tag, message);
	}

	public static void V(String tag, String message, Throwable tr) {
		if (!mIsLogOn)
			return;

		Log.v(tag, message, tr);
	}

	public static void W(String tag, String message) {
		if (!mIsLogOn)
			return;

		Log.w(tag, message);
	}

	public static void W(String tag, String message, Throwable tr) {
		if (!mIsLogOn)
			return;

		Log.w(tag, message, tr);
	}

    public static void cleanLogFile(){
		File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/James_says_HELLO/Log_file.txt");
		if(file.exists()){
			file.delete();
		}
	}

	public static String getString(byte[] data) {

		StringBuilder sBuilder = new StringBuilder();

		for (int i = 0; i < data.length; i++) {

			if (data[i] == 0x0)
				break;

			sBuilder.append((char) data[i]);
		}

		return sBuilder.toString();
	}

	public static String getGianni_byteString(byte[] data) {

		String strDebug = "bytearray:";
		int debuglen = 0;
		for( byte v : data ) {
			strDebug += String.format( "0x%02X ", v);
			debuglen++;
			if (debuglen == data.length){
				break;
			}

		}
		return strDebug;
	}



}
