/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosCursosXML;
import Vista.FRM_Cursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PaulaJCh
 */
public class Controlador_FRM_Cursos implements ActionListener{

   
    FRM_Cursos frm_Cursos;
    MetodosCursosXML metodos;
    
    public Controlador_FRM_Cursos(FRM_Cursos frm_Cursos) 
    {
        this.frm_Cursos=frm_Cursos;
        metodos=new MetodosCursosXML(frm_Cursos);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.guardarCursosXML(frm_Cursos.devolverInformacion());
            frm_Cursos.mostrarMensaje("Información agregada al archivo XML de forma correcta.");
            frm_Cursos.limpiarInterfaz();
            frm_Cursos.estadoInicial();
        }
        if(e.getActionCommand().equals("Consultar"))
        {
           buscar();  
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificarCursosXml(frm_Cursos.devolverInformacion());
            frm_Cursos.mostrarMensaje("Información modificada en el archivo XML de forma correcta.");
            frm_Cursos.limpiarInterfaz();
            frm_Cursos.estadoInicial();
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminarCursosXml(frm_Cursos.devolverSigla());
            frm_Cursos.mostrarMensaje("Información eliminada del archivo XML de forma correcta.");
            frm_Cursos.limpiarInterfaz();
            frm_Cursos.estadoInicial();
        }
    } 
    public void buscar()
    {
        if(metodos.consultarCursosXml(frm_Cursos.devolverSigla()))
        {
            frm_Cursos.mostrarInformacion(metodos.getArregloInformacion());
            frm_Cursos.habilitarOpciones();
            
            frm_Cursos.mostrarMensaje("Información encontrada con la sigla : "+frm_Cursos.devolverSigla());
        }
        else
        {
            frm_Cursos.mostrarMensaje("No se encontró información con la sigla: "+frm_Cursos.devolverSigla());
            frm_Cursos.habilitarAgregar();
        }   
        frm_Cursos.deshabilitarSigla();
    }  
}
