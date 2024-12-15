package ws;

import jakarta.xml.ws.Endpoint;

/**
 * This class serves as a standalone server for deploying a Java-based web service.
 * It uses the `Endpoint` class from Jakarta XML Web Services (JAX-WS) to publish the
 * `BanqueService` web service at a specified URL.
 */
public class ServerJWS {
    public static void main(String[] args) {
        // Define the URL where the web service will be deployed.
        String url = "http://0.0.0.0:8787/";

        // Publish the `BanqueService` web service at the specified URL.
        Endpoint.publish(url, new BanqueService());

        // Log a confirmation message indicating successful deployment.
        System.out.println("Web service deployé sur  " + url);
    }
}
