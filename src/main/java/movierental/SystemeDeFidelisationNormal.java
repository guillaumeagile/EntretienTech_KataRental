package movierental;

import java.util.HashMap;
import java.util.Map;

public class SystemeDeFidelisationNormal implements SystemeDeFidelisation {
    Map<Class<? extends Film>, Fidelisation> listeDesFidelisations;

    public SystemeDeFidelisationNormal() {
        this.listeDesFidelisations = new HashMap<>();
        listeDesFidelisations.put(FilmRecent.class, new FidelisationRecent());
        listeDesFidelisations.put(FilmPourEnfant.class, new FidelisationClassique());
        listeDesFidelisations.put(FilmClassique.class, new FidelisationClassique());
    }

    public Fidelisation calculerFidelisation(Film film) {
        return listeDesFidelisations.get(film.getClass());
    }
}
