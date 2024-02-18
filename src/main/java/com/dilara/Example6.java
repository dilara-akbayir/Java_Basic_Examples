package com.dilara;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        //Girilen sayının basamakları toplamını ve kaç basamaklı olduğunu do-while
        //ile ekrana yazdıralım.

        int basamakSayisi=0;
        int basamakToplami=0;

        System.out.println("Lütfen bir sayı giriniz.");
        Scanner scanner=new Scanner(System.in);
        int sayi=scanner.nextInt();

        do {
            int basamakDegeri=sayi%10;
            basamakToplami+=basamakDegeri;
            basamakSayisi++;
            sayi=sayi/10;
        }while (sayi>0);
        //ctrl + d ile satır aşağı kopyalanır
        System.out.println("Basamak toplamı: "+basamakToplami);
        System.out.println("Basamak sayısı: "+basamakSayisi);
    }
}
