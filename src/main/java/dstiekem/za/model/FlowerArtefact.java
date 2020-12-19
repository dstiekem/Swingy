package dstiekem.za.model;

public class FlowerArtefact extends Artefact {
    //flower for... attack
    //level 1  pansy the pansiest of plants offers you no improvement to your venomous capabilities. adds 455 X 5 (takes 5 to get to new level)2450
    //level 2 gardenia spicy leaf with a kick to your attack 235 x 10 to get to 4800
    //level 3  leaves 325 x 10 to get to 8050
    //level 4 415 x10 to get to 12200
    //level 5 1725 X 10 to get to 17250 and win the game.
        //1725 /15 = 115. if each artefact gives 345 it could take 5 artefacts tp get to 1725 and 10 x 5 artefacts to win the game
    FlowerArtefact(Level hLev) {
        super(hLev);
        int aspLev = hLev.getLev() + 1;
        switch(aspLev){
            case 2: super.setStat(182, 172, 101);
            case 3: super.setStat(141, 47, 47);
            case 4: super.setStat(130, 65, 65);
            case 5: super.setStat(166, 83,83);
            case 6: super.setStat(120, 110, 115);
        }
    }
}

