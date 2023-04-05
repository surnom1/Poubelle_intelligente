package application;
import java.util.*;

/**
 * 
 */
public class Commerce_partenaire {
    private List<Vendre_produit> ventes=new ArrayList<>();
    private List<Contrat> Contrats=new ArrayList<>();
    private String Nom;
    private String Emplacement;
    /**
     * Default constructor
     */
    public Commerce_partenaire() {
    }

    public Commerce_partenaire(String nom, String emplacement) {

        Nom = nom;
        Emplacement = emplacement;
    }
    public void add_contrat(Contrat contrat){
        this.Contrats.add(contrat);
    }
    public void add_ventes(Vendre_produit vente){
        this.ventes.add(vente);
    }
    /**
     * @return
     */
    public List<Contrat> GetContrat() {
        return Contrats;
    }

    /**
     * @param <Produit>
     * @param produit 
     * @return
     */
    public <Produit> float GetDiscount(Produit produit) {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @return
     */
    public String GetNom() {

        return Nom;
    }

    /**
     * @return
     */
    public String GetEmplacement() {

        return Emplacement;
    }

}