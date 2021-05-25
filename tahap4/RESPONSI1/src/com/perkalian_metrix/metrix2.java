package com.perkalian_metrix;

public class metrix2 {
    public void tampilan_metrix2() {
        int bil[][] = {{1,2,3},
                       {2,3,4},
                       {5,6,7}};
        int hasil[][] = new int[bil.length][bil.length];
        for (int i = 0; i < bil.length; i++) {
            for (int j = 0; j < bil.length; j++) {
                hasil[i][j] = 2 * bil[i][j];
            }
        }
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil.length; j++) {
                System.out.print(bil[i][j]+"\t");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Hasil dikali 2");
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil.length; j++) {
                System.out.print(hasil[i][j]+"\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}
