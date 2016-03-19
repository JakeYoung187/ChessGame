package chess;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ChessPanel extends JPanel {
	
	private JButton[][] board;
	private ChessModel model;
	private JButton cell;
	public Move currentMove;
	
	//Images
	private Image bPawn;
	private Image wPawn;
	private Image bRook;
	private Image wRook;
	private Image bKnight;
	private Image wKnight;
	private Image bBishop;
	private Image wBishop;
	private Image bQueen;
	private Image wQueen;
	private Image bKing;
	private Image wKing;
	
	//ImageIcons
	private ImageIcon blackPawn;
	private ImageIcon whitePawn;
	private ImageIcon blackRook;
	private ImageIcon whiteRook;
	private ImageIcon blackKnight;
	private ImageIcon whiteKnight;
	private ImageIcon blackBishop;
	private ImageIcon whiteBishop;
	private ImageIcon blackQueen;
	private ImageIcon whiteQueen;
	private ImageIcon blackKing;
	private ImageIcon whiteKing;
	
	
	//declare other instance variables
	
	public ChessPanel() {
		
		addIcons();
		model = new ChessModel();
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(8, 8));
		add(center, BorderLayout.CENTER);
		board = new JButton[8][8];
		
		for(int row = 0; row < 8; row++) {
			for(int col = 0; col < 8; col++) {
				board[row][col] = new JButton("");
				board[row][col].addMouseListener(listener);
				board[row][col].setPreferredSize(new Dimension(100, 100));
				center.add(board[row][col]);
			}
		}
		displayBoard();
	}
	
	//method that updates the board
	private void displayBoard() {
		for(int r = 0; r < 8; r++) {
			for(int c = 0; c < 8; c++) {
				if(r % 2 == c % 2) {
					board[r][c].setBackground(Color.WHITE);
				}
				else {
					board[r][c].setBackground(Color.GRAY);
				}
				if(model.pieceAt(r, c) != null) {
					if(model.pieceAt(r, c).type() == "Pawn") {
						if(model.pieceAt(r, c).player() == Player.WHITE) {
							board[r][c].setIcon(whitePawn);
						}
						else {
							board[r][c].setIcon(blackPawn);
						}
					}
					if(model.pieceAt(r, c).type() == "Rook") {
						if(model.pieceAt(r, c).player() == Player.WHITE) {
							board[r][c].setIcon(whiteRook);
						}
						else {
							board[r][c].setIcon(blackRook);
						}
					}
					if(model.pieceAt(r, c).type() == "Knight") {
						if(model.pieceAt(r, c).player() == Player.WHITE) {
							board[r][c].setIcon(whiteKnight);
						}
						else {
							board[r][c].setIcon(blackKnight);
						}
					}
					if(model.pieceAt(r, c).type() == "Bishop") {
						if(model.pieceAt(r, c).player() == Player.WHITE) {
							board[r][c].setIcon(whiteBishop);
						}
						else {
							board[r][c].setIcon(blackBishop);
						}
					}
					if(model.pieceAt(r, c).type() == "Queen") {
						if(model.pieceAt(r, c).player() == Player.WHITE) {
							board[r][c].setIcon(whiteQueen);
						}
						else {
							board[r][c].setIcon(blackQueen);
						}
					}
					if(model.pieceAt(r, c).type() == "King") {
						if(model.pieceAt(r, c).player() == Player.WHITE) {
							board[r][c].setIcon(whiteKing);
						}
						else {
							board[r][c].setIcon(blackKing);
						}
					}	
				}
				else {
					board[r][c].setIcon(null);
				}
			}
		}
	}
	
	private void addIcons() {
		try{
			bPawn = ImageIO.read(getClass().getResource("/Resources/blackPawn.png"));
			wPawn = ImageIO.read(getClass().getResource("/Resources/whitePawn.png"));
			bRook = ImageIO.read(getClass().getResource("/Resources/blackRook.png"));
			wRook = ImageIO.read(getClass().getResource("/Resources/whiteRook.png"));
			bKnight = ImageIO.read(getClass().getResource("/Resources/blackKnight.png"));
			wKnight = ImageIO.read(getClass().getResource("/Resources/whiteKnight.png"));
			bBishop = ImageIO.read(getClass().getResource("/Resources/blackBishop.png"));
			wBishop = ImageIO.read(getClass().getResource("/Resources/whiteBishop.png"));
			bQueen = ImageIO.read(getClass().getResource("/Resources/blackQueen.png"));
			wQueen = ImageIO.read(getClass().getResource("/Resources/whiteQueen.png"));
			bKing = ImageIO.read(getClass().getResource("/Resources/blackKing.png"));
			wKing = ImageIO.read(getClass().getResource("/Resources/whiteKing.png"));
			
		} catch (IOException e) {
			System.out.println("5");
		}
		finally {
			
			blackPawn = new ImageIcon(bPawn);
			whitePawn = new ImageIcon(wPawn);
			blackRook = new ImageIcon(bRook);
			whiteRook = new ImageIcon(wRook);
			blackKnight = new ImageIcon(bKnight);
			whiteKnight = new ImageIcon(wKnight);
			blackBishop = new ImageIcon(bBishop);
			whiteBishop = new ImageIcon(wBishop);
			blackQueen = new ImageIcon(bQueen);
			whiteQueen = new ImageIcon(wQueen);
			blackKing = new ImageIcon(bKing);
			whiteKing = new ImageIcon(wKing);
			
			
		}
	}
	
	public void highlight(int x, int y) {
		IChessPiece temp = model.pieceAt(x, y);
		for(int t = 0; t < 8; t++) {
			for(int g = 0; g < 8; g++) {
				currentMove.toRow = t;
				currentMove.toColumn = g;
				if(model.isValidMove(currentMove)) {
					board[t][g].setBackground(Color.GREEN);
				}
			}
		}
	}
	
	//add other helper methods
	
	
		MouseListener listener = new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				//possibly display piece name	
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				for(int a = 0; a < 8; a++) {
					for(int b = 0; b < 8; b++) {
						if(e.getSource() == board[a][b]) {
							if(e.getButton() == MouseEvent.BUTTON1) {
								if(model.pieceAt(a, b) != null) {
									if(model.pieceAt(a, b).player() == model.currentPlayer()) {
										model.setCurrentPiece(model.pieceAt(a, b));
										currentMove.fromRow = a;
										currentMove.fromColumn = b;
									}
									else if(model.pieceAt(a, b).player() != model.currentPlayer()) {
										currentMove.toRow = a;
										currentMove.toColumn = b;
										model.move(currentMove);
										model.setNextPlayer();
									}	
								}
								else {
									currentMove.toRow = a;
									currentMove.toColumn = b;
									model.move(currentMove);
									model.setNextPlayer();
								}
								displayBoard();
							}
							if(e.getButton() == MouseEvent.BUTTON3) {
								if(e.getSource() == board[a][b]) {
									if(model.getCurrentPiece() == null) {
										if(model.pieceAt(a, b) != null) {
											if(model.pieceAt(a, b).player()
													== model.currentPlayer()) {
												currentMove.fromRow = a;
												currentMove.fromColumn = b;
												highlight(a, b);
											}
										}
									}
								}
							}
						}
					}
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		

	}

