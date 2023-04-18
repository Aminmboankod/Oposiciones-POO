package edu.craptocraft.tipos;

public enum Adjudicada {
    ADJUDICADA(true), NO_ADJUDICADA(false);

    private final boolean estado;

    private Adjudicada(boolean estado) {
        this.estado = estado;
    }

    public boolean esAdjudicada() {
        return this.estado;
    }
}
