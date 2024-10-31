import java.util.Objects;

public class Pawn extends Piece {

    public Pawn(String color, int x, int y) {
        super(color, x, y);
        super.setType('P');
    }
    @Override
    public boolean isValidMove(ChessTable chessTable, int newX, int newY) {

        if (newY != this.getY()) {
            return false;
        }
        if (Math.abs(newX - this.getX()) > 1) { //can only move 1 block
            return false;
        }

        return isPathClear(newX, newY, chessTable);
    }

    private boolean isPathClear(int x, int y, ChessTable chessTable) {
        if (x < 0 || x > 7 || y < 0 || y > 7)
            return false;

        if (chessTable.getPiece(x + 1, y) == null)
            return true;
        if (!chessTable.getPiece(x + 1, y).getColor().equals(this.getColor()))
            return true;
        return true;
    }

    @Override
    public String toString() {
        if(this.getColor().equals("white")){
            return "P";
        } else
            return "p";
    }
}
