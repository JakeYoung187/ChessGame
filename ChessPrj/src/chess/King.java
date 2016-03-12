package chess;

public class King extends ChessPiece{
  
  // Think there's a way to return a string describing _why_ 
  // the move you're trying to make is illegal? -- Henry
  
  /**
   * Returns whether or not the piece is allowed to make a particular
   * move given the current board state.
   * 
   * @param move the move to be made
   * @param board the board the piece is on
   * @return the legality of the move
   **/
  public boolean isValidMove(Move move, IChessPiece[][] board) {
    if (!super.isValidMove(move, board))
      return false;
    
    boolean vtr = true;
    int toRow = move.toRow;
    int fromRow = move.fromRow;
    int toColumn = move.toColumn;
    int fromColumn = move.fromColumn
    
    if (Math.abs(toRow - fromRow) > 1 || Math.abs(toColumn - fromColumn) > 1)
      vtr = false;
      
    // TODO: Add castling functionality
    /*
    if (!hasMoved && Math.abs(fromColumn - toColumn) == 2 && toRow == fromRow && // Rook logic)
    */
    
    return vtr;
  }
}
