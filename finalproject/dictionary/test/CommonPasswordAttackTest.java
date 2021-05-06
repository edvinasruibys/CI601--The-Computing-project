package test;

import com.attack.CommonPasswordAttack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonPasswordAttackTest {
    CommonPasswordAttack commonPasswordAttack = new CommonPasswordAttack();
 // tests if the given input is not found in the dictionary which would return "Password not found" in the console
    @Test
    void testattackWithCommonWithNotFound() {
    	// hash for a word that does not exist in the dictionary
        boolean b = commonPasswordAttack.attackWithCommon("74b87337454200dd33f80c4663dc5e5");
        assertEquals(b,false);
    }
 // tests if the given input is found in the dictionary
    @Test
    void testattackWithCommonWithFound() {
    	// hash for aaaa password which is in the dictionary
        boolean b = commonPasswordAttack.attackWithCommon("74b87337454200d4d33f80c4663dc5e5");
        assertEquals(b,true);
    }
}