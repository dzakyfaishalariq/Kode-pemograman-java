package com.soalkedua;

public class huruf_H {
    public void proses_H() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j <= 1 || j >= 4) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            System.out.print(" * ");
        }
        System.out.println();
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j <= 1 || j >= 4) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
