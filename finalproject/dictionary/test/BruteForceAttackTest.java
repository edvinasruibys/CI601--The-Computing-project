package test;

import com.attack.BruteForceAttack;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

class BruteForceAttackTest {
    BruteForceAttack bruteForceAttack = new BruteForceAttack();
    @Test
    // tests if the bruteforce finds the password on a given hash input and string length
    void attackWithBruteForce() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        boolean aaaa = bruteForceAttack.attackWithBruteForce("74b87337454200d4d33f80c4663dc5e5",4);
        assertEquals(aaaa, true);
    }

    @Test
    // tests the next string of the alphabet in this case the letter "c" is the next string after letter "b"
    void next() {
        String nextString = bruteForceAttack.next("b");
        System.out.println(nextString);
        assertEquals(nextString, "c");
    }

    @Test
    // test to check if the next string works with 2 letters of the alphabet
    void nextWithDoubleString() {
        String nextString = bruteForceAttack.next("bc");
        System.out.println(nextString);
        assertEquals(nextString, "bd");
    }

    @Test
    // tests the string initialisation method which returns the number of characters based on the string length
    void stringInit() {
    	// 
        String convertedString = bruteForceAttack.stringInit(2, "a");
        assertEquals(convertedString,"aaa");
    }
}