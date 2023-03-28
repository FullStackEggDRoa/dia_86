/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author droa
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Alumno> alumnos=new ArrayList<>();
        
        try{
            Iterator<Alumno> it = alumnos.iterator();
            it.next().getNombre();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        
    }
    
}
