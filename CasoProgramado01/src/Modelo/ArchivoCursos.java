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
public class ArchivoCursos {
    ObjectOutputStream archivoSalida;
    ObjectInputStream  archivoEntrada;
    
    public ArchivoCursos(){
       if(cargarArchivoCursos())
       {
           System.out.println("Se cargo el archivo cursos corretamente");
       }
       else
       {
           System.out.println("Error al cargar el archivo cursos");
       }
    }
    
     public boolean cargarArchivoCursos(){
        boolean existe=false;
         try
         {
         archivoEntrada=new ObjectInputStream(new FileInputStream("cursos.dat"));
         existe=true;
         }
         catch(Exception e)
         {
                 System.out.println("Error al cargar archivo de cursos"+e);
         }
        return existe;
     }
     
     public void crearArchivosCursos(){
         try
         {
         archivoSalida=new ObjectOutputStream(new FileOutputStream("cursos.dat"));
         System.out.println("Se creo el archivo de cursos correctamente");
         }
         catch(Exception e)
         {
                 System.out.println("Error al crear archivo de cursos"+e);
         }
     }
     
     public void ingresarArchivoCursos(Curso curso){
     
         try
         {
             archivoSalida.writeObject(curso);
             System.out.println("Se escribio correctamente la informacion en el archivo cursos");
         }
         catch(Exception e)
         {
                 System.out.println("Error al ingresar informacion al archivo de cursos"+e);
         }
     }

       public ArrayList<Curso> devolverArchivoCursos() {

        ArrayList<Curso> array = new ArrayList<Curso>();
        try {
            while (true) {
                array.add((Curso) archivoEntrada.readObject());
            }
        } catch (Exception e) {
            System.out.println("Se llego a el final del archivo estudiantes");
        }
        return array;
    }
}
