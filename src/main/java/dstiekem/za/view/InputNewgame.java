package dstiekem.za.view;

import dstiekem.za.validators.ValidChoice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNewgame {
    @ValidChoice
    String onllyYN;
    private boolean gamestate;
    public InputNewgame(String onlyYN, boolean fileex) throws IOException {
        this.onllyYN = onlyYN;
        if (onlyYN.equals("yes") || onlyYN.equals("Yes") || onlyYN.equals("YES") || onlyYN.equals("Y") || onlyYN.equals("y")) {
            //gameState = new NewState(hero);
            System.out.println("Creating a new game...");
            gamestate = false;
        } else if ((onlyYN.equals("no") || onlyYN.equals("No") || onlyYN.equals("NO") || onlyYN.equals("N") || onlyYN.equals("n")) && fileex == false) {
            //gameState = new NewState(hero);
            System.out.println("Do you want to quit?: ");
            BufferedReader qr = new BufferedReader(new InputStreamReader(System.in));
            onlyYN = qr.readLine();
            if (onlyYN.equals("yes") || onlyYN.equals("Yes") || onlyYN.equals("YES") || onlyYN.equals("Y") || onlyYN.equals("y")) {
                System.out.println("ok bye bye");
                System.exit(0);
            }
            else {
                System.out.println("Creating a new game...cos theres no game to load");
                gamestate = false;
            }
        } else if (onlyYN.equals("no") || onlyYN.equals("No") || onlyYN.equals("NO") || onlyYN.equals("N") || onlyYN.equals("n") && fileex == true) {
            //gameState = new ReadState(hero);
            System.out.println("Loading game...");
            System.out.println();
            gamestate = true;
        }
        else
        {
            System.out.println("ok...creating a new game!!");
        }
    }
    public boolean GetGame() {
        return gamestate;
    }
}
