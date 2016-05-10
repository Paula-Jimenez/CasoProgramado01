/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosUsuariosXML;
import Vista.FRM_Usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PaulaJCh
 */
public class Controlador_FRM_Usuarios implements ActionListener{

   
    FRM_Usuarios frm_Usuarios;
    MetodosUsuariosXML metodos;
    
    public Controlador_FRM_Usuarios(FRM_Usuarios frm_Usuarios) 
    {
        this.frm_Usuarios=frm_Usuarios;
        metodos=new MetodosUsuariosXML(frm_Usuarios);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.guardarUsuariosXML(frm_Usuarios.devolverInformacion());
            frm_Usuarios.mostrarMensaje("Información agregada al archivo XML de forma correcta.");
            frm_Usuarios.limpiarInterfaz();
            frm_Usuarios.estadoInicial();
        }
        if(e.getActionCommand().equals("Consultar"))
        {
           buscar();  
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificarUsuariosXml(frm_Usuarios.devolverInformacion());
            frm_Usuarios.mostrarMensaje("Información modificada en el archivo XML de forma correcta.");
            frm_Usuarios.limpiarInterfaz();
            frm_Usuarios.estadoInicial();
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminarUsuariosXml(frm_Usuarios.devolverUsuario());
            frm_Usuarios.mostrarMensaje("Información eliminada del archivo XML de forma correcta.");
            frm_Usuarios.limpiarInterfaz();
            frm_Usuarios.estadoInicial();
        }
    } 
    public void buscar()
    {
        if(metodos.consultarUsuariosXml(frm_Usuarios.devolverUsuario()))
        {
            frm_Usuarios.mostrarInformacion(metodos.getArregloInformacion());
            frm_Usuarios.habilitarOpciones();
            
            frm_Usuarios.mostrarMensaje("Información encontrada con la sigla : "+frm_Usuarios.devolverUsuario());
        }
        else
        {
            frm_Usuarios.mostrarMensaje("No se encontró información con la sigla: "+frm_Usuarios.devolverUsuario());
            frm_Usuarios.habilitarAgregar();
        }   
        frm_Usuarios.deshabilitarUsuario();
    }  
}

