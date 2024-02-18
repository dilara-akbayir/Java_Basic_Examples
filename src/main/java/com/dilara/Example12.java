package com.dilara;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {

        //Dışarıdan bir taban değeri ve üs değeri alıp, sonucu ekrana yazdıralım.
        //(2 üzeri 3 = 8)

        System.out.println("Bir taban değeri girin: ");
        int taban = new Scanner(System.in).nextInt();
        System.out.println("Bir üs değeri girin: ");
        int us = new Scanner(System.in).nextInt();
        int sonuc = 1;

        for (int i = 1; i<=us; i++) {
            sonuc*=taban;
        }
        System.out.println(taban+"^"+us+"= "+sonuc);
    }
}
