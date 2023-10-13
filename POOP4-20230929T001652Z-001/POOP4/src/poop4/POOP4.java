
package poop4;

/**
 *
 * @author estudiante
 */
import java.util.ArrayList;
import java.util.List;
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto punto = new Punto();
        punto.imprimirPunto();
        Punto punto2=new Punto(3,5);
        punto2.imprimirPunto();
        System.out.println(punto);
        System.out.println(punto2);
        
        Perro perro =new Perro("max","chihuahua","negro",15);
        System.out.println(perro);
        Coche coche =new Coche("Mazda","2018","rojo","automatico","magna");
        coche.girar("derecha");
        System.out.println(coche.toString());
        double a,b,c;
        a=2;
        b=2;
        TrianguloRectangulo lados=new TrianguloRectangulo(a,b);
        System.out.println(lados.toString());
        System.out.println("El Area es:"+lados.Area(a,b));
        c=lados.calcularHipotenusa(a, b);
        System.out.println("La hipotenusa es:"+c);
        System.out.println("El Perimetro es:"+lados.Perimetro(a, b,c ));
         Alumno alumno = new Alumno();
         double[] calificaciones = { 10, 10, 10, 10, 10 };
        Alumno kevin = new Alumno("Kevin", "Jimenez", "ji33040", 18, calificaciones);
        System.out.println(kevin.toString());
        Profesor profesor = new Profesor("Juan", "Gómez", 35, "Matemáticas");

        // Agregar cursos al profesor
        profesor.agregarCurso("Álgebra");
        profesor.agregarCurso("Cálculo");
        profesor.agregarCurso("Geometría");

        // Obtener información del profesor
        System.out.println("Información del profesor:");
        System.out.println("Nombre: " + profesor.obtenerNombre());
        System.out.println("Apellido: " + profesor.obtenerApellido());
        System.out.println("Edad: " + profesor.obtenerEdad());
        System.out.println("Especialidad: " + profesor.obtenerEspecialidad());
        
        List<String> cursos = profesor.obtenerCursos();
        System.out.println("Cursos:");
        for (String curso : cursos) {
            System.out.println("- " + curso);
        }

        // Imprimir la información completa del profesor
        System.out.println(profesor);
    }
}
