package chess;

import java.awt.Panel;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ChessModel implements IChessModel {
	
	private IChessPiece[][] board;
	private Player player;
<<<<<<< HEAD
	private IChessPiece currentPiece;
	
=======
	public IChessPiece currentPiece;
	public IChessPiece[] takenPieces;
	private int i = 0;
	//declare other instance variables as needed
>>>>>>> special
	
	public ChessModel() {
		board = new IChessPiece[8][8];
		takenPieces = new IChessPiece[32];
		player = Player.WHITE;
		
		//-----back row for Black---------//
		board[0][0] = new Rook(Player.BLACK);
		board[0][1] = new Knight(Player.BLACK);
		board[0][2] = new Bishop(Player.BLACK);
		board[0][3] = new Queen(Player.BLACK);
		board[0][4] = new King(Player.BLACK);
		board[0][5] = new Bishop(Player.BLACK);
		board[0][6] = new Knight(Player.BLACK);
		board[0][7] = new Rook(Player.BLACK);
		//---------Black pawns------------//
		board[1][0] = new Pawn(Player.BLACK);
		board[1][1] = new Pawn(Player.BLACK);
		board[1][2] = new Pawn(Player.BLACK);
		board[1][3] = new Pawn(Player.BLACK);
		board[1][4] = new Pawn(Player.BLACK);
		board[1][5] = new Pawn(Player.BLACK);
		board[1][6] = new Pawn(Player.BLACK);
		board[1][7] = new Pawn(Player.BLACK);
		
		//-----back row for White---------//
		board[7][0] = new Rook(Player.WHITE);
		board[7][1] = new Knight(Player.WHITE);
		board[7][2] = new Bishop(Player.WHITE);
		board[7][3] = new Queen(Player.WHITE);
		board[7][4] = new King(Player.WHITE);
		board[7][5] = new Bishop(Player.WHITE);
		board[7][6] = new Knight(Player.WHITE);
		board[7][7] = new Rook(Player.WHITE);
		//---------White pawns------------//
		board[6][0] = new Pawn(Player.WHITE);
		board[6][1] = new Pawn(Player.WHITE);
		board[6][2] = new Pawn(Player.WHITE);
		board[6][3] = new Pawn(Player.WHITE);
		board[6][4] = new Pawn(Player.WHITE);
		board[6][5] = new Pawn(Player.WHITE);
		board[6][6] = new Pawn(Player.WHITE);
		board[6][7] = new Pawn(Player.WHITE);
		
	
	}

	@Override
	public boolean isComplete() {
		return false;
	}

	@Override
	public boolean isValidMove(Move move) {
		if(pieceAt(move.fromRow, move.fromColumn).isValidMove(move, board)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void move(Move move) {
<<<<<<< HEAD
		
		
=======
		if(isValidMove(move)) {
			if(pieceAt(move.toRow, move.toColumn) != null) {
				add(pieceAt(move.toRow, move.toColumn));
				board[Move.toRow][Move.toColumn] = pieceAt(move.fromRow, move.fromColumn);
				board[Move.fromRow][Move.fromColumn] = null;
			}
			board[Move.toRow][Move.toColumn] = pieceAt(move.fromRow, move.fromColumn);
			board[Move.fromRow][Move.fromColumn] = null;
		}
		else {
			JOptionPane.showMessageDialog(null, "Not a valid move.");
		}
		currentPiece = null;
>>>>>>> special
	}

	@Override
	public boolean inCheck(Player p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Player currentPlayer() {
		return player;
	}
	
	public int numRows() {
		return 8;
	}
	
	public int numColumns() {
		return 8;
	}
	
	public IChessPiece pieceAt(int row, int column) {
		return board[row][column];
	}
	
	public void setNextPlayer() {
		player = player.next();
	}
	
	public IChessPiece[] add(IChessPiece x) {
		takenPieces[i] = x;
		return takenPieces;
	}
	
	public void setCurrentPiece(IChessPiece p) {
		currentPiece = p;
	}
	
	public IChessPiece getCurrentPiece() {
		return currentPiece;
	}
	
	//add other public or helper methods as needed

}
