/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo5;

/**
 *
 * @author poo08alu26
 */
public class Alumno {
    private String nombre,apellido,carrera,escuela;
    private int semestre;
    private Fecha fNacimineto;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String carrera, String escuela, int semestre, Fecha fNacimineto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.escuela = escuela;
        this.semestre = semestre;
        this.fNacimineto = fNacimineto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Fecha getfNacimineto() {
        return fNacimineto;
    }

    public void setfNacimineto(Fecha fNacimineto) {
        this.fNacimineto = fNacimineto;
    }
    
    public void dormir(){
        System.out.println("ZzZzZzZzZzZzZzZzZzZzZzZz");
    }
    public void comer(){
        System.out.println("niam niam");
    }
    public void estudiar(){
        System.out.println("Estoyestudiando");
    }
    public void trabajar(){
        System.out.println("Estoy trabajando");
    }
    public void jugar(){
        System.out.println("Estoy jugando");
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera + ", escuela=" + escuela + ", semestre=" + semestre + ", fNacimineto=" + fNacimineto + '}';
    }
    
    
    
}
