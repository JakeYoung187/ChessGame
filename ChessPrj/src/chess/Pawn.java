package chess;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Pawn extends ChessPiece {
	
	private Player owner;
	private boolean hasMoved;
	
	
	protected Pawn(Player player) {
		super(player);
		this.owner = player;
	}
	
	public String type(){
		return "Pawn";
	}
	
	public Player player() {
		return owner;
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(super.isValidMove(move, board)) {
			if(hasMoved == true) {
				if(Math.abs(move.fromRow - move.toRow) == 1 
						&& move.fromColumn == move.toColumn) {
					return true;
				}
				return false;
			}
			else if(Math.abs(move.toRow - move.fromRow) < 3 
					&& move.fromColumn == move.toColumn) {
				hasMoved = true;
				return true;
			}
			else if((move.toRow - move.fromRow == 1) 
					&& (Math.abs(move.toColumn - move.fromColumn) == 1)) {
				if(board[move.toRow][move.toColumn].type() != null) {
					hasMoved = true;
					return true;
				}
				return false;
			}
		}
		return false;
	}
}
