package com.tutorial;

import java.util.Arrays;

public class array {
    public static void main(String[] args){

        int[] arrayinteger = {1,2,3,5,4}; // assignment
        arrayinteger[4] = 25;
        System.out.println(arrayinteger[0]);
        System.out.println(arrayinteger[2]);

        float[] arrayfloat = new float[5]; //deklarasi array
        arrayfloat[1]=15.5f;
        System.out.println(arrayfloat[0]);
        System.out.println(arrayfloat[1]);

        System.out.println(Arrays.toString(arrayfloat));
        System.out.println(Arrays.toString(arrayinteger));
    }
}
