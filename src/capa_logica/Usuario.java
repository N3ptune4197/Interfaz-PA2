/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capa_logica;

import java.util.Random;

/**
 *
 * @author NAYR VASQUEZ
 */
public class Usuario {

    private String nombre;
    private String contraseña;
    private String nombreCompleto;
    private String tipo;
    private boolean estado;
    
    public Usuario() {
        this.nombre = "";
        this.contraseña = "";
        this.nombreCompleto = "";
        this.tipo = "";
        this.estado = false;
    }
    
    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.nombreCompleto = "";
        this.tipo = "";
        this.estado = false;
    }
    
    public Usuario(String nombre, String contraseña, String nombreCompleto, 
            String tipo, boolean estado) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.nombreCompleto = nombreCompleto;
        this.tipo = tipo;
        this.estado = estado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public boolean IniciarSesion()
    {
        if( nombre.equals("Admin") && contraseña.equals("65432") )
        {
            return true;
        }
        else
            return false;
    }
    
    public int generarAleatorio()
    {
        Random  valor = new Random();
        int dato;
        
        dato = valor.nextInt(10000, 99999);
        return dato;
    }
}
