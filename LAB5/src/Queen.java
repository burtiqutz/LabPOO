import java.util.Objects;

public class Queen extends Piece {

    public Queen(String color, int x, int y) {
        super(color, x, y);
        super.setType('Q');
    }

    public boolean isValidMove(ChessTable chessTable, int newX, int newY) {
        if (newX < 0 || newX > 7 || newY < 0 || newY > 7)
            return false;

        if (true) {
            // Check if path is clear
            if (isPathClear(newX, newY, chessTable)) {
                Piece dest = chessTable.getPiece(newX, newY);
                if(dest == null || !Objects.equals(chessTable.getPiece(newX, newY).getColor(), this.getColor())){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isPathClear(int x, int y, ChessTable chessTable) {

        return true;
    }
    @Override
    public String toString() {
        return "Q";
    }
}
