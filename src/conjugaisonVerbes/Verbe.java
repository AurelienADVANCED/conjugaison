package conjugaisonVerbes;

public abstract class Verbe {

    public Verbe(String verbe) throws IllegalArgumentException {

        if (!verbe.endsWith(GetFinverber())) {
            throw new IllegalArgumentException("[" + this.getClass().getName() + "] Le verbe donné ne finit pas en : " + GetFinverber());
        }
        this.radicalVerbe = verbe.substring(0, verbe.length() - GetFinverber().length());
    }

    public String radicalVerbe;
    public static final String PREMIERE_PERSONNE_SINGULIER = "Je";
    public static final String PREMIERE_PERSONNE_PLURIEL = "Nous";

    public String conjuge1erePersonneSingulier() {
        return PREMIERE_PERSONNE_SINGULIER + " " + radicalVerbe + terminaisonSingulier();
    }

    public String conjugue1erePersonnePluriel() {
        return PREMIERE_PERSONNE_PLURIEL + " " + radicalVerbe + terminaisonPluriel();
    }
    public String conjugeParticipePresent() {
        
        return radicalVerbe + terminaisonParticipePresent();
    }
    public String conjugueParticipePasse() {
        return radicalVerbe + terminaisonParticipePasse();
    }

    public abstract String terminaisonSingulier();
    public abstract String terminaisonPluriel();
    public abstract String terminaisonParticipePresent();
    public abstract String terminaisonParticipePasse();

    public abstract String GetFinverber();

    @Override
    public String toString() {
        return "Verbe{" +
                "radicalVerbe='" + radicalVerbe + '\'' +
                '}';
    }
}
