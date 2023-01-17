package conjugaisonVerbes.Experts;

import conjugaisonVerbes.Verbe;
import conjugaisonVerbes.groupe1.GerVerbe;

public class VbExpertGer extends VbExpertCOR {

    public VbExpertGer(VbExpertCOR suivant)
    {
        super(suivant);
    }

    @Override
    public Verbe initialisation2(String infinitif) {
        try {
            GerVerbe gerVerbe = new GerVerbe(infinitif);
            return gerVerbe;
        } catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }



}
