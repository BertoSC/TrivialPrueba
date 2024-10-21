package org.example;

import java.util.List;

public class PreguntaMultiple extends Pregunta {
    private String opCorrecta;
    List<String> opIncorrectas;


    public PreguntaMultiple(String pregunta, TipoPregunta tipoPregunta, Dificultad dificultad, Categoria categoria, String opC, List<String> opI) {
        super(pregunta, tipoPregunta, dificultad, categoria);
        this.opCorrecta=opC;
        this.opIncorrectas=opI;
    }

    public String getOpCorrecta() {
        return opCorrecta;
    }

    public void setOpCorrecta(String opCorrecta) {
        this.opCorrecta = opCorrecta;
    }

    public List<String> getOpIncorrectas() {
        return opIncorrectas;
    }

    public void setOpIncorrectas(List<String> opIncorrectas) {
        this.opIncorrectas = opIncorrectas;
    }c

    @Override
    public String toString() {
        return "PreguntaMultiple{" +
                "opCorrecta='" + opCorrecta + '\'' +
                ", opIncorrectas=" + opIncorrectas +
                '}';
    }


}
