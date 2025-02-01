package org.example;

public class LAVector {
    private float[] components;

    public LAVector(int size) {
        this.components = new float[size];
    }

    public LAVector(float[] components) {
        this.components = components;
    }

    public LAVector(int size, float value) {
        this.components = new float[size];
        for (int i = 0; i < size; i++){
            components[i] = value;
        }
    }

    public LAVector plusVector(LAVector other) {
        if (this.components.length != other.components.length){
            System.out.println("Ошибка: вектора разные по длине");
            return null;
        }

        for (int i = 0; i < this.components.length; i++){
            this.components[i] += other.components[i];
        }

        return this;
    }

    public LAVector multNumber(float number) {
        for (int i = 0; i < this.components.length; i++){
            this.components[i] *= number;
        }
        return this;
    }

    public float scalarMult(LAVector other) {
        if (this.components.length != other.components.length){
            System.out.println("Ошибка: вектора разной длины");
            return 0;
        }
        float res = 0;
        for (int i = 0; i < this.components.length; i++){
            res += this.components[i] * other.components[i];
        }

        return res;
    }

    public double abs() {
        double res = 0;
        for (int i = 0; i < components.length; i++){
            res += components[i] * components[i];
        }
        return Math.sqrt(res);
    }

    public float getComponent(int n) {
        return this.components[n];
    }

    public int size() {
        return this.components.length;
    }

    public void print(){
        System.out.print("( ");
        for (double i: this.components){
            System.out.print(i + " ");
        }
        System.out.println(")");
    }

}
