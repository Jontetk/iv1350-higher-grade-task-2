package se.kth.iv1350.highertask2.Inherited;

public class RandomInheritedString extends RandomInheritedChar{
    
    public RandomInheritedString() {
        super();
    }

    public RandomInheritedString(long seed) {
        super(seed);
    }



    public String nextString(int stringLength,int origin, int bound) {
        StringBuilder stringBuild = new StringBuilder();
        for(int i = 0; i < stringLength; i++) 
            stringBuild.append(super.nextChar(origin,bound));
        return stringBuild.toString();
    }
    public String nextString() {
        int random_num = super.nextInt(100);
        return nextString(random_num);
    }
    public String nextString(int origin,int bound) {
        int random_num = super.nextInt(100);
        return nextString(random_num,origin,bound);
    }
    public String nextString(int stringLength) {
        return nextString(stringLength,32,256);
    }
    



    

}
