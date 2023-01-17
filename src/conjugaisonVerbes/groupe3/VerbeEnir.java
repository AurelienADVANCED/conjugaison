package conjugaisonVerbes.groupe3;

import conjugaisonVerbes.Verbe;

public class VerbeEnir extends Verbe {

    public VerbeEnir(String verbe) throws IllegalArgumentException {
        super(verbe);
    }

    @Override
    public String terminaisonSingulier() {
        return "iens";
    }

    @Override
    public String terminaisonPluriel() {
        return "enons";
    }

    @Override
    public String terminaisonParticipePresent() {
        return "enant";
    }
    @Override
    public String terminaisonParticipePasse() {
        return "enu";
    }

    @Override
    public String GetFinverber() { return "enir"; }


}
