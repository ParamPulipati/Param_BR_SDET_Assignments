package com.broadridge.java;

public class TriangleArrayOnedotTen {
    public static void main(String args[]) {
        String [][] arr = new String [10][21];
        int count = 0;
        for (int i=9;i>=0;i--) {
            for (int j = count; j < 21-count; j++) {
                if(count%2==0) {
                    if (j % 2 == 0) {
                        arr[i][j] = " ";
                    } else {

                        arr[i][j] = "0";
                    }
                }
                else{
                    if (j%2==0) {
                        arr[i][j] = "0";
                    }
                    else{

                        arr[i][j] = " ";
                    }
                }
            }
            count = count+1;
        }

        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < 21; j++) {
                if(arr[i][j]==null){
                    System.out.print(" ");
                }
                else{
                    System.out.print(arr[i][j]);
                }

            }
            System.out.println();
        }

    }
}
