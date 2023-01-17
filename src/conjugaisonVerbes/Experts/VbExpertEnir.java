package conjugaisonVerbes.Experts;

import conjugaisonVerbes.Verbe;
import conjugaisonVerbes.groupe3.VerbeEnir;

public class VbExpertEnir extends VbExpertCOR {

    public VbExpertEnir(VbExpertCOR suivant)
    {
        super(suivant);
    }

    @Override
    public Verbe initialisation2(String infinitif) {
        try {
            VerbeEnir verbeEnir = new VerbeEnir(infinitif);
            return verbeEnir;
        } catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }



}
