package application;
import java.util.*;

/**
 * 
 */
public class Vendre_produit {

    public Commerce_partenaire getCommerce_partenaire() {
        return commerce_partenaire;
    }

    private float Bon_d_achat;

    private float Bon_de_reduction;

    private float Prix;

    private String Nom_produit;
    private Consommateur consommateur;
    private Commerce_partenaire commerce_partenaire;
    static List<Vendre_produit> allInstances=new ArrayList<>();
    /**
     * Default constructor
     */
    public Vendre_produit() {
    }

    public Vendre_produit(float bon_d_achat, float bon_de_reduction, float prix, String nom_produit, Consommateur consommateur, Commerce_partenaire commerce_partenaire) {
        Bon_d_achat = bon_d_achat;
        Bon_de_reduction = bon_de_reduction;
        Prix = prix;
        Nom_produit = nom_produit;
        this.consommateur = consommateur;
        this.commerce_partenaire = commerce_partenaire;
        allInstances.add(this);
        commerce_partenaire.add_ventes(this);
        consommateur.add_ventes(this);
    }

    /**
     * @return
     */
    public boolean Acceptation_paiement() {
        float debit_consommateur = Prix*Bon_de_reduction;
        if (consommateur.GetPoints() - debit_consommateur>0) {
            consommateur = new Consommateur(consommateur.getCode_acces(), consommateur.getAdresse(), consommateur.GetPoints() - debit_consommateur, consommateur.getNom_utilisateur());
            return true;
        }
        return false;
    }

}