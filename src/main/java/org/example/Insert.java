package org.example;

import java.util.Arrays;

public class Insert
{
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5};//Creating integer Array
        int newArr[]=new int[a.length+1];//creating a new array with the size greater than the previous size( bcz array size is fixed)
        int value=7;//declaring new element which has to be inserted
        System.out.println(Arrays.toString(a));//prints given array
        for (int i=0;i<a.length;i++)//Declaring var i and initializing the value to 0,checks if i<length of array & increment the i
        {
            newArr[i]=a[i];//copying the elements to newly created array
        }
        newArr[a.length]=value;//assigning the new element to the array
        System.out.println(Arrays.toString(newArr));//prints updated array//addElementInIndex(a[i],2,7);

    }
}
