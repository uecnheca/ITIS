package org.example;
public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 6, 7, 4, 2, 3, 4, 1};

        Node root = new Node(arr[0]);
        travelsFromLeft travelsFromLeft = new travelsFromLeft();

        for (int i = 1; i < arr.length; i++){
            travelsFromLeft.addLeaf(arr[i], root);
        }

        travelsFromLeft.travers(root);


    }
}