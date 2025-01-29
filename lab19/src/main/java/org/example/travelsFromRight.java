package org.example;

public class travelsFromRight extends BinaryTree {
    public void travers (Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getValue());
        travers(node.getLeft());
        travers(node.getRight());
    }
}
