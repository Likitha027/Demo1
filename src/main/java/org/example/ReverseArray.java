package org.example;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};//Declare array
        for (int i = 0; i < a.length; i++)//Declaring var i and initializing the value to 0,checks if i<length of array & increment the i
        {
            System.out.println(a[i]);//prints the given array
        }
        System.out.println("Array in reverse order");
        for (int i = a.length - 1; i >= 0; i--) //decrement length by 1, checks if i>=0 & decrement the i
        {
            System.out.println(a[i]);//prints array in reverse order
        }
    }
}
