package chess;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/******************************************************************
 * The abstract ChessPiece allows for extensions into the various 
 * needed pieces, King, Queen, Pawn, etc..  
 * @author Logan R. Crowe, Jake Young, Henry McDonough
 *****************************************************************/
public abstract class ChessPiece implements IChessPiece {
	
	/*Player variable that holds this pieces owner*/
	private Player owner;
	
	/*sets the owner variable for this piece*/
	protected ChessPiece(Player player) {
		this.owner = player;
	}
	
	/*holds the a String listing the type of pieces this is*/
	public abstract String type();
	
	/*returns the owner of the current piece*/
	public Player player() {
		return owner;
	}
	
	/*****************************************************************
	 * Returns whether a move is allowed for a generic ChessPiece. 
	 * Extensions of this method will allow for more specific checks. 
	 *****************************************************************/
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
//	 	else if(!(this.type() 
//	 			== board[move.fromRow][move.fromColumn].type())){
//	 		return false;
//	 	}
	 	//check that their isn't a friendly piece at the destination
//	 	else if(this.owner 
//	 			== board[Move.toRow][Move.toColumn].player()){
//	 		return false;
//	 	}
	 	return true;
	}
}

