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
public class Controlador {
    DAOClase dao = new DAOClase();
    
    Vista vista = new Vista();
    
    public void ejecutar() throws InterruptedException{
        Integer opcion=0;
        while(opcion<4){
            
            opcion = vista.cargarMenu("Pasar lista", "Explicar", "Expulsar de clase");
            
            switch(opcion){
                case 1: dao.pasarLista();
                    break;
                case 2: dao.explicar();
                    break;
                case 3: dao.expulsar();
                    break;
            }
            
        }
    }
}
