package com.dilara;

public class Example25 {
    public static void main(String[] args) {

        /**
         * 1 ile 400 arasında hem 15'in katı hem de 7'ye bölümünden
         * kalan 2 olan sayıları bulunuz.
         */

            int sayac=0;
            for(int i=0;i<400;i+=15) {
                if (i % 7 == 2) {
                    System.out.println("Sayı: " + i);
                    sayac++;
                }
            }
            if(sayac>0){
                System.out.println(sayac+" adet sayı bulunmuştur.");
            }else {
                System.out.println("Böyle bir sayı yoktur.");
            }
        }
    }


