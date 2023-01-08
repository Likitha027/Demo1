package org.example;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Logic";//Declaring var s and initializing the value
        String ns = "";//Empty string
        char ch;//Declaring character ch
        System.out.println(s);//prints word Logic
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);//extracts each character
            ns = ch + ns;//adds each character in front of the existing string
        }
        System.out.println("reverse word" + ns);//prints reverse string

    }
}
/* {
    StringBuilder input=new StringBuilder();
    input.append(stringtobereversed);
    input.reverse();
    System.out.println("reversed string"+input);
}*/