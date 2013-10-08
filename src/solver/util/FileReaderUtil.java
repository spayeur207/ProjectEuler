package solver.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User: samuelpayeur
 * Date: 10/7/13
 * Time: 8:47 AM
 */
public class FileReaderUtil {
    private static final String BASE_PATH = "src/solver/data/";
    private FileInputStream fileIn;
    public FileReaderUtil(String fileName) throws FileNotFoundException {
        File file = new File(BASE_PATH+fileName);
        fileIn = new FileInputStream(file);
    }

    public List<String> readAndTokenize(String token){
        Scanner scanner = new Scanner(fileIn);
        Pattern tokenPattern = Pattern.compile(token);
        scanner.useDelimiter(tokenPattern);
        ArrayList<String> tokenizedList = new ArrayList<String>(7500);
        while (scanner.hasNext()){
            tokenizedList.add(scanner.next());
        }
        return tokenizedList;
    }

}
