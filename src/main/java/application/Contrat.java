package application;
import java.util.*;

/**
 * 
 */
public class Contrat {
    private Centre_de_tri centre_de_tri;
    private Commerce_partenaire commerce_partenaire;
    private Date Fin;
    private Date Debut;
    private String Types_de_services;
    private String Types_de_ventes;
    private Date delta_temps;
    static List<Contrat> allInstances=new ArrayList<>();
    /**
     * Default constructor
     */
    public Contrat() {
    }

    public Commerce_partenaire getCommerce_partenaire() {
        return commerce_partenaire;
    }

    public Contrat(Centre_de_tri centre_de_tri, Commerce_partenaire commerce_partenaire, Date fin, Date debut, String types_de_services, String types_de_ventes) {
        this.centre_de_tri = centre_de_tri;
        this.commerce_partenaire = commerce_partenaire;
        Fin = fin;
        Debut = debut;
        Types_de_services = types_de_services;
        Types_de_ventes = types_de_ventes;
        this.delta_temps = new Date(Fin.getTime()-Debut.getTime());
        allInstances.add(this);
        commerce_partenaire.add_contrat(this);
    }

    public Date getFin() {
        return Fin;
    }

    /**
     * @return
     */
    public void Se_renouveler() {
        this.Fin.setTime(Fin.getTime()+delta_temps.getTime());
    }

}