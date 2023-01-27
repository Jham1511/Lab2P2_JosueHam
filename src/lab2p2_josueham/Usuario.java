package lab2p2_josueham;

import java.util.*;

public class Usuario {
    private String nombre, user, password;
    private int edad;

    public Usuario(String nombre, String user, String password, int edad) {
        this.nombre = nombre;
        this.user = user;
        this.password = password;
        this.edad = edad;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
