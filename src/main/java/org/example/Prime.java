package org.example;
public class Prime
{
    public static void main(String[] args)
    {
        int num =0;//Declaring var num and initializing the value to 0
        String  primeNumbers = "";//Empty string

        for (int i = 1; i <= 100; i++)//Declaring var i and initializing the value to 1,checks if i<=100& increment the i
        {
            int count=0;//Declaring var count and initializing the value to 0
            for(num =i; num>=1; num--)
            {
                if(i%num==0)//checks i divisible by num and remainder ==0
                {
                    count++;//if above condition is true ,then increment the count
                }
            }
            if (count ==2)
            {
                //Appended the Prime number to the string
                primeNumbers = primeNumbers + i +" ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :" +primeNumbers);

    }
}
