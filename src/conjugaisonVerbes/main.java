package conjugaisonVerbes;
import java.io.*;
import java.util.Scanner;

import conjugaisonVerbes.Experts.*;

public class main {

    public static void main(String[] args) throws IOException {

        while (true)
        {
            VbExpertCOR expertMiami = new VbExpertGroupe1(null);
            expertMiami = new VbExpertGroupe2(expertMiami);
            expertMiami = new VbExpertAître(expertMiami);
            expertMiami = new VbExpertIndre(expertMiami);
            expertMiami = new VbExpertGer(expertMiami);
            expertMiami = new VbExpertC(expertMiami);
            expertMiami = new VbExpertEnir(expertMiami);


            Scanner keyboard = new Scanner(System.in);
            String inputvar = keyboard.nextLine();
            System.out.println("Entrer un mot : " + inputvar);

            Verbe verbe = expertMiami.initialisation(inputvar);

            Call(verbe);
        }
    }

    /**
     * Conjuge le verbe reçus
     * @param variable
     */
    public static void Call(Verbe variable)
    {
        System.out.println(variable);
        System.out.println(variable.conjuge1erePersonneSingulier());
        System.out.println(variable.conjugue1erePersonnePluriel());
        System.out.println(variable.conjugeParticipePresent());
        System.out.println(variable.conjugueParticipePasse());
    }
}
