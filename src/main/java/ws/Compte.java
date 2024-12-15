package ws;

import java.util.Date;

/**
 * The `Compte` class represents a bank account in the system.
 * It contains attributes for the account code, balance, and creation date,
 * along with the necessary constructors, getters, and setters for managing these attributes.
 */
public class Compte {
    // Attributes
    private int code;              // Unique identifier for the account.
    private double solde;          // The balance of the account.
    private Date dateCreation;     // The creation date of the account.

    /**
     * Constructor with parameters to initialize all attributes of the account.
     *
     * @param code the unique identifier for the account.
     * @param solde the balance of the account.
     * @param dateCreation the date when the account was created.
     */
    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    /**
     * Default constructor for creating an empty account object.
     * Attributes can be set later using setter methods.
     */
    public Compte() {
    }

    // Getters and Setters

    /**
     * Gets the unique identifier (code) of the account.
     *
     * @return the account code.
     */
    public int getCode() {
        return code;
    }

    /**
     * Gets the balance (solde) of the account.
     *
     * @return the account balance.
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Gets the creation date of the account.
     *
     * @return the date the account was created.
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * Sets the unique identifier (code) of the account.
     *
     * @param code the new account code.
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Sets the balance (solde) of the account.
     *
     * @param solde the new account balance.
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Sets the creation date of the account.
     *
     * @param dateCreation the new creation date of the account.
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
