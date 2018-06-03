package chess;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Chesspan_2 {
	Move move = new Move();
	public boolean isClicked;
	public int clickedX;
	public int clickedY;

	Tile board2[][] = new Tile[14][14];
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
	ChessPiece b_queen = new ChessPiece(Start.teamNum.RED);
	ChessPiece w_queen = new ChessPiece(Start.teamNum.GREEN);
	
	
	ChessPiece[] r_pawn = new ChessPiece[8];
	ChessPiece[] g_pawn = new ChessPiece[8];
	ChessPiece[] r_knight = new ChessPiece[2];
	ChessPiece[] g_knight = new ChessPiece[2];
	ChessPiece[] r_rook = new ChessPiece[2];
	ChessPiece[] g_rook = new ChessPiece[2];
	ChessPiece[] r_bishop = new ChessPiece[2];
	ChessPiece[] g_bishop = new ChessPiece[2];
	ChessPiece r_king = new ChessPiece(Start.teamNum.BLACK);
	ChessPiece g_king = new ChessPiece(Start.teamNum.WHITE);
	ChessPiece r_queen = new ChessPiece(Start.teamNum.RED);
	ChessPiece g_queen = new ChessPiece(Start.teamNum.GREEN);


	public Chesspan_2() {

	}

	public void setChessBoard() {
		frame.setLayout(new GridLayout(14, 14));
		ChessBoardGUI_2 gui2 = new ChessBoardGUI_2();

		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 14; j++) {
				board2[i][j] = new Tile(i, j);
				board2[i][j].setLayout(new GridLayout(1, 1));
				board2[i][j].setOpaque(true);
				board2[i][j].isOccupied = false;
			}
		}
		gui2.setGame();

		for (int i = 0; i < 14; i++) {

			for (int j = 0; j < 14; j++) {
				if((0<=i && i<=2) || (11<=i && i<=13)){
					if((0<=j && j<=2) || (11<=j && j<=13)) {
						frame.add(new JPanel());
					}
					else
						frame.add(board2[i][j]);
				}
				else
					frame.add(board2[i][j]);
			}
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMinimumSize(new Dimension(900, 900));
		frame.setMaximumSize(new Dimension(900, 900));
		frame.setVisible(true);
	}

	public void resetBackground() {
		for(int i = 0; i < 14; i++)
			for(int j = 0; j < 14; j++)
				Start.chessboard2.board2[i][j].setBackground(Start.chessboard2.board2[i][j].defaultBackground);
	}

	public void movePiece(int x, int y) {
		Start.chessboard2.board2[Start.chessboard2.clickedX][Start.chessboard2.clickedY].setBorder(new EmptyBorder(0,0,0,0));
		Start.chessboard2.board2[x][y].temp = Start.chessboard2.board2[Start.chessboard2.clickedX][Start.chessboard2.clickedY].temp;
		Start.chessboard2.board2[Start.chessboard2.clickedX][Start.chessboard2.clickedY].remove(Start.chessboard2.board2[Start.chessboard2.clickedX][Start.chessboard2.clickedY].temp);
		Start.chessboard2.board2[Start.chessboard2.clickedX][Start.chessboard2.clickedY].isOccupied = false;
		Start.chessboard2.resetBackground();
		Start.chessboard2.board2[x][y].add(Start.chessboard2.board2[x][y].temp);
		Start.chessboard2.board2[x][y].isOccupied = true;
		Start.chessboard2.isClicked = false;
	}

}
