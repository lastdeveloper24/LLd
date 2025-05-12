package Model;

public class PlayingPiece {
    Piece piece;
    public PlayingPiece(Piece piece){
        this.piece = piece ;
    }

    public void setPlayingPiece(Piece piece){
        this.piece = piece;
    }
    public Piece getPlayingPiece(){
        return this.piece;
    }
}
