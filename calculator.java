package com.tutorial;

import java.util.Scanner;

public class calculator {
    public  static void main(String[] args){

        Scanner userInput;
        float a,b,hasil;
        char operator;

        userInput = new Scanner(System.in);
        System.out.print("a = ");
        a = userInput.nextFloat();

        userInput = new Scanner(System.in);
        System.out.print("operator = ");
        operator = userInput.next().charAt(0);

        userInput = new Scanner(System.in);
        System.out.print("b = ");
        b = userInput.nextFloat();

//        System.out.println(a + " " + operator + " " + b);

        if (operator == '+'){
            hasil = a + b ;
            System.out.println(a + " " + operator + " " + b + " = " + hasil);
        }else if (operator == '-') {
            hasil = a - b;
            System.out.println(a + " " + operator + " " + b + " = " + hasil);
        }else if (operator == '*'){
        hasil = a * b ;
            System.out.println(a + " " + operator + " " + b + " = " + hasil);
        }else if (operator == '/') {
            if (b == 0){
                System.out.println(a + " " + operator + " " + b + " = Tak Terhingga");
            }else {
            hasil = a/b;
                System.out.println(a + " " + operator + " " + b + " = " + hasil);
            }
        }else
            System.out.println("operator tidak tersedia");



    }
}
