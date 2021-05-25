package com.peckage2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class p_do_while {
    public int batas;
    static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    public void inputUser() {
        String bts = null;
        try {
            System.out.print("Masukan batas pengulangan : ");
            bts = masuk.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        int b = Integer.valueOf(bts).intValue();
        this.batas = b;
    }
    public void proses() {
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= this.batas);
    }
    public static void main(String[] args) {
        p_do_while obj = new p_do_while();
        obj.inputUser();
        obj.proses();
    }
}
