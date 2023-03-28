/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import Entidades.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero operacion1=new DivisionNumero();
        
        System.out.print("Ingrese el valor del Número 1:  ");
        String num1 = leer.next();
        System.out.print("Ingrese el valor del Número 2:  ");
        String num2 = leer.next();
        
        operacion1.setNum1(Integer.parseInt(num1));
        operacion1.setNum2(Integer.parseInt(num2));
        
        System.out.println("La División de los números ingresados es: "+(operacion1.getNum1()/operacion1.getNum2()));
        
    }
    
}
