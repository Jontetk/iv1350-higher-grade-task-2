package se.kth.iv1350.highertask2.Inherited;

import java.util.Random;

public class RandomChar extends Random {
    

    public  RandomChar() {
        super();
    }

    public RandomChar(long seed) {
        super(seed); 
    }


    protected char nextChar(char origin, char bound){
        int originInt = (int) origin; 
        int boundInt = (int) bound; 
        int zero = 0;

        if(originInt < bound){
            int n =  boundInt-origin;
            if (n>0){
                return (char) (nextInt(n)+origin);
            }
                }
            return (char) zero;

    }

    protected char NextBasicLatinChar(){
        int origin = 0;
        int bound = 127;
        
    }
}
