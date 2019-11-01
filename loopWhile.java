package com.tutorial;

import java.util.Scanner;

public class loopWhile {
    public static void main(String[] args){

        Scanner userInput;
        int a=0;
        int target;
        userInput = new Scanner(System.in); //definisikan hanya sekali

        System.out.print("diulang berapa kali ? --> ");
        target = userInput.nextInt();
        boolean kondisi =true ;
        System.out.println("start code");
        while (kondisi){
            System.out.println("while.looping step - "+a);
            a++;
            kondisi = (a==target) ? false : true ;
        }
        System.out.println("end code while.loop \n");

        System.out.print("diulang berapa kali ? --> ");
        target = userInput.nextInt();
        a=0;
        System.out.println("start code");
        do{
            a++;
            System.out.println("do.while.looping step - "+a);
            kondisi = (a==target) ? false : true;
        }while (kondisi);
        System.out.println("end code do.while.loop \n");

        System.out.print("diulang berapa kali ? --> ");
        target = userInput.nextInt();
        System.out.println("for.loop start session");
        for(a=0; a < target; a++){
            System.out.println("for.looping step - "+a);
        }
        System.out.println("end code for.loop");
    }


}
