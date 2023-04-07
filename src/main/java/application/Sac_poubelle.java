package application;
import java.util.*;

/**
 * 
 */
public class Sac_poubelle {

    private float Poids;

    private Type_de_dechet type_de_dechet;

    private String Type_de_bac;

    private int Nombre_de_dechets;
    private Consommateur consommateur;
    private Poubelle_intelligente poubelle_intelligente;
    private Bac bac;
    static List<Sac_poubelle> allInstances=new ArrayList<>();

    public float getPoids() {
        return Poids;
    }

    public Type_de_dechet getType_de_dechet() {
        return type_de_dechet;
    }


    public int getNombre_de_dechets() {
        return Nombre_de_dechets;
    }

    public Consommateur getConsommateur() {
        return consommateur;
    }

    public Poubelle_intelligente getPoubelle_intelligente() {
        return poubelle_intelligente;
    }

    public Bac getBac() {
        return bac;
    }

    public Sac_poubelle() {

    }

    @Override
    public String toString() {
        return "Sac_poubelle{" +
                "Poids=" + Poids +
                ", type_de_dechet=" + type_de_dechet +
                ", Type_de_bac='" + Type_de_bac + '\'' +
                ", Nombre_de_dechets=" + Nombre_de_dechets +
                ", consommateur=" + consommateur +
                ", poubelle_intelligente=" + poubelle_intelligente +
                ", bac=" + bac +
                '}';
    }

    public void setNombre_de_dechets(int nombre_de_dechets) {
        Nombre_de_dechets = nombre_de_dechets;
    }

    public Sac_poubelle(Type_de_dechet type_de_dechet, String type_de_bac, Consommateur consommateur, Bac bac) {
        Type_de_bac = type_de_bac;
        this.type_de_dechet = type_de_dechet;
        this.Nombre_de_dechets=50;
        this.Poids = type_de_dechet.getPoids_en_kg();
        allInstances.add(this);
        this.consommateur=consommateur;
        this.bac=bac;
        this.poubelle_intelligente=bac.getPoubelle_intelligente();
        bac.getPoubelle_intelligente().add_sac_poubelle(this);
        consommateur.add_sac_poubelle(this);

    }

    public void setConsommateur(Consommateur consommateur) {
        this.consommateur = consommateur;
    }

    /**
     * @return
     */
    public void vider() {

        int nb_max_dechet_dans_bac=bac.Get_nombre_max_de_dechets();
        int nb_dechet_dans_bac=bac.Get_nombre_de_dechets();

        if(this.Nombre_de_dechets+nb_dechet_dans_bac<nb_max_dechet_dans_bac) {
            bac.set_nombre_dechets(this.Nombre_de_dechets+nb_dechet_dans_bac);
            this.Nombre_de_dechets=0;
        }else{
            bac.set_nombre_dechets(nb_max_dechet_dans_bac);
            this.Nombre_de_dechets=nb_dechet_dans_bac-nb_max_dechet_dans_bac;
        }
        }

}