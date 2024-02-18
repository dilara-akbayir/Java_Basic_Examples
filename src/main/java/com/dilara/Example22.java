package com.dilara;

import java.util.Scanner;

public class Example22 {
    public static void main(String[] args) {

        //Dışarıdan bir metin girip daha sonra bu metni tersten yazdıralım.

        System.out.println("Bir kelime giriniz.");
        String kelime = new Scanner(System.in).nextLine();

        String yeniKelime="";

        for (int i = kelime.length() - 1; i >= 0; i--) {
            System.out.print(kelime.charAt(i));
            yeniKelime += kelime.charAt(i);
        }
        System.out.println();
        System.out.println("Kelimenin tersi: "+yeniKelime);
    }
}
