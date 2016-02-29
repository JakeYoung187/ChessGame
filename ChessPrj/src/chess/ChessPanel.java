package chess;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ChessPanel extends JPanel {
	
	private JButton[][] board;
	//private ChessModel model;
	private JButton cell;
	
	//declare other instance variables
	
	private ButtonListener buttonListener = new ButtonListener();
	
	public ChessPanel() {
		
		//model = new ChessModel();
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(8, 8));
		board = new JButton[8][8];
		
		for(int row = 0; row < 8; row++) {
			for(int col = 0; col < 8; col++) {
//				cell = board[row][col];
				board[row][col] = new JButton("");
				board[row][col].setPreferredSize(new Dimension(150, 150));
				center.add(board[row][col]);
				if(row % 2 == col % 2) {
					board[row][col].setBackground(Color.WHITE);
				}
				else {
					board[row][col].setBackground(Color.BLACK);
				}
			}
		}
		add(center, BorderLayout.CENTER);
		displayBoard();
	}
	
	//method that updates the board
	private void displayBoard() {
		for(int r = 0; r < 8; r++) {
			for(int c = 0; c < 8; c++) {
				
			}
		}
	}
	
	//add other helper methods
	
	//inner class that represents action listener for buttons
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			//complete
		}
	}

}
