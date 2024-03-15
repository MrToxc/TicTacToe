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
    }

    public void addX() {

    }
    public void addO() {

    }
}
