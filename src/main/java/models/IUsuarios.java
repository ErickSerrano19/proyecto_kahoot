package models;

public interface IUsuarios {

    public void registrarUsuario(String nombre, String correo, String contraseña);

    public void verificarUsuario(String correo, String contraseña);

    

}
