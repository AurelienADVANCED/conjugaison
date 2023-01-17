package conjugaisonVerbes.groupe3;

import conjugaisonVerbes.Verbe;

public class VerbeAître extends Verbe {

    public VerbeAître(String verbe) throws IllegalArgumentException {
        super(verbe);
    }

    @Override
    public String terminaisonSingulier() {
        return "ais";
    }

    @Override
    public String terminaisonPluriel() {
        return "aissons";
    }

    @Override
    public String terminaisonParticipePresent() {
        return "aissant";
    }
    @Override
    public String terminaisonParticipePasse() {
        return "u";
    }

    @Override
    public String GetFinverber() { return "aître"; }


}
