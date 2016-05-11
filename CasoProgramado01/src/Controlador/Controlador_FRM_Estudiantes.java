/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ArchivoEstudiantes;
import Modelo.MetodosEstudiantesXML;
import Vista.FRM_Estudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PaulaJCh
 */
public class Controlador_FRM_Estudiantes implements ActionListener{

   
    FRM_Estudiantes frm_Estudiantes;
    MetodosEstudiantesXML metodos;
    ArchivoEstudiantes archivoEstudiantes;
    
    public Controlador_FRM_Estudiantes(FRM_Estudiantes frm_Estudiantes) 
    {
        this.frm_Estudiantes=frm_Estudiantes;
        metodos=new MetodosEstudiantesXML(frm_Estudiantes);
        archivoEstudiantes= new ArchivoEstudiantes();
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.guardarEstudiantesXML(frm_Estudiantes.devolverInformacion());
            //archivoEstudiantes.agregarArchivoEstudiantes(frm_Estudiantes.devolverInformacion());
            frm_Estudiantes.mostrarMensaje("Información agregada al archivo XML de forma correcta.");
            frm_Estudiantes.limpiarInterfaz();
            frm_Estudiantes.estadoInicial();
        }
        if(e.getActionCommand().equals("Consultar"))
        {
           buscar();  
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificarEstudiantesXml(frm_Estudiantes.devolverInformacion());
            frm_Estudiantes.mostrarMensaje("Información modificada en el archivo XML de forma correcta.");
            frm_Estudiantes.limpiarInterfaz();
            frm_Estudiantes.estadoInicial();
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminarEstudiantesXml(frm_Estudiantes.devolverCedula());
            frm_Estudiantes.mostrarMensaje("Información eliminada del archivo XML de forma correcta.");
            frm_Estudiantes.limpiarInterfaz();
            frm_Estudiantes.estadoInicial();
        }
    } 
    public void buscar()
    {
        if(metodos.consultarEstudiantesXml(frm_Estudiantes.devolverCedula()))
        {
            frm_Estudiantes.mostrarInformacion(metodos.getArregloInformacion());
            frm_Estudiantes.habilitarOpciones();
            
            frm_Estudiantes.mostrarMensaje("Información encontrada con la cédula : "+frm_Estudiantes.devolverCedula());
        }
        else
        {
            frm_Estudiantes.mostrarMensaje("No se encontró información con la cédula: "+frm_Estudiantes.devolverCedula());
            frm_Estudiantes.habilitarAgregar();
        }   
        frm_Estudiantes.deshabilitarCedula();
    }  
}


