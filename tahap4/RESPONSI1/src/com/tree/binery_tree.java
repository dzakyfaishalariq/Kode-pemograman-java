package com.tree;

public class binery_tree {
    //root  = > menyimpan nilai root pada binery tree
    public Node root;
    public void addNode(Node node) {
        if (root == null) {
            root = node;
        } else {
            insertNode(root,node);
        }
    }
    public void insertNode(Node parent, Node node) {
        if (parent.getvalue() > node.getvalue()) {
            //arah kiri
            if (parent.leftchild == null) {
                parent.leftchild = node;
            }else{
                insertNode(parent.leftchild, node);
            }
        } else {
            //arah kanan
            if (parent.leftchild == null) {
                parent.leftchild = node;
            } else {
                insertNode(parent.rightchild, node);
            }
        }
    }
    public static boolean serchValue(Node root, int value){
        if (root == null) {
            return false;
        }
        else{
            if (root.getvalue() == value) {
                return true;
            }else if (root.getvalue()>value) {
                return serchValue(root.leftchild, value);  
            } else {
                return serchValue(root.rightchild, value);
            }
        }
    }
}
