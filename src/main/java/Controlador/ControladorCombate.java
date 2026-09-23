/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Daniel Alejandro
 */
import modelo.Personaje;
import vista.vistaCombate;

public class ControladorCombate {
    //el controlador debe tener
    //las referencias al modelo pero en un arreglo
    //y tambien a la vista
    private Personaje[] grupo;
    private vistaCombate vista;

    //logica de coordinacion
    public ControladorCombate(Personaje[] grupo, vistaCombate vista) {
        this.grupo = grupo;
        this.vista = vista;
    }
    
    public void ejecutarRonda(){
        vista.mostrarInicioDeCombate();
        //polimorfismo
        for(Personaje p: grupo){
            String accion = p.realizarAtaque();
            vista.mostrarAtaque(p.getNombre(), accion);
        }
    }
    
}
