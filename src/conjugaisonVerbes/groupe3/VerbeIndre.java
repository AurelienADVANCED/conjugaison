package conjugaisonVerbes.groupe3;

import conjugaisonVerbes.Verbe;

public class VerbeIndre extends Verbe {

    public VerbeIndre(String verbe) throws IllegalArgumentException {
        super(verbe);
    }

    @Override
    public String terminaisonSingulier() {
        return "ins";
    }

    @Override
    public String terminaisonPluriel() {
        return "ignons";
    }

    @Override
    public String terminaisonParticipePresent() {
        return "ignant";
    }
    @Override
    public String terminaisonParticipePasse() {
        return "int";
    }

    @Override
    public String GetFinverber() { return "indre"; }


}
