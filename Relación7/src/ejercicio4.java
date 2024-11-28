import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // 4. Crea un programa que reciba dos Arrays, y devuelva un Array con los
        // valores
        // máximos en cada una de las posiciones. Se debe tener en cuenta que los Arrays
        // podrán ser de tamaños distintos.

        int[] ar1 = { 4, 8, 15, 1 };
        int[] ar2 = { 7, 2, 11, 18 };

        for (int i = 0; i < N_max; i++) {
            if (i < ar1.length && i < ar2.length) {
                maximos[i] = Math.max(ar1[i], ar2[i]);
            } else if (i < ar1.length) {
                maximos[i] = ar1[i];
            } else {
                maximos[i] = ar2[i];
            }
        }

    }
}
