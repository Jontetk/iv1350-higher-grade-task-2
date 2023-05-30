package se.kth.iv1350.highertask2.Composition;

import java.util.Random;

public class RandomComposedChar {
    private Random rng;
  


    public RandomComposedChar(){
        this.rng = new Random();
    }

    public RandomComposedChar(long seed){
        this.rng = new Random(seed);
    }

    public void setSeed(long seed) {
        this.rng.setSeed(seed);
    }

    char nextChar(int origin, int bound){

        int zero = 0;
        if(origin < bound){
            int n =  bound-origin;
            if (n>0){
                return (char) (rng.nextInt(n)+origin);
            }
        }
        
        return (char) zero;
    }

    public char nextBasicLatinChar(){
        return nextChar(' ', '~'+1);
    }
    
}
