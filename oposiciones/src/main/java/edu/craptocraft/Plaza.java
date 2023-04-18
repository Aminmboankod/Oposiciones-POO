package edu.craptocraft;

import edu.craptocraft.aspirantes.Persona;
import edu.craptocraft.tipos.Adjudicada;
import edu.craptocraft.tipos.TipoPlaza;

public class Plaza {
    private static int contador = 0;
    private int id;
    private TipoPlaza tipo;
    private Adjudicada adjudicada;
    private Persona persona;

    public Plaza(TipoPlaza tipo) {
        this.id = contador++;
        this.tipo = tipo;
        this.adjudicada = Adjudicada.NO_ADJUDICADA;
    }

    public int getId() {
        return id;
    }

    public TipoPlaza getTipo() {
        return tipo;
    }

    public Adjudicada isAdjudicada() {
        return adjudicada;
    }

    public void setAdjudicada(Adjudicada adjudicada) {
        this.adjudicada = adjudicada;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String toString() {
        return "ID Plaza: " + id + "\n" +
                "Tip:" + tipo +
                "Adjudicada: " + adjudicada + "\n" +
                persona.toString() + "\n";
    }
}
