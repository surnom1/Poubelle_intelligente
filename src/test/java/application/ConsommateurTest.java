package application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ConsommateurTest {
    Centre_de_tri centre_de_tri = new Centre_de_tri("", "","",3000);
    Poubelle_intelligente poubelle_intelligente = new Poubelle_intelligente(24,"rue Charles De Gaulle",6000f,"bleu,vert,verre,metal",5500f);

    Consommateur consommateur = new Consommateur(27,"adresse",72f,"User");
    Consommateur consommateur2 = new Consommateur(27,"adresse",72f,"User");
    Commerce_partenaire commerce_partenaire = new Commerce_partenaire("free","12 rue Flaubert");

    Vendre_produit vente1 = new Vendre_produit(40f,40f,500f,"telephone",consommateur,commerce_partenaire);
    Sac_poubelle sac_poubelle = new Sac_poubelle(Type_de_dechet.METAL,"bac bleu",consommateur, new Bac(Type_de_dechet.PLASTIQUE,300,poubelle_intelligente));
    Sac_poubelle sac_poubelle2 = new Sac_poubelle(Type_de_dechet.METAL,"bac bleu",consommateur, new Bac(Type_de_dechet.PLASTIQUE,300,poubelle_intelligente));
    Sac_poubelle sac_poubelle3 = new Sac_poubelle(Type_de_dechet.METAL,"bac bleu",consommateur2,  new Bac(Type_de_dechet.PLASTIQUE,300,poubelle_intelligente));
    @Test
    void getCode_acces() {
        Assertions.assertEquals(27,consommateur.getCode_acces());
    }

    @Test
    void getAdresse() {
        Assertions.assertEquals("adresse",consommateur.getAdresse());
    }

    @Test
    void getNom_utilisateur() {
        Assertions.assertTrue("User".equals(consommateur.getNom_utilisateur()));
    }

    @Test
    void getMap() {
        //TODO
        Map<String,Integer> map = new HashMap<>();
        Assertions.assertTrue(map.equals(consommateur.getMap()));
    }

    @Test
    void getSac_poubelle() {
        List<Sac_poubelle> sacs = new ArrayList<>();
        sacs.add(sac_poubelle);
        sacs.add(sac_poubelle2);
        Assertions.assertEquals(consommateur.getSac_poubelle(),sacs);
    }

    @Test
    void getCentre_de_tri() {
        consommateur.add_centre_de_tri(centre_de_tri);
        List<Centre_de_tri> liste = new ArrayList<>();
        liste.add(centre_de_tri);
        Assertions.assertTrue(consommateur.getCentres_de_tri().equals(liste));

    }

    @Test
    void getVentes() {
        List<Vendre_produit> ventes = new ArrayList<>();
        ventes.add(vente1);
        Assertions.assertEquals(ventes,consommateur.getVentes());

    }

    @Test
    void historique() {
    }

    @Test
    void getPoints() {
        Assertions.assertEquals(72f,consommateur.GetPoints());
    }
}