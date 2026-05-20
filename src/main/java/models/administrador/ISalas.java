package models.administrador;

public interface ISalas {

    void crearSala(String nombreSala, boolean estado);

    void eliminarSala(int código);

    void modificarSala(int código, String nombreSala, boolean estado);


}
