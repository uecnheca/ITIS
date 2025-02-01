package org.example;

public class Main {
    public static void main(String[] args) {

        Matrix matrix = new Matrix(5, 1.0);
        matrix.print();
        Matrix transpMatrix = matrix.transp();

        System.out.println("------------------------");
        Matrix trans = matrix.transp();
        trans.print();
    }
}
