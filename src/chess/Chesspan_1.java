package chess;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class Chesspan_1 {
	Move move = new Move();
	Rule rule = new Rule();
	public boolean isClicked;
	public int clickedX;
	public int clickedY;
	public int turn;

	Tile board[][] = new Tile[8][8];
	JFrame frame = new JFrame("Chess");

	ChessPiece[] b_pawn = new ChessPiece[8];
	ChessPiece[] w_pawn = new ChessPiece[8];
	ChessPiece[] b_knight = new ChessPiece[2];
	ChessPiece[] w_knight = new ChessPiece[2];
	ChessPiece[] b_rook = new ChessPiece[2];
	ChessPiece[] w_rook = new ChessPiece[2];
	ChessPiece[] b_bishop = new ChessPiece[2];
	ChessPiece[] w_bishop = new ChessPiece[2];
	ChessPiece b_king = new ChessPiece(Start.teamNum.BLACK);
	ChessPiece w_king = new ChessPiece(Start.teamNum.WHITE);
	ChessPiece b_queen = new ChessPiece(Start.teamNum.BLACK);
	ChessPiece w_queen = new ChessPiece(Start.teamNum.WHITE);

	public Chesspan_1() {

	}

	public void setChessBoard() {
		frame.setLayout(new GridLayout(8, 8));
		ChessBoardGUI_1 gui1 = new ChessBoardGUI_1();
		this.turn = 1;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = new Tile(i, j);
				board[i][j].setLayout(new GridLayout(1, 1));
				board[i][j].setOpaque(true);
				board[i][j].isOccupied = false;
			}
		}
		gui1.setGame();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				frame.add(board[i][j]);
			}
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMinimumSize(new Dimension(900, 900));
		frame.setMaximumSize(new Dimension(900, 900));
		frame.setVisible(true);
	}
	
	public void resetBackground() {
		for(int i = 0; i < 8; i++)
			for(int j = 0; j < 8; j++)
				Start.chessboard.board[i][j].setBackground(Start.chessboard.board[i][j].defaultBackground);
	}
	
	public void movePiece(int x, int y) {
		Start.chessboard.board[Start.chessboard.clickedX][Start.chessboard.clickedY].setBorder(new EmptyBorder(0,0,0,0));
		Start.chessboard.board[x][y].temp = Start.chessboard.board[Start.chessboard.clickedX][Start.chessboard.clickedY].temp;
		Start.chessboard.board[Start.chessboard.clickedX][Start.chessboard.clickedY].remove(Start.chessboard.board[Start.chessboard.clickedX][Start.chessboard.clickedY].temp);
		Start.chessboard.board[Start.chessboard.clickedX][Start.chessboard.clickedY].isOccupied = false;
		Start.chessboard.resetBackground();
		Start.chessboard.board[x][y].add(Start.chessboard.board[x][y].temp);
		Start.chessboard.board[x][y].isOccupied = true;
		Start.chessboard.isClicked = false;
		this.turn++;
	}
}