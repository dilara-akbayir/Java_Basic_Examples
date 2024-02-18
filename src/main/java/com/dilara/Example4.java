package com.dilara;

public class Example4 {
    public static void main(String[] args) {
        // 1'den başlayarak sırayla sayıları toplayalım. Toplamımız 50'den büyük olana kadar program
        //çalışsın. Program sonunda toplamı ve programın kaç defa çalıştığını yazdıralım.

        int toplam = 0;
        int i =0;
        while (toplam<50){
            i++;
            toplam+=i;
            System.out.println(toplam);
        }
        System.out.println("Çalışma sayısı: "+i);
        System.out.println("Toplam: "+toplam);

    }
}
