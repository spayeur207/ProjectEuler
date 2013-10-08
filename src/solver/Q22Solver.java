package solver;

import solver.util.FileReaderUtil;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * User: samuelpayeur
 * Date: 10/7/13
 * Time: 8:45 AM
 */
public class Q22Solver {

    private FileReaderUtil fileReaderUtil;

    public Q22Solver() throws FileNotFoundException {
        fileReaderUtil = new FileReaderUtil("p22.txt");
    }

    public void solve(){
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.addAll(fileReaderUtil.readAndTokenize("\",\""));
        Iterator iterator = treeSet.iterator();
        int i = 1;
        int sum = 0;
        while(iterator.hasNext()){
            String nextString = (String)iterator.next();
            if(nextString.contains("\""));
            {
                nextString.replace('\"', ' ');
                nextString.trim();
            }
            int curSum = 0;

            for(char c : nextString.toCharArray()){
                curSum+= (c-'A'+1);
            }
            System.out.println(nextString+" - "+curSum);
            sum += curSum*i;
            i++;
        }
        System.out.println(sum);
    }
}
