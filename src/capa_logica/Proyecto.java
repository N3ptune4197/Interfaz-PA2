package capa_logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Proyecto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String codigo;
    private String nombre;
    private String ubicacion;
    private String responsable;

    private ArrayList<Pedido> pedidos;

    public Proyecto() {

        codigo = "";
        nombre = "";
        ubicacion = "";
        responsable = "";

        pedidos = new ArrayList<>();

    }

    public Proyecto(String codigo,
            String nombre,
            String ubicacion,
            String responsable) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.responsable = responsable;

        pedidos = new ArrayList<>();

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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void eliminarPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }

    public float getMontoTotal() {

        float total = 0;

        for (Pedido p : pedidos) {

            total += p.getSubtotal();

        }

        return total;

    }

    @Override
    public String toString() {
        return nombre;
    }

}