/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamapsjava;

import java.util.HashMap;

/**
 *
 * @author josel
 */
public class DAOClase {
    //HashMap: Los elementos que se insertan en el map no tienen un orden especefico. No acepta clave duplicadas ni valores null.
    //TreeMap: El mapa se ordena de forma "natural". Por ejemplo, si la clave son valores enteros los ordena de menor a mayor.
    //LinkedHasMap: Los elementos se insertan en el map en el orden de llegada, no sigue ninguna ordenacion, por ello realiza las busquedas de forma mas lenta que los demas.
		
    private HashMap<Integer, Persona> mapPersonas;

    DAOClase() {
        mapPersonas = new HashMap<Integer, Persona>();
        mapPersonas.put(1, new Alumno("Pablo", "Picazo", "Hernandez", "12345678A", Curso.SEGUNDODAM));
        mapPersonas.put(2, new Profesor("Mariano", "Rajoy", "Bustamantis", "12345667P", Dpto.musica));
    }

    public void pasarLista() {
        for(Persona persona:this.mapPersonas.values()){
            Vista.mostrar(persona.dni+", "+persona.nombre+" "+persona.apellido1+" "+persona.apellido2);
        }
    }

    void explicar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void expulsar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
