package models.administrador;

public class Partida {

    private String codigo;
    private String nombre;
    private java.util.Timer tiempo;

    public Partida(String codigo) {
        this.codigo = codigo;
        this.tiempo = new java.util.Timer();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public java.util.Timer getTiempo() {
        return tiempo;
    }

}
