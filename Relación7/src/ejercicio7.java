import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // 7. Define tres arrays de 20 números enteros cada uno, con nombres numero,
        // cuadrado y cubo. Carga el
        // array numero con valores aleatorios entre 0 y 100. En el array cuadrado se
        // deben almacenar los
        // cuadrados de los valores que hay en el array numero. En el array cubo se
        // deben almacenar los cubos
        // de los valores que hay en numero. A continuación, muestra el contenido de los
        // tres arrays dispuesto
        // en tres columnas.
        // NOTA: para generar números aleatorios se debe utilizar el método random() de
        // la clase Math.

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 100);
            cuadrado[i] = (int) (Math.pow(numero[i], 2));
            cubo[i] = (int) (Math.pow(numero[i], 3));
            System.out.println(numero[i] + " " + cuadrado[i] + " " + cubo[i]);
        }

    }
}