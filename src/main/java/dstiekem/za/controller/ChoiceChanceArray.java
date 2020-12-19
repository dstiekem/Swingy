package dstiekem.za.controller;

import java.util.ArrayList;
import java.util.Random;

public class ChoiceChanceArray {
    private int[] chancechoice;
    int size;
    int rangeochoice;
    public ChoiceChanceArray(int size, int rangeochoice, int div) {
        this.size = size;
        this.rangeochoice = rangeochoice;
        chancechoice = new int[size];
        int split = 1;
        if (div == 0 || rangeochoice > 2)
            split = size / rangeochoice;
        else if(div > 0 && rangeochoice == 2)
            split = div;
        Random rand = new Random();
        for(int n = 0; n < size; n++)
        {
            //System.out.println("first" + chancechoice[n]);
            if(chancechoice[n] == 0)
            {
                for (int i = 1; i <= rangeochoice; i++) {
                    //System.out.println("it are" + i);
                    for (int x = 0; x < split; x++) {
                        int ee = rand.nextInt(size);
                        if (chancechoice[ee] == 0)
                            chancechoice[ee] = i;
                    }
                }
            }
        }
    }
    public int getnextvalue(int i){
        return chancechoice[i];
    }
}
