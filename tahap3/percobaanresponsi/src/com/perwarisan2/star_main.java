package com.perwarisan2;

public class star_main {
    public static void main(String[] args) {
        induk obj = new induk();
        obj.judul();
        pembuatansegitiga obj2 = new pembuatansegitiga("========Pogram berjalan========");
        System.out.println(pembuatansegitiga.nama);
        obj2.batas = 10;
        obj2.judul();
    }
}
