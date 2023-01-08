package org.example;

import java.util.Scanner;

public class Vowels {
    public void findVowel(char ch)//This method will check if the given letter is vowels or not
    {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("Entered character" + ch + "is a Vowel");
        } else
        {
            System.out.println("Entered character " + ch + "is not a vowel");
        }
    }

    public static void main(String[] args) {
        Vowels c = new Vowels();//created new object reference var
        Scanner sc = new Scanner(System.in);//instantiating scanner object & getting input character
        System.out.println("enter a character");
        char ch = sc.next().charAt(0);//getting the first character only
        c.findVowel(ch);

    }
}
