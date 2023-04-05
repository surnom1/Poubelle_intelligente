package application;
/**
 * 
 */
public enum Type_de_dechet {
    PLASTIQUE(1,5),
    METAL(2,20),
    VERRE(3,15),
    CARTON(4,10);

    private final int poids_en_kg;

    public int getNb_points_attribues() {
        return nb_points_attribues;
    }

    private final int nb_points_attribues;

    Type_de_dechet(int poids_en_kg,int nb_points_attribues) {
        this.poids_en_kg=poids_en_kg;
        this.nb_points_attribues=nb_points_attribues;
    }
    public int getPoids_en_kg() {
        return this.poids_en_kg;
    }

}