package com.dilara;

public class Example7 {
    public static void main(String[] args) {
       // a'dan z'ye alfabe yazdıralım (döngü ile)

        char baslangic = 'a';
        char bitis = 'z';

        System.out.println("***** Alfabe *****");

        for (char harf=baslangic;harf<=bitis;harf++){
            System.out.print(harf+"-");
        }

        System.out.println();
        for (char i=97;i<=122; i++){ //ASCII değerleri
            System.out.print(i+" ");
        }

    }
}
