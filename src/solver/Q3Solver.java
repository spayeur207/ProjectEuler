package solver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * User: samuelpayeur
 * Date: 10/3/13
 * Time: 8:26 PM
 */
public class Q3Solver {

    public static List<Long> primeFactorize(long subject, List<Long> primes) throws ExecutionException, InterruptedException {

        List<Long> primeFactorsList = new ArrayList<Long>();
        boolean factored = false;
        Long currentSubject = subject;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        while(!factored){
            for(Long prime : primes){
                if(currentSubject % prime == 0){
                    currentSubject = currentSubject/prime;
                    System.out.println("Factor: "+prime);
                    System.out.println("Current subj: "+currentSubject);
                    primeFactorsList.add(prime);
                    break;
                }
                if(currentSubject==1){
                    factored = true;
                }
            }
        }


        return primeFactorsList;
    }
}
