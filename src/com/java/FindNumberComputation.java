package com.java;

import java.util.Scanner;

/*
@Purpose: Find Number Computation
a. Desc -> Reads in Integer number and prints them.
b. I/P -> reading random numbers in to the list
c. Logic -> Use boolean and if else statement
d. O/P -> Print the number
@file : findnumbercomputation.java
*/
public class FindNumberComputation {
	public int search(int low,int high){
        if((high-low)==1)
            return low;
        int mid = low+(high-low)/2;
        System.out.printf("is number is less than %d? type true or false : ",mid);
        boolean isLessThan = scanner.nextBoolean();
        if(isLessThan)
            return search(low,mid);
        else
            return search(mid,high);
    }
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        FindNumberComputation findNumberComputation = new FindNumberComputation();
        System.out.println("guess the number of your choice");
        int number = scanner.nextInt();
        int high = (int)Math.pow(2,number);
        int yourNumber = findNumberComputation.search(0,high);
        System.out.printf("your guessed number is %d\n",yourNumber);

    }
}
