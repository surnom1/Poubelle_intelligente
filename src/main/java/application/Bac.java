package application;
import java.util.*;

/**
 * 
 */
public class Bac {

    private Poubelle_intelligente poubelle_intelligente;
    public int Nombre_dechets;

    public int nombre_max_de_dechets;

    public Type_de_dechet getType_de_dechet() {
        return type_de_dechet;
    }

    private Type_de_dechet type_de_dechet;

    private int Poids_unitaire_type_de_dechets;
    private List<Sac_poubelle> sacs_poubelle;


    public Bac(Type_de_dechet type_de_dechet,int Nombre_dechets,Poubelle_intelligente poubelle_intelligente) {
        this.type_de_dechet=type_de_dechet;
        this.Nombre_dechets=Nombre_dechets;
        this.nombre_max_de_dechets=5000;
        this.Poids_unitaire_type_de_dechets=this.type_de_dechet.getPoids_en_kg();
        this.poubelle_intelligente = poubelle_intelligente;
    }

    public int Get_nombre_max_de_dechets() {
        return nombre_max_de_dechets;
    }

    public Poubelle_intelligente getPoubelle_intelligente() {
        return poubelle_intelligente;
    }

    public void set_nombre_dechets(int nombre_dechets) {
        this.Nombre_dechets = nombre_dechets;
    }

    public int getPoids_unitaire_type_de_dechets() {
        return Poids_unitaire_type_de_dechets;
    }

    public void Set_poids_dechet(int poids) {
        this.Poids_unitaire_type_de_dechets=poids;

    }
    public int Get_poids() {
        return this.Nombre_dechets*this.Poids_unitaire_type_de_dechets;
    }
    public Type_de_dechet Get_type_de_dechets() {
        return this.type_de_dechet;
    }
    public int Get_nombre_de_dechets() {
        return this.Nombre_dechets;
    }

}