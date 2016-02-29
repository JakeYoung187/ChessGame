package chess;

public abstract class ChessPiece implements IChessPiece {
	
	private Player owner;
	
	protected ChessPiece(Player player) {
		this.owner = player;
	}
	
	public abstract String type();
	
	public Player player() {
		//complete this
	}
	
	public boolean isValidMove(Move move, IChess Piece[][] board) {
		//complete this
	}
}
