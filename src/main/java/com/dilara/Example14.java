package com.dilara;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {

    //Bir öğrencinin 3 adet notunu alarak, not ortalamasını bulalım. Geçip geçmediğini
    //yazdıralım. (Eğer not ortalaması 50 veya daha yüksekse dersi geçsin.)

        int n1,n2,n3,ort;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.notu giriniz...: ");
        n1 = scanner.nextInt();
        System.out.println("2.notu giriniz...: ");
        n2 = scanner.nextInt();
        System.out.println("3.notu giriniz...: ");
        n3 = scanner.nextInt();
        ort = (n1+n2+n3)/3;
        System.out.println("Ortalama.......: " +ort);
        if(ort>=50)
            System.out.println("Geçti");
        else
            System.out.println("Kaldı");
        System.out.println("Program sonlandı.");
    }
}
