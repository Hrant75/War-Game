package etc;

/**
 * Created by Hrant on 29.03.2017.
 */
public class Coordinates {
    private int x;
    private int y;

    public Coordinates(){}

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
