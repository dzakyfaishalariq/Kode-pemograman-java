package com.exersais3;
import java.util.Scanner;
import java.util.ArrayList;
public class rekursif {
    //pencarian nilai Binery
    private final int data[] = {1,2,3,4,5,6,7,8}; 
    public void pencarian(int atas, int bawah,int cari) {
        if (atas >= bawah) {
            int tengah = (bawah + atas)/2;
            if (cari < data[tengah]) {
                pencarian( atas = tengah - 1, bawah, cari);
            }else if(cari == data[tengah]){
                System.out.print("Nilai ketemu berada di index " + tengah +  " nilai : " + cari );
            }else{
                pencarian(atas, bawah = tengah + 1, cari);
            }
        }else{
            System.out.println("Maaf nilai tidak ketemu");
        }

    }
    public void prosesBinery(int cari) {
        int bawah = 0;
        int atas = data.length - 1;
        pencarian(atas, bawah, cari);
    }
    //============================================
    //membalikan array
    private static ArrayList<Integer> array = new ArrayList<Integer>();
    public void input_nilai(int i,int batas) {
        Scanner input = new Scanner(System.in);
        if(i < batas){
            System.out.print("Data ke-" + (i+1) +" : ");
            int nilai = input.nextInt();
            array.add(nilai);
            input_nilai(++i, batas);
        }
    }
    public void tampilanAwal(int i) {
        if (i < array.size()) {
            System.out.print(array.get(i) + " ");
            tampilanAwal(++i);
        }
    }
    public void pembalikan_pernyotiran(int i) {
        for (int k = i; k < array.size() - 1; k++) {
            for (int k2 = k+1; k2 < array.size(); k2++) {
                if (array.get(k) > array.get(k2)) {
                    int bantu = array.get(k);
                    array.set(k, array.get(k2));
                    array.set(k2, bantu);
                }
            }
        }
    }
    public void tampilanTerakhir(int i) {
        if (i < array.size()) {
            System.out.print(array.get(i) + "  ");
            tampilanTerakhir(++i);
        }
    }
    // ======================================================
    // perhitungan jumlah digit 0
    private static ArrayList<Integer> lis = new ArrayList<Integer>();
    public void jumlahDigit0() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai bilangan di sini : ");
        int nilai = input.nextInt();
        pencariandigit0(nilai);
    }
    public void pencariandigit0(int nilai) {
        int a = nilai,c;
        if (nilai != 0) {
            c = a % 10;
            if (c == 0) {
                lis.add(c);
            }
            pencariandigit0(nilai=nilai/10);
        }
    }
    public void Tampilan() {
        System.out.println("Nilai 0 nya sebanyak : "+lis.size());
    }
    //===================================================
    //polindrom
    public int polindrom = 0,bilangan;
    public void inputBilangan() {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan nilai polindrom nya: ");
        int nilai = masuk.nextInt();
        penentunya(nilai);
        this.bilangan = nilai;
    }
    public void penentunya(int bilangan) {
        if (bilangan != 0) {
            int bantu = bilangan % 10;
            this.polindrom = this.polindrom * 10 + bantu;
            penentunya(bilangan = bilangan/10);
        }
    }
    public void cek() {
        if (this.polindrom == this.bilangan) {
            System.out.println("Ini polindrom");
        }else{
            System.out.println("Ini bukan polindrom");
        }
    }
    //menggambar segitiga
    public void segitigY(int i) {
        if (i <= 4) {
            segitigaX(0,i);
            System.out.println();
            segitigY(++i);
        }
    }
    public void segitigaX(int j,int i) {
        if (j <= i) {
            System.out.print("* ");
            segitigaX(++j, i);
        }
    }
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        rekursif obj = new rekursif();
        // pencarian binery
        obj.prosesBinery(6);
        System.out.println();
        System.out.println("=================================");
        //pembalikanArray
        obj.input_nilai(0,7);
        System.out.println("Tampilan awal : ");
        obj.tampilanAwal(0);
        obj.pembalikan_pernyotiran(0);
        System.out.println();
        System.out.println("tampilan akhir : ");
        obj.tampilanTerakhir(0);
        System.out.println();
        System.out.println("=================================");
        //penghitung jumlah 0
        obj.jumlahDigit0();
        obj.Tampilan();
        System.out.println();
        //penentu polindrom
        System.out.println("====================================");
        obj.inputBilangan();
        obj.cek();
        System.out.println();
        //menggambar segi tiga
        System.out.println("====================================");
        obj.segitigY(0);
    }
}
