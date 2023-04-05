package application;
import java.util.Date;

public class TrackedClass
{

    public static void main( String[] args )
    {
        Transport a = new Transport(new Date() ,new Centre_de_tri(),new Poubelle_intelligente());
        Transport b = new Transport(new Date() ,new Centre_de_tri(),new Poubelle_intelligente());
        Transport c = new Transport(new Date() ,new Centre_de_tri(),new Poubelle_intelligente());
        for (Object allInstance : Transport.allInstances) {
            System.out.println(allInstance);
        }

    }
}