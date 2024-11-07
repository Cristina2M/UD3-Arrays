import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
//2. Crea un programa que reciba un Array de Strings y muestre el String más largo
        int longitud, posicion=0, mayor=0;


        String[] cadenas= {"Ana", "Maria", "Antonio", "Paco"};

        for (int i = 0; i < cadenas.length; i++) {
            longitud=cadenas[i].length();
            if (longitud>mayor) {
                mayor=longitud;
                posicion=i;
            }
        }
        System.out.println(cadenas[posicion]);

    }
}
