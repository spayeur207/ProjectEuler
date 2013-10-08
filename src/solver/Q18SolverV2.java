package solver;

import solver.util.PathNode;

import java.util.ArrayList;
import java.util.List;

/**
 * User: samuelpayeur
 * Date: 10/4/13
 * Time: 4:04 PM
 */
public class Q18SolverV2 {

    public void solve(){
//        int[][] tree = {
//                {75},
//                {95, 64},
//                {17, 47, 82},
//                {18, 35, 87, 10},
//                {20, 4, 82, 47, 65},
//                {19, 1, 23, 75, 3, 34},
//                {88, 2, 77, 73, 7, 63, 67},
//                {99, 65, 4, 28, 6, 16, 70, 92},
//                {41, 41, 26, 56, 83, 40, 80, 70, 33},
//                {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
//                {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
//                {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
//                {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
//                {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
//                {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23}
//        };

        int[][] tree = {{3},
                {7, 4},
                {2, 4, 6},
                {8, 5, 9, 3}
        };
        List<List<PathNode>> paths = new ArrayList<List<PathNode>>();
        for(int i = 0; i < tree[tree.length-1].length; i++){
            List<PathNode> path = new ArrayList<PathNode>();
            int a = tree[tree.length-1][i];
            path.add(new PathNode(a, i));
            paths.add(path);
        }

        for(int i = tree.length-2; i >= 0; i--){
            int[] row = tree[i];
            for(List<PathNode> path : paths){
                PathNode node = path.get(path.size()-1);
                if(node.index == 0){
                    path.add(new PathNode(row[0], 0));
                }
                else if(node.index == row.length){
                    path.add(new PathNode(row[row.length-1], row.length-1));
                }
                else{
                    int a = row[node.index];
                    int b = row[node.index-1];
                    if(a>b){
                        path.add(new PathNode(a, node.index));
                    }
                    else if(a<b){
                        path.add(new PathNode(b, node.index-1));
                    }
//                    else if(a==b){
//                        List<PathNode> newPath = new ArrayList<PathNode>(path);
//                        newPath.add(new PathNode(b, node.index-1));
//                        path.add(new PathNode(a, node.index));
//                        paths.add(newPath);
//                    }
                }
            }
        }
        for(List<PathNode> p : paths){
            System.out.print(p.toString());
            int sum = 0;
            for(PathNode n : p){
                sum+= n.value;
            }
            System.out.print(" - "+sum+"\n");
        }
    }
}
