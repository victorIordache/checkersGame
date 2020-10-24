package checkers.model;

public class MoveResult {

    private MoveType type;

    private Piece piece;

    public Piece getPiece(){
        return piece;
    }

    public MoveType getType(){
        return type;
    }

    public MoveResult(MoveType type){
        this(type, null);
    }

    public MoveResult(MoveType type, Piece piece){
        this.type = type;
        this.piece = piece;
    }
}
