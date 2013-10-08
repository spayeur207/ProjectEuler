import solver.Q22Solver;
import solver.util.FileReaderUtil;

import java.io.*;
import java.util.concurrent.ExecutionException;

/**
 * User: samuelpayeur
 * Date: 10/3/13
 * Time: 8:28 PM
 */
public class main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, ExecutionException, InterruptedException {
        Q22Solver solver = new Q22Solver();
        solver.solve();
    }
}
