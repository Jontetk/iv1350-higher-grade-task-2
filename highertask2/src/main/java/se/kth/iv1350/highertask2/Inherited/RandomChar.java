package se.kth.iv1350.highertask2.Inherited;

import java.util.Random;

public class RandomChar extends Random {
    

    public  RandomChar() {
        super();
    }

    public RandomChar(long seed) {
        super(seed); 
    }
    
    protected char nextChar(int origin, int bound){
     
        int zero = 0;

        if(origin < bound){
            int n =  bound-origin;
            if (n>0){
                return (char) (nextInt(n)+origin);
            }
                }
            return (char) zero;

    }

    public char nextBasicLatinChar(){
        int origin = 32;
        int bound = 127;
        
        return nextChar(origin, bound);
    }

    
}
