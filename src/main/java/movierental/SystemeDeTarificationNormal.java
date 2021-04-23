package movierental;

import java.util.HashMap;
import java.util.Map;

public class SystemeDeTarificationNormal implements SystemeDeTarification {
    Map<Class<? extends Film>, Tarification> listeDesTarifications;

    public SystemeDeTarificationNormal() {
        this.listeDesTarifications = new HashMap<>();
        listeDesTarifications.put(FilmRecent.class, new TarificationRecent());
        listeDesTarifications.put(FilmPourEnfant.class, new TarificationPourEnfant());
        listeDesTarifications.put(FilmClassique.class, new TarificationClassique());
    }

    public Tarification calculerTarification(Film film) {
        return listeDesTarifications.get(film.getClass());
    }
}
