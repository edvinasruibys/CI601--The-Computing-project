package com.attack;

public class CommonPasswordAttack {
	// this class uses file reader to select the password dictionary from a given path
    public final String path= "resource/commonpasswords.txt";
    // after receiving input it calls the readFile method from the FileRead class and checks if the password will match
    public boolean attackWithCommon(String input)
    {
        FileRead fileRead = new FileRead();
        boolean b = fileRead.readFile(path, input);
        if (b) // if b is true
        {
        	// prints out "Password Found" and prints the password as a text
            System.out.println("Password Found: "+ fileRead.foundPassword);
            return true;
        } else {
        	// if the hash does not match with words from dictionary, will print "Password not found"
            System.out.println("Password not found");
            return false;
        }
    }
}
