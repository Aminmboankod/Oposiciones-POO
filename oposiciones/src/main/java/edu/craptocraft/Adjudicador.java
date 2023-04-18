package edu.craptocraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.craptocraft.aspirantes.Docente;
import edu.craptocraft.aspirantes.Persona;
import edu.craptocraft.aspirantes.Sanitario;
import edu.craptocraft.tipos.TipoPlaza;

public class Adjudicador {

    List<Plaza> plazas;
    List<Persona> personas;
    Map<TipoPlaza, List<Persona>> especialistasDisponibles = new HashMap<>();

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

        // Adjudicar las plazas por orden de plaza
        for (Plaza plaza : plazas) {

            TipoPlaza tipoPlaza = plaza.getTipo();
            List<Persona> especialistas = especialistasDisponibles.get(tipoPlaza);

            // Recorrer la lista de especialistas disponibles en orden descendente de su
            // puntuación o días trabajados

        }
    }
}
