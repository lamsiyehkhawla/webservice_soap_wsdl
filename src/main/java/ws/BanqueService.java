package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

/**
 * This class is a web service implementation
 * It provides methods to perform currency conversion, retrieve account details,
 * and list multiple accounts.
 *
 * Annotations from Jakarta JWS are used to expose the methods as web services.
 */
@WebService(serviceName = "BanqueWS") // Defines the web service with the name "BanqueWS".
public class BanqueService {

    /**
     * Converts a given amount in Euros to Dirhams.
     *
     * @param mt the amount in Euros to be converted.
     * @return the equivalent amount in Dirhams (using a fixed conversion rate of 11).
     */
    @WebMethod(operationName = "ConversionEuroToDH") // Exposes this method with a custom operation name.
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 11; // Simple conversion logic using a static exchange rate.
    }

    /**
     * Retrieves the details of an account identified by its code.
     *
     * @param code the unique identifier for the account.
     * @return a new account object with the given code, a randomly generated balance,
     *         and the current date as the creation date.
     */
    @WebMethod // Exposes this method as part of the web service.
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random() * 80000, new Date()); // Generate account details dynamically.
    }

    /**
     * Provides a list of predefined account objects.
     *
     * @return a list of accounts, each with a unique code, a random balance,
     *         and the current date as the creation date.
     */
    @WebMethod // Exposes this method as part of the web service.
    public List<Compte> listeCompte() {
        return List.of(
                new Compte(1, Math.random() * 80000, new Date()), // Account 1
                new Compte(2, Math.random() * 80000, new Date()), // Account 2
                new Compte(3, Math.random() * 80000, new Date())  // Account 3
        );
    }
}
