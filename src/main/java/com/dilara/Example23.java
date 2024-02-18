package com.dilara;

import java.util.Scanner;

public class Example23 {
    public static void main(String[] args) {

        //Dışarıdan girilen kelimenin palindrom olup olmadığını kontrol edelim.
        //not: palindrom kelime, hem sağdan hem de soldan aynı okunan kelimedir.


        System.out.println("Bir kelime giriniz.");
        String kelime = new Scanner(System.in).nextLine();

        String kelimeTersi = "";

        for (int i = kelime.length() - 1; i >= 0; i--) {
            kelimeTersi+=kelime.charAt(i);
        }
        if (kelimeTersi.equals(kelime)){
            System.out.println("Kelime palindromdur.");
        }else{
            System.out.println("Kelime palindrom değildir.");
        }

    }
}
