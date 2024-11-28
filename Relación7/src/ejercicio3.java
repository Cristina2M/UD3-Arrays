import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // 3. Crea un programa que reciba un Array de Strings y un char. Deberá mostrar
        // todos los Strings cuya primera letra coincida con el char.

        String[] arrayDeCadenas = { "manzana", "banana", "cereza", "mango", "pera", "melon" };
        char primercaracter = 'm';

        for (String str : arrayDeCadenas) {
            if (str.length() > 0 && str.charAt(0) == primercaracter) {
                System.out.println(str);
            }
        }

    }
}
