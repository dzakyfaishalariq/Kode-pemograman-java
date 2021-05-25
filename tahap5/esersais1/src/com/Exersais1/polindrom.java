package com.Exersais1;
import java.util.Scanner;
/***
Buat algoritme untuk memeriksa apakah sebuah kata
dimasukkan dari pengguna adalah palindrome atau tidak
Contoh
- Masukan: 10011001
- Keluaran: palindrome
- Input: Apakah itu mobil atau kucing yang saya lihat
- Keluaran: palindrome
 */
public class polindrom {
    public int bilangan;
    public String kalimat;
    public void polindromBilangan() {
        int n = this.bilangan;
        int poli = 0;
        while (this.bilangan != 0) {
            int bantu = this.bilangan % 10;
            this.bilangan = this.bilangan / 10;
            poli = poli * 10 + bantu;
        }
        if (n == poli) {
            System.out.println("Ini adalah bilangan polindrom");
        }else{
            System.out.println("Ini bukan bilangan polindrom");
        }
    }
    public void polindrmKalimat() {
        String kata_asli,katabalik = "";
        kata_asli = this.kalimat;
        int panjangKlimat=kata_asli.length();
        for (int i = panjangKlimat-1; i >= 0; i--) {
            katabalik = katabalik + kata_asli.charAt(i);
        }
        if (katabalik.equals(kata_asli)) {
            System.out.println("Ini merupakan kata polindrom");
        } else {
            System.out.println("Ini bukan merupakan kata polindrom");
        }
    }
    public static void main(String[] args) {
        polindrom obj = new polindrom();
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        int nil = input.nextInt();
        obj.bilangan = nil;
        obj.polindromBilangan();
        System.out.print("Masukan kalimat : ");
        String kta = input2.nextLine();
        obj.kalimat = kta;
        obj.polindrmKalimat();

    }
}
