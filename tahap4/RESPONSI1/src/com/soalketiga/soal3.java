package com.soalketiga;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class soal3 {
    static Scanner input = new Scanner(System.in);
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public int pilih;
    public void inputUser() {
        String pilihan = null;
        try {
            induk obji = new induk();
            obji.IdentitasKabinetMaju();
            System.out.println("Silahkan pilih dari beberapa menu ini");
            System.out.println("----------Info KIM----------");
            System.out.println("[1]. Preasiden dan wakil prasiden");
            System.out.println("[2]. Mentri Kordinator");
            System.out.println("[3]. Mentri Bidang");
            System.out.println("Silahkan pilih : ");
            pilihan = masuk.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int n = Integer.valueOf(pilihan).intValue();
        this.pilih = n;
    }
    public void proses() {
        switch (this.pilih) {
            case 1:
                anak1 obj = new anak1("Perasiden dan Wakil Perasiden");
                System.out.println("===============================");
                System.out.println(anak1.nama);
                obj.IdentitasKabinetMaju();
                break;
            case 2:
                anak2 obj2 = new anak2("Mentri Koordinator");
                System.out.println("===============================");
                System.out.println(anak2.nama);
                obj2.IdentitasKabinetMaju();
                break;
            case 3:
                anak3 obj3 = new anak3("Mentri Bidang");
                System.out.println("================================");
                System.out.println(anak3.nama);
                obj3.IdentitasKabinetMaju();
                anak4 obj4 = new anak4("Mentri Bidang 2");
                System.out.println(anak4.nama);
                obj4.IdentitasKabinetMaju();
                anak5 obj5 = new anak5("Mentri Bidang 3");
                System.out.println(anak5.nama);
                obj5.IdentitasKabinetMaju();
                anak6 obj6 = new anak6("Mentri Bidang 4");
                System.out.println(anak6.nama);
                obj6.IdentitasKabinetMaju();
                anak7 obj7 = new anak7("Mentri Bidang 5");
                System.out.println(anak7.nama);
                obj7.IdentitasKabinetMaju();
                break;
            default:
                System.out.println("Maaf anda salah pilih");
                break;
        }
    }
    public static void main(String[] args) {
        soal3 obj = new soal3();
        char ulang = 'y';
        while (ulang == 'y') {
        obj.inputUser();
        obj.proses();
        System.out.println("Apakah anda ingin mengulang[y/t] : ");
        ulang = input.next().charAt(0);
        }
    }
}
