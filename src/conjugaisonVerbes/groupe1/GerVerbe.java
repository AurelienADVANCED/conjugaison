package conjugaisonVerbes.groupe1;

public class GerVerbe extends VerbeGroupe1 {

    public GerVerbe(String verbe) throws IllegalArgumentException {
        super(verbe);

        if(!radicalVerbe.endsWith("g")) {
            throw new IllegalArgumentException("Ce n'est pas un verbe qui finit en g");
        }
    }

    @Override
    public String terminaisonPluriel() {
        return "eons";
    }

    @Override
    public String terminaisonParticipePresent() {
        return "eant";
    }
}


