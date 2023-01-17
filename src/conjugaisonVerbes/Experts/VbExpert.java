package conjugaisonVerbes.Experts;

import conjugaisonVerbes.Verbe;
public interface VbExpert {

    /**
     *
     * @param infinitif  Exemples : Commencer, Finir, Peindre, Connaître, Ect...
     * @return Verbe correspondant
     * Retourne null si le verbe n'est pas reconnu
     */
    Verbe initialisation(String infinitif);
}
