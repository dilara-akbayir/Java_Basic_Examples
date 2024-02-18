package com.dilara;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        // 1'den girdiğimiz sayıya kadar olan sayıların toplamını ekrana yazdıralım.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int number = scanner.nextInt();
        int toplam = 0;

        for (int i = 1; i <= number ; i++) {
            toplam += i;
        }
        System.out.println("Toplam: "+toplam);
    }
}
