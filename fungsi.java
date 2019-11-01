package com.tutorial;

import java.util.Scanner;

public class fungsi {
    public static void main (String[] args){
        Scanner inputUser;
        int inputPanjang, inputLebar;

        inputUser = new Scanner(System.in);

        System.out.print("panjang = ");
        inputPanjang = inputUser.nextInt();
        System.out.print("lebar = ");
        inputLebar = inputUser.nextInt();

        tampil(inputPanjang,inputLebar); //panggil fungsi tampil

    }
    private static int luas(int panjang, int lebar){
        int hasil = (panjang * lebar);
        return hasil;

    }

    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;

    }

    private static void tampil(int panjang, int lebar){
        int i,j;
        for (i=0; i<lebar; i++){
            for(j=0; j<panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("Luas = "+luas(panjang, lebar));//panggil fungsi luas
        System.out.println("Keliling = "+keliling(panjang, lebar));//panggil fungsi keliling
    }
}
