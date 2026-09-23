/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dndsimulador;

/**
 *
 * @author Daniel Alejandro
 */
import Controlador.ControladorCombate;
import modelo.Paladin;
import modelo.Personaje;
import modelo.Ranger;
import vista.vistaCombate;

public class DNDSimulador {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Simulador de DND");
        //inicializar
        Personaje explorador = new Ranger("david",14);
        Personaje guerrero = new Paladin("valerie",17);
        Personaje profesor = new Personaje("edwin",10);
        
        Personaje[] miGrupo ={explorador,guerrero,profesor};
        vistaCombate miVista =new vistaCombate();
        
        //inicializamos el controlador (inyectar el modelo y la vista)
        ControladorCombate controlador = new ControladorCombate(miGrupo,miVista);
        
        //la logica de la coordinacion
        controlador.ejecutarRonda();
    }
}