package test;

import com.attack.FileRead;
import org.junit.jupiter.api.Test;

import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;
//this test is to check if the fileRead method class works correctly
class FileReadTest {
    FileRead fileRead = new FileRead();
    @Test
    void readFile() {
        boolean aaaa = fileRead.readFile("resource/dictionary.txt", "74b87337454200d4d33f80c4663dc5e5");
        assertEquals(aaaa,true);
    }
}
// the boolean passes the file path and the password hash. Then it checks if the hash matches with the "aaaa" keyword in the dictionary