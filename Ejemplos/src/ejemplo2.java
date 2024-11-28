public class ejemplo2 {
    public static void main(String[] args) {
        

    int edad=18;
    float peso = 65.2f;
    String nombre = "Pepe López";

        System.out.printf("Hola, %s, tienes %d años y pesas %.2f kilos", nombre, edad, peso);
        //%s significa que ahí va un string
        //%d significa que ahí va un int
        //%f significa que ahí va un float. si le pones un .2 solo muestra dos decimales


System.out.println();


        System.out.printf("%-10s %10s\n", "Producto", "Precio");
        System.out.printf("%-10s %10.2f\n", "Manzana", 1.25);
        System.out.printf("%-10s %10.2f\n", "Banana", 0.75);
// la \n significa un salto de línea
//siempre hay que dar un valor mayor de lo que vayas a poner, no tiene porque ser siempre 10
//poner - hace que los valores se coloquen a la izquierda


    }
}
