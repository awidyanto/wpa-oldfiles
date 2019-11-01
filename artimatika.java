package com.tutorial;

public class artimatika {
    public static void main(String[] args){

        //operasi aritmatika
        int variabel1 = 6;
        int variabel2 = 4;
        int hasil;

        //penjumlahan
        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);

        //pengurangan
        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n", variabel1, variabel2, hasil);

        //perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d x %d = %d \n", variabel1, variabel2, hasil);

        //pembagian ..hasilnya tidak sesuai karena pecahan
        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n", variabel1, variabel2, hasil);

        //modulus
        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d \n", variabel1, variabel2, hasil);


    }
}
