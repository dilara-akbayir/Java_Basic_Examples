package com.dilara;

import java.util.Scanner;

public class Example21 {
    public static void main(String[] args) {

        //Dışarıdan girilen bir sayının asal sayı olup olmadığını bulup
        //eğer asalsa ekrana 'asaldır', değilse 'asal değildir' çıktısını verelim.

        System.out.println("lütfen bir sayı giriniz");
        int sayi =new Scanner(System.in).nextInt();

        boolean asalmi=true;

        if (sayi==2){
            System.out.println("2 bir asal sayıdır");
        }else{
            for (int i = 2; i <sayi ; i++) {
                if (sayi%i==0){
                    asalmi=false;
                    break;
                }
            }

            if (asalmi){
                System.out.println(sayi+" Asal sayıdır");
            }else{
                System.out.println(sayi+" Asal sayı değildir");
            }
        }
    }
}
