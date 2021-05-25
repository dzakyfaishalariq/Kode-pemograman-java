package com.Sortir_and_array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pogram1 {
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public int batas;
    public void inputuser() {
        String bts = null;
        try {
            System.out.print("Masukan batas penginputan : ");
            bts = masuk.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int b = Integer.valueOf(bts).intValue();
        this.batas = b;
    }
    public void tampilkan() {
        String bill = null;
        int bil[] = new int[this.batas];
        for (int i = 0; i < this.batas; i++) {
            try {
                System.out.print("-> Nilai ke " + (i+1) + " = ");
                bill = masuk.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            bil[i] = Integer.valueOf(bill).intValue();
        }
        System.out.println("Menampilkan ke user : ");
        for (int i = 0; i < bil.length; i++) {
            System.out.print(bil[i] + " ");
        }
        // penentu nilai terbesarnya
        for (int i = 0; i < bil.length - 1; i++) {
            for (int j = i+1; j < bil.length; j++) {
                if (bil[i] > bil[j]) {
                    int bantu = bil[i];
                    bil[i] = bil[j];
                    bil[j] = bantu;
                }
            }
        }
        System.out.println("Nilai terbesarnya iyalah : ");
        System.out.println("-> " + bil[this.batas - 1]);
    }
    public static void main(String[] args) {
        pogram1 obj = new pogram1();
        obj.inputuser();
        obj.tampilkan();
    }
}
