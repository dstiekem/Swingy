package dstiekem.za.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputPickup {
    String onllyYN;

    InputPickup(Artefact artefact) throws IOException {
        System.out.println("An Artefact was dropped. Pick it up?");
        BufferedReader qr = new BufferedReader(new InputStreamReader(System.in));
        onllyYN = qr.readLine();
        if (onllyYN.equals("yes") || onllyYN.equals("Yes") || onllyYN.equals("YES") || onllyYN.equals("Y") || onlyYN.equals("y")) {
            //gameState = new NewState(hero);
            System.out.println("You gained more" + artefact.getstats() + "!");
        }
    }
}
