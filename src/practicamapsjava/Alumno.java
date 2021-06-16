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
public class Alumno extends Persona{
    
    private Curso curso;

    public Alumno(String nombre, String apellido1, String apellido2, String dni, Curso curso) {
        super(nombre, apellido1, apellido2, dni);
        this.curso=curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{ dni=" + getDni() + ", nombre="+ getNombre()+", nombre="+ getApellido1() +", nombre="+ getApellido2() + ", nombre="+ getDni()+", curso=" + curso + "}";
    }    
    
}
