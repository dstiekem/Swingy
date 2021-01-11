package dstiekem.za.view;

import dstiekem.za.model.Artefact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputPickup {
    Artefact a;
    public InputPickup(Artefact artefact) throws IOException, InterruptedException {
        this.a = artefact;
        String onllyYN;
        System.out.println("An Artefact was dropped. Pick it up?");
        BufferedReader qr = new BufferedReader(new InputStreamReader(System.in));
        onllyYN = qr.readLine();
        if (onllyYN.equals("yes") || onllyYN.equals("Yes") || onllyYN.equals("YES") || onllyYN.equals("Y") || onllyYN.equals("y")) {
            //gameState = new NewState(hero);
            if(artefact.getname().equals("Flower"))
            {
                System.out.println("\nyou picked up a flower");
                java.lang.Thread.sleep(1000);
                System.out.println("\n A source of food. \n" +
                        "Flowers are your life \n" +
                        "therefore the sustainance you need\n" +
                        "to live through this treacherous garden (hit points)\n");
            }
            else if(artefact.getname().equals("Leaf"))
            {
                System.out.println("\nyou picked up a leaf\nLeaves harden you to the world \n");
                java.lang.Thread.sleep(1000);
                System.out.println("you have been hardened little one \n" +
                        "go forth and survive through defense!\n" +
                        "also continue to eat all the greans\n");
                        ;
            }
            else if(artefact.getname().equals("Royal Jelly"))
            {
                System.out.println("\nyou picked up Royaljelly\n");
                java.lang.Thread.sleep(1000);
                System.out.println("F***ing B*** \n" +
                "you're pumped bro!! \n" +
                        "this is the JUICE\n" +
                        " THE ROYALJELLY JUICE FOR ATTACK\n");
            }
        }
    }
    public void newex(int newexint){
        System.out.println("You gained more experience!\n" + this.a.getStringstats());
        System.out.println("Current expereince: " + newexint);
    }
}
