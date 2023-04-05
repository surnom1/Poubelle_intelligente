package application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Commerce_partenaireTest {
    Commerce_partenaire commerce_partenaire= new Commerce_partenaire("commerce partenaire","12 rue Flaubert");

    Commerce_partenaire commerce_partenaire2= new Commerce_partenaire("commerce partenaire","12 rue Flaubert");
    Contrat contrat1 = new Contrat(new Centre_de_tri(),commerce_partenaire,new Date(),new Date(),"location","paiement");
    Contrat contrat2 = new Contrat(new Centre_de_tri(),commerce_partenaire2,new Date(),new Date(),"location","paiement");
    Contrat contrat3 = new Contrat(new Centre_de_tri(),commerce_partenaire,new Date(),new Date(),"location","paiement");

    @Test
    void getContrat() {
        List<Contrat> liste = new ArrayList<>();
        List<Contrat> liste2 = new ArrayList<>();
        liste.add(contrat1);
        liste2.add(contrat2);
        liste.add(contrat3);
        Assertions.assertTrue(commerce_partenaire.GetContrat().equals(liste));
        Assertions.assertTrue(commerce_partenaire2.GetContrat().equals(liste2));
    }

    @Test
    void getDiscount() {
    }

    @Test
    void getNom() {
        Assertions.assertEquals("commerce partenaire",commerce_partenaire.GetNom());
    }

    @Test
    void getEmplacement() {
        Assertions.assertEquals("12 rue Flaubert",commerce_partenaire.GetEmplacement());
    }
}