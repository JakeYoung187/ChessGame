package chess;

/******************************************************************
 * The specific variations to ChessPiece that make a Rook.  
 * @author Logan R. Crowe, Jake Young, Henry McDonough
 *****************************************************************/
public class Rook extends ChessPiece {
	
	protected Rook(Player player) {
		super(player);
		this.owner = player;
	}

	private Player owner;
	
	
	
	public String type(){
		return "Rook";
	}
	
	public Player player() {
		return owner;
	}
	
	/*****************************************************************
	 * Returns whether a move is allowed for a Rook
	 *****************************************************************/
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(super.isValidMove(move, board)) {
			if(!(move.fromRow == move.toRow 
					|| move.fromColumn == move.toColumn)){
				return false;
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
}
