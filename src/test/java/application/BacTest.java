package application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BacTest {
    Poubelle_intelligente poubelle_intelligente = new Poubelle_intelligente(24,"rue Charles De Gaulle",6000f,"bleu,vert,verre,metal",5500f);
    Bac bac = new Bac(Type_de_dechet.METAL,10,poubelle_intelligente);
    int poids = 20;
    @Test
    void getType_de_dechet() {
        Assertions.assertEquals(bac.Get_type_de_dechets(),Type_de_dechet.METAL);
    }

    @Test
    void get_nombre_max_de_dechets() {
        Assertions.assertEquals(bac.nombre_max_de_dechets,5000);
    }

    @Test
    void set_nombre_dechets() {
        Assertions.assertEquals(bac.nombre_max_de_dechets,5000);
    }

    @Test
    void set_poids_dechet() {
        bac.Set_poids_dechet(poids);
        Assertions.assertEquals(poids,bac.getPoids_unitaire_type_de_dechets());
    }

    @Test
    void get_poids() {
        Assertions.assertEquals(bac.getPoids_unitaire_type_de_dechets()*10,bac.Get_poids());
    }

    @Test
    void get_type_de_dechets() {
        Assertions.assertEquals(bac.getType_de_dechet(),Type_de_dechet.METAL);

    }

    @Test
    void get_nombre_de_dechets() {
        Assertions.assertEquals(10,bac.Get_nombre_de_dechets());
    }
}