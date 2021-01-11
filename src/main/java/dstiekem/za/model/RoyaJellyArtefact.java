package dstiekem.za.model;

public class RoyaJellyArtefact extends Artefact{
    public RoyaJellyArtefact(Level hLev) {
        super(hLev);
        super.artName = "Royal Jelly";
        int aspLev = hLev.getLev() + 1;
        switch(aspLev){
            case 2: super.setStat(172, 101, 182);
            case 3: super.setStat(47, 47, 141);
            case 4: super.setStat(65, 65, 130);
            case 5: super.setStat(83, 83,166);
            case 6: super.setStat(110, 115, 120);
        }
    }
    //level 1  pansy the pansiest of plants offers you no improvement to your venomous capabilities. adds 455 X 5 (takes 5 to get to new level)2450
    //level 2 gardenia spicy leaf with a kick to your attack 235 x 10 to get to 4800
    //level 3  leaves 325 x 10 to get to 8050
    //level 4 415 x10 to get to 12200
    //level 5 1725 X 10 to get to 17250 and win the game.

}
