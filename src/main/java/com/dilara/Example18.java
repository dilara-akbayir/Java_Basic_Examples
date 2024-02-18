package com.dilara;

import java.util.Scanner;

public class Example18 {
    public static void main(String[] args) {

        /**
         * Dışarıdan bir kelime girelim ve her harfin başına index numarası
         * gelecek şekilde ekrana yazdıralım.
         * ör. kelime = kod ise;
         * 0-k
         * 1-o
         * 2-d
         */

        System.out.println("Bir kelime giriniz.");
        String kelime = new Scanner(System.in).nextLine();
        for (int i = 0; i <kelime.length(); i++) {
            System.out.println(i + " - "+ kelime.charAt(i));
        }
    }
}
