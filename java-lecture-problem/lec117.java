public class lec117 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        q.area();
    }
}

interface ChessPlayer{
    void moves();
}
interface MovingArea{
    void area();
}
class Queen implements ChessPlayer, MovingArea{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all four directions)");
    }

    public void area(){
        System.out.println("can only move in 8X8 area");
    }

}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class king implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right diagonal - (by one step)");
    }
}