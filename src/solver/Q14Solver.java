package solver;

import solver.util.CollatzSequenceFuture;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * User: samuelpayeur
 * Date: 10/4/13
 * Time: 10:58 AM
 */
public class Q14Solver {

    public static void solve() throws ExecutionException, InterruptedException {
        int maxI = -1;
        int maxISize = -1;

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i = 999999; i>1; i--){
            Future<List<Long>> listFuture = executorService.submit(new CollatzSequenceFuture(Long.valueOf(i)));
            List<Long> longs = listFuture.get();
            if(longs.size()>maxISize){
                System.out.println("Index " + i + ": " + longs.size());
                maxISize = longs.size();
                maxI = i;
            }

        }
        System.out.println("done");
    }
}
