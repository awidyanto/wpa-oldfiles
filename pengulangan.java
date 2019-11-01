package com.tutorial;

import java.util.Scanner;

public class pengulangan {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int nilaiAwal, nilaiAkhir, total;

        System.out.print("masukkan nilai awal : ");
        nilaiAwal = userInput.nextInt();
        System.out.print("masukkan nilai akhir : ");
        nilaiAkhir = userInput.nextInt();

        System.out.println("\nnilai awal = " + nilaiAwal);
        total = 0;
        for(;nilaiAwal<=nilaiAkhir;){

            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi "+ total);
            nilaiAwal++;
        }

    }
}
