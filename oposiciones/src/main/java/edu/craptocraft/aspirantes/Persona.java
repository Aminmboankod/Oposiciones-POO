package edu.craptocraft.aspirantes;

public class Persona {
    private static int contador = 0;
    protected int id;
    protected String nombre;
    protected String apellido1;
    protected String apellido2;

    public Persona(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.id = contador++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public static int getContador() {
        return contador;
    }

}
