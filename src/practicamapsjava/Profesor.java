/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamapsjava;

/**
 *
 * @author josel
 */
public class Profesor extends Persona{
    
    private Dpto dpto;
    
    public Profesor(String nombre, String apellido1, String apellido2, String dni, Dpto dpto) {
        super(nombre, apellido1, apellido2, dni);
        this.dpto=dpto;
    }

    public Dpto getDpto() {
        return dpto;
    }

    public void setDpto(Dpto dpto) {
        this.dpto = dpto;
    }

    @Override
    public String toString() {
        return "Profesor{ dni=" + getDni() + ", nombre="+ getNombre()+", nombre="+ getApellido1() +", nombre="+ getApellido2() + ", nombre="+ getDni()+", dpto=" + dpto + "}";
    }
    
    
}
