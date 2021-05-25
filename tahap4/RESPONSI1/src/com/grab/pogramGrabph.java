package com.grab;
import java.util.Stack;
public class pogramGrabph {
    public static void main(String[] args) {
    char[] label = {'A','X','Z','M','P','D','E','B','C'};
    double[][] adjacentymatrix = {
    //   A  X  Z  M  P  D  E  B  C
        {0, 4, 7, 4, 0, 0, 0, 1, 7},//A
        {4, 0, 9, 6, 2, 0, 0, 0, 0},//X
        {7, 9, 0, 0, 0, 0, 0, 0, 0},//Z
        {4, 6, 0, 0, 0, 0, 0, 0, 0},//M
        {0, 2, 0, 0, 0, 8, 0, 0, 0},//P
        {0, 0, 0, 0, 8, 0, 3, 5, 10},//D
        {0, 0, 0, 0, 0, 3, 0, 0, 0},//E
        {1, 0, 0, 0, 0, 5, 0, 0, 0},//B
        {7, 0, 0, 0, 0, 10, 0, 0, 0}//C
    };
    boolean[] visitied = new boolean[label.length];
    Stack<Integer> nilaiStak = new Stack<>();
    int pencarianawal = 0;
    int pencarianakhir = 6;
    visitied[pencarianawal] = true;
    nilaiStak.push(pencarianawal);
    boolean misiselesai = false;
    while (!nilaiStak.isEmpty()) {
        System.out.println("Stack " + nilaiStak.toString());
        int vtrexasal = nilaiStak.peek();
        if (vtrexasal == pencarianakhir) {
            misiselesai = true;
            break;
        } else {
            int vtrextujuan = -1;
            for (int i = 0; i < adjacentymatrix[vtrexasal].length; i++) {
                double bobot = adjacentymatrix[vtrexasal][i];
                boolean isvisited = visitied[i];
                if (bobot > 0 && !isvisited) {
                    vtrextujuan = i;
                    break;
                }
            }
            if (vtrextujuan != -1) {
                nilaiStak.push(vtrextujuan);
                visitied[vtrextujuan] = true;
            }else{
                nilaiStak.pop();
            }
        }
        // sintak tidak muncul dan berjalan error tidak terpakai
        if (misiselesai && !nilaiStak.isEmpty()) {
            System.out.println("path : " + label[pencarianawal]);
            double totalbobot = 0;
            for (int i = 0; i < nilaiStak.size(); i++) {
                int va = nilaiStak.get(i-1);
                int vb = nilaiStak.get(i);
                double bobot = adjacentymatrix[va][vb];
                totalbobot += bobot;
                System.out.println("-" + label[vb]);
            }
            System.out.println("\n total bobot : " + totalbobot);
        }
    }
    }
}
