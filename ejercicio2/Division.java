
package division;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        double num1;
        double num2;
        double division;
        
        Scanner constructor=new Scanner(System.in);
        
        System.out.println("ingrese el primer numero: ");
        num1=constructor.nextDouble();
        
        System.out.println("ingrese el segundo numero: ");
        num2=constructor.nextDouble();
        
        division = num1 / num2;
        System.out.println("El resultado de la division es: " + division);
    }
    
}
