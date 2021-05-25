package com.teskamus;
import java.util.Scanner;
public class kamus {
    public static void main(String[] args) {
        String indo[] = {"satu","dua","tiga","empat"};
        String ingr[] = {"one","two","tree","four"};
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bahasa indonesia : ");
        String nilai = input.nextLine();
        for (int i = 0; i < ingr.length; i++) {
            if (nilai.equals(indo[i])) {
                System.out.println("arti ingrisnya : " + ingr[i]);
            } 
        }

    }
}
