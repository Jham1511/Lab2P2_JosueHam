
package lab2p2_josueham;

import java.util.*;

public class Edificio {
    private int NumPisos, locales;
    private String direccion;

    public Edificio(int NumPisos, int locales, String direccion) {
        this.NumPisos = NumPisos;
        this.locales = locales;
        this.direccion = direccion;
    }

    public Edificio() {
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
    
    
}
