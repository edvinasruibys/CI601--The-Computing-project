package com.attack;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

// main functionality of the application
public class AttackMain {

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        System.out.print("Enter the hash to find: ");
        Scanner S = new Scanner(System.in);
        String pass = S.nextLine();
        // selection of different password attacks
        CommonPasswordAttack commonPasswordAttack;
        DictionaryPasswordAttack dictionaryPasswordAttack;
        BruteForceAttack bruteForceAttack;
        int choice;
        while (true) {
            System.out.print("\n1. Common passwords attack\n2. Dictionary attack\n3. Brute force attack\n0. EXIT\nInput: ");
            choice = S.nextInt();
            if (choice == 1) {
                commonPasswordAttack = new CommonPasswordAttack();
                commonPasswordAttack.attackWithCommon(pass);
                break;
            } else if (choice == 2) {
                dictionaryPasswordAttack = new DictionaryPasswordAttack();
                dictionaryPasswordAttack.attackWithDic(pass);
                break;
            } else if (choice == 3) {
                bruteForceAttack = new BruteForceAttack();
                int length;
                Scanner sc = new Scanner(System.in);
                // functionality for the variable password length
                while (true) {
                    System.out.print("Enter length of the password (If password length is unknown enter 1): ");
                    length = sc.nextInt();
                    if (length < 1) {
                        System.out.println("Length cannot be less than 1");
                    } else {
                        break;
                    }
                }
                bruteForceAttack.attackWithBruteForce(pass, length);
                return;
            }
            else if(choice == 0)
            {
                S.close();
                return;
            } else {
                System.out.println("Invalid choice!!\n");
            }
        }
    }

}
//test hash 74b87337454200d4d33f80c4663dc5e5 for password aaaa
//test hash e2fc714c4727ee9395f324cd2e7f331f for password abcd