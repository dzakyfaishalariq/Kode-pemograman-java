package com.grab;
import java.util.LinkedList;
import java.util.Scanner;
public class jalur {
    static Scanner input = new Scanner(System.in);
    static LinkedList<String> v = new LinkedList<String>();
    public void pemasukan_velue() {
        //mengisi Vartexnya
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");     
    }
    public void pengoprasian() {
        //mengisi egs atau panjang jalurnya
        int e[][] = {
            //  A   B    C   D   E
               {0,  15,  0,  20, 0},//A
               {0,   0,  0,  10, 0},//B
               {-10, 0,  0,  13, 5},//C
               {0,   0,  0,  0,  0},//D
               {0,   0,  0,  12, 0} //E
        };
        //menentukan jalur terpendek dari A ke D
        System.out.println("Panjang jalur => "+v.get(0) + "->" + v.get(3) + " : ");
        // atribut nya di lihat dari matrixnya
        int e1 = 15,
            e2 = 10,
            e3 = 20,
            e4 = -10,
            e5 = 13,
            e6 = 12,
            e7 = 5;
        int jumlah = 0;
        int jumlah2 = 0;
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e.length; j++) {
                if (e1 == e[i][j]||e2 == e[i][j]) {
                    jumlah = jumlah + e[i][j];
                    continue;
                }
                if (e3==e[i][j]) {
                    jumlah2 = jumlah2+e[i][j];
                    continue;
                }
            }
        }
        System.out.println("Nilai nya ada : ");
        System.out.println(jumlah + " Dan " + jumlah2);
    }
    public static void main(String[] args) {
        jalur obj = new jalur();
        obj.pemasukan_velue();
        obj.pengoprasian();
    }
}
