/*
 * Copyright: 2017 aisecurius.com Inc. All rights reserved.
*/
package com.aisecurius.ctu.client.model;

import org.apache.commons.lang3.StringUtils;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @FileName: Context.java
 * @Description: Context.java
 * @Author: lizhi
 * @Date: 2017/11/1 14:43
 */
public class CtuConstidContext {
    public static final int DEFAULT_CONNECT_TIMEOUT = 2000;
    public static final int DEFAULT_CONNECTION_REQUEST_TIMEOUT = 2000;
    public static final int DEFAULT_SOCKET_TIMEOUT = 2000;
    public static final boolean USE_DEFAULT_TIMEOUT_SETTING = true;

    public static final Charset DEFAULT_CHARSET = Charset.forName("utf-8");
    public static final String GET_DEVICE_INFO_URL = "/udid/api/getDeviceInfo";


    /**
     * Calculate the md 5 digest of the given data
     *
     * @param data The dataset for which summaries need to be computed
     * @return
     */
    public final static String md5(byte[]... data) {
        if (data == null || data.length < 1) {
            return "";
        }
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        if (md5 == null) {
            return "";
        }
        for (byte[] item : data) {
            md5.update(item);
        }

        BigInteger bi = new BigInteger(1, md5.digest());
        String m = bi.toString(16);
        return StringUtils.leftPad(m, 32, "0");
    }

}
