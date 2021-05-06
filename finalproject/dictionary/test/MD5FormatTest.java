package test;

import com.attack.MD5Format;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;
// this test is to check if the md5 format method works correctly and it works by taking a password string and converting it to md5 hash
class MD5FormatTest {
    MD5Format md5Format = new MD5Format();
    @Test
    void MD5() throws UnsupportedEncodingException, NoSuchAlgorithmException {
    	// this is the given password
        String s = md5Format.MD5("rush2112");
        // this is the matching password hash that is expected for the MD5 method to create in order to pass the test
        assertEquals(s,"f71f21a84e7fec0da740b689c7b0bb8e");
    }
}