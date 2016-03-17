package chess;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class ChessPiece implements IChessPiece {
	
	private Player owner;
	
	protected ChessPiece(Player player) {
		this.owner = player;
	}
	
	public abstract String type();
	
	public Player player() {
		return owner;
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		//check that move is a move
	 	if(move.fromRow == move.toRow 
	 			&& move.fromColumn == move.toColumn){
	 		return false;
	 	}
	 	//check that move is on the board
	 	else if(move.toRow < 0 || move.toRow > 7 
	 			|| move.toColumn < 0 || move.toColumn > 7){
	 		return false;
	 	}
	 	//check that the piece is the right type
	 	else if(!(this.type() 
	 			== board[move.fromRow][move.fromColumn].type())){
	 		return false;
	 	}
	 	//check that there isn't a friendly piece at the destination
	 	else if(this.player() 
	 			== board[move.toRow][move.toColumn].player()){
	 		return false;
	 	}
	 	return true;
	}
}

