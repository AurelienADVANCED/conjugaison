package conjugaisonVerbes.groupe2;

import conjugaisonVerbes.Verbe;

public class VerbeGroupe2 extends Verbe {
    public VerbeGroupe2(String verbe) throws IllegalArgumentException {
        super(verbe);
    }
    @Override
    public String terminaisonSingulier() {
        return "is";
    }

    @Override
    public String terminaisonPluriel() {
        return "issons";
    }

    @Override
    public String terminaisonParticipePresent() {
        return "issant";
    }
    @Override
    public String terminaisonParticipePasse() {
        return "i";
    }

    @Override
    public String GetFinverber() { return "ir"; }



}
