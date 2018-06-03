package chess;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class ChessPiece extends ImagePanel implements ChessPieceInterface {

	private static final long serialVersionUID = 1L;
	public int x, y;
	private ChessPieceSprite.ChessPieceSpriteType mytype;
	private Start.teamNum team;
	Border selected = new LineBorder(Color.RED, 3);

	public ChessPiece(Start.teamNum num) {
		this.team = num;
	}

	public void setChessPiece(ChessPieceSprite.ChessPieceSpriteType type) {
		BufferedImage img;
		if(type == ChessPieceSprite.ChessPieceSpriteType.BLACK_PAWN) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_PAWN);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.BLACK_PAWN);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.WHITE_PAWN) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_PAWN);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.WHITE_PAWN);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.BLACK_KING) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_KING);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.BLACK_KING);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.WHITE_KING) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_KING);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.WHITE_KING);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.BLACK_QUEEN) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_QUEEN);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.BLACK_QUEEN);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.WHITE_QUEEN) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_QUEEN);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.WHITE_QUEEN);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.BLACK_KNIGHT) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_KNIGHT);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.BLACK_KNIGHT);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.WHITE_KNIGHT) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_KNIGHT);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.WHITE_KNIGHT);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.BLACK_LOOK) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_LOOK);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.BLACK_LOOK);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.WHITE_LOOK) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_LOOK);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.WHITE_LOOK);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.BLACK_BISHOP) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_BISHOP);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.BLACK_BISHOP);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.WHITE_BISHOP) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_BISHOP);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.WHITE_BISHOP);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.RED_PAWN) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.RED_PAWN);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.RED_PAWN);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.GREEN_PAWN) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.GREEN_PAWN);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.GREEN_PAWN);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.RED_KING) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.RED_KING);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.RED_KING);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.GREEN_KING) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.GREEN_KING);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.GREEN_KING);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.RED_QUEEN) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.RED_QUEEN);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.RED_QUEEN);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.GREEN_QUEEN) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.GREEN_QUEEN);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.GREEN_QUEEN);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.RED_KNIGHT) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.RED_KNIGHT);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.RED_KNIGHT);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.GREEN_KNIGHT) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.GREEN_KNIGHT);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.GREEN_KNIGHT);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.RED_LOOK) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.RED_LOOK);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.RED_LOOK);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.GREEN_LOOK) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.GREEN_LOOK);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.GREEN_LOOK);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.RED_BISHOP) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.RED_BISHOP);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.RED_BISHOP);
		}
		else if(type == ChessPieceSprite.ChessPieceSpriteType.GREEN_BISHOP) {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.GREEN_BISHOP);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.GREEN_BISHOP);
		}
		else {
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.GREEN_BISHOP);
			setChessPieceType(ChessPieceSprite.ChessPieceSpriteType.GREEN_BISHOP);
		}


		this.setImage(img);
		this.setLocation(0, 0);
		this.setOpaque(false);
		this.setLayout(new GridLayout(1, 1));
	}

	public void setChessPieceType(ChessPieceSprite.ChessPieceSpriteType type) {
		mytype = type;
	}

	public ChessPieceSprite.ChessPieceSpriteType getChessPieceType() {
		return mytype;
	}
	
	public Start.teamNum getTeam() {
		return this.team;
	}
	
	public void showWhitePawnPath(int x, int y) {
		Start.chessboard.board[x][y].setBorder(selected);
		if (x == 6) {
			if((!Start.chessboard.board[x - 1][y].isOccupied)) {
				Start.chessboard.board[x - 1][y].setBackground(Color.GREEN);
				if(!Start.chessboard.board[x - 2][y].isOccupied) {
					Start.chessboard.board[x - 2][y].setBackground(Color.GREEN);
				}
			}
		} else if (x > 0) {
			if((!Start.chessboard.board[x - 1][y].isOccupied)) {
				Start.chessboard.board[x - 1][y].setBackground(Color.GREEN);
			}
		}
		if (x - 1 > -1 && y - 1 > -1) {
			if(Start.chessboard.board[x - 1][y - 1].isOccupied)
				if(Start.chessboard.board[x - 1][y - 1].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
					Start.chessboard.board[x - 1][y - 1].setBackground(Color.RED);
		}

		if (x - 1 > -1 && y + 1 < 8) {
			if(Start.chessboard.board[x - 1][y + 1].isOccupied) 
				if(Start.chessboard.board[x - 1][y + 1].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
					Start.chessboard.board[x - 1][y + 1].setBackground(Color.RED);
		} 
	}

	public void showBlackPawnPath(int x, int y) {
		Start.chessboard.board[x][y].setBorder(selected);
		if (x == 1) {
			if((!Start.chessboard.board[x + 1][y].isOccupied)) {
				Start.chessboard.board[x + 1][y].setBackground(Color.GREEN);
				if(!Start.chessboard.board[x + 2][y].isOccupied) {
					Start.chessboard.board[x + 2][y].setBackground(Color.GREEN);
				}
			}
		} 
		else if (x + 1 < 8) {
			if((!Start.chessboard.board[x + 1][y].isOccupied)) {
				Start.chessboard.board[x + 1][y].setBackground(Color.GREEN);
			}
		}
		if (x + 1 < 8 && y + 1 < 8) {
			if(Start.chessboard.board[x + 1][y + 1].isOccupied)
				if(Start.chessboard.board[x + 1][y + 1].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
					Start.chessboard.board[x + 1][y + 1].setBackground(Color.RED);
		}

		if (x + 1 < 8 && y - 1 > -1) {
			if(Start.chessboard.board[x + 1][y - 1].isOccupied) 
				if(Start.chessboard.board[x + 1][y - 1].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
					Start.chessboard.board[x + 1][y - 1].setBackground(Color.RED);
		} 
	}
	
	public void showKnightPath(int x, int y) {
		Start.chessboard.board[x][y].setBorder(selected);
		int[] knightX = {-2, 2, -1, 1};
		int[] knightY = {-1, 1, -2, 2};
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (x + knightX[i] > -1 && x + knightX[i] < 8 && y + knightY[j] > -1 && y + knightY[j] < 8) {
					if (!Start.chessboard.board[x + knightX[i]][y + knightY[j]].isOccupied) {
						Start.chessboard.board[x + knightX[i]][y +knightY[j]].setBackground(Color.GREEN);
					}
					else if(Start.chessboard.board[x][y].temp.getTeam() != Start.chessboard.board[x + knightX[i]][y + knightY[j]].temp.getTeam()) {
						//
						Start.chessboard.board[x + knightX[i]][y + knightY[j]].setBackground(Color.RED);
					}
				}
				if (x + knightX[i + 2] > -1 && x + knightX[i + 2] < 8 && y + knightY[j + 2] > -1 && y + knightY[j + 2] < 8) {
					if (!Start.chessboard.board[x + knightX[i + 2]][y + knightY[j + 2]].isOccupied) {
						Start.chessboard.board[x + knightX[i + 2]][y +knightY[j + 2]].setBackground(Color.GREEN);
					}
					else if(Start.chessboard.board[x][y].temp.getTeam() != Start.chessboard.board[x + knightX[i + 2]][y + knightY[j + 2]].temp.getTeam()){
						//
						Start.chessboard.board[x + knightX[i + 2]][y +knightY[j + 2]].setBackground(Color.RED);
					}
				}
			}
		}
	}
	
	public void showKingPath(int x, int y) {
		Start.chessboard.board[x][y].setBorder(selected);
		int[] kingX = {-1,0,1};
		int[] kingY= {-1,0,1};

		for(int i=0; i<3; i++) {
			int next_X=x+kingX[i];
			for(int j=0; j<3; j++) {
				int next_Y = y+kingY[j];
				if(-1<next_X && next_X<8 && -1<next_Y && next_Y<8 ) {

					if(kingX[i]==0 && kingY[j]==0) {
					}
					else if(!Start.chessboard.board[next_X][next_Y].isOccupied) {
						Start.chessboard.board[next_X][next_Y].setBackground(Color.GREEN);
					}
					else if(Start.chessboard.board[next_X][next_Y].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam()) {
						//
						Start.chessboard.board[next_X][next_Y].setBackground(Color.RED);
					}
				}
			}
		}
	}
	
	public void showRookPath(int x, int y) {
		Start.chessboard.board[x][y].setBorder(selected);
		for(int i = x, j = y; i < 7; i++) {
			if((Start.chessboard.board[i+1][j].isOccupied)) {
				if(Start.chessboard.board[i+1][j].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
					Start.chessboard.board[i+1][j].setBackground(Color.RED);
				break;
			}
			Start.chessboard.board[i+1][j].setBackground(Color.GREEN);
		}
		for(int i = x, j = y; j < 7; j++) {
			if((Start.chessboard.board[i][j+1].isOccupied)) {
				if(Start.chessboard.board[i][j+1].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
					Start.chessboard.board[i][j+1].setBackground(Color.RED);
				break;
			}
			Start.chessboard.board[i][j+1].setBackground(Color.GREEN);
		}
		for(int i = x, j = y; i >= 1; i--) {
			if((Start.chessboard.board[i-1][j].isOccupied)) {
				if(Start.chessboard.board[i-1][j].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
					Start.chessboard.board[i-1][j].setBackground(Color.RED);
				break;
			}
			Start.chessboard.board[i-1][j].setBackground(Color.GREEN);
		}
		for(int i = x, j = y; j >=1; j--) {
			if((Start.chessboard.board[i][j-1].isOccupied)) {
				if(Start.chessboard.board[i][j-1].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
					Start.chessboard.board[i][j-1].setBackground(Color.RED);
				break;
			}
			Start.chessboard.board[i][j-1].setBackground(Color.GREEN);
		} 
	}
	
	public void showBishopPath(int x, int y) {
		Start.chessboard.board[x][y].setBorder(selected);
		for (int i = 1; i < 8; i++) {
			if (x + i < 8 && y + i < 8) {
				if (!Start.chessboard.board[x + i][y + i].isOccupied)
					Start.chessboard.board[x + i][y + i].setBackground(Color.GREEN);
				else {
					if (Start.chessboard.board[x + i][y + i].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
						Start.chessboard.board[x + i][y + i].setBackground(Color.RED);
					break;
				}
			}
			else
				break;
		}      
		for (int i = 1; i < 8; i++) {
			if (x + i < 8 && y - i > -1) {
				if (!Start.chessboard.board[x + i][y - i].isOccupied)
					Start.chessboard.board[x + i][y - i].setBackground(Color.GREEN);
				else {
					if (Start.chessboard.board[x + i][y - i].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
						Start.chessboard.board[x + i][y - i].setBackground(Color.RED);
					break;
				}
			}
			else
				break;
		}         
		for (int i = 1; i < 8; i++) {
			if (x - i > -1 && y + i < 8) {
				if (!Start.chessboard.board[x - i][y + i].isOccupied)
					Start.chessboard.board[x - i][y + i].setBackground(Color.GREEN);
				else {
					if (Start.chessboard.board[x - i][y + i].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
						Start.chessboard.board[x - i][y + i].setBackground(Color.RED);
					break;
				}
			}
			else
				break;
		}  
		for (int i = 1; i < 8; i++) {
			if (x - i > -1 && y - i > -1) {
				if (!Start.chessboard.board[x - i][y - i].isOccupied)
					Start.chessboard.board[x - i][y - i].setBackground(Color.GREEN);
				else {
					if (Start.chessboard.board[x - i][y - i].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
						Start.chessboard.board[x - i][y - i].setBackground(Color.RED);
					break;
				}
			}
			else
				break;
		} 
	}
	
	public void showQueenPath(int x, int y) {
		Start.chessboard.board[x][y].setBorder(selected);
		for (int i = 1; i < 8; i++) {
			if (x + i < 8 && y + i < 8) {
				if (!Start.chessboard.board[x + i][y + i].isOccupied)
					Start.chessboard.board[x + i][y + i].setBackground(Color.GREEN);
				else {
					if (Start.chessboard.board[x + i][y + i].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
						Start.chessboard.board[x + i][y + i].setBackground(Color.RED);
					break;
				}
			}
			else
				break;
		}      
		for (int i = 1; i < 8; i++) {
			if (x + i < 8 && y - i > -1) {
				if (!Start.chessboard.board[x + i][y - i].isOccupied)
					Start.chessboard.board[x + i][y - i].setBackground(Color.GREEN);
				else {
					if (Start.chessboard.board[x + i][y - i].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
						Start.chessboard.board[x + i][y - i].setBackground(Color.RED);
					break;
				}
			}
			else
				break;
		}         
		for (int i = 1; i < 8; i++) {
			if (x - i > -1 && y + i < 8) {
				if (!Start.chessboard.board[x - i][y + i].isOccupied)
					Start.chessboard.board[x - i][y + i].setBackground(Color.GREEN);
				else {
					if (Start.chessboard.board[x - i][y + i].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
						Start.chessboard.board[x - i][y + i].setBackground(Color.RED);
					break;
				}
			}
			else
				break;
		}  
		for (int i = 1; i < 8; i++) {
			if (x - i > -1 && y - i > -1) {
				if (!Start.chessboard.board[x - i][y - i].isOccupied)
					Start.chessboard.board[x - i][y - i].setBackground(Color.GREEN);
				else {
					if (Start.chessboard.board[x - i][y - i].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
						Start.chessboard.board[x - i][y - i].setBackground(Color.RED);
					break;
				}
			}
			else
				break;
		}         
		for(int i = x, j = y; i < 7; i++) {
			if((Start.chessboard.board[i+1][j].isOccupied)) {
				if(Start.chessboard.board[i+1][j].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
					Start.chessboard.board[i+1][j].setBackground(Color.RED);
				break;
			}
			Start.chessboard.board[i+1][j].setBackground(Color.GREEN);
		}
		for(int i = x, j = y; j < 7; j++) {
			if((Start.chessboard.board[i][j+1].isOccupied)) {
				if(Start.chessboard.board[i][j+1].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
					Start.chessboard.board[i][j+1].setBackground(Color.RED);
				break;
			}
			Start.chessboard.board[i][j+1].setBackground(Color.GREEN);
		}
		for(int i = x, j = y; i >= 1; i--) {
			if((Start.chessboard.board[i-1][j].isOccupied)) {
				if(Start.chessboard.board[i-1][j].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
					Start.chessboard.board[i-1][j].setBackground(Color.RED);
				break;
			}
			Start.chessboard.board[i-1][j].setBackground(Color.GREEN);
		}
		for(int i = x, j = y; j >=1; j--) {
			if((Start.chessboard.board[i][j-1].isOccupied)) {
				if(Start.chessboard.board[i][j-1].temp.getTeam() != Start.chessboard.board[x][y].temp.getTeam())
					Start.chessboard.board[i][j-1].setBackground(Color.RED);
				break;
			}
			Start.chessboard.board[i][j-1].setBackground(Color.GREEN);
		} 
	}
}
