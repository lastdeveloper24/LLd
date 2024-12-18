package Model;

public class Player {
    String name;
    PlayingPiece playingPiece;

    public Player(String name, PlayingPiece playingPiece){
        this.name = name;
        this.playingPiece = playingPiece;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPlayingPiece(PlayingPiece playingPiece){
        this.playingPiece =playingPiece;
    }

    public PlayingPiece getPlayerPiece(){
        return this.playingPiece;
    }
}
