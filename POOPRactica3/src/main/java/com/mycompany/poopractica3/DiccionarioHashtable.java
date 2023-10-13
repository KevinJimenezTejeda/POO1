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
import java.util.Enumeration;
public class DiccionarioHashtable {
    public static void main(String[] args) {
        // Crear una Hashtable
        Hashtable<String, String> diccionario = new Hashtable<>();

        // Agregar elementos al diccionario
        diccionario.put("Casa", "Lugar donde se vive");
        diccionario.put("Auto", "Medio de transporte terrestre");
        diccionario.put("Computadora", "Dispositivo para procesar información");
        diccionario.put("Libro", "Conjunto de hojas impresas");
        diccionario.put("Perro", "Mamífero domesticado");

        // Imprimir todos los elementos del diccionario
        Enumeration<String> keys = diccionario.keys();
        while (keys.hasMoreElements()) {
            String palabra = keys.nextElement();
            String definicion = diccionario.get(palabra);
            System.out.println(palabra + ": " + definicion);
        }
    }
}
