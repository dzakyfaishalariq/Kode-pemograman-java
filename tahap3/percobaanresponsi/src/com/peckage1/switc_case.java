package com.peckage1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class switc_case {
    public int hari;
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public void inputData() {
        String nilai = null;
        try {
            System.out.print("Masukan hitungan hari yang anda pilih : ");
            nilai = masuk.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int n = Integer.valueOf(nilai).intValue();
        this.hari = n;
    }
    public void Proses() {
        switch (this.hari) {
            case 1:
                System.out.println("Ini hari senin");
                break;
            case 2:
                System.out.println("Ini hari selasa");
                break;
            case 3:
                System.out.println("Ini hari rabu");
                break;
            default:
                System.out.println("Maaf anda kelebihan hari");
                break;
        }   
    }
    public static void main(String[] args) {
        switc_case obj = new switc_case();
        obj.inputData();
        obj.Proses();
        System.out.println("=========Pogram sukses=========");
    }
}
