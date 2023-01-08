package org.example;
public class Even {
    public static void main(String[] args) {
        int n=100;//Declaring var n and initializing the value
        System.out.println("List of even num from 0 to" + n);
        for (int i=0;i<=n;i++)//Declaring var i and initializing value and this loops execute till i<=100
        {
            if (i%2==0)//checks if i divided by 2 and remainder ==0
            {
                System.out.println(i);//displays even num
            }
        }
    }
}
