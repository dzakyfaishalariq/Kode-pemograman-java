package com.soalkedua;

public class huruf_A {
    public void proses() {
        for (int i = 1; i <= 4; i++) {
            System.out.print(" * ");
        }
        System.out.println();
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == 2||j == 3) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
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
                if (j==2 || j == 3) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
