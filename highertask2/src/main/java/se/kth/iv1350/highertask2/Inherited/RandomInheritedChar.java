package se.kth.iv1350.highertask2.Inherited;

import java.util.Random;

/**
 * Random char generator class 
 * implemeted using inheritance
 */
public class RandomInheritedChar extends Random {
    
    /**
     *  Creates an instance with randomized seed 
     */
    public  RandomInheritedChar() {
        super();
    }


    /**
     *  Creates an instance with specifed seed 
     * @param seed the seed that this instance 
     * will use to generate random characters
     */
    public RandomInheritedChar(long seed) {
        super(seed); 
    }
    
    /**
     * All integer parameters represent chars the
     * decimal representaion of characters in unicode. 
     * 
     * @param origin lower bound for characters that can be generated (inclusive)
     * @param bound upper bound for characters that can be generated (exclusive)
     * @return a randomly generated character within the given range
     */
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

    /**
     * Generates a random Basic Latin unicode character. 
     * @return a random basic latin character
     */
    public char nextBasicLatinChar(){
        // Basic Latin in unicode begins with Space and ends with Tilde
        return nextChar(' ', '~'+1);
    }

    
}
