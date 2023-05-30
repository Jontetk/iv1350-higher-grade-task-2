package se.kth.iv1350.highertask2.Inherited;

public class RandomString extends RandomChar{
    
    public RandomString() {
        super();
    }

    public RandomString(long seed) {
        super(seed);
    }



    public String nextString(int stringLength,int origin, int bound) {
        StringBuilder stringBuild = new StringBuilder();
        for(int i = 0; i < stringLength; i++) 
            stringBuild.append(super.nextChar(origin,bound));
        return stringBuild.toString();
    }
    public String nextString() {
        return nextString(super.nextInt(2048));
    }
    public String nextString(int origin,int bound) {
        return nextString(super.nextInt(2048),origin,bound);
    }
    public String nextString(int stringLength) {
        return nextString(stringLength,32,255);
    }



    

}
