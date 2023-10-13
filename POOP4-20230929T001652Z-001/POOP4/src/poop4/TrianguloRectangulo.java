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
public class TrianguloRectangulo {
    double ladoA,ladoB;

    public TrianguloRectangulo() {
    }

    public TrianguloRectangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    public double calcularHipotenusa(double ladoA,double ladoB){
        double hipotenusa;
        hipotenusa=Math.sqrt((Math.pow(ladoA,2))+(Math.pow(ladoB,2)));
        return hipotenusa;
    }  
    public double Perimetro(double ladoA,double ladoB,double hipotenusa){
        double perimetro=ladoA+ladoB+hipotenusa;
        return perimetro;
    }  
     public double Area(double ladoA,double ladoB){
        double area;
        area=(ladoA*ladoB)/2;   
       return area;
     }
     public double obtenerLadoA(){
       Scanner lado = new Scanner (System.in);
       System.out.println("\n Por favor, dame el primer número de la operación. ");
       ladoA =lado.nextDouble();
       return ladoA;
     } 
     
     public double obtenerLadoB(){

       Scanner lado = new Scanner (System.in);
       System.out.println("\n Por favor, dame el primer número de la operación. ");
       ladoB =lado.nextDouble();
       return ladoB;
     } 
     public void establecerLados(double ladoA,double ladoB){
         ladoA=ladoA;
         ladoB=ladoB;
     }

    @Override
    public String toString() {
        return "TrianguloRectangulo{" + "ladoA=" + ladoA + ", ladoB=" + ladoB + '}';
    }
     
     
}
