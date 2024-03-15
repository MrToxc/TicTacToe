import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Square> arr = new ArrayList<>();
    public void playGame(){
    }

    public Game() {
    }

    public List<Square> getArr() {
        return arr;
    }

    public void setArr(List<Square> arr) {
        this.arr = arr;
    }

    public void createGame() {
        for (int i = 0; i < 9; i++) {
            arr.add(new Square());
        }
        arr.get(0).setLocation(Location.A1);
        arr.get(1).setLocation(Location.A2);
        arr.get(2).setLocation(Location.A3);
        arr.get(3).setLocation(Location.B1);
        arr.get(4).setLocation(Location.B2);
        arr.get(5).setLocation(Location.B3);
        arr.get(6).setLocation(Location.C1);
        arr.get(7).setLocation(Location.C2);
        arr.get(8).setLocation(Location.C3);
    }

    public void addX() {

    }
    public void addO() {

    }
}
