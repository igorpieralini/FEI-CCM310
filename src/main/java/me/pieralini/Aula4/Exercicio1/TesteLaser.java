package me.pieralini.Aula4.Exercicio1;

import java.util.Scanner;

public class TesteLaser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Laser[] sensores = new Laser[10];

        for (int i = 0; i < 10; i++) {
            sensores[i] = new Laser("Fabricante" + (i + 1), 100.0, 0.01);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a medida do sensor " + (i + 1) + ": ");
            double medida = scanner.nextDouble();
            sensores[i].setMedida(medida);
        }

        System.out.println("\n--- Medidas registradas ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Sensor " + (i + 1) + " (" + sensores[i].getFabricante() + "): "
                    + sensores[i].getMedida());
        }

        scanner.close();
    }
}