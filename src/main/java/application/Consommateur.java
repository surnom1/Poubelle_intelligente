package application;
import java.util.*;



public class Consommateur {



    private Integer Code_acces;
    private String Adresse;
    private float Points;
    private String Nom_utilisateur;
    Map<String,Integer> map;
    private List<Sac_poubelle> Sac_poubelle = new ArrayList<>();
    private List<Centre_de_tri> centres_de_tri = new ArrayList<>();
    private List<Vendre_produit> Ventes = new ArrayList<>();

    public float getPoints() {
        return Points;
    }

    public void setPoints(float points) {
        Points = points;
    }

    public void add_ventes(Vendre_produit vente){
        Ventes.add(vente);
    }
    public Consommateur() {
    }

    public Consommateur(Integer code_acces, String adresse, float points, String nom_utilisateur) {
        Code_acces = code_acces;
        Adresse = adresse;
        Points = points;
        Nom_utilisateur = nom_utilisateur;
        this.map =  new HashMap<>();

    }
    public void add_sac_poubelle(Sac_poubelle sac_poubelle){
        this.Sac_poubelle.add(sac_poubelle);
    }
    public void add_centre_de_tri(Centre_de_tri centre_de_tri){
            this.centres_de_tri.add(centre_de_tri);
    }
    public Integer getCode_acces() {
        return Code_acces;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String getNom_utilisateur() {
        return Nom_utilisateur;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public List<application.Sac_poubelle> getSac_poubelle() {
        return Sac_poubelle;
    }

    public List<Centre_de_tri> getCentres_de_tri() {
        return centres_de_tri;
    }

    public List<Vendre_produit> getVentes() {
        return Ventes;
    }

    public Map<String, Integer> Historique() {
        return map;

    }
    public float GetPoints() {
        return Points;
    }


}