/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author PaulaJCh
 */
public class Estudiante implements Serializable{
    private String cedula;
    private String nombreCompleto;
    private String direccion;
    

    public Estudiante(String cedula, String nombreCompleto, String direccion)
    {
        this.cedula=cedula;
        this.nombreCompleto=nombreCompleto;
        this.direccion=direccion;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
  public String getInformacion(){
      return " Cedula: "+cedula+" Nombre Completo: "+nombreCompleto+" Direccion: "+direccion;
  }   
}