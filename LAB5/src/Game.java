import java.util.Objects;
import java.util.Scanner;

public class Game {
    private ChessTable chessTable;
    private String currentPlayer;

    public Game(){
        chessTable = new ChessTable();
        currentPlayer = "white";
        this.chessTable.showTable();
    }

    public void startGame(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Player: " + currentPlayer);
            System.out.print("Please give move input (StX, StY, EndX, EndY): ");
            int startX = scanner.nextInt();
            int startY = scanner.nextInt();
            int endX = scanner.nextInt();
            int endY = scanner.nextInt();
            this.doTurn(startX, startY, endX, endY);
        }
    }

    public void doTurn(int startX, int startY, int endX, int endY){
        Piece piece = chessTable.getPiece(startX, startY);
        if(piece != null && Objects.equals(piece.getColor(), currentPlayer)){
            chessTable.doMove(startX, startY, endX, endY);
            switchTurn();
            this.chessTable.showTable();
        } else{
            System.out.println("INVALID MOVE");
        }
    }

    public void switchTurn(){
        System.out.println("Move made by: " + currentPlayer);
        currentPlayer = Objects.equals(currentPlayer, "white") ? "black" : "white";
    }
}
