/******************************************************************************
 *                                                                            *
 * Copyright (c) 2011 by TUTK Co.LTD. All Rights Reserved.                    *
 *                                                                            *
 *                                                                            *
 * Class: Packet.java                                                         *
 *                                                                            *
 * Author: joshua ju                                                          *
 *                                                                            *
 * Date: 2011-05-14                                                           *
 *                                                                            *
 ******************************************************************************/

package com.tutk.IOTC;

public class Packet {

	public static final short byteArrayToShort_Little(byte byt[], int nBeginPos) {
		return (short) ((0xff & byt[nBeginPos]) | ((0xff & byt[nBeginPos + 1]) << 8));
	}

	public static final int byteArrayToInt_Little(byte byt[], int nBeginPos) {
		return (0xff & byt[nBeginPos]) | (0xff & byt[nBeginPos + 1]) << 8 | (0xff & byt[nBeginPos + 2]) << 16 | (0xff & byt[nBeginPos + 3]) << 24;
	}

	public static final int byteArrayToInt_Little(byte byt[]) {
		if (byt.length == 1)
			return 0xff & byt[0];
		else if (byt.length == 2)
			return (0xff & byt[0]) | ((0xff & byt[1]) << 8);
		else if (byt.length == 4)
			return (0xff & byt[0]) | (0xff & byt[1]) << 8 | (0xff & byt[2]) << 16 | (0xff & byt[3]) << 24;
		else
			return 0;
	}

	public static final long byteArrayToLong_Little(byte byt[], int nBeginPos) {

		return (0xff & byt[nBeginPos]) | (0xff & byt[nBeginPos + 1]) << 8 | (0xff & byt[nBeginPos + 2]) << 16 | (0xff & byt[nBeginPos + 3]) << 24
				| (0xff & byt[nBeginPos + 4]) << 32 | (0xff & byt[nBeginPos + 5]) << 40 | (0xff & byt[nBeginPos + 6]) << 48 | (0xff & byt[nBeginPos + 7]) << 56;
	}

	public static final int byteArrayToInt_Big(byte byt[]) {
		if (byt.length == 1)
			return 0xff & byt[0];
		else if (byt.length == 2)
			return (0xff & byt[0]) << 8 | 0xff & byt[1];
		else if (byt.length == 4)
			return (0xff & byt[0]) << 24 | (0xff & byt[1]) << 16 | (0xff & byt[2]) << 8 | 0xff & byt[3];
		else
			return 0;
	}

	public static final byte[] longToByteArray_Little(long value) {
		return new byte[] { (byte) value, (byte) (value >>> 8), (byte) (value >>> 16), (byte) (value >>> 24), (byte) (value >>> 32), (byte) (value >>> 40),
				(byte) (value >>> 48), (byte) (value >>> 56) };
	}

	public static final byte[] intToByteArray_Little(int value) {
		return new byte[] { (byte) value, (byte) (value >>> 8), (byte) (value >>> 16), (byte) (value >>> 24) };
	}

	public static final byte[] intToByteArray_Big(int value) {
		return new byte[] { (byte) (value >>> 24), (byte) (value >>> 16), (byte) (value >>> 8), (byte) value };
	}

	public static final byte[] shortToByteArray_Little(short value) {
		return new byte[] { (byte) value, (byte) (value >>> 8) };
	}

	public static final byte[] shortToByteArray_Big(short value) {
		return new byte[] { (byte) (value >>> 8), (byte) value };
	}
	
	public static final short[] byteArray2shortArray_Little(byte[] b , int length)
	{
    	short[] buf = new short[length / 2];
        for(int i=0 ; i<length/2 ; i++)
        {
        	buf[i] = byteArrayToShort_Little(b,i*2);
        }
        return buf;
	}
    public static final byte[] shortArray2byteArray_Little(short[] s , int length)
    {
    	byte[] buf = new byte[length * 2];
        for(int i=0 ; i<length ; i++)
        {
        	short s0 = s[i];
        	
        	byte[] b = shortToByteArray_Little(s0);
        	buf[i*2 + 0]=b[0];
        	buf[i*2 + 1]=b[1];
        }
        return buf;
    }

	public static final long bytes2Long(byte[] data, int length){

		byte[] bData = null;
		bData = reverse(data,length);// c 的特性需要反轉

		int mask = 0xFF;
		int temp = 0;
		long n = 0;
//        BitIntenger n = 0;

		for(int i= 0; i<length;i++){
			n <<= 8;
			temp = bData[i] & mask;
			n |= temp;

		}


		return n;
	}

	public static byte[] reverse(byte[] data,int length){
		int nSize = length;
		byte temp;

		for(int i= 0; i<nSize/2;i++){
			temp = data[i];
			data[i] = data[nSize-1 -i];
			data[nSize -1 -i] = temp;
		}
		return  data;
	}
}
