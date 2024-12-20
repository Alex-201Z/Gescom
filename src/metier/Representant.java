package metier;

import java.util.*;

public class Representant {

    /* propriétés privées */
    private int idRepresentant;
    private String nom;
    private String prenom;
    private Double caRepresentant;
    private List<Client> lesClients;


    public Representant(int idRepresentant, String prenom, String nom, List<Client> lesClients) {
        /* Affectations */
        this.idRepresentant = idRepresentant;
        this.nom = nom;
        this.prenom = prenom;
        this.caRepresentant = caRepresentant;
        this.lesClients = lesClients;
    }

    /**
     * Recherche un Client sur son id dans la 
     * liste des clients. 
     * Retourne le Client si trouvé, sinon retourne null
     * @param idClient
     * @return Client
     */
    public Client getClientById(int idClient) {
        for (Client client : lesClients) {
        }
        return
    }

    /* getters et setters */
    public int getIdRepresentant()
    { return idRepresentant; }
    public void setIdRepresentant(int idRepresentant)
    { this.idRepresentant = idRepresentant; }
    public String getNom()
    { return nom; }
    public void setNom(String nom)
    { this.nom = nom; }
    public String getPrenom()
    { return prenom; }
    public void setPrenom(String prenom)
    { this.prenom = prenom; }
    public Double getCaRepresentant()
    { return caRepresentant; }
    public void setCaRepresentant(Double caRepresentant)
    { this.caRepresentant = caRepresentant; }
    public List<Client> getLesClients()
    { return lesClients; }
    public void setLesClients(List<Client> lesClients)
    { this.lesClients = lesClients; }

}
