package chess;

public class Bishop extends ChessPiece {
	
	private Player owner;
	
	protected ChessPiece(Player player) {
		this.owner = player;
	}
	
	public String type(){
		return "bishop";
	}
	
	public Player player() {
		return owner;
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(super.isValidMove())
	 	//check that the move is diagonal from the current spot
	 	else if(!Math.abs(move.fromRow - move.toRow) 
	 			== Math.abs(move.fromColumn - move.toColumn)){
	 		return false;
	 	}
	 	return true;
	}
}
