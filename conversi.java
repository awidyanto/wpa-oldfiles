package com.tutorial;

import java.awt.*;
import java.util.Scanner;

public class conversi {
    public static void main(String[] args){
        int panjang,lebar,tinggi,luas,i;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();


        luas =panjang*lebar;
        System.out.println("Luas = " + luas);

        System.out.println("=========CONVERSI.type.data========");
        System.out.print("Nilai integer yang di konversi = ");
        i = userInput.nextInt();
        System.out.println("nilai integer " + i);

        //konversi ke tipe yang lebih besar misal long
        long l = i;
        System.out.println("hasil konversi ke nilai long " + l);

        //konversi ke tipe yang lebih kecil misal byte
        byte b = (byte) i;
        System.out.println("hasil konversi ke nilai byte " + b);
        System.out.println("/konversi tersebut benar metodenya, tapi salah hasinya/");

        System.out.println("ingat tipe data ya tong kalo mo konversi");
        System.out.println("biar kasus diatas tidak terulang... ");

        int x = 10;
        int y = 4;
        float z =(float)x / y;

        System.out.printf("%d / %d = %f \n",x,y,z);
        y--;
        x++;
        System.out.printf("nilai dari %d dan %d \n",x,y);

        y += 5;
        x *= 3;
        z *= 2;
        System.out.printf("nilai dari %d dan %d dan %f \n",x,y,z);
    }
}
