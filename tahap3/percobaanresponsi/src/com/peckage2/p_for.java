package com.peckage2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class p_for {
    public int batasX,batasY;
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public void inputdata() {
        String bts1 = null, bts2 = null;
        try {
            System.out.print("Masukan Batas baris : ");
            bts1 = masuk.readLine();
            System.out.print("Masukan Batas colom : ");
            bts2 = masuk.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        int n = Integer.valueOf(bts1).intValue(),
            n2 = Integer.valueOf(bts2).intValue();
        this.batasX = n;
        this.batasY = n2;
    }
    public void pengoprasian() {
        int bil[][] = new int[this.batasX][this.batasY],
            bil2[][] = new int[this.batasX][this.batasY],
            hasil[][] = new int[this.batasX][this.batasY];
        Random random = new Random();
        for (int i = 0; i < this.batasX; i++) {
            for (int j = 0; j < this.batasY; j++) {
                bil[i][j] = random.nextInt(30);
            }
        }
        for (int i = 0; i < this.batasX; i++) {
            for (int j = 0; j < this.batasY; j++) {
                bil2[i][j] = random.nextInt(30);
            }
        }
        for (int i = 0; i < this.batasX; i++) {
            for (int j = 0; j < this.batasY; j++) {
                hasil[i][j] = bil[i][j] + bil2[i][j];
            }
        }
        System.out.println("Tampilkan");
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil.length; j++) {
                System.out.print(bil[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil.length; j++) {
                System.out.print(bil2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("===========================+");
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil.length; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        p_for obj = new p_for();
        obj.inputdata();
        obj.pengoprasian();
        System.out.println("=================POGRAM SUKSES================");
    }
}
