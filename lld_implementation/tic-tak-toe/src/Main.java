import Model.PlayingPiece;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's play the game");
        Tictaktoe tictaktoe = new Tictaktoe();
        System.out.println(tictaktoe.player1.getName());
        System.out.println(tictaktoe.player1.getPlayerPiece().getPlayingPiece());
    }
}