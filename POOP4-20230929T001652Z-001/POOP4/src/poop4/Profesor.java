/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author kevin
 */
import java.util.ArrayList;
import java.util.List;
public class Profesor {
    private String nombre;
    private String apellido;
    private int edad;
    private String especialidad;
    private List<String> cursos;

    // Constructor
    public Profesor(String nombre, String apellido, int edad, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Métodos para obtener información
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public List<String> obtenerCursos() {
        return cursos;
    }

    // Método para agregar un curso
    public void agregarCurso(String curso) {
        cursos.add(curso);
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", especialidad=" + especialidad + ", cursos=" + cursos + '}';
    }
    
}
