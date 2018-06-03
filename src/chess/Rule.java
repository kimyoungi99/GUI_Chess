package chess;

import javax.swing.border.EmptyBorder;

public class Rule {
	public void catchPiece(int x, int y) {
		Start.chessboard.board[Start.chessboard.clickedX][Start.chessboard.clickedY].setBorder(new EmptyBorder(0,0,0,0));
		Start.chessboard.board[x][y].remove(Start.chessboard.board[Start.chessboard.clickedX][Start.chessboard.clickedY].temp);
		Start.chessboard.board[x][y].remove(Start.chessboard.board[x][y].temp);
		Start.chessboard.board[x][y].temp = Start.chessboard.board[Start.chessboard.clickedX][Start.chessboard.clickedY].temp;
		Start.chessboard.board[Start.chessboard.clickedX][Start.chessboard.clickedY].remove(Start.chessboard.board[Start.chessboard.clickedX][Start.chessboard.clickedY].temp);
		Start.chessboard.board[Start.chessboard.clickedX][Start.chessboard.clickedY].isOccupied = false;
		Start.chessboard.resetBackground();
		Start.chessboard.board[x][y].add(Start.chessboard.board[x][y].temp);
		Start.chessboard.board[x][y].isOccupied = true;
		Start.chessboard.isClicked = false;
		Start.chessboard.turn++;
	}
	
	public void isCheck(int movedX, int movedy) {
		
		
	}
	
}
