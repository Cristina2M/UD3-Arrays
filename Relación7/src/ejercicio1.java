import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
//1. Crea un programa que dado un Array de enteros y un valor entero, muestre la cantidad de veces que aparece el entero en el Array.
    Scanner entrada= new Scanner(System.in);
        int entero, contador=0;
        int[] lista_num ={1,0,2,2,3,3,3,4,4,5,0,0,2,0,1};

        System.out.println("Introduce un número entero del 0 al 5: ");
        entero= entrada.nextInt();
        for (int i = 0; i < lista_num.length; i++) {
            if (lista_num[i]==entero) {
                contador++;
            }
        }
        System.out.println("El entero " + entero + " aparece " + contador + " veces.");
         



    }
}
