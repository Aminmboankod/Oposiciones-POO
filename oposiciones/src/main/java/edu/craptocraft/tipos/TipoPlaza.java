package edu.craptocraft.tipos;

public enum TipoPlaza {
    DOCENTE("D"), SANITARIO("S");

    private final String tipo;

    private TipoPlaza(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
