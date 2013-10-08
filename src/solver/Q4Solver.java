package solver;

/**
 * User: samuelpayeur
 * Date: 10/4/13
 * Time: 10:11 AM
 */
public class Q4Solver {

    public static int palindrome(){
        for(int i = 999; i>=100; i--){
            for(int j = 999; i>=100; i--){
                Integer x = i*j;
                String y = x.toString();
                if(y.length()%2==0){
                    CharSequence a = y.substring(y.length()/2);
                    CharSequence b = y.substring(0, y.length()/2);
                    for(int k = 0; k<a.length(); k++){

                    }
                }

            }
        }

        return 0;
    }

}
