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
    boolean vtr = true;
    int toRow = move.toRow;
    int fromRow = move.fromRow;
    int toColumn = move.toColumn;
    int fromColumn = move.fromColumn
    
    if (toRow < 0 || toRow > 7 || toColumn < 0 || toColumn > 7)
      vtr = false;
    
    if (fromRow > toRow - 1 || fromRow < toRow + 2 ||
      fromColumn > toColumn - 1 || fromColumn < toColumn + 2)
      vtr = false;
    return vtr;
  }
}
