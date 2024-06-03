// Piece.java
public class Piece {
    private PieceType type;
    private PieceColor color;

    public Piece(PieceType type, PieceColor color) {
        this.type = type;
        this.color = color;
    }

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }

    public PieceColor getColor() {
        return color;
    }

    public void setColor(PieceColor color) {
        this.color = color;
    }
}

// Board.java
public class Board {
    private Piece[][] grid;

    public Board() {
        // Initialize the grid with pieces in starting positions
        this.grid = new Piece[8][8];
        // Populate the grid with pieces
    }

    // Methods to initialize the board, move pieces, check for check/checkmate, etc.

    public Piece[][] getGrid() {
        return grid;
    }

    public void setGrid(Piece[][] grid) {
        this.grid = grid;
    }
}

// ChessGame.java
public class ChessGame {
    private Board board;
    private PieceColor currentTurn;

    public ChessGame() {
        this.board = new Board();
        this.currentTurn = PieceColor.WHITE; // Assuming white starts first
    }

    // Methods to start the game, make moves, check game status, etc.

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public PieceColor getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(PieceColor currentTurn) {
        this.currentTurn = currentTurn;
    }
}