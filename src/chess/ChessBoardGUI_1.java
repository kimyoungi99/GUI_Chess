package chess;

public class ChessBoardGUI_1 {
	
	public ChessBoardGUI_1() {
		
	}
	
	public void setGame() {
		setPawn();
		setKing();
		setQueen();
		setKnight();
		setRook();
		setBishop();
		
		for(int i = 0; i < 8; i++)
			for(int j = 0; j < 8; j++)
				if(i == 0 || i == 1 || i == 6 || i == 7)
					Start.chessboard.board[i][j].isOccupied = true;
	}
	
	public void setPawn() {
		for(int i = 0; i < 8; i++)
			Start.chessboard.b_pawn[i] = new ChessPiece(Start.teamNum.BLACK);
		for(int i = 0; i < 8; i++)
			Start.chessboard.w_pawn[i] = new ChessPiece(Start.teamNum.WHITE);
		
		for(int i = 0; i < 8; i++) {
			Start.chessboard.board[1][i].add(Start.chessboard.b_pawn[i]);
			Start.chessboard.board[1][i].temp = Start.chessboard.b_pawn[i];
			Start.chessboard.b_pawn[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_PAWN);
			Start.chessboard.b_pawn[i].x = 1; Start.chessboard.b_pawn[i].y = i;
		}
		
		for(int i = 0; i < 8; i++) {
			Start.chessboard.board[6][i].add(Start.chessboard.w_pawn[i]);
			Start.chessboard.board[6][i].temp = Start.chessboard.w_pawn[i];
			Start.chessboard.w_pawn[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_PAWN);
			Start.chessboard.w_pawn[i].x = 6; Start.chessboard.w_pawn[i].y = i;
		}
	}
	
	public void setKing() {
		Start.chessboard.board[0][4].add(Start.chessboard.b_king);
		Start.chessboard.board[0][4].temp = Start.chessboard.b_king;
		Start.chessboard.b_king.setChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_KING);
		Start.chessboard.b_king.x = 0; Start.chessboard.b_king.y = 3;
		
		Start.chessboard.board[7][4].add(Start.chessboard.w_king);
		Start.chessboard.board[7][4].temp = Start.chessboard.w_king;
		Start.chessboard.w_king.setChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_KING);
		Start.chessboard.w_king.x = 7; Start.chessboard.w_king.y = 4;
	}
	
	public void setQueen() {
		Start.chessboard.board[0][3].add(Start.chessboard.b_queen);
		Start.chessboard.board[0][3].temp = Start.chessboard.b_queen;
		Start.chessboard.b_queen.setChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_QUEEN);
		Start.chessboard.b_queen.x = 0; Start.chessboard.b_queen.y = 4;
		
		Start.chessboard.board[7][3].add(Start.chessboard.w_queen);
		Start.chessboard.board[7][3].temp = Start.chessboard.w_queen;
		Start.chessboard.w_queen.setChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_QUEEN);
		Start.chessboard.w_queen.x = 7; Start.chessboard.w_queen.y =3;
	}
	
	public void setKnight() {
		for(int i = 0; i < 2; i++)
			Start.chessboard.b_knight[i] = new ChessPiece(Start.teamNum.BLACK);
		for(int i = 0; i < 2; i++)
			Start.chessboard.w_knight[i] = new ChessPiece(Start.teamNum.WHITE);
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard.board[0][1 + i * 5].add(Start.chessboard.b_knight[i]);
			Start.chessboard.board[0][1 + i * 5].temp = Start.chessboard.b_knight[i];
			Start.chessboard.b_knight[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_KNIGHT);
			Start.chessboard.b_knight[i].x = 0; Start.chessboard.b_knight[i].y = 1 + i * 5;
		}
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard.board[7][1 + i * 5].add(Start.chessboard.w_knight[i]);
			Start.chessboard.board[7][1 + i * 5].temp = Start.chessboard.w_knight[i];
			Start.chessboard.w_knight[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_KNIGHT);
			Start.chessboard.w_knight[i].x = 7; Start.chessboard.w_knight[i].y = 1 + i * 5;
		}
	}
	
	public void setRook() {
		for(int i = 0; i < 2; i++)
			Start.chessboard.b_rook[i] = new ChessPiece(Start.teamNum.BLACK);
		for(int i = 0; i < 2; i++)
			Start.chessboard.w_rook[i] = new ChessPiece(Start.teamNum.WHITE);
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard.board[0][0 + i * 7].add(Start.chessboard.b_rook[i]);
			Start.chessboard.board[0][0 + i * 7].temp = Start.chessboard.b_rook[i];
			Start.chessboard.b_rook[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_LOOK);
			Start.chessboard.b_rook[i].x = 0; Start.chessboard.b_rook[i].y = 0 + i * 7;
		}
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard.board[7][0 + i * 7].add(Start.chessboard.w_rook[i]);
			Start.chessboard.board[7][0 + i * 7].temp = Start.chessboard.w_rook[i];
			Start.chessboard.w_rook[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_LOOK);
			Start.chessboard.w_rook[i].x = 7; Start.chessboard.w_rook[i].y = 0 + i * 7;
		}
	}
	
	public void setBishop() {
		for(int i = 0; i < 2; i++)
			Start.chessboard.b_bishop[i] = new ChessPiece(Start.teamNum.BLACK);
		for(int i = 0; i < 2; i++)
			Start.chessboard.w_bishop[i] = new ChessPiece(Start.teamNum.WHITE);
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard.board[0][2 + i * 3].add(Start.chessboard.b_bishop[i]);
			Start.chessboard.board[0][2 + i * 3].temp = Start.chessboard.b_bishop[i];
			Start.chessboard.b_bishop[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_BISHOP);
			Start.chessboard.b_bishop[i].x = 0; Start.chessboard.b_bishop[i].y = 2 + i * 3;
		}
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard.board[7][2 + i * 3].add(Start.chessboard.w_bishop[i]);
			Start.chessboard.board[7][2 + i * 3].temp = Start.chessboard.w_bishop[i];
			Start.chessboard.w_bishop[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_BISHOP);
			Start.chessboard.w_bishop[i].x = 7; Start.chessboard.w_bishop[i].y = 2 + i * 3;
		}
	}
}

