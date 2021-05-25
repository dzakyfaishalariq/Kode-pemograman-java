package com.peckage2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class p_while {
    public int batas;
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public void input_data() {
        String bts = null;
        try {
            System.out.print("Masukan nilai vaktorial : ");
            bts = masuk.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        int b = Integer.valueOf(bts).intValue();
        this.batas = b;
    }
    public void proses() {
        int i = 0, c = 1;
        while (this.batas > 0) {
            c = c * this.batas;
            this.batas--;
        }
        System.out.println("Nilai faktroialnya iyalah : " + c);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        p_while obj = new p_while();
        char ulang = 'y';
        while (ulang == 'y') {
            obj.input_data();
            obj.proses();
            System.out.print("Apa anda ingin mengulang : ");
            ulang = input.next().charAt(0);
        }
    }
}
