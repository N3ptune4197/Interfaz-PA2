/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Datos;

/**
 *
 * @author MSI
 */
public class Material {
    private String codigo;
    private String nombre;
    private String categoria;
    private int unidad;
    private float costo;
    private int stock;

    public Material() {
        this.codigo = "";
        this.nombre = "";
        this.categoria = "";
        this.unidad = 0;
        this.costo = 0;
        this.stock = 0;
    }
    
    public Material(String codigo, String nombre, String categoria, int unidad, float costo, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.unidad = unidad;
        this.costo = costo;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Material{" + "codigo=" + codigo + ", nombre=" + nombre + ", categoria=" + categoria + ", unidad=" + unidad + ", costo=" + costo + ", stock=" + stock + '}';
    }
    
    
    
    
    
}
