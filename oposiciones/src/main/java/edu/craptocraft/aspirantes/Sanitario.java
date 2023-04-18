package edu.craptocraft.aspirantes;

public class Sanitario extends Persona {
    private String especialidad;
    private int diasTrabajados;

    public Sanitario(String nombre, String apellido1, String apellido2, String especialidad, int diasTrabajados) {
        super(nombre, apellido1, apellido2);
        this.especialidad = especialidad;
        this.diasTrabajados = diasTrabajados;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public String toString() {
        return "ID: " + id + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido 1: " + apellido1 + "\n" +
                "Apellido 2: " + apellido2 + "\n" +
                "Titulación: " + especialidad + "\n" +
                "Días trabajados: " + diasTrabajados + "\n";
    }
}
