/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_Cursos;
import Controlador.Controlador_FRM_Estudiantes;
import Controlador.Controlador_FRM_Matricula;
import Controlador.Controlador_FRM_Usuarios;

/**
 *
 * @author PaulaJCh
 */
public class GUI_Botones extends javax.swing.JPanel {

    /**
     * Creates new form GUI_Botones
     */
    Controlador_FRM_Estudiantes  controladorEstudiantes;
    Controlador_FRM_Cursos       controladorCursos;
    Controlador_FRM_Matricula    controladorMatricula;
    Controlador_FRM_Usuarios     controladorUsuarios;
    
    public GUI_Botones() {
        initComponents();
    }
    public void agregarEventos(Controlador_FRM_Estudiantes controlador)
        {
            this.controladorEstudiantes=controlador;
            this.btn_Consultar.addActionListener(controlador);
            this.btn_Agregar.addActionListener(controlador);
            this.btn_Modificar.addActionListener(controlador);
            this.btn_Eliminar.addActionListener(controlador);
        }
    
    public void agregarEventos(Controlador_FRM_Cursos controlador)
        {
            this.controladorCursos=controlador;
            this.btn_Consultar.addActionListener(controlador);
            this.btn_Agregar.addActionListener(controlador);
            this.btn_Modificar.addActionListener(controlador);
            this.btn_Eliminar.addActionListener(controlador);
        }
    
    public void agregarEventos(Controlador_FRM_Matricula controlador)
        {
            this.controladorMatricula=controlador;
            this.btn_Consultar.addActionListener(controlador);
            this.btn_Agregar.addActionListener(controlador);
            this.btn_Modificar.addActionListener(controlador);
            this.btn_Eliminar.addActionListener(controlador);
        }
    
    public void agregarEventos(Controlador_FRM_Usuarios controlador)
        {
            this.controladorUsuarios=controlador;
            this.btn_Consultar.addActionListener(controlador);
            this.btn_Agregar.addActionListener(controlador);
            this.btn_Modificar.addActionListener(controlador);
            this.btn_Eliminar.addActionListener(controlador);
        }
    
    public void estadoInicial()
    {
        this.btn_Consultar.setEnabled(true);
        this.btn_Agregar.setEnabled(false);
        this.btn_Eliminar.setEnabled(false);
        this.btn_Modificar.setEnabled(false);
    }
    
    public void habilitarAgregar()
    {
        this.btn_Consultar.setEnabled(false);
        this.btn_Agregar.setEnabled(true);
        this.btn_Eliminar.setEnabled(false);
        this.btn_Modificar.setEnabled(false);
    }
    
     public void habilitarOpciones()
    {
        this.btn_Consultar.setEnabled(false);
        this.btn_Agregar.setEnabled(false);
        this.btn_Eliminar.setEnabled(true);
        this.btn_Modificar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Consultar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        btn_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_Consultar)
                .addGap(18, 18, 18)
                .addComponent(btn_Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Eliminar)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_Consultar)
                .addComponent(btn_Agregar)
                .addComponent(btn_Modificar)
                .addComponent(btn_Eliminar))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    // End of variables declaration//GEN-END:variables
}
