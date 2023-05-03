package MAINS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Chespo
 */
public class Correciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> listadob = new TreeSet();
        //HashMap<Integer,String> personas = new HashMap();

        /*LISTAS:*/
        ArrayList<Integer> numerosA = new ArrayList();//Lista de tipo Integer
        int x = 20;
        int f = 10;
        numerosA.add(x);//Agregamos  el numero 20 a la Lista en la posiciion 0 
        numerosA.add(f);
        numerosA.remove(0);
//Conjuntos:
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 20;
        numerosB.add(y);

//Mapas
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 42782184;
        String nombreAlumno = "Chespo";
        alumnos.put(dni, nombreAlumno);//Agregamos la llave y un Valor 

        HashMap<Integer, String> personas = new HashMap();

        String n1 = "Albus";
        int dni1 = 123;
        String n2 = "Severus";
        int dni2 =321;

        personas.put(dni1,n1);
        personas.put(dni2,n2);

        System.out.println(n1 + "-" + n2 + "-");
 System.out.println(personas.get(dni2));
    }

}
