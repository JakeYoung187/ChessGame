package chess;

public class Knight extends ChessPiece {

	private Player owner;
	
	protected ChessPiece(Player player) {
		this.owner = player;
	}
	
	public String type(){
		return "knight";
	}
	
	public Player player() {
		return owner;
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(super.isValidMove())
	 	//checks that the move is either two(2) rows and one(1) column or 
		//two(2) columns and one(1) row
	 	else if( ((Math.abs(move.fromRow - move.toRow) == 2) 
	 			&& (Math.abs(move.fromColumn - move.toColumn) == 1)) 
	 			|| ((Math.abs(move.fromColumn - move.toColumn) == 2) 
	 		 	&& (Math.abs(move.fromRow - move.toRow) == 1)){
	 		return false;
	 	}
	 	return true;
	}
}
