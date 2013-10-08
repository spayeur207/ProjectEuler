package solver;

import java.util.ArrayList;
import java.util.List;

/**
 * User: samuelpayeur
 * Date: 10/4/13
 * Time: 12:37 PM
 */
public class Q18Solver {

    public void solve(){
        int[][] tree = {
                {75},
                {95, 64},
                {17, 47, 82},
                {18, 35, 87, 10},
                {20, 4, 82, 47, 65},
                {19, 1, 23, 75, 3, 34},
                {88, 2, 77, 73, 7, 63, 67},
                {99, 65, 4, 28, 6, 16, 70, 92},
                {41, 41, 26, 56, 83, 40, 80, 70, 33},
                {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
                {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
                {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
                {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
                {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
                {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23}
        };

        int lMax, rMax, lMaxIndex, rMaxIndex;

        List<Integer> choices = new ArrayList<Integer>();
        List<Integer> choiceIndexs = new ArrayList<Integer>();

        for(int i = 0; i<tree.length; i++){
            int[] row = tree[i];
            int[] adj = new int[2];
            if(row.length == 1){
                choices.add(row[0]);
                choiceIndexs.add(0);
                continue;
            }

            rMax = -1;
            rMaxIndex = -1;
            for(int j = 0; j < row.length; j++){
                if(row[j] > rMax){
                    rMax = row[j];
                    rMaxIndex = j;
                }
            }

            for(int k = 0; k < 2; k++){
                if(row[choiceIndexs.get(i-1)+k] == rMax){
                    lMax = rMax;
                    lMaxIndex = i-1;
                    break;
                }
            }


        }

    }
}
