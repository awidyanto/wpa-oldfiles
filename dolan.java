package com.tutorial;

import java.util.Scanner;

public class dolan {
    public static void main(String[] args){

        int a,b;
        Scanner inputUser;

        inputUser = new Scanner(System.in);
        System.out.print(" masukkan nilai panjang = ");
        int inputPanjang = inputUser.nextInt();
        System.out.print(" masukkan nilai lebar = ");
        int inputLebar = inputUser.nextInt();

        tampil(inputPanjang,inputLebar);
    }

    private static int luas(int panjang, int lebar){
        int hasil = (panjang*lebar);
        return  hasil;
    }

    private static int keliling(int panjang, int lebar){
        int hasil = (panjang+lebar)*2;
        return hasil;
    }

    private static void tampil(int panjang, int lebar){
        System.out.println("suatu bangun dengan panjang " + panjang + " dan lebar = " + lebar);
        int i,j;
        for (i=0;i<lebar;i++){
            for(j=0;j<panjang;j++){
                System.out.print("* ");
            }
            System.out.println("* ");
        }
        System.out.println("Luas bangun = " + luas(panjang, lebar));
        System.out.println("Kelilingn bangun =" + keliling(panjang, lebar));
    }


}
