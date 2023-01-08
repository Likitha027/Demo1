package org.example;

public class Multipleof6 {
    public static void main(String[] args) {
        int n = 100;//Declaring var n and initializing the value
        System.out.println("List of multiples of 6 from 0 to" + n);
        for (int i = 0; i <= n; i++) {//Declaring var i and initializing value and this loops execute till i<=100
            if (i % 6 == 0) {//checks if i divided by 2 and remainder ==0
                System.out.println(i);//displays even num
            }
        }
    }
}