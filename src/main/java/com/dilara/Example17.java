package com.dilara;

import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {

    //Bir kullanıcıdan adını alıp, adını tersten yazdıralım

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
