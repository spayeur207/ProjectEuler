package solver.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * User: samuelpayeur
 * Date: 10/4/13
 * Time: 10:58 AM
 */
public class CollatzSequenceFuture implements Callable<List<Long>> {

    private Long chainStart;
    private List<Long> chain;

    public CollatzSequenceFuture(Long base){
        this.chainStart = base;
        chain = new ArrayList<Long>();
        chain.add(chainStart);

    }
    @Override
    public List<Long> call() throws Exception {
        if(chainStart==1) return chain;
        else if(chainStart%2==0){
            collatzEven(chainStart);
        }
        else{
            collatzOdd(chainStart);
        }
        return chain;  //To change body of implemented methods use File | Settings | File Templates.
    }

    private Long collatzEven(Long base){
        Long result = base/2;
        chain.add(result);
        if(result==1) return result;
        else if(result%2==0){
            return collatzEven(result);
        }
        else{
            return collatzOdd(result);
        }

    }

    private Long collatzOdd(Long base) {
        Long result = (base*3)+1;
        if(result==1) return result;
        else if(result%2==0){
            return collatzEven(result);
        }
        else{
            return collatzOdd(result);
        }
    }
}
