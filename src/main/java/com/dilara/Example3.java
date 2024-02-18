package com.dilara;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        // 1'den girdiğimiz sayıya kadar olan sayıları yazdıralım.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi ; i++) {
            System.out.print(i+" ");
        }

    }
}
