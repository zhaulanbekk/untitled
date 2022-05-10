package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(method(300));
    }
     static int method(int aty){
       // int[] aty = new int[300];
        int count=0;
        int sum=0;
        for (int i = 1; i < aty; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0){
                System.out.print(i+" ");
                sum+=i;
                count++;
             }

        }
        System.out.println();
        System.out.println(count+": san tak daana bolunot ");
        System.out.print("obshiy summasy: ");
        return sum;
     }
}
