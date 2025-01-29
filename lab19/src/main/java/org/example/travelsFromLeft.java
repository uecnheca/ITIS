package org.example;

public class travelsFromLeft extends BinaryTree {
    public void travers (Node node) {
        if (node == null) {
            return;
        }
        travers(node.getLeft());
        System.out.println(node.getValue());
        travers(node.getRight());

    }
}
