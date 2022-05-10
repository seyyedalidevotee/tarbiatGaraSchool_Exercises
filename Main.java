package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        bt(lines);

    }
    //تابع اصلی چاپ m
    public static void bt(int a) {
        int b = a;
        for (int i = a; i > 0; i--) {
            btr(i);
            btr((b - i) * 2);
            btr((i - 1) * 2);
            btr((b - i) * 2);
            System.out.println("");

        }
    }
    //تابع چاپ فاصله + *
    public static void btr(int e) {
        if (e != 0) {
            for (int i = 0; i < e; i++) {
                System.out.print("\t");
            }
            System.out.print("*");
        } else {
            System.out.print("*");
        }
    }


}