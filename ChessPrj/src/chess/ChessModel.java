package chess;

import javax.swing.JOptionPane;

public class ChessModel implements IChessModel {
	
	private IChessPiece[][] board;
	private Player player;
	private IChessPiece currentPiece;
	
	
	public ChessModel() {
		board = new IChessPiece[8][8];
		
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
		if(inCheck(Player.BLACK) || inCheck(Player.WHITE)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isValidMove(Move move) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void move(Move move) {
		
		
	}

	@Override
	public boolean inCheck(Player p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Player currentPlayer() {
		if(player == Player.BLACK) {
			return Player.BLACK;
		}
		else {
			return Player.WHITE;
		}
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
	
	public boolean squareIsThreatened(int row, int column, Player threatenedBy) {
		for (int r = 0; r < 8; r++) {
			for (int c = 0; c < 8; c++ /*best language*/) {
				if (pieceAt(r, c).isValidMove(move(r, c, row, column),
						board))
					return true;
			}
		}
		return false;
	}
	
	//add other public or helper methods as needed

}
