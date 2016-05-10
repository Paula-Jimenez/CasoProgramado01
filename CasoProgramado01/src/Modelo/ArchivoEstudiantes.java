/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author PaulaJCh
 */
public class ArchivoEstudiantes {
    
    ObjectOutputStream archivoSalida;
    ObjectInputStream  archivoEntrada;
    
    public ArchivoEstudiantes(){
       if(cargarArchivoEstudiantes())
       {
           System.out.println("Se cargo el archivo estudiantes corretamente");
       }
       else
       {
           System.out.println("Error al cargar el archivo estudiantes");
       }
    }
    
     public boolean cargarArchivoEstudiantes(){
        boolean existe=false;
         try
         {
         archivoEntrada=new ObjectInputStream(new FileInputStream("estudiantes.dat"));
         existe=true;
         }
         catch(Exception e)
         {
                 System.out.println("Error al cargar archivo de estudiantes"+e);
         }
        return existe;
     }
     
     public void crearArchivosEstudiantes(){
         try
         {
         archivoSalida=new ObjectOutputStream(new FileOutputStream("estudiantes.dat"));
         System.out.println("Se creo el archivo de estudiantes correctamente");
         }
         catch(Exception e)
         {
                 System.out.println("Error al crear archivo de estudiantes"+e);
         }
     }
     
     public void ingresarArchivoEstudiantes(Estudiante estudiante){
     
         try
         {
             archivoSalida.writeObject(estudiante);
             System.out.println("Se escribio correctamente la informacion en el archivo estudiantes");
         }
         catch(Exception e)
         {
                 System.out.println("Error al ingresar informacion al archivo de estudiantes"+e);
         }
     }

       public ArrayList<Estudiante> devolverArchivoEstudiantes() {

        ArrayList<Estudiante> array = new ArrayList<Estudiante>();
        try {
            while (true) {
                array.add((Estudiante) archivoEntrada.readObject());
            }
        } catch (Exception e) {
            System.out.println("Se llego a el final del archivo estudiantes");
        }
        return array;
    }
}