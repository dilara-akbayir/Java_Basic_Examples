package com.dilara;

import java.util.Scanner;

public class Example19 {
    public static void main(String[] args) {

        //Dışarıdan bir cümle veya kelime girelim. Daha sonra bir harf girelim, alınan harfin kelimenin içinde
        // kaç defa olduğunu ekrana yazdıralım.

        System.out.println("Bir kelime girin.");
        String word = new Scanner(System.in).nextLine();
        System.out.println("Bir harf girin.");
        String letter = new Scanner(System.in).nextLine();

        int sayac= 0 ;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)==letter.charAt(0)){
                sayac++;
            }
        }
        System.out.println("Girilen kelimede "+letter + " harfi " +sayac+ " kere vardır.");
    }
}
