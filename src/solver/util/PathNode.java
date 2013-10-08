package solver.util;

/**
 * User: samuelpayeur
 * Date: 10/4/13
 * Time: 5:14 PM
 */
public class PathNode {
    public Integer value;
    public Integer index;

    public PathNode(int value, int index){
        this.value = value;
        this.index = index;
    }

    public String toString(){
        return value+"";
    }
}
