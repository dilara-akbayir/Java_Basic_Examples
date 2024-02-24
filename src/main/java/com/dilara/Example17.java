package com.dilara;

import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir sayı alıp, sayı kadar satırdan oluşan üçgen yazdıralım.
         * 1'den sayıya kadar satır olsun. Her satırda satırdaki sayının kendisi kadar sayı dönsün.
         * (Yazdırılan üçgen sola veya sağa yatık olmayacak)
         * ör: 3 sayısı girilmiş ise;
         *    1
         *   2 2
         *  3 3 3
         */
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi = new Scanner(System.in).nextInt();

        for (int i=1; i <=sayi ; i++) {
            for (int j =sayi; j>=i ; j--) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
