package application;
import java.util.*;


public class Poubelle_intelligente {

    /**
     * Default constructor
     */
    public Poubelle_intelligente() {
    }

    private Integer Identifiant;

    private String Emplacement;

    private float Capacite;

    private String Type_poubelle;

    private float Quantite_dechets;
    private List<Bac> bacs = new ArrayList<Bac>();
    private List<Sac_poubelle> Sacs_poubelle = new ArrayList<Sac_poubelle>();
    private Transport transport;

    public Poubelle_intelligente(Integer identifiant, String emplacement, float capacite, String type_poubelle, float quantite_dechets) {
        Identifiant = identifiant;
        Emplacement = emplacement;
        Capacite = capacite;
        Type_poubelle = type_poubelle;
        Quantite_dechets = quantite_dechets;
    }

    public List<Sac_poubelle> getSacs_poubelle() {
        return Sacs_poubelle;
    }
    public void add_sac_poubelle(Sac_poubelle sac_poubelle){
        this.Sacs_poubelle.add(sac_poubelle);
    }
    /**
     * @param Sac_poubelle 
     * @return
     */
    public float Calculer_quantite(Sac_poubelle Sac_poubelle) {
        return Sac_poubelle.getNombre_de_dechets()*Sac_poubelle.getPoids();
    }

    /**
     * @param Sac_poubelle 
     * @return
     */
    public Boolean Verifier_dechets(Sac_poubelle Sac_poubelle) {

        return Sac_poubelle.getBac().getType_de_dechet().equals(Sac_poubelle.getType_de_dechet());
    }

    /**
     * @param Sac_poubelle
     * @param Consommateur
     * @return
     */
    public float Attribuer_points(Sac_poubelle Sac_poubelle,Consommateur consommateur) {

        if (Verifier_dechets(Sac_poubelle)){
            float temp = consommateur.GetPoints()+Sac_poubelle.getType_de_dechet().getNb_points_attribues()*Sac_poubelle.getNombre_de_dechets();
            consommateur.setPoints(temp);
            //Sac_poubelle.setConsommateur(new Consommateur(consommateur.getCode_acces(),consommateur.getAdresse(),temp,consommateur.getNom_utilisateur()));
            System.out.println(temp);
            return temp;
        }
        return 0;
    }

    /**
     * @return
     */
    public String Notif_centre_de_tri(Centre_de_tri centre_de_tri) {
        Date date = new Date();
        this.transport = new Transport(date,centre_de_tri,this);
        return transport.toString();
    }



    /**
     * @param Sac_poubelle 
     * @param Consommateur
     * @return
     */
    public float Attribuer_penalite(Sac_poubelle Sac_poubelle, Consommateur consommateur) {
        if (!(Verifier_dechets(Sac_poubelle))){
            float temp = consommateur.GetPoints()-Sac_poubelle.getType_de_dechet().getNb_points_attribues()*Sac_poubelle.getNombre_de_dechets();
            consommateur.setPoints(temp);
            //Consommateur = new Consommateur(Consommateur.getCode_acces(),Consommateur.getAdresse(),temp,Consommateur.getNom_utilisateur());
            return temp;
        }
        return 0;
    }


    public void Set_emplacement(String s) {
        this.Emplacement=s;
    }

    public String getEmplacement() {
        return Emplacement;
    }
}