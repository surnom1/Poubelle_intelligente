package application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vendre_produitTest {


    Consommateur consommateur = new Consommateur(27,"adresse",72f,"User");
    Commerce_partenaire commerce_partenaire = new Commerce_partenaire("free","12 rue Flaubert");
    Vendre_produit vente = new Vendre_produit(0f,0.2f,100,"parfum",consommateur,commerce_partenaire);

    @Test
    void acceptation_paiement() {
        Assertions.assertTrue(vente.Acceptation_paiement());
        System.out.println(consommateur.GetPoints());
    }
}