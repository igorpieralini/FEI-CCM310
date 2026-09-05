package me.pieralini.Aula3.Exercicio1;

public class Retangulo {
    private double x1, y1;
    private double x2, y2;
    private double x3, y3;
    private double x4, y4;

    public Retangulo(double x1, double y1, double x2, double y2,
                     double x3, double y3, double x4, double y4) {
        set(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public void set(double x1, double y1, double x2, double y2,
                    double x3, double y3, double x4, double y4) {

        double[] xs = {x1, x2, x3, x4};
        double[] ys = {y1, y2, y3, y4};

        for (int i = 0; i < 4; i++) {
            if (xs[i] < 0.0 || xs[i] > 20.0 || ys[i] < 0.0 || ys[i] > 20.0) {
                throw new IllegalArgumentException("Coordenadas fora do primeiro quadrante ou acima de 20.0");
            }
        }

        double[] xOrd = xs.clone();
        double[] yOrd = ys.clone();
        java.util.Arrays.sort(xOrd);
        java.util.Arrays.sort(yOrd);

        double xMenor = xOrd[0];
        double xMaior = xOrd[3];
        double yMenor = yOrd[0];
        double yMaior = yOrd[3];

        boolean formaRetangulo =
                temPonto(xs, ys, xMenor, yMenor) &&
                        temPonto(xs, ys, xMenor, yMaior) &&
                        temPonto(xs, ys, xMaior, yMenor) &&
                        temPonto(xs, ys, xMaior, yMaior) &&
                        xMenor != xMaior && yMenor != yMaior;

        if (!formaRetangulo) {
            throw new IllegalArgumentException("As coordenadas fornecidas nao formam um retangulo");
        }

        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
        this.x3 = x3; this.y3 = y3;
        this.x4 = x4; this.y4 = y4;
    }

    private boolean temPonto(double[] xs, double[] ys, double x, double y) {
        for (int i = 0; i < 4; i++) {
            if (xs[i] == x && ys[i] == y) {
                return true;
            }
        }
        return false;
    }

    public double getComprimento() {
        double lado1 = maiorX() - menorX();
        double lado2 = maiorY() - menorY();
        return Math.max(lado1, lado2);
    }

    public double getLargura() {
        double lado1 = maiorX() - menorX();
        double lado2 = maiorY() - menorY();
        return Math.min(lado1, lado2);
    }

    public double getPerimetro() {
        return 2 * (getComprimento() + getLargura());
    }

    public double getArea() {
        return getComprimento() * getLargura();
    }

    private double menorX() {
        return Math.min(Math.min(x1, x2), Math.min(x3, x4));
    }

    private double maiorX() {
        return Math.max(Math.max(x1, x2), Math.max(x3, x4));
    }

    private double menorY() {
        return Math.min(Math.min(y1, y2), Math.min(y3, y4));
    }

    private double maiorY() {
        return Math.max(Math.max(y1, y2), Math.max(y3, y4));
    }
}