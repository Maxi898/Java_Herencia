/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Daniel Alejandro
 */
public class vistaCombate {
    public void mostrarInicioDeCombate(){
        System.out.println("============================");
        System.out.println("========== Inicio de Combate ==========");
        System.out.println("============================");
    }
    
    public void mostrarAtaque(String nombrePersonaje, String accionAtaque){
        System.out.println("¡Boom!"+ nombrePersonaje+"->"+accionAtaque); 
    }
} 

