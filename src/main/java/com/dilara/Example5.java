package com.dilara;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        // Dışarıdan girilen bir sayının faktöriyelini hesaplayınız

        int faktoriyel=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi= scanner.nextInt();

        for (int i=sayi;i>0;i--){
            faktoriyel=faktoriyel*i;
        }
        System.out.println(faktoriyel);
    }
}
