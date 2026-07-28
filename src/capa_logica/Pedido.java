package capa_logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    private String codigo;
    private Material material;
    private int cantidad;
    private LocalDate fecha;

    private static final DateTimeFormatter FORMATO =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Pedido() {

        codigo = "";
        material = null;
        cantidad = 0;
        fecha = LocalDate.now();

    }

    public Pedido(String codigo, Material material,
            int cantidad, LocalDate fecha) {

        this.codigo = codigo;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getFechaFormateada() {
        return fecha.format(FORMATO);
    }

    public float getSubtotal() {

        if (material == null)
            return 0;

        return cantidad * material.getCosto();

    }

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", material=" + material + ", cantidad=" + cantidad + ", fecha=" + fecha + '}';
    }

    

}