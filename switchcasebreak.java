package com.tutorial;

import java.util.Scanner;
import java.util.logging.LoggingPermission;

public class switchcasebreak {
    public static void main(String[] args){

        Scanner userInput;
        float a,b,hasil;
        String operator;

        userInput =new Scanner(System.in);
        System.out.print("Nilai a : ");
        a = userInput.nextFloat();
        System.out.print("Operator : ");
        operator = userInput.next();
        System.out.print("Nilai b = ");
        b = userInput.nextFloat();

        switch (operator){
            case "+" :
                System.out.print("Operasi Penjumlahan \n");
                hasil = a + b;
                System.out.println(a + " " +operator+ " "+b+" = "+ hasil);
            break;
            case "-" :
                System.out.print("Operasi Pengurangan \n");
                hasil = a - b;
                System.out.println(a + " " +operator+ " "+b+" = "+ hasil);
                break;
            case "*" :
                System.out.print("Operasi Perkalian \n");
                hasil = a * b;
                System.out.println(a + " " +operator+ " "+b+" = "+ hasil);
                break;
            case "/" :
                System.out.print("Operasi Pembagian \n");
                hasil = a / b;
                System.out.println(a + " " +operator+ " "+b+" = "+ hasil);
                break;
            default:
                System.out.println("operator "+operator+ " tidak dikenali");

        }


    }
}
