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
        
        Jugador j1 = new Jugador();
        j1.setNombre("Gaby");
        j1.setApellido("Martinez");
        j1.setPosicion("delantero");
        j1.setNumero(10);
        
        ArrayList<Jugador> jugadores = new ArrayList();
        jugadores.add(j1);
        
        Equipo e1 = new Equipo();
        e1.setJugadores(jugadores);
        
        for (Jugador aux : jugadores) {
            System.out.println(aux.toString());
        }
        
    }
    
}
