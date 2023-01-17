package conjugaisonVerbes.Experts;

import conjugaisonVerbes.Verbe;
import conjugaisonVerbes.groupe1.VerbeC;

public class VbExpertC extends VbExpertCOR {

    public VbExpertC(VbExpertCOR suivant)
    {
        super(suivant);
    }

    @Override
    public Verbe initialisation2(String infinitif) {
        try {
            VerbeC verbeC = new VerbeC(infinitif);
            return verbeC;
        } catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }



}
