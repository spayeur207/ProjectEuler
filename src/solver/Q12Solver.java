package solver;

import java.util.ArrayList;
import java.util.List;

/**
 * User: samuelpayeur
 * Date: 10/4/13
 * Time: 7:18 PM
 */
public class Q12Solver {

    public void solve(){
        List<Integer> divisors = new ArrayList<Integer>();
        int value = 1;
        int count = 1;
        while(divisors.size()<500){
            count++;
            for(int i = 1; i<=value; i++){
                if(value%i==0)
                    divisors.add(i);
            }
            if(divisors.size()<500){
                System.out.println(value+" - "+divisors.size());
                value = 0;
                for(int i = 1; i< count; i++){
                    value+=i;
                };
                divisors.clear();
            }
        }
        System.out.println(value);
    }
}
