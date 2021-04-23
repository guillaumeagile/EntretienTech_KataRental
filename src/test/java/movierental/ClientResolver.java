package movierental;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolver;

public class ClientResolver implements ParameterResolver {

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
        return parameterContext.getParameter().getType() == Client.class;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
        Client client = new Client("Bob", new SystemeDeTarificationNormal(), new SystemeDeFidelisationNormal());
        client.ajouterUneLocation(new FilmClassique("Jaws"), 2);
        client.ajouterUneLocation(new FilmClassique("Golden Eye"), 3);
        client.ajouterUneLocation(new FilmRecent("Short New"), 1);
        client.ajouterUneLocation(new FilmRecent("Long New"), 2);
        client.ajouterUneLocation(new FilmPourEnfant("Bambi"), 3);
        client.ajouterUneLocation(new FilmPourEnfant("Toy Story"), 4);

        return client;
    }
}
