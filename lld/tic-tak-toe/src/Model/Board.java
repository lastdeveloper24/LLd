package Model;

public class Board {
    int x;
    int y;
    int[][] b;
    public Board(int x, int y){
        this.x=x;
        this.y=y;

        b = new int[this.x][this.y];
    }
}
