package conjugaisonVerbes.groupe1;

public class VerbeC extends VerbeGroupe1 {

    public VerbeC(String verbe) throws IllegalArgumentException {
        super(verbe);

        if(!radicalVerbe.endsWith("c")) {
            throw new IllegalArgumentException("Ce n'est pas un verbe qui finit en c");
        }
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
    public String conjugue1erePersonnePluriel() {
        String verbe = super.conjugue1erePersonnePluriel();
        return replaceC(verbe);
    }

    @Override
    public String conjugeParticipePresent() {
        String verbe = super.conjugeParticipePresent();
        return replaceC(verbe);
    }

    public String replaceC(String text){
        StringBuffer sb = new StringBuffer(text);
        int l = sb.length();
        int start = l-4;
        int end = l-3;
        sb.replace(start,end,"ç");

        return sb.toString();
    }
}


