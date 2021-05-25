package com.perwarisan2;

public class pembuatansegitiga extends induk{
    public int batas;
    public pembuatansegitiga(String namaObjek){
        pembuatansegitiga.nama = namaObjek;
    }
    @Override
    public void judul() {
        for (int i = 1; i <= this.batas; i++) {
            for (int j = this.batas; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= this.batas + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < this.batas; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
