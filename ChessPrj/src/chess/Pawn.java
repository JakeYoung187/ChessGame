package chess;

public class Pawn extends ChessPiece {
	
	private Player owner;
	private boolean hasMoved;
	
	protected ChessPiece(Player player) {
		this.owner = player;
	}
	
	public String type(){
		return "pawn";
	}
	
	public Player player() {
		return owner;
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(super.isValidMove())
			
		//check for attack move	
		if((move.toRow - move.fromRow == 1) 
				&& (Math.abs(move.toColumn - move.fromColumn) == 1)){
			//check that space isn't empty
			if((board[move.toRow][move.toColumn].type() == null){
				return false;
			}
			hasMoved = true;
			return true;
		}
		//check that this isn't the first move	
		else if(hasMoved == true){
	 		//is the move only a single space
	 		//NOTE - add check for foward only
	 		if(!(Math.abs(move.fromRow - move.toRow) == 1) 
	 				|| !(move.fromColumn == move.toColumn){
	 			return false;
	 		}
	 	}
		//check that first move is correct
	 	else if (!(Math.abs(move.fromRow - move.toRow) == 2) 
	 				|| !(move.fromColumn == move.toColumn){
	 		return false;
	 	}
	 	hasMoved = true;
	 	return true;
	}
}
