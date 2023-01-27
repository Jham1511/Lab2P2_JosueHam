package lab2p2_josueham;

import java.util.*;

public class SolarBal {

    private double ancho, largo;
    private double area;
    private String dueno;

    public SolarBal(double ancho, double largo, double area, String dueno) {
        this.ancho = ancho;
        this.largo = largo;
        this.area = area;
        this.dueno = dueno;
    }

    public SolarBal() {
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    
    
}
