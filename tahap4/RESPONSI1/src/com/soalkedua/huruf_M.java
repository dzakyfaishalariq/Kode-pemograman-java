package com.soalkedua;

public class huruf_M {
    public void proses() {
        //baris pertama
        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == 5) {
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
        }
        System.out.println();
        //baris kedua
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.print("   ");
            } else {
                System.out.print(" * ");
            }
        }
        System.out.println();
        //baris ketiga
        for (int i = 1; i <= 5; i++) {
            if (i == 2 || i == 4) {
                System.out.print("   ");
            }else{
                System.out.print(" * ");
            }
        }
        System.out.println();
        //baris ke empat
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }    
}
