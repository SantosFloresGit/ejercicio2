
//Flores Apaza Santos Jaime

package sumar;
import java.io.*;
import java.util.Scanner;

public class Sumar {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num1,num2,sumar;
        System.out.println("Ingrese Primer número:");
        num1= teclado.nextInt();
        System.out.println("Ingrese Segundo número:");
        num2= teclado.nextInt();
        
        sumar=num1+num2;
        
        System.out.println("El resultado es:" +sumar);
    }
}

