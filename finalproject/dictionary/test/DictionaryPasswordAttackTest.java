package test;

import com.attack.DictionaryPasswordAttack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryPasswordAttackTest {
    DictionaryPasswordAttack dictionaryPasswordAttack = new DictionaryPasswordAttack();
// tests if the given input is not found in the dictionary which would return "Password not found" in the console
    @Test
    void testattackWithDicNotFound() {
    	// hash for a word that does not exist in the dictionary
        boolean test = dictionaryPasswordAttack.attackWithDic("74b87337454200dd33f80c4663dc5e5"); 
        assertEquals(test, false);
    }
// tests if the given input is found in the dictionary
    @Test
    void testattackWithDicFound() {
    	// hash for aaaa password which is in the dictionary
        boolean test = dictionaryPasswordAttack.attackWithDic("74b87337454200d4d33f80c4663dc5e5"); 
        assertEquals(test, true);
    }
}