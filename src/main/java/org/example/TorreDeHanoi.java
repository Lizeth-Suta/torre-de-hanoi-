public class TorreDeHanoi {

    public static void torreDeHanoi(int n, char origen, char destino, char auxiliar) {

        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }

        torreDeHanoi(n - 1, origen, auxiliar, destino);