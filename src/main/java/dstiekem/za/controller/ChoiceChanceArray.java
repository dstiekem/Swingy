package dstiekem.za.controller;

import java.util.ArrayList;
import java.util.Random;

public class ChoiceChanceArray {
    private int[] chancechoice;
    int size;
    int rangeochoice;
    public ChoiceChanceArray(int size, int rangeochoice, int div)  {
        this.size = size;
        this.rangeochoice = rangeochoice;
        chancechoice = new int[size];
        int split = 1;
        if (div == 0)
            split = size / rangeochoice;
        else if(div > 0 && rangeochoice == 2)
            split = div;
        Random rand = new Random();
        int n = 0;
        while(n < size)
        {
            //System.out.println("first" + chancechoice[n]);
            if(chancechoice[n] == 0)
            {
                for (int i = 1; i <= rangeochoice; i++) {
                    //System.out.println("it are" + i);
                    int x = 0;
                    while(x <= split) {
                        int ee = rand.nextInt(size);
                        if (chancechoice[ee] == 0) {

                           // System.out.println("first" + chancechoice[ee]);
                            chancechoice[ee] = i;
                            //try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
                           // System.out.println(chancechoice[ee]);
                        }
                        x++;
                    }
                }
            }
            n++;
        }
        for(int x = 0; x < size; x++)
        {
            //System.out.println("before" + chancechoice[x]);
            if (chancechoice[x] == 0)
                chancechoice[x] = 1;
            //System.out.println("after" + chancechoice[x]);
        }
    }
    public int getnextvalue(int i){
        return chancechoice[i];
    }
}
