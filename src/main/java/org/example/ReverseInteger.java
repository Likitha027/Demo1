package org.example;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 987654;//Declaring var num and initializing the value
        int reverse = 0;//Declaring var reverse and initializing the value to 0
        while (num != 0)//checks if the num is not equals to 0 and this loop  will run till num=0
        {
            int remainder = num % 10;//Declaring the var remainder, it stores the remainder
            reverse = reverse * 10 + remainder;//Stores the reverse num
            num = num / 10;//dividing the number to move to next digit
        }
        System.out.println("the reverse of given num is" + reverse);//prints integer in reverse order
    }
}
