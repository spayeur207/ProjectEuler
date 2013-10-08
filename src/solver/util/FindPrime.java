package solver.util;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * User: samuelpayeur
 * Date: 10/3/13
 * Time: 8:39 PM
 */
public class FindPrime implements Callable<Long> {
    private List<Long> givenPrimes;
    private Long base;

    public FindPrime(List<Long> givenPrimes, Long base){
        this.base = base;
        this.givenPrimes = givenPrimes;
    }

    @Override
    public Long call() throws Exception {
        Long potential = base;
        boolean foundPrime = false;
        while(!foundPrime){
            potential = potential + 2;
            for(Long prime : givenPrimes){
                if(potential%prime == 0){
                    foundPrime = false;
                    break;
                }
                else{
                    foundPrime = true;
                }
            }
        }
        return potential;
    }
}
