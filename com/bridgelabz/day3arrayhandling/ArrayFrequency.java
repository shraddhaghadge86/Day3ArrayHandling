package com.bridgelabz.day3arrayhandling;

import java.util.Scanner;

public class ArrayFrequency {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter total number of array elements: ");
        int num = s1.nextInt();
        int[] arr = new int[num];
        int[] fr = new int[arr.length];
        int visited = 'a';
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s1.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int c = 1;
            for (int j = i + 1; j < arr.length; j++) {
            if(arr[i] == arr[j]){
                c++;
                fr[j]= visited;
            }
                System.out.println(fr[j]);
            }

            if(fr[i] != visited){
                fr[i] = c;
                System.out.println(arr[i] + " " + fr[i]);
            }


        }
    }
}
