package se.kth.iv1350.highertask2.Inherited;


/**
 * 
 * Random string generator
 */
public class RandomInheritedString extends RandomInheritedChar{
    
    /**
     * Random String generator
     * 
     */
    public RandomInheritedString() {
        super();
    }
    /**
     * Random string generator
     * @param seed The seed that will be used
     */
    public RandomInheritedString(long seed) {
        super(seed);
    }


    /**
     * Generates a random string
     * @param stringLength The length of the random string
     * @param origin The unicode for the lowest selectable character
     * @param bound The unicode for the highest selectable character
     * @return Random string
     */
    public String nextString(int stringLength,int origin, int bound) {
        StringBuilder stringBuild = new StringBuilder();
        for(int i = 0; i < stringLength; i++) 
            stringBuild.append(super.nextChar(origin,bound));
        return stringBuild.toString();
    }

    /**
     * Generates a random string with a random length up to 100 and unicode characters between 32 and 256
     * @return Random string
     */
    public String nextString() {
        int random_num = super.nextInt(100);
        return nextString(random_num);
    }
    /**
     * Generates a random string with a random length up to 100
     * @param origin The unicode for the lowest selectable character
     * @param bound The unicode for the highest selectable character
     * @return Random string
     */
    public String nextString(int origin,int bound) {
        int random_num = super.nextInt(100);
        return nextString(random_num,origin,bound);
    }

    /**
     * Generates a random string with unicode characters between 32 and 256
     * @param stringLength The length of the string
     * @return Random string
     */
    public String nextString(int stringLength) {
        return nextString(stringLength,32,256);
    }
    



    

}
