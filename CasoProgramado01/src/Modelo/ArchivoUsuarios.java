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
public class ArchivoUsuarios {
    ObjectOutputStream archivoSalida;
    ObjectInputStream  archivoEntrada;
    
    public ArchivoUsuarios(){
       if(cargarArchivoUsuario())
       {
           System.out.println("Se cargo el archivo usuarios corretamente");
       }
       else
       {
           System.out.println("Error al cargar el archivo usuarios");
       }
    }
    
     public boolean cargarArchivoUsuario(){
        boolean existe=false;
         try
         {
         archivoEntrada=new ObjectInputStream(new FileInputStream("usuarios.dat"));
         existe=true;
         }
         catch(Exception e)
         {
                 System.out.println("Error al cargar archivo de estudiantes"+e);
         }
        return existe;
     }
     
     public void crearArchivosUsuario(){
         try
         {
         archivoSalida=new ObjectOutputStream(new FileOutputStream("usuarios.dat"));
         System.out.println("Se creo el archivo de usuarios correctamente");
         }
         catch(Exception e)
         {
                 System.out.println("Error al crear archivo de usuarios"+e);
         }
     }
     
     public void ingresarArchivoUsuario(Usuario usuario){
     
         try
         {
             archivoSalida.writeObject(usuario);
             System.out.println("Se escribio correctamente la informacion en el archivo usuarios");
         }
         catch(Exception e)
         {
                 System.out.println("Error al ingresar informacion al archivo de usuarios"+e);
         }
     }

       public ArrayList<Usuario> devolverArchivoUsuario() {

        ArrayList<Usuario> array = new ArrayList<Usuario>();
        try {
            while (true) {
                array.add((Usuario) archivoEntrada.readObject());
            }
        } catch (Exception e) {
            System.out.println("Se llego a el final del archivo usuarios");
        }
        return array;
    }
}
