package conjugaisonVerbes.Experts;

import conjugaisonVerbes.Verbe;
import conjugaisonVerbes.groupe2.VerbeGroupe2;

public class VbExpertGroupe2 extends VbExpertCOR {

    public VbExpertGroupe2(VbExpertCOR suivant)
    {
        super(suivant);
    }

    @Override
    public Verbe initialisation2(String infinitif) {
        try {
            VerbeGroupe2 verbeGroupe2 = new VerbeGroupe2(infinitif);
            return verbeGroupe2;
        } catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }



}
