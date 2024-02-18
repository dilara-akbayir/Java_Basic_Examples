package com.dilara;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        // 1'den girdiğimiz sayıya kadar olan çift sayıların toplamını yazdıralım

        int i;
        int toplam=0;
        System.out.println("Bir sayı giriniz.");
        Scanner scanner=new Scanner(System.in);
        int sayi=scanner.nextInt();

        for (i=2;i<=sayi;i+=2){
            toplam+=i;
            System.out.println("i===>"+i);
        }

        System.out.println(toplam);
        toplam=0;

        for (i=1;i<=sayi;i++){
            int ciftSayi=i%2==0?i:0;
            toplam+=ciftSayi;
        }

        System.out.println(toplam);

        }
    }

