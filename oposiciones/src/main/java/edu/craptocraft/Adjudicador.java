package edu.craptocraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.craptocraft.aspirantes.Docente;
import edu.craptocraft.aspirantes.Persona;
import edu.craptocraft.aspirantes.Sanitario;
import edu.craptocraft.tipos.Adjudicada;
import edu.craptocraft.tipos.TipoPlaza;

public class Adjudicador {

    List<Plaza> plazas = new ArrayList<>();
    List<Persona> personas = new ArrayList<>();
    Map<TipoPlaza, List<Persona>> especialistasDisponibles = new HashMap<>();
    Map<Plaza, Persona> adjudicaciones = new HashMap<>();

    public Adjudicador() {
    }

    public List<Plaza> getPlazas() {
        return plazas;
    }

    public void setPlazas(List<Plaza> plazas) {
        this.plazas = plazas;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public void añadirPersonas() {

        especialistasDisponibles.put(TipoPlaza.DOCENTE, new ArrayList<>());
        especialistasDisponibles.put(TipoPlaza.SANITARIO, new ArrayList<>());
        // Agregar los especialistas a la lista correspondiente en el Map
        for (Persona persona : personas) {
            if (persona instanceof Docente) {
                especialistasDisponibles.get(TipoPlaza.DOCENTE).add(persona);
            } else if (persona instanceof Sanitario) {
                especialistasDisponibles.get(TipoPlaza.SANITARIO).add(persona);
            }
        }
    }

    public void adjudicarPlazas(List<Plaza> plazas, List<Persona> personas) {

        añadirPersonas();

        // Añadir las personas con mayor puntuacion o mayor días trabajados a la lista
        // de plazas

        for (Plaza plaza : plazas) {
            if (plaza.getTipo() == TipoPlaza.DOCENTE) {
                if (especialistasDisponibles.get(TipoPlaza.DOCENTE).size() > 0) {
                    Persona persona = especialistasDisponibles.get(TipoPlaza.DOCENTE).get(0);
                    especialistasDisponibles.get(TipoPlaza.DOCENTE).remove(0);
                    plaza.setPersona(persona);
                    plaza.setAdjudicada(Adjudicada.ADJUDICADA);
                    adjudicaciones.put(plaza, persona);
                }
            } else if (plaza.getTipo() == TipoPlaza.SANITARIO) {
                if (especialistasDisponibles.get(TipoPlaza.SANITARIO).size() > 0) {
                    Persona persona = especialistasDisponibles.get(TipoPlaza.SANITARIO).get(0);
                    especialistasDisponibles.get(TipoPlaza.SANITARIO).remove(0);
                    plaza.setPersona(persona);
                    plaza.setAdjudicada(Adjudicada.ADJUDICADA);
                    adjudicaciones.put(plaza, persona);
                }
            }
        }

    }

    public void mostrarAdjudicaciones() {
        System.out.println(" =============================================" +
                "La última adjudicación de plazas ha producido \nlos siguientes resultados para " + TipoPlaza.DOCENTE
                +
                " =============================================");
        for (Plaza plaza : plazas) {
            if (plaza.getTipo() == TipoPlaza.DOCENTE) {
                System.out.println(plaza.toString());
            }
        }
        System.out.println(" =============================================" +
                "La última adjudicación de plazas ha producido \nlos siguientes resultados para " + TipoPlaza.SANITARIO
                +
                " =============================================");
        for (Plaza plaza : plazas) {
            if (plaza.getTipo() == TipoPlaza.SANITARIO) {
                System.out.println(plaza.toString());
            }
        }
    }
}
