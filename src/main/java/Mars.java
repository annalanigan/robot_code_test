import java.util.ArrayList;

public class Mars {

    private int x;
    private int y;
    private ArrayList<Integer> inner;
    private ArrayList<ArrayList<Integer>> outer;

    public Mars(int x, int y){
        this.x = x;
        this.y = y;
        this.inner = new ArrayList<Integer>();
        this.outer = new ArrayList<ArrayList<Integer>>();
    }

    public int getSizeOfInner(){
        return inner.size();
    }

    public int getSizeOfOuter(){
        return outer.size();
    }

    public void buildXAxis(){
        int i = 0;
        while (i <= x){
            inner.add(i);
            i++;
        }
    }

    public void buildMars(){
        buildXAxis();
        int i = 0;
        while (i <= y){
            outer.add(inner);
            i++;
        }
    }

}
