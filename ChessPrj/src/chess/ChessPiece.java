package chess;

public abstract class ChessPiece implements IChessPiece {
	
	private Player owner;
	protected boolean hasMoved;
	
	protected ChessPiece(Player player) {
		this.owner = player;
	}
	
	public abstract String type();
	
	public Player player() {
		//complete this
	}
	
	/**
	 * Determines whether or not a move is legal given the current board state.
	 * All this version of the method does is check to see if a particuular square is
	 * on the board to begin with.
	 * 
	 * @param move the move to be made
	 * @param board the current board state
	 * @return whether or not the square is on the baord
	 */
	public boolean isValidMove(Move move, IChessPiece[][] board) {
	 	return (move.toRow < 0 || move.toRow > 7 || move.toColumn < 0 ||
	 		move.toColumn > 7);
	}
}

