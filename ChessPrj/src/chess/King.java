package chess;

public class King extends ChessPiece{
  
  public boolean isValidMove(Move move, IChessPiece[][] board) {
    boolean vtr = true;
    int toRow = move.toRow;
    int fromRow = move.fromRow;
    int toColumn = move.toColumn;
    int fromColumn = move.fromColumn
    
    if (fromRow > toRow - 1 || fromRow < toRow + 2 ||
      fromColumn > toColumn - 1 || fromColumn < toColumn + 2)
      vtr = false;
    return vtr;
  }
}
