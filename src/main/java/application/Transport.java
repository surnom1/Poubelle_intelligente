package application;
import java.util.*;

/**
 * 
 */
public class Transport {
    static List<Transport> allInstances=new ArrayList<>();
    static int nb_transports=0;
    private Integer Identifiant;
    private Date Horaire;
    private Centre_de_tri centre_de_tri;
    private Poubelle_intelligente poubelle_intelligente;
    /**
     * Default constructor
     */
    public Transport() {
    }

    public Poubelle_intelligente getPoubelle_intelligente() {
        return poubelle_intelligente;
    }

    public Transport(Date horaire, Centre_de_tri centre_de_tri, Poubelle_intelligente poubelle_intelligente) {
        Identifiant = nb_transports;
        Horaire = horaire;
        this.centre_de_tri = centre_de_tri;
        this.poubelle_intelligente = poubelle_intelligente;
        nb_transports+=1;
        allInstances.add(this);
    }

    public Centre_de_tri getCentre_de_tri() {
        return centre_de_tri;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "Identifiant=" + Identifiant +
                ", Horaire=" + Horaire +
                ", centre_de_tri=" + centre_de_tri +
                ", poubelle_intelligente=" + poubelle_intelligente +
                '}';
    }

    /**
     * @param s
     * @return
     */
    public void Deplacer(String s) {
        poubelle_intelligente.Set_emplacement(s);
    }

    /**
     * @return
     */
    public Integer Get_identifiant_transport() {

        return Identifiant;
    }

    /**
     * @return
     */
    public Date Get_Horaire_passage() {

        return Horaire;
    }

    /**
     * @return
     */
    public void Set_identifiant_transport(Integer valeur) {
    this.Identifiant = valeur;
    }

    /**
     * @return
     */
    public void Set_horaire_passage(Date date) {
        this.Horaire=date;
    }

}