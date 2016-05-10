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
    public class Usuario implements Serializable{
    String nombreCompleto;
    String usuario;
    String contrasena;
    String tipo;

    public Usuario(String nombreCompleto, String usuario, String contrasena, String tipo) {
        this.nombreCompleto = nombreCompleto;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

 public String getInformacion(){
      return " NombreCompleto: "+nombreCompleto+" Usuario: "+usuario+" Contraseña: "+contrasena+" Tipo: "+tipo;
  }    
    
}
