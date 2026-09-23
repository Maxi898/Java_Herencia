/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Daniel Alejandro
 */
public class Paladin extends Personaje {
    
    public Paladin(String nombre, int constitucion) {
        super(nombre, constitucion);
    }
    
    @Override
    public String realizarAtaque (){
        return "Con su mazo sagrado hace un daño radiante";
    }
}