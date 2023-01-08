package org.example;
public class Sum
{
    public static void main(String[] args) {
        int n=10;//Declaring var n and initializing the value 10
        int sum=0;//Declaring var sum and initializing the value 0
        for (int i=0;i<=n;i++)////Declaring var i and initializing the value to 0,checks if i<=n & increment the i
        {
            sum=sum+i;//Add the elements till above condition fails
        }
        System.out.println("Sum of 10 numbers" + sum);//Prints the sum of 10
    }
}
