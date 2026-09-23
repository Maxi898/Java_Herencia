/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Daniel Alejandro
 */
public class Personaje {
    protected String nombre;
    protected int constitucion;

    public Personaje(String nombre, int constitucion) {
        this.nombre = nombre;
        this.constitucion = constitucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public void setConstitucion(int constitucion) {
        this.constitucion = constitucion;
    }
    
    public String realizarAtaque (){
    return "realiza un ataque básico sin armas";
}
    
} 

