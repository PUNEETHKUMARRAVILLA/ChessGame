// ChessController.java
@RestController
@RequestMapping("/api/chess")
public class ChessController {
    private ChessGame chessGame;

    // Constructor

    @PostMapping("/start")
    public ResponseEntity<String> startGame() {
        // Initialize a new game
        chessGame = new ChessGame();
        return ResponseEntity.ok("New game started.");
    }

    @GetMapping("/board")
    public ResponseEntity<Board> getBoard() {
        // Return the current state of the chessboard
        if (chessGame == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.ok(chessGame.getBoard());
    }

    @PostMapping("/move")
    public ResponseEntity<String> makeMove(@RequestBody MoveRequest moveRequest) {
        // Make a move
        if (chessGame == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Game not started.");
        }
        // Validate move and update game state
        // Assuming MoveRequest contains move details like source position and target position
        boolean validMove = chessGame.makeMove(moveRequest);
        if (validMove) {
            return ResponseEntity.ok("Move successful.");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid move.");
        }
    }

    // Other endpoints for features like check/checkmate, special moves, etc.
}