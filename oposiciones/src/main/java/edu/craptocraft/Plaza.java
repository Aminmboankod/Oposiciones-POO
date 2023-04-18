package edu.craptocraft;

import edu.craptocraft.aspirantes.Persona;
import edu.craptocraft.tipos.TipoPlaza;

public class Plaza {
    private static int contador = 0;
    private int id;
    private TipoPlaza tipo;
    private boolean adjudicada;
    private Persona persona;

    public Plaza(TipoPlaza tipo) {
        this.id = contador++;
        this.tipo = tipo;
        this.adjudicada = false;
    }

    public int getId() {
        return id;
    }

    public TipoPlaza getTipo() {
        return tipo;
    }

    public boolean isAdjudicada() {
        return adjudicada;
    }

    public void setAdjudicada(boolean adjudicada) {
        this.adjudicada = adjudicada;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
