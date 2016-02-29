package chess;

public class ChessModel implements IChessModel {
	
	private IChessPiece[][] board;
	private Player player;
	//declare other instance variables as needed
	
	public ChessModel() {
		//complete this
	}

	@Override
	public boolean isComplete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValidMove(Move move) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void move(Move move) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean inCheck(Player p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Player currentPlayer() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int numRows() {
		//complete this
		return 0;
	}
	
	public int numColumns() {
		//complete this
		return 0;
	}
	
	public IChessPiece pieceAt(int row, int column) {
		//complete
		return null;
	}
	
	//add other public or helper methods as needed

}
