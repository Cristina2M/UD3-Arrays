import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // 6. Programa que lee por teclado la nota de los alumnos de una clase y calcula
        // la nota media del grupo.
        // También muestra los alumnos con notas superiores a la media. El número de
        // alumnos se lee por
        // teclado.
        System.out.print("Introduce el número de alumnos: ");
        int numAlumnos = entrada.nextInt();

        double[] notas = new double[numAl];
        double sumaNotas = 0;

        for (int i = 0; i < numAl; i++) {
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
            sumaNotas += notas[i];
        }

        double media = sumaNotas / numAl;
        System.out.println("La media de las notas del grupo es: " + media);

        System.out.println("Los alumnos con notas superiores a la media:");
        for (int i = 0; i < numAl; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno " + (i + 1) + " con nota: " + notas[i]);
            }
        }

    }
}
