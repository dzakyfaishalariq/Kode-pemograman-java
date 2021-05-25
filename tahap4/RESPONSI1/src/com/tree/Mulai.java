package com.tree;

public class Mulai {
    public static void main(String[] args) {
        binery_tree tree = new binery_tree();
        tree.addNode(new Node(7));
        tree.addNode(new Node(5));
        tree.addNode(new Node(6));
        tree.addNode(new Node(8));
        tree.addNode(new Node(3));

        System.out.println(binery_tree.serchValue(tree.root, 3));
    }
}
