package com.tree2;

public class Node {
    public int bill;
    public Node kiri;
    public Node kanan;

    public Node(int nilai){
        this.bill = nilai;
    }
    public int getData() {
        return bill;
    }
}
