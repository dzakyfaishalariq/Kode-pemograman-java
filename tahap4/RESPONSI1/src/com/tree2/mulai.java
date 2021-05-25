package com.tree2;
public class mulai {
    public static void main(String[] args) {
        BinerryTree tree = new BinerryTree();
        tree.addtambahData(new Node(3));
        tree.addtambahData(new Node(8));
        tree.addtambahData(new Node(2));
        tree.addtambahData(new Node(1));
        tree.addtambahData(new Node(9));
        System.out.println(BinerryTree.cari(tree.root, 1));
    }
}
