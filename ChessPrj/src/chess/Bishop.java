package chess;

public class Bishop extends ChessPiece {
	
	private Player owner;
	
	protected Bishop(Player player) {
		super(player);
		this.owner = player;
	}
	
	public String type(){
		return "Bishop";
	}
	
	public Player player() {
		return owner;
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(super.isValidMove(move, board)) {
			//check that the move is diagonal from the current spot
			if(!(Math.abs(move.fromRow - move.toRow) 
					== Math.abs(move.fromColumn - move.toColumn))){
				return false;
			}
			return true;
		}
		else {
			return false;
		}
	}
}
