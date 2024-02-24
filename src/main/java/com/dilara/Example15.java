package com.dilara;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan alınan bir sayıya göre sola yatık dik üçgen çizen
         * kodu çiziniz.
         * 1
         * 12
         * 123
         * 1234
         */

        System.out.println("Bir sayı giriniz.");
        int sayi = new Scanner(System.in).nextInt();

        for (int i=1; i <=sayi ; i++) {
            for (int j = 1; j<=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}