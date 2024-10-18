package org.example;

public class PreguntaTrueFalse extends Pregunta{

    private boolean respuesta;

    public PreguntaTrueFalse(String pregunta, TipoPregunta tipoPregunta, Dificultad dificultad, Categoria categoria, boolean respuesta) {
        super(pregunta, tipoPregunta, dificultad, categoria);
        this.respuesta = respuesta;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "PreguntaTrueFalse{" +
                "respuesta=" + respuesta +
                '}';
    }
}
