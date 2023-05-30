package se.kth.iv1350.highertask2.Composition;

import java.util.Random;

public class RandomComposedString {
    private Random rand;
    private RandomComposedChar randChar;

    public RandomComposedString() {
        this.rand = new Random();
        this.randChar = new RandomComposedChar();
    }

    public RandomComposedString(long seed) {
        this.rand = new Random(seed);
        this.randChar = new RandomComposedChar(seed);
    }



    public String nextString(int stringLength,int origin, int bound) {
        StringBuilder stringBuild = new StringBuilder();
        for(int i = 0; i < stringLength; i++) 
            stringBuild.append(randChar.nextChar(origin,bound));
        return stringBuild.toString();
    }
    public String nextString() {
        int random_num = this.rand.nextInt(100);
        return nextString(random_num);
    }
    public String nextString(int origin,int bound) {
        int random_num = this.rand.nextInt(100);
        return nextString(random_num,origin,bound);
    }
    public String nextString(int stringLength) {
        return nextString(stringLength,32,256);
    }
    public void setSeed(long seed) {
        this.rand.setSeed(seed);
        this.randChar.setSeed(seed);
    }


}
