package conjugaisonVerbes.Experts;

import conjugaisonVerbes.Verbe;
import conjugaisonVerbes.groupe1.VerbeGroupe1;
public class VbExpertGroupe1 extends VbExpertCOR {

    public VbExpertGroupe1(VbExpertCOR suivant)
    {
        super(suivant);
    }

    @Override
    public Verbe initialisation2(String infinitif) {
        try {
            VerbeGroupe1 verbeGroupe1 = new VerbeGroupe1(infinitif);
            return verbeGroupe1;
        } catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }



}
