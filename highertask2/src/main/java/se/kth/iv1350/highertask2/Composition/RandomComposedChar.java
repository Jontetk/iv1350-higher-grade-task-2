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

    char nextChar(int origin, int bound){
        
    }

    
}
