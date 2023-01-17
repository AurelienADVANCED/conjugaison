package conjugaisonVerbes.Experts;

import conjugaisonVerbes.Verbe;
import conjugaisonVerbes.groupe3.VerbeAître;

public class VbExpertAître extends VbExpertCOR {

    public VbExpertAître(VbExpertCOR suivant)
    {
        super(suivant);
    }

    @Override
    public Verbe initialisation2(String infinitif) {
        try {
            VerbeAître verbeAître = new VerbeAître(infinitif);
            return verbeAître;
        } catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }



}
