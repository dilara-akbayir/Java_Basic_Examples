package com.dilara;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        //Girilen iki sayının karelerinin toplamını bulalım

        System.out.print("Sayı 1'i giriniz : ");
        int s1 = new Scanner(System.in).nextInt();

        System.out.print("Sayı 2'yi giriniz : ");
        int s2 = new Scanner(System.in).nextInt();
        System.out.println("Sonuç : " +(s1*s1+s2*s2));
    }
}
