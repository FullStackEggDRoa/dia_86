/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import Entidades.Persona;

/**
 *
 * @author droa
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = null;
        
        try{
            p1.getNombre();
        }catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}
