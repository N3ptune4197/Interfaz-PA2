package capa_logica;

public class Proyecto {

    private String codigo;
    private String nombre;
    private String ubicacion;
    private String responsable;

    public Proyecto() {
        codigo = "";
        nombre = "";
        ubicacion = "";
        responsable = "";
    }

    public Proyecto(String codigo, String nombre,
            String ubicacion, String responsable) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.responsable = responsable;
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

    @Override
    public String toString() {
        return "Proyecto{" + "codigo=" + codigo + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", responsable=" + responsable + '}';
    }

    

}