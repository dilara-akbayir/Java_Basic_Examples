package com.dilara;

import java.util.Scanner;

public class Example20 {
    public static void main(String[] args) {
        /**
         * Dısarıdan girilen bir sayının mükemmel sayı olup olmadığını bulalım.
         * Mükemmel sayı, kendisi haric bölenlerinin toplamı kendisine eşit olan
         * sayıdır.
         * örnek: 6=1+2+3;
         */

        int toplam = 0;

        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = new Scanner(System.in).nextInt();

        for (int i = 1; i <=sayi/2 ; i++) {
            if(sayi%i==0){
                System.out.println(i);
                toplam+=i;
                if (toplam==sayi){
                    System.out.println(+sayi +" bir mükemmel sayıdır.");
                }
            }
        }
    }
}
