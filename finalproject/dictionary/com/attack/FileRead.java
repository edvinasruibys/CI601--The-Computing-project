package com.attack;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
// the fileRead class contains the file reader which is used by common password attack and dictionary password attack
public class FileRead {
	
    public static String foundPassword = null; // variable for found password
    
	MD5Format md5Format = new MD5Format();
// the file reader takes the file path of the dictionary
    public boolean readFile(String filePath, String matchString)
    {
        try {
            java.io.FileReader fr = null;
            BufferedReader br = null;
            File absolute = new File(filePath);
            fr = new java.io.FileReader(absolute);
            String currentLine;
            br = new BufferedReader(fr);
            int x = 0;
// while loop which reads and hashes each line of the dictionary and looks for a matching hash string
            while ((currentLine = br.readLine()) != null) {
                String readLine = md5Format.MD5(currentLine);
                System.out.println("MD5 Hash: " +readLine + " Password: " + currentLine); // print hash and password
                if (readLine.equalsIgnoreCase(matchString)) {
                	FileRead.foundPassword = currentLine; // save the found password
                    return true;
                }
            }
            br.close();

            return false;
        } catch (IOException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            System.out.println("Wrong arguments");
        }
        return false;
    }
}
