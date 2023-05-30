package se.kth.iv1350.highertask2;

import se.kth.iv1350.highertask2.Composition.RandomComposedChar;
import se.kth.iv1350.highertask2.Composition.RandomComposedString;
import se.kth.iv1350.highertask2.Inherited.*;


/**
 * Hello world!
 */
public final class Main {

    public static void main(String[] args) {

        RandomInheritedString rInString = new RandomInheritedString();
        RandomComposedString rCompString = new RandomComposedString();
        RandomComposedChar rComposedChar = new RandomComposedChar();
        RandomInheritedChar rInChar = new RandomInheritedChar();
       
        System.out.println("We have adapted java.util.random class.");
        System.out.println("One class for random chars and one for random strings.");
        System.out.println("Only random string is shown as it depends on random char");
        System.out.println("");

        System.out.println("Random String class outputs with random seed: ");
        System.out.println("Adapted using inheritance: "+rInString.nextString(5));
        System.out.println("Adapted using compsiton:   "+rCompString.nextString(5));
        System.out.println("Adapted using compsiton:   "+rInString.nextString(5));
        System.out.println("Adapted using inheritance: "+rCompString.nextString(5));
        rInString.setSeed(5);
        rCompString.setSeed(5);

        System.out.println("Random String class outputs with specific seed: ");
        System.out.println(rInString.nextString(5));
        System.out.println(rCompString.nextString(5));
        System.out.println(rInString.nextString(10));
        System.out.println(rCompString.nextString(10));

        System.out.println("");

        System.out.println(rCompString.nextString());
        System.out.println("");
        System.out.println(rInString.nextString());
        System.out.println("");
        rInString.setSeed(5);
        rCompString.setSeed(5);
        System.out.println(rInString.nextString(32,100));
        System.out.println("");
        System.out.println(rCompString.nextString(32,100));
        System.out.println("");

        System.out.println("");


        
        rInString.setSeed(5);
        rCompString.setSeed(5);
        System.out.println(rCompString.nextString(10,50,60));
        System.out.println(rInString.nextString(10,50,60));


    }
}
