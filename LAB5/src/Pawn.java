import java.util.Objects;

public class Pawn extends Piece {

    public Pawn(String color, int x, int y) {
        super(color, x, y);
        super.setType('P');
    }

    public boolean isValidMove(ChessTable chessTable, int newX, int newY) {
        //pawn can only move on y axis
        if(newX != this.getX()){
            return false;
        }
        if(Math.abs(newY - this.getY()) > 1){ //can only move 1 block
            return false;
        }

        return isPathClear(newX, newY, chessTable);
    }

    private boolean isPathClear(int x, int y, ChessTable chessTable) {
        if (x < 0 || x > 7 || y < 0 || y > 7)
            return false;

        if(chessTable.getPiece(x, y + 1) == null)
            return true;
        if(!chessTable.getPiece(x, y + 1).getColor().equals(this.getColor()))
            return true;
        return true;
    }

    @Override
    public String toString() {
        return "P";
    }
}
