package com.soalpertama;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class soal1 {
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public int saldo;
    // penginputan saldo dari user
    public void inputanUser() {
        String sld = null;
        try {
            System.out.print("Masukan Saldo anda : Rp. ");
            sld = masuk.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int s = Integer.valueOf(sld).intValue();
        this.saldo = s;
    }
    public void proses() {
        System.out.println("Saldo awal : Rp. " + this.saldo);
        if (this.saldo >= 50000) {
            /***Jika sado awal anda sebesar Rp.50.000 atau lebih maka
             *  maka anda mendapatkan Bunga sebesar 10% per bulan
             * dan biaya admin sebesar 5% dari saldo anda yang di dapat
             * ***/
            int bunga = (this.saldo * 10)/100;
            int biaya_admin = ((this.saldo + bunga)*5)/100;
            int saldo_baru = this.saldo + bunga - biaya_admin;
            System.out.println("(Setelah berjalan satu bulan dengan");
            System.out.println("dengan pertimbangan bunga dan biaya admin)");
            System.out.println("Saldo baru anda : Rp. " + saldo_baru);
        }else if (this.saldo >= 100000) {
            /***Jika sado awal anda sebesar Rp.100.000 atau lebih maka
             *  maka anda mendapatkan Bunga sebesar 15% per bulan
             * dan biaya admin sebesar 10% dari saldo anda yang di dapat
             * ***/
            int bunga = (this.saldo * 15)/100;
            int biaya_admin = ((this.saldo + bunga)*10)/100;
            int saldo_baru = this.saldo + bunga - biaya_admin;
            System.out.println("(Setelah berjalan satu bulan dengan");
            System.out.println("dengan pertimbangan bunga dan biaya admin)");
            System.out.println("Saldo baru anda : Rp. " + saldo_baru);
        }else if (this.saldo >= 1000000) {
            /***Jika sado awal anda sebesar Rp.1.000.000 atau lebih maka
             *  maka anda mendapatkan Bunga sebesar 20% per bulan
             * dan biaya admin sebesar 15% dari saldo anda yang di dapat
             * ***/
            int bunga = (this.saldo * 20)/100;
            int biaya_admin = ((this.saldo + bunga)*15)/100;
            int saldo_baru = this.saldo + bunga - biaya_admin;
            System.out.println("(Setelah berjalan satu bulan dengan");
            System.out.println("pertimbangan bunga dan biaya admin)");
            System.out.println("Saldo baru anda : Rp. " + saldo_baru);
        }
        else {
            System.out.println("===========Maaf anda salah input !!==================== ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        soal1 obj = new soal1();
        System.out.println("=========================================");
        obj.inputanUser();
        obj.proses();
        System.out.println("=========================================");
    }
}
