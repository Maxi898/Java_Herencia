/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Daniel Alejandro
 */
public class Ranger extends Personaje {
        
    public Ranger(String nombre, int constitucion) {
        super(nombre, constitucion);
    }
    
    @Override
    public String realizarAtaque (){
        return "Dispara con una flecha letal desde las sombras";
    }
}
