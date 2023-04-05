package application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sac_poubelleTest {
    Poubelle_intelligente poubelle_intelligente = new Poubelle_intelligente(24,"rue Charles De Gaulle",6000f,"bleu,vert,verre,metal",5500f);

    Bac bac = new Bac(Type_de_dechet.PLASTIQUE,300,poubelle_intelligente);
    Consommateur consommateur = new Consommateur(50,"adresse",75f,"nom user");
    Sac_poubelle sac_poubelle = new Sac_poubelle(Type_de_dechet.PLASTIQUE, "bac noir", consommateur,bac);

    @Test
    void getPoids() {
        Assertions.assertEquals(1,sac_poubelle.getPoids());
    }

    @Test
    void getType_de_dechet() {
        Assertions.assertEquals(Type_de_dechet.PLASTIQUE,sac_poubelle.getType_de_dechet());
    }

    @Test
    void getNombre_de_dechets() {
        Assertions.assertEquals(50,sac_poubelle.getNombre_de_dechets());
    }

    @Test
    void getConsommateur() {
        Assertions.assertEquals(consommateur,sac_poubelle.getConsommateur());
    }

    @Test
    void getPoubelle_intelligente() {
        Assertions.assertEquals(poubelle_intelligente,sac_poubelle.getPoubelle_intelligente());
    }

    @Test
    void getBac() {
        Assertions.assertEquals(bac,sac_poubelle.getBac());
    }

    @Test
    void setConsommateur() {
        Consommateur consommateur2 = new Consommateur(51,"adresse2",70f,"nom user2");
        sac_poubelle.setConsommateur(consommateur2);

        Assertions.assertEquals(consommateur2,sac_poubelle.getConsommateur());

    }

    @Test
    void vider() {
        sac_poubelle.vider();
        Assertions.assertEquals(0,sac_poubelle.getNombre_de_dechets());
        Assertions.assertEquals(350,sac_poubelle.getBac().Get_nombre_de_dechets());

    }
}