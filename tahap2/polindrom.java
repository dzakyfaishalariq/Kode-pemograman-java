package com.tesvidio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class polindrom {
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public int bill;
    public void Inputan() {
        String nilai = null;
        System.out.println("Nilai polindrom");
        System.out.println("================");
        try {
            System.out.print("Masukan nilai polindrom di sini: ");
            nilai = masuk.readLine();
        } catch (Exception e) {
            System.out.println("=============================");
            System.out.println("Maaf kode anda ada yang salah");
            e.printStackTrace();
        }
        this.bill = Integer.valueOf(nilai).intValue();
    }
    public void prosesnya() {
        int bantu,poli = 0, nilai_awal;
        nilai_awal = this.bill;
        while (this.bill != 0) {
            bantu = this.bill % 10;
            this.bill = this.bill / 10;
            poli = 10*poli + bantu;
        }
        if (nilai_awal == poli) {
            System.out.println("Ini merupakan polindrom");
        }else{
            System.out.println("Ini bukan polindrom");
        }
    }
    public static void main(String[] args) {
        polindrom obj = new polindrom();
        obj.Inputan();
        obj.prosesnya();
    }
}
