package com.tutorial;

import javax.swing.*;
import java.util.Scanner;

public class bitwiseopr {
    public static void main(String[] args){
        //deklarasi variabel
        byte a,b,c,d,e,geser;
        String a_bits,b_bits,c_bits,d_bits,e_bits;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Nilai desimal (byte) = ");
        a = userInput.nextByte(); //ambil inputan 1
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        // atau pakai model bawah ini juga bisa
        // a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ","0");

        //System.out.printf("%s --> %d \n",a_bits,a);
        System.out.printf("%s = %d \n",a_bits,a);

        System.out.println("operasi shift left atau (<<) geser ke kiri");
        System.out.print("Geser ke Kiri berapa kali = ");
        geser = userInput.nextByte(); //ambil inputan 2
        b = (byte) (a << geser);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d --> (A)\n",b_bits,b);

        System.out.println("operasi shift right atau (>>) geser ke kanan");
        System.out.print("Geser ke Kanan berapa kali = ");
        geser = userInput.nextByte(); //ambil inputan 3
        c = (byte) (b >> geser);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d --> (B)\n",c_bits,c);

        System.out.println("\n");
        System.out.println("bitwise OR (|) (A) or (B)");
        d = (byte)(b | c);
        d_bits = String.format("%8s",Integer.toBinaryString(d)).replace(' ','0');

        System.out.printf("%s = %d --> (A)\n",b_bits,b);
        System.out.printf("%s = %d --> (B)\n",c_bits,c);
        System.out.println("--------------OR");
        System.out.printf("%s = %d --> (C)\n",d_bits,d);

        System.out.println("\n");
        System.out.println("bitwise AND (&) (A) and (B)");
        d = (byte)(b & c);
        d_bits = String.format("%8s",Integer.toBinaryString(d)).replace(' ','0');

        System.out.printf("%s = %d --> (A)\n",b_bits,b);
        System.out.printf("%s = %d --> (B)\n",c_bits,c);
        System.out.println("--------------AND");
        System.out.printf("%s = %d --> (C)\n",d_bits,d);

        System.out.println("\n");
        System.out.println("bitwise XOR (^) (A) xor (B)");
        d = (byte)(b ^ c);
        d_bits = String.format("%8s",Integer.toBinaryString(d)).replace(' ','0');

        System.out.printf("%s = %d --> (A)\n",b_bits,b);
        System.out.printf("%s = %d --> (B)\n",c_bits,c);
        System.out.println("--------------XOR");
        System.out.printf("%s = %d --> (C)\n",d_bits,d);

        System.out.println("\n");
        System.out.println("bitwise NOT (~) not (A) is (B)");
        d = (byte)(~b);
        d_bits = String.format("%8s",Integer.toBinaryString(d)).substring(24);
        System.out.printf("%s = %d --> (A)\n",b_bits,b);
        System.out.printf("%s = %d --> (B)\n",d_bits,d);

    }
}
