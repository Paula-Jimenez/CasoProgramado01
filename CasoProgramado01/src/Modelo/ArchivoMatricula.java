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
public class ArchivoMatricula {
    ObjectOutputStream archivoSalida;
    ObjectInputStream  archivoEntrada;
    
    public ArchivoMatricula(){
       if(cargarArchivoMatricula())
       {
           System.out.println("Se cargo el archivo matricula corretamente");
       }
       else
       {
           System.out.println("Error al cargar el archivo matricula");
       }
    }
    
     public boolean cargarArchivoMatricula(){
        boolean existe=false;
         try
         {
         archivoEntrada=new ObjectInputStream(new FileInputStream("matricula.dat"));
         existe=true;
         }
         catch(Exception e)
         {
                 System.out.println("Error al cargar archivo de matricula"+e);
         }
        return existe;
     }
     
     public void crearArchivosMatricula(){
         try
         {
         archivoSalida=new ObjectOutputStream(new FileOutputStream("matricula.dat"));
         System.out.println("Se creo el archivo de matricula correctamente");
         }
         catch(Exception e)
         {
                 System.out.println("Error al crear archivo de matricula"+e);
         }
     }
     
     public void ingresarArchivoMatricula(Matricula matricula){
     
         try
         {
             archivoSalida.writeObject(matricula);
             System.out.println("Se escribio correctamente la informacion en el archivo matricula");
         }
         catch(Exception e)
         {
                 System.out.println("Error al ingresar informacion al archivo de matricula"+e);
         }
     }

       public ArrayList<Matricula> devolverArchivoMatricula() {

        ArrayList<Matricula> array = new ArrayList<Matricula>();
        try {
            while (true) {
                array.add((Matricula) archivoEntrada.readObject());
            }
        } catch (Exception e) {
            System.out.println("Se llego a el final del archivo matricula");
        }
        return array;
    }
}

