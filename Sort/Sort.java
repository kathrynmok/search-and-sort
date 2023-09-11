import java.util.Random;
import java.util.Arrays;
import java.lang.Math;
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
        boolean isChanged = true;
        boolean isDone = true;
        for (int i=0; i<100; i++) {
            double doubleRandom = Math.random() * 99;
            arrayOfRandomNumbers[i] = doubleRandom;
        }
        System.out.println(Arrays.toString(arrayOfRandomNumbers));
        for (int k=0; k < arrayOfRandomNumbers.length; k++){
            for (int i=0; i < arrayOfRandomNumbers.length-1; i++) {
                isChanged = true;
                while (isChanged == true)
                {
                    if (arrayOfRandomNumbers[i] > arrayOfRandomNumbers[i+1]) {
                        double temp = arrayOfRandomNumbers[i+1];
                        arrayOfRandomNumbers[i+1] = arrayOfRandomNumbers[i];
                        arrayOfRandomNumbers[i] = temp;
                    }
                    else
                    {
                        isChanged = false; 
                    }
                }
            }

        }
        System.out.println(Arrays.toString(arrayOfRandomNumbers));
    }
}