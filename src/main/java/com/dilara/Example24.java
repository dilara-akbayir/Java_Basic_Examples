package com.dilara;

public class Example24 {
    public static void main(String[] args) {

        //String kelimeyi virgüllerden ayırıp, her değeri alt alta ekrana yazdıralım.

        String kelime = "Java,React,Css,Html";

        for (int i = 0; i < kelime.length(); i++) {
            int index = kelime.indexOf(",");

            if (index != -1) {
                System.out.println(kelime.substring(0, index));
                kelime = kelime.substring(index + 1);
            } else {
                System.out.println(kelime);
            }
        }
    }
}
