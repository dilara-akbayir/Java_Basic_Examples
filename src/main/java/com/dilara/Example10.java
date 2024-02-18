package com.dilara;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        //En büyük sayıyı bulalım

        int s1,s2,s3,s4,enb;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz.....:");
        s1 = sc.nextInt();
        System.out.println("2.sayıyı giriniz.....:");
        s2= sc.nextInt();
        System.out.println("3.sayıyı giriniz.....:");
        s3 = sc.nextInt();
        System.out.println("4.sayıyı giriniz.....:");
        s4 = sc.nextInt();
        if(s1>s2 && s1>s3 && s1>s4) {enb = s1;
        }else if (s2>s1 && s2>s3 && s2>s4) {enb = s2;
        }else if (s3>s1 && s3>s2 && s3>s4) {enb = s3;
        }else {enb = s4;
        }
        System.out.println("En büyük sayı......: " +enb);
        System.out.println("Program sonlandı.");
    }
}
