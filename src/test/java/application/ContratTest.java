package application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ContratTest {
    Centre_de_tri centre_de_tri = new Centre_de_tri("24 rue Albert Camus","centre1","Cergy",50f);
    Commerce_partenaire commerce_partenaire = new Commerce_partenaire("8 rue Albert Camus","commerce1");
    Contrat contrat = new Contrat(centre_de_tri,commerce_partenaire,new Date(500_000_000),new Date(100_000_000),"services","ventes");
    @Test
    void getCommerce_partenaire() {
        Assertions.assertEquals(commerce_partenaire,contrat.getCommerce_partenaire());

    }

    @Test
    void se_renouveler() {
        contrat.Se_renouveler();
        Assertions.assertTrue(new Date(900_000_000).equals(contrat.getFin()));
    }
}