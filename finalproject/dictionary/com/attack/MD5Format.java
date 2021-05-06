package com.attack;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
// MD5 format class which is uses message digest function to generate md5 hash from a string
public class MD5Format {
    public  String MD5(String s) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        byte[] bytesOfS = s.getBytes("UTF-8");
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] theDigest = md.digest(bytesOfS);
        StringBuilder sb = new StringBuilder();
        for (byte b : theDigest) {
            sb.append(String.format("%02X", b));
        }
        String hash = sb.toString().toLowerCase();
        return hash;
    }
}
