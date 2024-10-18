package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AppTrivial {
    public static void main(String[] args) {

     Pregunta p = new Pregunta().setTipoPregunta(TipoPregunta.MULTIPLE);
     Categoria c = new Categoria("prueba");
     Dificultad d = Dificultad.EASY;
     p.setPregunta("Esta es una pregunta");
     p.setCategoria(c);
     p.setDificultad(d);
     p.setCorrecta("Esta es la verdadera");
     p.addIncorrecta("Esta no es");
     p.addIncorrecta("Esta tampoco");
     p.addIncorrecta("Vas mal");


     Gson g = new GsonBuilder().setPrettyPrinting().create();
     String p1 = g.toJson(p);
     System.out.println(p1);
     Path path = Path.of("prueba.json");
     try (var out = Files.newBufferedWriter(path)){
         out.write(p1);

     } catch (IOException e) {
         System.out.println("error");
            }

    try (var in = Files.newBufferedReader(path)){
        Pregunta p2 = g.fromJson(in, Pregunta.class);
        System.out.println(p2);

    } catch (IOException e) {
        throw new RuntimeException(e);
    }



        /* MEJOR VERSION POSIBLE
     * try(var bw = Files.newBufferedWriter(Paths.get("pregunta.json"))){
     *   gson.toJason(p1, bw);
     * }
     *
     * */
    }
    }

