package com.dilara;

import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        /**
         * Aşağıdaki üçgeni oluşturalım
         *
         *       1
         *      2 2
         *     3 3 3
         *    4 4 4 4
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
