package org.example;

public class TorreDeHanoi {

    public static void torreDeHanoi(int n, char origen, char destino, char auxiliar) {

        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        torreDeHanoi(n - 1, origen, auxiliar, destino);

        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);

        torreDeHanoi(n - 1, auxiliar, destino, origen);
    }
    public static void main(String[] args) {
        int n = 3;
        torreDeHanoi(n, 'A', 'C', 'B');
    }
}