/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g9_guia;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;

/**
 *
 * @author Gabriela
 */
public class Manos_Obra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creacion clase jugador
        Jugador j1 = new Jugador();
        j1.setNombre("Gaby");
        j1.setApellido("Martinez");
        j1.setPosicion("delantero");
        j1.setNumero(10);
        
        Jugador j2 = new Jugador();
        j2.setNombre("Julia");
        j2.setApellido("Jimenez");
        j2.setPosicion("portero");
        j2.setNumero(7);
        
        //creacion lista de jugadores
        ArrayList<Jugador> jugadores = new ArrayList();
        
        //añadir el jugador creado a la lista
        jugadores.add(j1);
        jugadores.add(j2);
        
        //creacion clase equipo
        Equipo e1 = new Equipo();
        
        //a la clase equipo se le envía la lista con de objetos jugadores creados
        e1.setJugadores(jugadores);
        
        //imprimir los objetos jugadores en la lista
        for (Jugador aux : jugadores) {
            System.out.println(aux.toString());
        }
        
    }
    
}
