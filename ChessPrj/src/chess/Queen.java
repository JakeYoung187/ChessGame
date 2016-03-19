package chess;

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
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(super.isValidMove(move, board)) {
			if(!(Math.abs(move.fromRow - move.toRow) 
					== Math.abs(move.fromColumn - move.toColumn))) {
				if(!(move.fromRow == move.toRow 
						|| move.fromColumn == move.toColumn)) {
					return false;
				}
			}
		}
		return true;
	}

}
