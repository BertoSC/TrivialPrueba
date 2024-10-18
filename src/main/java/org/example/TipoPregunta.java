package org.example;

public enum TipoPregunta {
    MULTIPLE("Múltiple"), BOOLEAN ("Verdadero/Falso");
    private String tipoPregunta;

    private TipoPregunta(String tipoPregunta){
        this.tipoPregunta = tipoPregunta;
    }

    public String getTipoPregunta() {
        return tipoPregunta;
    }
}
