/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capa_logica;

/**
 *
 * @author MSI
 */
public class Pedido {
    private String codigo;
    private Proyecto proyecto;
    private Material material;
    private int cantidad;
    private String fecha;
    
     public Pedido(String codigo, Proyecto proyecto, Material material, int cantidad, String fecha) {
        this.codigo = codigo;
        this.proyecto = proyecto;
        this.material = material;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", proyecto=" + proyecto + ", material=" + material + ", cantidad=" + cantidad + ", fecha=" + fecha + '}';
    }
    
    
    
    
}
