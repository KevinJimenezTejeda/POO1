/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class Perro {
    String nombre,raza,color;
    int edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }
    
    public void sentado(){
        System.out.println("Estoy sentado");
    }
    public void ladra(int veces){
        for (int i=0;i<veces;i++) {
        System.out.println("wof");
    }
    }
    public void corre(int distacia){
      System.out.println("corri"+distacia+"metros");  
        
    }
     public void duerme(int horas){
    System.out.println("Dormi"+horas+"horas");
}

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + '}';
    }
     
}
