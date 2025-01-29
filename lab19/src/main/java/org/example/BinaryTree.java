package org.example;

public  abstract class BinaryTree {
    public abstract  void travers(Node node);
    public void addLeaf (int n, Node node) {
        if (n > node.getValue()) {
            if (node.getRight() == null) {
                Node usel = new Node(n);
                node.setRight(usel);
                return ;
            }else {
                addLeaf(n, node.getRight());
            }
        }else {
            if (node.getLeft() == null) {
                Node usel = new Node(n);
                node.setLeft(usel);
                return ;
            }else{
                addLeaf(n, node.getLeft());
            }
        }
    }
}
