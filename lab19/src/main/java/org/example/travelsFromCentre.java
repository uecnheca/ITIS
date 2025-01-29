package org.example;

public class travelsFromCentre extends BinaryTree {
    @Override
    public void travers(Node node) {
        if (node == null) {
            return;
        }
        travers(node.getLeft());
        travers(node.getRight());
        System.out.println(node.getValue());
    }

}
