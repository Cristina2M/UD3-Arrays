public class ejercicio13 {
    public static void main(String[] args) {
//13. Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de
//diferentes países. El array que contiene los nombres de los países es el siguiente: país = {“España”,
//“Rusia”, “Japón”, “Australia”}. Los datos sobre las estaturas se deben simular mediante un array de 4
//filas por 10 columnas con números aleatorios generados al azar entre 140 y 210. Los decimales de la
//media se pueden despreciar. Los nombres de los países se deben mostrar utilizando el array de países
//(no se pueden escribir directamente).

        int valorMayor=0;
        int valorMenor=220;
        int sumaValores=0;
        int media=0;


        String[] país= {"España", "Rusia", "Japón", "Australia"};
        int[][] estatura= new int[4][10];


        System.out.printf("%81s\n", "MED   MIN   MAX");

        for (int filas = 0; filas < estatura.length; filas++) {
            //imprimo el nombre del país
            System.out.printf("%10s:", país[filas]);
            for (int columnas = 0; columnas < estatura[filas].length; columnas++) {
                
                estatura[filas][columnas]= (int) (Math.random()*70+140);
                //imprimo cada uno de los valores
                System.out.printf("%5d", estatura[filas][columnas]);
                
                if (estatura[filas][columnas] > valorMayor) { 
                    valorMayor=estatura[filas][columnas];    
                }
                
                if(estatura[filas][columnas] < valorMenor){
                    valorMenor=estatura[filas][columnas];
                }
                
                sumaValores+=estatura[filas][columnas];
            }
            media= sumaValores / estatura[filas].length;
            //imprimo la media, el valorMenor y el valorMayor
            System.out.printf("|| %5d %5d %5d",media, valorMenor, valorMayor);

            System.out.println();
            valorMayor=0;
            valorMenor=220;
            sumaValores=0;
            media=0;
        }



    }
}