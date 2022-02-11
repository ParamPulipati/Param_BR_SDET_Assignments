package com.broadridge.java;

import java.util.Scanner;

public class FactorialOnedotOne  {

    public static void main(String[] args){
        int number;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        number = obj.nextInt();
        factorial(number);

    }
    private static void factorial(int number) {
            int factorial_val=1;
            int i=1;
            while (i <= number) {
                factorial_val = factorial_val*i;
                i++;
            }
            System.out.println("Factorial of "+number+" is: "+factorial_val);
        }

}
