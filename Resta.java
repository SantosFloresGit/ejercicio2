
import java.util.Scanner;

public class Resta {

    public static void main(String[] args) {
        double num1;
        double num2;
        double resta;

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el primer numero: ");
        num1 = leer.nextDouble();

        System.out.println("ingrese el segundo numero: ");
        num2 = leer.nextDouble();

        resta = num1 - num2;
        System.out.println("El resultado de la resta es: " + resta);
    }

}