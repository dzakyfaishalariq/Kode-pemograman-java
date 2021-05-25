package com.graphs2;

import java.util.NavigableMap;

public class grabphs {
    private final int MAX_Verts = 20;
    private vartex vartexlist[];
    private int adjMat[][];
    private int nVelts;
    private char sorteArray[];
    public grabphs(){
        vartexlist = new vartex[MAX_Verts];
        adjMat = new int[MAX_Verts][MAX_Verts];
        nVelts = 0;
        for (int i = 0; i < MAX_Verts; i++) {
            for (int j = 0; j < MAX_Verts; j++) {
                adjMat[i][j] = 0;
            }
        }
        sorteArray = new char[MAX_Verts];
    }
    public void addVertex(char label) {
        vartexlist[nVelts++] = new vartex(label);
    }
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
    }
    public void display() {
        System.out.println("Adjecency");
        for (int i = 0; i < nVelts; i++) {
            for (int j = 0; j < nVelts; j++) {
                if (adjMat[i][j] == 1) {
                    System.out.println(vartexlist[i].label + " -- " + vartexlist[j].label);
                }
            }
        }
        System.out.println("");
    }
    public void displayVertex(int v) {
        System.out.println(vartexlist[v].label + " ");
    }
    public int getAdjOnvisitedVertex(int v){
        for (int i = 0; i < nVelts; i++) {
            if (adjMat[v][i] == 1 && vartexlist[i].vasVisited==false) {
                return i;
            }
        }
        return -1;
    }
    private void resetFlags(){
        for (int i = 0; i < nVelts; i++) {
            vartexlist[i].vasVisited = false;
        }
    }
    public void connect(){
        for (int i = 0; i < nVelts; i++) {
            System.out.print(vartexlist[i].label + " ");
            for (int j = 0; j < nVelts; j++) {
                if (adjMat[i][j] == 1) {
                    System.out.print(vartexlist[j].label + " ");
                    for (int j2 = 0; j2 < nVelts; j2++) {
                        if (adjMat[j][j2] == 1 && vartexlist[j2].vasVisited == false) {
                            System.out.print(vartexlist[j2].label + " ");
                            vartexlist[i].vasVisited = true;
                        }
                    }
                }
            }
            resetFlags();
            System.out.println(" ");
        }
    }
    // masi error!!!!!
    public void topo() {
        int orig_nverts = nVelts;
        while (nVelts > 0) {
            int currenVertex = noSuccessors();
            if (currenVertex == -1) {
                System.out.println("Error graph has cycle");
                return;
            }
            sorteArray[nVelts - 1] = vartexlist[currenVertex].label;
            deleteVertex(currenVertex);
        }
        System.out.println("Topologically sorter order");
        for (int i = 0; i < orig_nverts; i++) {
            System.out.print(sorteArray[i] + " ");
        }
        System.out.println(" ");
    }
    public int noSuccessors(){
        boolean isEdge;
        for (int i = 0; i < nVelts; i++) {
            isEdge = false;
            for (int j = 0; j < nVelts; j++) {
                if (adjMat[i][j] > 0) {
                    isEdge = true;
                    break;
                }
            }
            if(!isEdge){
                return i;
            }
        }
        return -1;
    }
    public void deleteVertex(int delVert) {
        if (delVert != nVelts) {
            for (int i = delVert; i < nVelts-1; i++) {
                vartexlist[i] = vartexlist[i+1];
            }
            for (int i = delVert; i < nVelts-1; i++) {
                moveRow(i,nVelts);
            }
            for (int i = delVert; i < nVelts-1; i++) {
                moveColeft(i,nVelts-1);
            }
        }
    }
    public void moveRow(int row, int length) {
        for (int i = 0; i < length; i++) {
            adjMat[row][i] = adjMat[row + 1][i];
        }
    }
    public void moveColeft(int col, int length) {
        for (int i = 0; i < length; i++) {
            adjMat[i][col] = adjMat[i][col+1];
        }
    }
}
