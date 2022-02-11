package com.broadridge.java;

import java.util.Scanner;

public class ArrayReverseOnedotEight {

    public static void main(String[] args) {
        //Initialize array
        Scanner obj = new Scanner(System.in);
        System.out.println("enter array size");
        int arrsize = obj.nextInt();
        int [] arr = new int [arrsize];
        System.out.println("enter array values ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("Array in reverse order: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
