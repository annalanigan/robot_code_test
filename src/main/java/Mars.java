import java.util.ArrayList;

public class Mars {

    private int x;
    private int y;
    private ArrayList<Integer> inner;

    public Mars(int x, int y){
        this.x = x;
        this.y = y;
        this.inner = new ArrayList<Integer>();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<Integer> getInner() {
        return inner;
    }

    public void setInner(ArrayList<Integer> inner) {
        this.inner = inner;
    }

    public int getSizeOfInner(){
        return inner.size();
    }

    public void buildXAxis(){
        int i = 0;
        while (i <= x){
            inner.add(i);
            i++;
        }
    }

}
