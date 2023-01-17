package conjugaisonVerbes.Experts;

import conjugaisonVerbes.Verbe;
import conjugaisonVerbes.groupe3.VerbeIndre;

public class VbExpertIndre extends VbExpertCOR {

    public VbExpertIndre(VbExpertCOR suivant)
    {
        super(suivant);
    }

    @Override
    public Verbe initialisation2(String infinitif) {
        try {
            VerbeIndre verbeIndre = new VerbeIndre(infinitif);
            return verbeIndre;
        } catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }



}
