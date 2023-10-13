/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poopractica3;

/**
 *
 * @author kevin
 */
import java.util.Hashtable;
import java.util.Calendar;
import java.util.Enumeration;
public class AgendaCumpleaños {
     public static void main(String[] args) {
        // Crear una Hashtable para la agenda
        Hashtable<String, Calendar> agenda = new Hashtable<>();

        // Crear instancias de Calendar para las fechas de cumpleaños
        Calendar cumpleaños1 = Calendar.getInstance();
        cumpleaños1.set(Calendar.YEAR, 2000);
        cumpleaños1.set(Calendar.MONTH, Calendar.MARCH);
        cumpleaños1.set(Calendar.DAY_OF_MONTH, 15);

        Calendar cumpleaños2 = Calendar.getInstance();
        cumpleaños2.set(Calendar.YEAR, 1995);
        cumpleaños2.set(Calendar.MONTH, Calendar.JULY);
        cumpleaños2.set(Calendar.DAY_OF_MONTH, 20);

        Calendar cumpleaños3 = Calendar.getInstance();
        cumpleaños3.set(Calendar.YEAR, 1987);
        cumpleaños3.set(Calendar.MONTH, Calendar.NOVEMBER);
        cumpleaños3.set(Calendar.DAY_OF_MONTH, 5);

        Calendar cumpleaños4 = Calendar.getInstance();
        cumpleaños4.set(Calendar.YEAR, 1992);
        cumpleaños4.set(Calendar.MONTH, Calendar.APRIL);
        cumpleaños4.set(Calendar.DAY_OF_MONTH, 10);

        Calendar cumpleaños5 = Calendar.getInstance();
        cumpleaños5.set(Calendar.YEAR, 1980);
        cumpleaños5.set(Calendar.MONTH, Calendar.SEPTEMBER);
        cumpleaños5.set(Calendar.DAY_OF_MONTH, 30);

        // Agregar registros a la agenda
        agenda.put("Persona1", cumpleaños1);
        agenda.put("Persona2", cumpleaños2);
        agenda.put("Persona3", cumpleaños3);
        agenda.put("Persona4", cumpleaños4);
        agenda.put("Persona5", cumpleaños5);

        // Imprimir todos los elementos de la agenda
        Enumeration<String> nombres = agenda.keys();
        while (nombres.hasMoreElements()) {
            String nombre = nombres.nextElement();
            Calendar cumpleaños = agenda.get(nombre);
            int año = cumpleaños.get(Calendar.YEAR);
            int mes = cumpleaños.get(Calendar.MONTH) + 1; // Los meses comienzan desde 0
            int dia = cumpleaños.get(Calendar.DAY_OF_MONTH);
            System.out.println(nombre + ": " + dia + "/" + mes + "/" + año);
        }
    }
}
