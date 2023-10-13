/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author kevin
 */
import java.util.Scanner;
public class Alumno {
   String nombre,apellido,numdecarnet;
   int edad ;
   double []calificaciones;
   
    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String numdecarnet, int edad, double[] calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numdecarnet = numdecarnet;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }
    public String obtenerNombre(){
        Scanner nombres = new Scanner (System.in);
       System.out.println("\n Por favor, dame tu nombre o nombres ");
       nombre =nombres.nextLine();
        return nombre;
    }
    public String obtenerApellido(){
        Scanner nombres = new Scanner (System.in);
       System.out.println("\n Por favor, dame tus apellidos ");
       apellido =nombres.nextLine();
        return apellido;
    }
    public int obtenerEdad(){
        Scanner edades = new Scanner (System.in);
       System.out.println("\n Por favor, dame tu edad ");
       edad =edades.nextInt();
        return edad;
    }
   public String obtenerNumcarnet(){
        Scanner carnets = new Scanner (System.in);
       System.out.println("\n Por favor, dame tu numero de carnet ");
       numdecarnet=carnets.nextLine();
        return numdecarnet;
    }
   public void agregarCalificacion(double[] calificaciones) {
       int numDeMaterias;
       Scanner materias = new Scanner(System.in);
       Scanner calificacion = new Scanner(System.in);

       System.out.println("\nPor favor, dame el número de calificaciones a ingresar: ");
       numDeMaterias = materias.nextInt();
    
       calificaciones = new double[numDeMaterias]; 

       for (int i = 0; i < numDeMaterias; i++) { 
           System.out.println("\nPor favor, ingresar calificación " + (i + 1) + ":");
           calificaciones[i] = calificacion.nextDouble();
        }
       
    }
   public double calcularPromedio(double[] calificaciones) {
    double suma = 0;
    int numCalificaciones = calificaciones.length;

    for (int i = 0; i < numCalificaciones; i++) {
        suma += calificaciones[i];
       }

    if (numCalificaciones > 0) {
        return suma / numCalificaciones;
      } else {
        return 0; // Evitamos dividir por cero si no hay calificaciones.
      }
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", numdecarnet=" + numdecarnet + ", edad=" + edad + ", calificaciones=" + calificaciones + '}';
    }
   


}
