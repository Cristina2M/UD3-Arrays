import java.util.Scanner;
public class ejemplo_aleatorio {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in); 
    double numAleatorio;

    numAleatorio = Math.random(); //genera un número entre 0 y 1 [0,1)
    System.out.println(numAleatorio);
    
    numAleatorio = Math.random() * 10; //genera un número entre 0 y 10 [0,10)
    System.out.println(numAleatorio);
    
    numAleatorio = Math.random() * 100; //genera un número entre 0 y 100 [0,100)
    System.out.println(numAleatorio);
    
    
            int aleatorio;
    //Math.random siempre va a dar un valor decimal
    aleatorio = (int) (Math.random() * 100); //genera un número entre 0 y 100 [0,100)
    System.out.println(aleatorio);
    
    
    aleatorio = (int) (Math.random() * 50 + 50); //genera un número entre 50 y 100 [50,100)
    System.out.println(aleatorio);
    //se resta al limite superior el inferior (este valor es el que multiplica) y se le suma el valor inferior.
    
    
    aleatorio = (int) (Math.random() * 101); //genera un número entre 1 y 100 [1,100)
    System.out.println(aleatorio);
    // se le suma 1 al valor que multiplica para que los numeros no empiecen desde el 0, sino por el 1
    }
}
