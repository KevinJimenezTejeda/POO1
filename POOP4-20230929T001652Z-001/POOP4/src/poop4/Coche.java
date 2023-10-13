/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class Coche {
    String marca,modelo,color,motor,combustible;

    public Coche() {
    }

    public Coche(String marca, String modelo, String color, String motor, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.combustible = combustible;
    }
    public void avanzar(){
         System.out.println("El coche avanzo"); 
    }
    
    public void retroceder(){
        System.out.println("El coche retrocedio"); 
      
    }
    
    public void prender(){
        System.out.println("Prendido"); 
      
    }
    
    public void apagar(){
        System.out.println("Apagado"); 
      
    }
    
    public void girar(String lado){
        System.out.println("El coche gira a la"+lado); 
      
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", motor=" + motor + ", combustible=" + combustible + '}';
    }
    
    
}
