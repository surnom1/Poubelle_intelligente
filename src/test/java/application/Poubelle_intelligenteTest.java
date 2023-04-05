package application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Poubelle_intelligenteTest {
    Centre_de_tri centre_de_tri = new Centre_de_tri("adresse","nom","emplacement",1000f);
    Poubelle_intelligente poubelle_intelligente = new Poubelle_intelligente(24,"rue Charles De Gaulle",6000f,"bleu,vert,verre,metal",5500f);
    Bac bac = new Bac(Type_de_dechet.PLASTIQUE,200,poubelle_intelligente);
    Consommateur consommateur = new Consommateur(27,"adresse",72f,"User");
    Consommateur consommateur2 = new Consommateur(27,"adresse",72f,"User");

    Sac_poubelle sac_poubelle = new Sac_poubelle(Type_de_dechet.PLASTIQUE,"bac bleu",consommateur,bac);
    Sac_poubelle sac_poubelle2 = new Sac_poubelle(Type_de_dechet.METAL,"bac bleu",consommateur,bac);
    Sac_poubelle sac_poubelle3 = new Sac_poubelle(Type_de_dechet.METAL,"bac bleu",consommateur2,bac);

    @Test
    void getSacs_poubelle() {
        List<Sac_poubelle> sacs= new ArrayList<>();
        sacs.add(sac_poubelle);
        sacs.add(sac_poubelle2);
        sacs.add(sac_poubelle3);
        Assertions.assertTrue(poubelle_intelligente.getSacs_poubelle().equals(sacs));
    }

    @Test
    void calculer_quantite() {
        System.out.println(sac_poubelle2.getNombre_de_dechets()*sac_poubelle2.getPoids());
        Assertions.assertEquals(poubelle_intelligente.Calculer_quantite(sac_poubelle2),50f*2);
    }

    @Test
    void verifier_dechets() {
        Assertions.assertTrue(poubelle_intelligente.Verifier_dechets(sac_poubelle));
        Assertions.assertFalse(poubelle_intelligente.Verifier_dechets(sac_poubelle2));
        Assertions.assertFalse(poubelle_intelligente.Verifier_dechets(sac_poubelle2));
    }

    @Test
    void attribuer_points() {
        poubelle_intelligente.Attribuer_points(sac_poubelle);
        System.out.println(sac_poubelle.toString());
        //System.out.println(poubelle_intelligente.Attribuer_points(sac_poubelle));

        float val = 322f;
        Assertions.assertEquals(consommateur.GetPoints(),val);
    }

    @Test
    void notif_centre_de_tri() {
        poubelle_intelligente.Notif_centre_de_tri(centre_de_tri);
        //Assertions.assertTrue();
    }

    @Test
    void attribuer_penalite() {
    }

    @Test
    void set_emplacement() {
        poubelle_intelligente.Set_emplacement("nouvel emplacement");
        Assertions.assertEquals("nouvel emplacement",poubelle_intelligente.getEmplacement());
    }
}