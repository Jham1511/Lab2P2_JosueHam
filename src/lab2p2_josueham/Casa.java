
package lab2p2_josueham;

import java.awt.Color;
import java.util.*;

public class Casa {
    private int NumCasa, NumBloque, NumBans,NumCuartos;
    private Color color;
    private double ancho, largo;

    public Casa() {
    }

    public Casa(int NumCasa, int NumBloque, int NumBans, int NumCuartos, Color color, double ancho, double largo) {
        this.NumCasa = NumCasa;
        this.NumBloque = NumBloque;
        this.NumBans = NumBans;
        this.NumCuartos = NumCuartos;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
    }

    
    
    public int getNumCasa() {
        return NumCasa;
    }

    public void setNumCasa(int NumCasa) {
        this.NumCasa = NumCasa;
    }

    public int getNumBloque() {
        return NumBloque;
    }

    public void setNumBloque(int NumBloque) {
        this.NumBloque = NumBloque;
    }

    public int getNumBans() {
        return NumBans;
    }

    public void setNumBans(int NumBans) {
        this.NumBans = NumBans;
    }

    public int getNumCuartos() {
        return NumCuartos;
    }

    public void setNumCuartos(int NumCuartos) {
        this.NumCuartos = NumCuartos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    
}
