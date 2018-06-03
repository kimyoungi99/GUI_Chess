package chess;

import java.awt.Color;
import chess.ChessPieceSprite.ChessPieceSpriteType;

import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Move {

	Border selected = new LineBorder(Color.RED, 3);

	public void notClickedNotEmpty(int x, int y) {
		ChessPieceSpriteType pieceType = Start.chessboard.board[x][y].temp.getChessPieceType();
		if(Start.chessboard.turn % 2 == 1) {
			if (pieceType == ChessPieceSpriteType.WHITE_PAWN) {
				Start.chessboard.board[x][y].temp.showWhitePawnPath(x, y);
			}
			else if (pieceType == ChessPieceSpriteType.WHITE_KNIGHT) {
				Start.chessboard.board[x][y].temp.showKnightPath(x, y);
			} 
			else if(pieceType == ChessPieceSpriteType.WHITE_KING) {
				Start.chessboard.board[x][y].temp.showKingPath(x, y);
			}
			else if(pieceType == ChessPieceSpriteType.WHITE_LOOK) {
				Start.chessboard.board[x][y].temp.showRookPath(x, y);
			}
			else if (pieceType == ChessPieceSprite.ChessPieceSpriteType.WHITE_BISHOP) {
				Start.chessboard.board[x][y].temp.showBishopPath(x, y);
			}
			else if(pieceType == ChessPieceSprite.ChessPieceSpriteType.WHITE_QUEEN) {
				Start.chessboard.board[x][y].temp.showQueenPath(x, y);
			}
			else
				return;
			Start.chessboard.isClicked = true;
			Start.chessboard.clickedX = x;
			Start.chessboard.clickedY = y;
		}
		else {
			if (pieceType == ChessPieceSpriteType.BLACK_PAWN) {
				Start.chessboard.board[x][y].temp.showBlackPawnPath(x, y);
			}
			else if (pieceType == ChessPieceSpriteType.BLACK_KNIGHT) {
				Start.chessboard.board[x][y].temp.showKnightPath(x, y);
			}
			else if(pieceType == ChessPieceSpriteType.BLACK_KING) {
				Start.chessboard.board[x][y].temp.showKingPath(x, y);
			}
			else if(pieceType == ChessPieceSpriteType.BLACK_LOOK) {
				Start.chessboard.board[x][y].temp.showRookPath(x, y);
			}
			else if (pieceType == ChessPieceSprite.ChessPieceSpriteType.BLACK_BISHOP) {
				Start.chessboard.board[x][y].temp.showBishopPath(x, y);
			}
			else if(pieceType == ChessPieceSprite.ChessPieceSpriteType.BLACK_QUEEN) {
				Start.chessboard.board[x][y].temp.showQueenPath(x, y);
			}
			else
				return;
			Start.chessboard.isClicked = true;
			Start.chessboard.clickedX = x;
			Start.chessboard.clickedY = y;
		}
	}


	public void clicked(int x, int y) {
		if (Start.chessboard.board[x][y].getBackground() == Color.GREEN) {
			Start.chessboard.movePiece(x,  y);
		}
		else if (Start.chessboard.board[x][y].getBackground() == Color.RED) {
			Start.chessboard.rule.catchPiece(x, y);
		}
		else {
			Start.chessboard.isClicked = false;
			Start.chessboard.board[Start.chessboard.clickedX][Start.chessboard.clickedY].setBorder(new EmptyBorder(0,0,0,0));
			Start.chessboard.resetBackground();
		}
	}
}

