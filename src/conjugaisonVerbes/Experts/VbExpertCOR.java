package conjugaisonVerbes.Experts;

import conjugaisonVerbes.Verbe;
public abstract class VbExpertCOR implements VbExpert
{
    protected VbExpertCOR suivant;

    public VbExpertCOR(VbExpertCOR suivant)
    {
        this.suivant = suivant;
    }

    /**
     * CF. interface VbExpert
     */
    @Override
    public Verbe initialisation(String infinitif)
    {
        Verbe verbe = this.initialisation2(infinitif);

        if (verbe != null) {
            return verbe;
        } else {
            if (this.suivant != null) {
                return this.suivant.initialisation(infinitif);
            } else {
                return null;
            }
        }
    }

    public abstract Verbe initialisation2(String infinitif);

}