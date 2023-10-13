/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poopractica3;

/**
 *
 * @author kevin
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

public class POOPRactica3 {

    public static void main(String[] args) {
        System.out.println("************* arreglos **************");
        int[] nums;
        int[] nums1;
        int[] nums2;
        int[] nums3;

        int[] num4 = {1, 2, 3, 4, 5};
        System.out.println("************* for **************");
        for (int i = 0; i < num4.length; i += 1) {
            int o = num4[i];
            System.out.println(o);
        }

        System.out.println("************* for-each **************");
        for (int o : num4) {
            System.out.println(o);
        }

        System.out.println("************* concatenar **************");

        String s = new String("Hola Mundo");
        String s1 = "Hola mundo 2";
        System.out.println(s);
        System.out.println(s1);

        String nombre = "Kevin";
        String apellido = "Jimenez";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);

        System.out.println("************* operador punto **************");

        System.out.println("arreglo con elementos: " + num4.length);
        System.out.println("elementos de nombre: " + nombre.length());
        System.out.println(nombreCompleto.toUpperCase());

        System.out.println("************* wrappers y autoboxing **************");
        Integer k = new Integer(50);
        Integer l = 22;
        int r = k;
        String s3 = k.toString();
        System.out.println(s3);
        String s4 = r + "";
        System.out.println(s4);

        System.out.println("************* Colecciones **************");
        System.out.println("************* arrayList **************");

        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(66);
        miArrayList.add(9);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(1));
        miArrayList.add(0, 20);
        System.out.println("***");
        for (Integer e : miArrayList) {
            System.out.println(e);
        }
        System.out.println("***");
        miArrayList.add(2, 77);
        for (Integer e : miArrayList) {
            System.out.println(e);
        }

        System.out.println("************* HashTable **************");
        Hashtable<String, Integer> miTabla = new Hashtable<String, Integer>();
        miTabla.put("uno", 1);
        miTabla.put("Antonio", 557966332);
        miTabla.put("Josefina", 552200569);
        System.out.println("Elementos de tabla: " + miTabla.size());

        for (Integer valor : miTabla.values()) {
            System.out.println(valor);
        }
        for (String clave : miTabla.keySet()) {
            System.out.println(clave);
        }

        System.out.println("************* Enumeracion **************");
        String llave;
        Integer valor;
        Enumeration<String> llaves = miTabla.keys();
        while (llaves.hasMoreElements()) {
            llave = llaves.nextElement();
            valor = miTabla.get(llave);
            System.out.println("Llave: " + llave + " Valor: " + valor);
        }

        System.out.println("************* Math **************");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80, 7));

        System.out.println("************* Date **************");
        Date hoy = new Date();
        System.out.println(hoy);

        System.out.println("************* Calendario **************");
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);

        System.out.println("************* Formato de date **************");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(formatoFecha.format(hoy));

        System.out.println("************* Formato de calendar **************");

        String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH) + " de ";
        fechaActual += (calendarioHoy.get(Calendar.MONTH) + 1) + " de ";
        fechaActual += calendarioHoy.get(Calendar.YEAR);
        System.out.println(fechaActual);
    }
}
