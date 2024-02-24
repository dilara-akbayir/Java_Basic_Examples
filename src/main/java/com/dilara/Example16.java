package com.dilara;

import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        /**
         * Dışarıdan bir sayı girilsin. Bu sayı kadar satır sayısı olan
         * sola yatık bir ters üçgen yazdıralım. Yıldız sayısı; ilk satırda
         * sayı kadar olup, tek tek azalsın.
         * örnek: girilen sayı 4 ise;
         * ****
         * ***
         * **
         * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını girin: ");
        int satirSayisi = scanner.nextInt();

        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = satirSayisi; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
