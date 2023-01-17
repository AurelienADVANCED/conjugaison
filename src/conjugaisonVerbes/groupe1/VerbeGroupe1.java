package conjugaisonVerbes.groupe1;

import conjugaisonVerbes.Verbe;

public class VerbeGroupe1 extends Verbe {
    public VerbeGroupe1(String verbe) throws IllegalArgumentException {
        super(verbe);
    }

    @Override
    public String terminaisonSingulier() {
        return "e";
    }

    @Override
    public String terminaisonPluriel() {
        return "ons";
    }

    @Override
    public String terminaisonParticipePresent() {
        return "ant";
    }
    @Override
    public String terminaisonParticipePasse() {
        return "é";
    }

    @Override
    public String GetFinverber() { return "er"; }
}
