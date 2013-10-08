package solver.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * User: samuelpayeur
 * Date: 10/3/13
 * Time: 8:14 PM
 */
public class PrimeGeneratorUtil {
    private static final String PRIME_FILE = "PrimeMemory.eul";
    private static long[] primeArray;
    {
        FileInputStream fileIn = null;
        ObjectInputStream in = null;
        try {
            fileIn = new FileInputStream(PRIME_FILE);
            in = new ObjectInputStream(fileIn);

            primeArray = (long[])in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            primeArray = new long[10000];
        }
        finally {
            try {
                fileIn.close();
                in.close();
            } catch (IOException e) {
                System.err.println("Oh man, everything went horribly wrong here.");
                e.printStackTrace(); //Everything died horribly.
            }
        }
    }

    public PrimeGeneratorUtil(){

    }

    public void generatePrimes(){
        synchronized (primeArray){

        }
    }
}
