package com.Sortir_and_array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pogram2 {
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public int batas;
    public void inputan() {
        String bts = null;
        try {
            System.out.print(" Masukan batasan yang anda inputkan : ");
            bts = masuk.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int b = Integer.valueOf(bts).intValue();
        this.batas = b;
    }
    public void tampilkan() {
        String nim = null, nama = null;
        System.out.println("Data mahasiswa : ");
        int Nim[] = new int[this.batas];
        String Nama[] = new String[this.batas];
        for (int i = 0; i < this.batas; i++) {
            try {
                System.out.print("->Nama : ");
                nama = masuk.readLine();
                System.out.print("->Nim  : ");
                nim = masuk.readLine();                
            } catch (Exception e) {
                e.printStackTrace();
            }
            int ni = Integer.valueOf(nim).intValue();
            Nim[i] = ni;
            Nama[i] = nama; 
        }
        System.out.println("Melakukan sortiran berdasarkan nim nilai yang ter kecil");
        for (int i = 0; i < Nama.length - 1; i++) {
            for (int j = i+1; j < Nama.length; j++) {
                if (Nim[i]>Nim[j]) {
                    int bantu = Nim[i];
                    Nim[i] = Nim[j];
                    Nim[j] = bantu;
                    // sortir nama
                    String bantu2 = Nama[i];
                    Nama[i] = Nama[j];
                    Nama[j] = bantu2;
                }
            }
        }
        System.out.println("Tampilannya : ");
        System.out.println("Nama" + "\t" + "Nim");
        System.out.println("===================");
        for (int i = 0; i < Nama.length; i++) {
            System.out.print(Nama[i] + " " + Nim[i] + "\n");
        }
    }
    public static void main(String[] args) {
        pogram2 obj = new pogram2();
        obj.inputan();
        obj.tampilkan();
    }
}
