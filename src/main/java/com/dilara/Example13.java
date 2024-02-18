package com.dilara;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {

        //1 ile 9 arasında girilen sayının çarpım tablosunu ekrana yazdıralım.
        // 7x1 = 7
        //...
        // 7x9 = 63

        System.out.println("Bir sayı giriniz.");
        int sayi = new Scanner(System.in).nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(sayi + " x " + i + " = " + sayi * i);
        }
    }
}