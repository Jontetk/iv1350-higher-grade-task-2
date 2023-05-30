package se.kth.iv1350.highertask2;

import se.kth.iv1350.highertask2.Composition.*;
import se.kth.iv1350.highertask2.Inherited.*;

public final class Main {

    public static void main(String[] args) {

        RandomInheritedString rInString = new RandomInheritedString();
        RandomComposedString rCompString = new RandomComposedString();
       
        System.out.println("We have adapted java.util.random class.");
        System.out.println("One class for random chars and one for random strings.");
        System.out.println("Only random string is shown as it depends on random char");
        System.out.println("");

        System.out.println("Random String class outputs with random seed: ");
        System.out.println("Adapted using inheritance:  "+rInString.nextString(5));
        System.out.println("Adapted using compsiton:  "+rCompString.nextString(5));
        System.out.println("Adapted using inheritance:  "+rInString.nextString(5));
        System.out.println("Adapted using compsiton:  "+rCompString.nextString(5));
        rInString.setSeed(10);
        rCompString.setSeed(10);
        System.out.println("");
        System.out.println("Random String class outputs with specific seed: ");
        System.out.println("Adapted using inheritance:  "+rInString.nextString(5));
        System.out.println("Adapted using compsiton:  "+rCompString.nextString(5));
        System.out.println("Adapted using inheritance:  "+rInString.nextString(10));
        System.out.println("Adapted using compsiton:  "+rCompString.nextString(10));

        System.out.println("");
        System.out.println("Random String class outputs with specific seed and random length: ");
        System.out.println("Adapted using compsiton:  "+rCompString.nextString());
        System.out.println("Adapted using inheritance:  "+rInString.nextString());

        rInString.setSeed(10);
        rCompString.setSeed(10);

        System.out.println("");
        System.out.println("Random String class outputs with specific seed and random length with selected characters: ");
        System.out.println("Adapted using inheritance:  "+rInString.nextString(32,100));
        System.out.println("Adapted using compsiton:  "+rCompString.nextString(32,100));
        
        
        rInString.setSeed(5);
        rCompString.setSeed(5);
        
        System.out.println("");
        System.out.println("Random String class outputs with specific seed and selected length with selected characters: ");
        System.out.println("Adapted using compsiton:  "+rCompString.nextString(10,50,60));
        System.out.println("Adapted using inheritance:  "+rInString.nextString(10,50,60));


    }
}
