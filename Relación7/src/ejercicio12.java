public class ejercicio12 {
    public static void main(String[] args) {
//12. Escribe un programa que pida 20 números enteros (o que los genere de forma aleatoria). Estos
//números se deben introducir en un array bidimensional de 4 filas por 5 columnas. El programa
//mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La suma
//total debe aparecer en la esquina inferior derecha.

        int[][] matriz = new int [4][5];
        int sumaFila=0;
        int sumaColumna=0;
        int sumaTotal=0;

//realizamos la suma de cada una de las filas
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = (int) (Math.random()*5);//genera un num aleatorio entre 0 y 5
                System.out.print(matriz[fila][columna]+"   ");
                sumaFila+= matriz[fila][columna];//es lo mismo que poner sumaFila=sumaFila+matriz[fila][columna]
            }
            System.out.println(sumaFila);
            sumaFila=0;
        }

//realizamos la suma de cada una de las columnas
        for (int columna = 0; columna < matriz[0].length; columna++) {
            for (int fila = 0; fila < matriz.length; fila++) {
                sumaColumna+= matriz[fila][columna];
            }
            System.out.print(sumaColumna+ "   ");
            sumaTotal+=sumaColumna;
            sumaColumna=0;
        }
        System.out.println(sumaTotal);


    }
}
