public class ejemplo1 {
    public static void main(String[] args) {
    
        int[] notas = new int[6];
        /*
         si le queremos dar todos los valores al arraid hacemos:
         int[] notas={8,5,3,7,20,30,10}

         otro ejemplo con un String
         String[] nombres={"Pep", "Tom", "Kal", "Cris", "Mar"}
         */

        notas[0]=10; //la primera posición es el 0
        notas[1]=7;
        notas[2]=notas[1]+notas[0]/2; //se pueden realizar operaciones con otras posiciones para adjudicar un valor

        System.out.println(notas[0]); //también se pueden imprimir los valores
        System.out.println(notas[1]);
        System.out.println(notas[2]);

        for (int i = 0; i < notas.length; i++) {//este length no lleva los (), solo los lleva los Strings
            notas[i]=100+i;
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }



    }
}