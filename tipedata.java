package com.tutorial;

public class tipedata {
    public static void main(String[] args){

        // tipe data primitive di Java
        // byte,short,integer,long,float,double,char,boolean

        //byte( (satuan)
        byte b = 10;
        System.out.println("=====BYTE=====");
        System.out.println("Contoh nilai byte : " + b);
        System.out.println("Nilai max = " + Byte.MAX_VALUE);
        System.out.println("Nilai min = " + Byte.MIN_VALUE);
        System.out.println("Besar byte : " + Byte.BYTES + " bytes");
        System.out.println("Besar byte : " + Byte.SIZE + " bit \n");


        //short (satuan)
        short s = 10;
        System.out.println("=====SHORT=====");
        System.out.println("Contoh nilai short : " + s);
        System.out.println("Nilai max = " + Short.MAX_VALUE);
        System.out.println("Nilai min = " + Short.MIN_VALUE);
        System.out.println("Besar short : " + Short.BYTES + " bytes");
        System.out.println("Besar short : " + Short.SIZE + " bit \n");

        //integer (satuan)
        int i = 10;
        System.out.println("=====INTEGER=====");
        System.out.println("Contoh nilai integer : " + i);
        System.out.println("Nilai max = " + Integer.MAX_VALUE);
        System.out.println("Nilai min = " + Integer.MIN_VALUE);
        System.out.println("Besar integer : " + Integer.BYTES + " bytes");
        System.out.println("Besar integer : " + Integer.SIZE + " bit \n");

        //long (satuan)
        long l = 10L;
        System.out.println("=====LONG=====");
        System.out.println("Contoh nilai long : " + l);
        System.out.println("Nilai max = " + Long.MAX_VALUE);
        System.out.println("Nilai min = " + Long.MIN_VALUE);
        System.out.println("Besar Long : " + Long.BYTES + " bytes");
        System.out.println("Besar Long : " + Long.SIZE + " bit \n");

        //float (koma, bilangan real)
        float f = 10.23F;
        System.out.println("=====FLOAT=====");
        System.out.println("Contoh nilai float : " + f);
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        System.out.println("Nilai min = " + Float.MIN_VALUE);
        System.out.println("Besar float : " + Float.BYTES + " bytes");
        System.out.println("Besar float : " + Float.SIZE + " bit \n");

        //double (koma, bilangan real)
        double d = 10.25D;
        System.out.println("=====DOUBLE=====");
        System.out.println("Contoh nilai double : " + d);
        System.out.println("Nilai max = " + Double.MAX_VALUE);
        System.out.println("Nilai min = " + Double.MIN_VALUE);
        System.out.println("Besar double : " + Double.BYTES + " bytes");
        System.out.println("Besar double : " + Double.SIZE + " bit \n");

        //char (koma, bilangan real) berdasarkan ASCII
        char c = 'c';
        System.out.println("=====CHAR=====");
        System.out.println("Contoh nilai char : " + c);
        System.out.println("Nilai max = " + Character.MAX_VALUE);
        System.out.println("Nilai min = " + Character.MIN_VALUE);
        System.out.println("Besar char : " + Character.BYTES + " bytes");
        System.out.println("Besar char : " + Character.SIZE + " bit \n");

        //boolean ()
        boolean val = true;
        System.out.println("=====BOOLEAN=====");
        System.out.println("Contoh nilai char : " + val);
        System.out.println("Nilai max = " + Boolean.TRUE);
        System.out.println("Nilai min = " + Boolean.FALSE);


    }
}
