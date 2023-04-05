package application;
import java.util.*;

/**
 * 
 */
public class Centre_de_tri {
    private List<Transport> Transports;
    private List<Consommateur> consommateur;
    private List<Contrat> Contrat;
    private String Adresse;
    private String Nom;
    private String Emplacement;
    private float Revenu;
    /**
     * Default constructor
     */
    public Centre_de_tri() {
    }

    public Centre_de_tri(String adresse, String nom, String emplacement, float revenu) {
        for (Transport allInstance : Transport.allInstances) {
            if (allInstance.getCentre_de_tri().equals(this)){
                Transports.add(allInstance);
            }
        }

        this.consommateur = consommateur;
        Contrat = application.Contrat.allInstances;
        Adresse = adresse;
        Nom = nom;
        Emplacement = emplacement;
        Revenu = revenu;

    }
    public void add_consommateur(Consommateur consommateur){
        this.consommateur.add(consommateur);
    }
    /**
     * @return
     */
    public void Placer_poubelle(Transport transport,String s) {
        transport.getPoubelle_intelligente().Set_emplacement(s);
    }

    /**
     * @return
     */
    public void Deplacer_poubelle(Transport transport,String s) {
        transport.getPoubelle_intelligente().Set_emplacement(s);
    }

    /**
     * @param Poubelle_intelligente 
     * @return
     */
    public void Collecter_dechets(Poubelle_intelligente Poubelle_intelligente) {

        for (Sac_poubelle sac_poubelle : Poubelle_intelligente.getSacs_poubelle()){
            if(Poubelle_intelligente.Verifier_dechets(sac_poubelle)){

            }
        }
    }

    /**
     * @return
     */
    public float Statistiques(Poubelle_intelligente Poubelle_intelligente) {
        float poids_total=0;
        float poids_trier=0;
        for (Sac_poubelle sac_poubelle : Poubelle_intelligente.getSacs_poubelle()){
            if(Poubelle_intelligente.Verifier_dechets(sac_poubelle)){
                poids_trier+=sac_poubelle.getPoids();
            }
            poids_total+=sac_poubelle.getPoids();
        }
        return poids_trier/poids_total;
    }

    /**
     * @return
     */
    public void Trier() {
        // TODO implement here
    }

}