import java.util.Objects;

public class King extends Piece {

    public King(String color, int x, int y) {
        super(color, x, y);
        super.setType('X');
    }

    public boolean isValidMove(ChessTable chessTable, int newX, int newY) {

        // Check if path is clear
        if (isPathClear(newX, newY, chessTable)) {
            Piece dest = chessTable.getPiece(newX, newY);
            //king can move 1 up 1 down 1 left or 1 right
            if (!(Math.abs(newX - this.getX()) > 1 || newX == this.getX())) {
                return true;
            }
            if (!(Math.abs(newY - this.getY()) > 1 || newY == this.getY())) {
                return true;
            }
            if (!(Math.abs(newX - this.getX()) + Math.abs(newY - this.getY()) != 1)) {
                //difference on x + difference on y can't be bigger (or lower) than 1
                return true;
            }
        }
        return false;
    }

    private boolean isPathClear(int x, int y, ChessTable chessTable) {
        if (x < 0 || x > 7 || x < 0 || x > 7)
            return false;
        if (chessTable.getPiece(x, y) != null || chessTable.getPiece(x, y).getColor().equals(this.getColor())) {
            //if it isnt open space or piece of opposite color, false
            return false;
        }

        return true;
    }
    @Override
    public String toString() {
        if(this.getColor().equals("white")){
            return "X";
        } else
            return "x";
    }
}
