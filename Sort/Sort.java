import java.util.Random;
/**
 * Class for sorting numbers from smallest to greatest.
 *
 * @Kathryn Mokhov
 * version 08/29/2023
 */
public class Sort
{
    
    /**
     * Constructor for objects of class Sort
     */
    public static void Random()
    {
        double[] arrayOfRandomNumbers = new double[100];
        for (int i=0; i<100; i++) {
            double doubleRandom = Math.random() * 99;
            arrayOfRandomNumbers[i] = doubleRandom;
            System.out.println(arrayOfRandomNumbers[i]);
        }
    }

    
    
    
}