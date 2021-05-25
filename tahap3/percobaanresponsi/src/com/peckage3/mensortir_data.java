package com.peckage3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
public class mensortir_data {
    static LinkedList<String> nama = new LinkedList<String>();
    static LinkedList<Integer> nim = new LinkedList<Integer>();
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public void penginputan() {
        String Nama = null, NIM = null,batas = null;
        try {
            System.out.print("Masukan batas lis yang anda inginkan : ");
            batas = masuk.readLine();
            int bts = Integer.valueOf(batas).intValue();
            for (int i = 0; i < bts; i++) {
                System.out.print("Masukan nama anda : ");
                Nama = masuk.readLine();
                nama.add(Nama);
                System.out.print("Masukan nim anda  : ");
                NIM = masuk.readLine();
                int n = Integer.valueOf(NIM).intValue();
                nim.add(n);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    public static void main(String[] args) {
        
    }
}
