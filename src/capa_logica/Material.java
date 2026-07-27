package capa_logica;

import java.io.Serializable;

public class Material implements Serializable {

    private static final long serialVersionUID = 1L;

    private String codigo;
    private String nombre;
    private String categoria;
    private String unidadMedida;
    private float costo;
    private int stock;

    public Material() {
        codigo = "";
        nombre = "";
        categoria = "";
        unidadMedida = "";
        costo = 0;
        stock = 0;
    }

    public Material(String codigo, String nombre, String categoria,
            String unidadMedida, float costo, int stock) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.unidadMedida = unidadMedida;
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

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
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
        return nombre;
    }

}