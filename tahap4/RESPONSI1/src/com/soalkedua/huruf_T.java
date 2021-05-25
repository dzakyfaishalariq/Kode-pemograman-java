package com.soalkedua;

public class huruf_T {
    public void proses() {
        for (int i = 0; i < 3; i++) {
            System.out.print(" * ");
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j % 2 == 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
