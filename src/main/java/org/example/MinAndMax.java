package org.example;
public class MinAndMax {
    public int max(int[] array) //This method to find Maximum value
    {
        int max = 0;//Declaring var max and initializing value
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {//Compares each value of array with Max value
                max = array[i];
            }
        }
        return max;//returns maximum value
    }

    public int min(int[] array) {//This method to find Minimum value
        int min = array[0];//Declaring var max and initializing value
        for (int i = 0; i < array.length; i++) {//Compares each value of array with Min value
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;//returns minimum value
    }

    public int sum(int[] array) {//This method to find Sum of array value
        int sum = 0;//Declaring var sum,avg and initializing value
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];// Adds all the numbers
        }
        avg = sum / array.length;//finds average
        return (int) avg;//returns average
    }

    public static void main(String[] args) {
        int[] myArray = {2, 56, 7, 63, 50};//Declaring array with random values
        MinAndMax m = new MinAndMax();//creating new object
        System.out.println("Maximum element is" + m.max(myArray));//displays maximum value
        System.out.println("Minimum element is" + m.min(myArray));//displays minimum value
        System.out.println("Average element is" + m.sum(myArray));//displays average of values

    }
}