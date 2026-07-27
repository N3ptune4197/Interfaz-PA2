


package capa_logica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Pedido {

    private String codigo;
    private Proyecto proyecto;
    private Material material;
    private int cantidad;
    private LocalDate fecha;

    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Pedido() {
        codigo = "";
        proyecto = null;
        material = null;
        cantidad = 0;
        fecha = LocalDate.now();
    }

    public Pedido(String codigo, Proyecto proyecto,
            Material material, int cantidad, LocalDate fecha) {

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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public float getSubtotal() {
        if (material == null) {
            return 0;
        }
        return cantidad * material.getCosto();
    }
    
    // METODO PARA FORMATEAR FECHAAAAAAAAAAAAAAAAAA dd/mm/yyyy
    public String getFechaFormateada() {
    return fecha.format(FORMATO);
}
    
    

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", proyecto=" + proyecto + ", material=" + material + ", cantidad=" + cantidad + ", fecha=" + fecha + '}';
    }

}