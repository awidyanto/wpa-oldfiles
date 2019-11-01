package com.tutorial;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class sahl {
    public static void main(String[] args) {
        String nama, tampil;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Ketikkan nama kamu :");
        nama = userInput.next();

        System.out.println("Halo " + nama + ", Selamat datang di Java");

        switch (nama) {
            case "SYIFA":
                System.out.println("Nomor Anggota kamu 001");
                break;
            case "SAHL":
                System.out.println("Nomor Anggota kamu 002");
                break;
            case "SALMAN":
                System.out.println("Nomor Anggota kamu 003");
                break;
            default:
                System.out.println(nama + " belum terdaftar.");
        }

//        if (nama.equals("SYIFA") || nama.equals("SAHL")){
//            System.out.println("Nomor anggota kamu : 001");
//        } else {
//            System.out.println("Kamu belum terdaftar");
//

        tampil = nama.equals("SYIFA") ? "Nomor Anggota 001" : "Kamu belum terdaftar";
        System.out.println("Hai " + nama + ", " + tampil);
    }
}