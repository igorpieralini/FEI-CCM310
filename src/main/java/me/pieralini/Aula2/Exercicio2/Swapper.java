package me.pieralini.Aula2.Exercicio2;

public class Swapper {
    private float x;
    private float y;

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void swap() {
        float aux = x;
        x = y;
        y = aux;
    }
}