package com.perkalian_metrix;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Random;
public class matrix {
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public int batasx,batasy;
    public void inputbatasanmetrix() {
        String bx = null,by = null;
        try {
            System.out.print("Masukan batas matrix panjang baris : ");
            bx = masuk.readLine();
            System.out.print("Masukan batas matrix panjang kolom : ");
            by = masuk.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Maaf kode error");
            e.printStackTrace();
        }
        this.batasx = Integer.valueOf(bx).intValue();
        this.batasy = Integer.valueOf(by).intValue();
    }
    public int b,c = 0,d,e = 0,f,g = 0;
    public void algortimaperkalianmetrix() {
        Random random = new Random();
        int bil1[][] = new int[this.batasx][this.batasy];
        int bil2[][] = new int[this.batasx][this.batasy];
        int hasil[][] = new int[this.batasx][this.batasy];
        for (int i = 0; i < this.batasx; i++) {
            for (int j = 0; j < this.batasy; j++) {
                bil1[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < this.batasx; i++) {
            for (int j = 0; j < this.batasy; j++) {
                bil2[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < this.batasx; i++) {
            for (int j = 0; j < this.batasy; j++) {
                for (int j2 = 0; j2 < this.batasx; j2++) {
                    this.c = this.c + (bil1[i][j2]*bil2[j2][i]);
                }
                hasil[i][j] = this.c;
            }
        }
        for (int i = 0; i < this.batasx; i++) {
            for (int j = 0; j < this.batasy; j++) {
                System.out.print(bil1[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < this.batasx; i++) {
            for (int j = 0; j < this.batasy; j++) {
                System.out.print(bil2[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < this.batasx; i++) {
            for (int j = 0; j < this.batasy; j++) {
                System.out.print(hasil[i][j] +"\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}
