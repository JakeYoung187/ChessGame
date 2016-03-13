package chess;

public class Rook extends ChessPiece {
	
	private Player owner;
	
	protected ChessPiece(Player player) {
		this.owner = player;
	}
	
	public String type(){
		return "rook";
	}
	
	public Player player() {
		return owner;
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(super.isValidMove())
	 	//check that the row or column stays the same
	 	else if(!(move.fromRow == move.toRow 
	 			|| move.fromColumn == move.toColumn){
	 		return false;
	 	}
	 	return true;
	}
}
