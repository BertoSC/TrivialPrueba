package org.example;

import java.util.List;

public class Pregunta {
    private String pregunta;
    private TipoPregunta tipoPregunta;
    private Dificultad dificultad;
    private Categoria categoria;
    private String correcta;
    private List<String> incorrectas;

    public Pregunta(){
    }

    public Pregunta(String pregunta, TipoPregunta tipoPregunta, Dificultad dificultad, Categoria categoria) {
        this.pregunta = pregunta;
        this.tipoPregunta = tipoPregunta;
        this.dificultad = dificultad;
        this.categoria = categoria;

    }

    public String getPregunta() {
        return pregunta;
    }

    public Pregunta setPregunta(String pregunta) {

        this.pregunta = pregunta;
        return this;
    }

    public TipoPregunta getTipoPregunta() {
        return tipoPregunta;
    }

    public Pregunta setTipoPregunta(TipoPregunta tipoPregunta) {

        this.tipoPregunta = tipoPregunta;
        return this;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public Pregunta setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;return this;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Pregunta setCategoria(Categoria categoria) {

        this.categoria = categoria;
        return this;
    }

    public String getCorrecta() {
        return correcta;
    }

    public Pregunta setCorrecta(String correcta) {
        this.correcta = correcta;
        return this;
    }

    public List<String> getIncorrectas() {
        return incorrectas;
    }

    public Pregunta setIncorrectas(List<String> incorrectas) {
        this.incorrectas = incorrectas;
        return this;
    }

    public void addIncorrecta (String incorrecta) {
        if (incorrectas == null){
            incorrectas =new java.util.ArrayList<>();
        }
        incorrectas.add(incorrecta);

    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "pregunta='" + pregunta + '\'' +
                ", tipoPregunta=" + tipoPregunta +
                ", dificultad=" + dificultad +
                ", categoria=" + categoria +
                '}';
    }
}
