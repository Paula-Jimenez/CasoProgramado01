/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_Cursos;
import Vista.FRM_Estudiantes;
import Vista.FRM_Matricula;
import Vista.FRM_Usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author PaulaJCh
 */
public class Controlador_FRM_MenuPrincipal implements ActionListener{
    FRM_Estudiantes frm_Estudiantes;
    FRM_Cursos      frm_Cursos;
    FRM_Usuarios   frm_Usuarios;
    FRM_Matricula   frm_Matricula;

    
    public Controlador_FRM_MenuPrincipal() {
       frm_Estudiantes = new FRM_Estudiantes();
       frm_Cursos= new FRM_Cursos();
       frm_Usuarios= new FRM_Usuarios();
       frm_Matricula= new FRM_Matricula();
    }
    
    public void actionPerformed(ActionEvent e) {
      
     if(e.getActionCommand().equals("Salir")){
            System.exit(0);
        }
         if(e.getActionCommand().equals("Estudiantes")){
            this.frm_Estudiantes.setVisible(true);
        }
           if(e.getActionCommand().equals("Cursos")){
            this.frm_Cursos.setVisible(true);
        }
           if(e.getActionCommand().equals("Matricula")){
            this.frm_Matricula .setVisible(true);
            //this.frm_Matricula.colocarCodigo();
        }
            if(e.getActionCommand().equals("Usuarios")){
                System.out.println("sirve");
            this.frm_Usuarios.setVisible(true);
        }
    }
    
}