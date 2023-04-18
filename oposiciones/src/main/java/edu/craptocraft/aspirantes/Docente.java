package edu.craptocraft.aspirantes;

public class Docente extends Persona {
    private String titulacion;
    private double puntos;

    public Docente(String nombre, String apellido1, String apellido2, String titulacion, double puntos) {
        super(nombre, apellido1, apellido2);
        this.titulacion = titulacion;
        this.puntos = puntos;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public double getPuntos() {
        return puntos;
    }
}