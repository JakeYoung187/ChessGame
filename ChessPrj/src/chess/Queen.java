package chess;

/******************************************************************
 * The specific variations to ChessPiece that make a Queen.  
 * @author Logan R. Crowe, Jake Young, Henry McDonough
 *****************************************************************/
public class Queen extends ChessPiece {
	
	private Player owner;

	protected Queen(Player player) {
		super(player);
		this.owner = player;
	}

	public String type(){
		return "Queen";
	}
	
	public Player player() {
		return owner;
	}
	
	/*****************************************************************
	 * Returns whether a move is allowed for a Queen
	 *****************************************************************/
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(super.isValidMove(move, board)) {
			if(!(Math.abs(move.fromRow - move.toRow) 
					== Math.abs(move.fromColumn - move.toColumn))) {
				if(!(Math.abs(move.fromRow - move.toRow) 
						== Math.abs(move.fromColumn - move.toColumn))) {
					return false;
				}
			}
		}
		return true;
	}

}
