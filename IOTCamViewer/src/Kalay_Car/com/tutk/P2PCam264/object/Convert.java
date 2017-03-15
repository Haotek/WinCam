package com.tutk.P2PCam264.object;

import java.security.MessageDigest;
import java.util.Random;

/**
 * Created by Neo on 2015/11/11.
 */
public class Convert {
    public static int b2Int(byte paramByte) {
        return (paramByte + 256) % 256;
    }

    public static int byteArray2Int(byte[] paramArrayOfByte) {
        return byteArray2Int(paramArrayOfByte, 0);
    }

    public static int byteArray2Int(byte[] paramArrayOfByte, int paramInt) {
        return (b2Int(paramArrayOfByte[(paramInt + 3)]) << 24)
                + (b2Int(paramArrayOfByte[(paramInt + 2)]) << 16)
                + (b2Int(paramArrayOfByte[(paramInt + 1)]) << 8)
                + b2Int(paramArrayOfByte[paramInt]);
    }

    public static short byteArray2Short(byte[] paramArrayOfByte, int paramInt) {
        return (short) ((b2Int(paramArrayOfByte[(paramInt + 1)]) << 8) + b2Int(paramArrayOfByte[paramInt]));
    }

    public static String byteArray2String(byte[] paramArrayOfByte) {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < paramArrayOfByte.length; i++) {
            if (paramArrayOfByte[i] == 0x0) {
                break;
            }
            sBuilder.append((char) paramArrayOfByte[i]);
        }
        return sBuilder.toString();
//        return byteArray2String(paramArrayOfByte, " ");
    }

    public static String byteArray2String(byte[] paramArrayOfByte, String paramString) {
        if (paramArrayOfByte == null) {
            return null;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        int i = paramArrayOfByte.length;
        for (int j = 0; ; j++) {
            if (j >= i) {
                return localStringBuilder.toString();
            }
            byte b = paramArrayOfByte[j];
            String str = "%02x" + paramString;
            localStringBuilder.append(String.format(str, b));
        }
    }

    public static String getDigest(String paramString) {
        try {
            String str = byteArray2String(MessageDigest.getInstance("MD5")
                    .digest(paramString.getBytes("UTF-8")), "");
            return str;
        } catch (Exception localException) {
            localException.printStackTrace();
        }
        return null;
    }

    public static String getRandomHexString(int paramInt) {
        Random localRandom = new Random(System.currentTimeMillis());
        byte[] arrayOfByte = new byte[paramInt];
        localRandom.nextBytes(arrayOfByte);
        return byteArray2String(arrayOfByte, "");
    }

    public static byte[] int2ByteArray(int paramInt) {
        byte[] arrayOfByte = new byte[4];
        arrayOfByte[0] = ((byte) paramInt);
        arrayOfByte[1] = ((byte) (paramInt >> 8));
        arrayOfByte[2] = ((byte) (paramInt >> 16));
        arrayOfByte[3] = ((byte) (paramInt >> 24));
        return arrayOfByte;
    }
}
