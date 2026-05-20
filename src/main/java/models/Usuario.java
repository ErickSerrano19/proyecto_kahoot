package models;

public class Usuario {

    private String name;
    private String correo;
    private String contraseña;

    public Usuario(String name, String correo, String contraseña) {
        this.name = name;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
