package com.tutorial;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        int f_n,f_n_1,f_n_2,n,i;
        boolean kondisi;
        Scanner userInput;

        userInput = new Scanner(System.in);
        System.out.print("tampilkan deret fibonacci ke - ");
        n = userInput.nextInt();

        f_n = 1;
        f_n_1 = 1;
        f_n_2 =0;
        i = 1;
        while (i <= n) {
            System.out.println("nilai deret fibonacci ke " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;
            if(i == n){
                continue;
            }
        }



    }
}
