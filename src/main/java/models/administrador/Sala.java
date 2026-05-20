package models.administrador;

public class Sala {

    private int código;
    private String nombreSala;
    private boolean estado;
    private int capacidad;
    private int jugadores;
    

    public Sala(int código, String nombreSala, boolean estado) {
        this.código = código;
        this.nombreSala = nombreSala;
        this.estado = estado;
        this.capacidad = 40;
        this.jugadores = 0;
    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }


    

}
