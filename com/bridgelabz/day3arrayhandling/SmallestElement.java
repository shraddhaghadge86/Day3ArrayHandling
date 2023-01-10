package com.bridgelabz.day3arrayhandling;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int num = s1.nextInt();
        int[] arr1 = new int[num];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<num; i++){
            arr1[i] = s1.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i<num; i++)
        {
            System.out.print(arr1[i]+" ");
        }
        int min = arr1[0];
        for(int i = 0; i<num; i++){
            if(arr1[i] < min) {
                min = arr1[i];
            }
        }
        System.out.println("\nSmallest element present in given array: " + min);
    }
}

