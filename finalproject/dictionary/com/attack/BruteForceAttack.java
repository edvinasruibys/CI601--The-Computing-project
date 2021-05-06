package com.attack;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class BruteForceAttack {
		
    MD5Format md5Format = new MD5Format();
    public boolean attackWithBruteForce(String pass, int length) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        boolean found;

        String guessString = stringInit(length, "");

        // loop that keeps matching passwords until it finds a matching password
        while (true) {
            String Match = md5Format.MD5(guessString);
            
         // Added a line to output the current password guess
            System.out.println(guessString);
            
            if (Match.equals(pass)) {
                System.out.println("Password found: \n" + guessString);
                found = true;
                break;
            }
            guessString = next(guessString);
        }
        return found;
    }
    
    // method that increases string length once the loop reaches the letter "z"
    public  String next(String s) {
        int length = s.length();
        char c = s.charAt(length - 1);

        if (c == 'z')
            return length > 1 ? next(s.substring(0, length - 1)) + 'a' : "aa";

        return s.substring(0, length - 1) + ++c;
    }

    public  String stringInit(int length, String str) {
        for(int i=0; i<length; i++)
        {
            str += "a";
        }
        return str;
    }
}
