package com.tree2;

public class BinerryTree {
    Node root;
    public void addtambahData(Node node) {
        if (root == null) {
            root = node;
        }else{
            insert(root,node);
        }
    }
    public void insert(Node keluarga, Node node){
        if (keluarga.getData()>node.getData()) {
            if (keluarga.kiri == null) {
                keluarga.kiri = node;
            }else{
                insert(keluarga.kiri, node);
            }
        }else{
            if (keluarga.kanan == null) {
                keluarga.kanan = node;
            }else{
                insert(keluarga.kanan, node);
            }
        }
    }
    public static boolean cari(Node root, int nilai){
        if (root == null) {
            return false;
        }else{
            if (root.getData() == nilai) {
                return true;
            }else if(root.getData() > nilai){
                return cari(root.kiri, nilai);
            }else{
                return cari(root.kanan, nilai);
            }
        }
    }
}
