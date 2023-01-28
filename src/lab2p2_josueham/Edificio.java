package lab2p2_josueham;

import java.util.*;

public class Edificio {

    private int NumPisos, locales;
    private String direccion, estado, dueno;

    public Edificio(int NumPisos, int locales, String direccion, String estado, String dueno) {
        this.NumPisos = NumPisos;
        this.locales = locales;
        this.direccion = direccion;
        this.estado = estado;
        this.dueno = dueno;
    }
    
    public Edificio() {
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getNumPisos() {
        return NumPisos;
    }

    public void setNumPisos(int NumPisos) {
        this.NumPisos = NumPisos;
    }

    public int getLocales() {
        return locales;
    }

    public void setLocales(int locales) {
        this.locales = locales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Edificio" 
                + "\nNumPisos: " + NumPisos 
                + "\nLocales: " + locales 
                + "\nDireccion: " + direccion 
                + "\nEstado: " + estado 
                + "\nDueño: " + dueno;
    }

    
}
