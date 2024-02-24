package com.dilara;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        // Dışarıdan aldığımız iki sayının toplamının çift olup olmadığını if-else kullanmadan
        // ekrana yazdıralım.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi2 = scanner.nextInt();

        int toplam = sayi1 + sayi2;

        System.out.println("Toplam: " + toplam);
        boolean kontrol = toplam % 2 == 0;
        if (toplam % 2 == 0) {
            System.out.println("Girdiğiniz sayı çift sayıdır.");
        } else {
            System.out.println("Girdiğiniz sayı tek sayıdır.");
        }
    }
}

