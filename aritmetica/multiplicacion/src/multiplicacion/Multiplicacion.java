/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Multiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int resultado;
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese el primer numero:");
        numero1=entrada.nextInt();
        System.out.println("ingrese el segundo numero:");
        numero2=entrada.nextInt();
        resultado=numero1*numero2;
        System.out.println("resultado multiplicacion:"+resultado);
        
    }
    
}
