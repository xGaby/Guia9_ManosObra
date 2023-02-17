/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g9_guia;

import Entidades.Dni;
import Entidades.Persona;

/**
 *
 * @author Gabriela
 */
public class Manos_Obra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona();
        persona1.setNombre("Gaby");
        persona1.setApellido("Martinez");
        Dni dni = new Dni();
        dni.setNumero(4);
        dni.setSerie("104543");
        
        persona1.setDni(dni);
        
        System.out.println(persona1.toString());
        
    }
    
}
