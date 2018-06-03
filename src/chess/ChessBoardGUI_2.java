package chess;

public class ChessBoardGUI_2 {
	
	public ChessBoardGUI_2() {
		
	}
	
	public void setGame() {
		setPawn();
		setKing();
		setQueen();
		setKnight();
		setRook();
		setBishop();
		
		for(int i = 0; i < 14; i++)
			for(int j = 0; j < 14; j++)
				if(i == 0 || i == 1 || i == 12 || i == 13)
					Start.chessboard2.board2[i][j].isOccupied = true;
	}
	
	public void setPawn() {
		for(int i = 0; i < 8; i++) {
			Start.chessboard2.b_pawn[i] = new ChessPiece(Start.teamNum.BLACK);
		}
		for(int i = 0; i < 8; i++)
			Start.chessboard2.w_pawn[i] = new ChessPiece(Start.teamNum.WHITE);
		
		for(int i = 0; i < 8; i++)
			Start.chessboard2.r_pawn[i] = new ChessPiece(Start.teamNum.RED);
		
		for(int i = 0; i < 8; i++)
			Start.chessboard2.g_pawn[i] = new ChessPiece(Start.teamNum.GREEN);
		
		for(int i = 3; i < 11; i++) {
			Start.chessboard2.board2[1][i].add(Start.chessboard2.b_pawn[i-3]);
			Start.chessboard2.board2[1][i].temp = Start.chessboard2.b_pawn[i-3];
			Start.chessboard2.b_pawn[i-3].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_PAWN);
			Start.chessboard2.b_pawn[i-3].x = 1; Start.chessboard2.b_pawn[i-3].y = i;
		}
		
		for(int i = 3; i < 11; i++) {
			Start.chessboard2.board2[12][i].add(Start.chessboard2.w_pawn[i-3]);
			Start.chessboard2.board2[12][i].temp = Start.chessboard2.w_pawn[i-3];
			Start.chessboard2.w_pawn[i-3].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_PAWN);
			Start.chessboard2.w_pawn[i-3].x = 12; Start.chessboard2.w_pawn[i-3].y = i;
		}
		
		for(int i = 3; i < 11; i++) {
			Start.chessboard2.board2[i][1].add(Start.chessboard2.r_pawn[i-3]);
			Start.chessboard2.board2[i][1].temp = Start.chessboard2.r_pawn[i-3];
			Start.chessboard2.r_pawn[i-3].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.RED_PAWN);
			Start.chessboard2.r_pawn[i-3].x = i; Start.chessboard2.r_pawn[i-3].y = 1;
		}
		
		for(int i = 3; i < 11; i++) {
			Start.chessboard2.board2[i][12].add(Start.chessboard2.g_pawn[i-3]);
			Start.chessboard2.board2[i][12].temp = Start.chessboard2.g_pawn[i-3];
			Start.chessboard2.g_pawn[i-3].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.GREEN_PAWN);
			Start.chessboard2.g_pawn[i-3].x = i; Start.chessboard2.g_pawn[i-3].y = 12;
		}
	}
	
	public void setKing() {
		Start.chessboard2.board2[0][7].add(Start.chessboard2.b_king);
		Start.chessboard2.board2[0][7].temp = Start.chessboard2.b_king;
		Start.chessboard2.b_king.setChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_KING);
		Start.chessboard2.b_king.x = 0; Start.chessboard2.b_king.y = 7;
		
		Start.chessboard2.board2[13][7].add(Start.chessboard2.w_king);
		Start.chessboard2.board2[13][7].temp = Start.chessboard2.w_king;
		Start.chessboard2.w_king.setChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_KING);
		Start.chessboard2.w_king.x = 13; Start.chessboard2.w_king.y = 7;
		
		Start.chessboard2.board2[7][0].add(Start.chessboard2.r_king);
		Start.chessboard2.board2[7][0].temp = Start.chessboard2.r_king;
		Start.chessboard2.r_king.setChessPiece(ChessPieceSprite.ChessPieceSpriteType.RED_KING);
		Start.chessboard2.r_king.x = 7; Start.chessboard2.r_king.y = 0;
		
		Start.chessboard2.board2[7][13].add(Start.chessboard2.g_king);
		Start.chessboard2.board2[7][13].temp = Start.chessboard2.g_king;
		Start.chessboard2.g_king.setChessPiece(ChessPieceSprite.ChessPieceSpriteType.GREEN_KING);
		Start.chessboard2.g_king.x = 7; Start.chessboard2.g_king.y = 13;
		
	}
	
	public void setQueen() {
		Start.chessboard2.board2[0][6].add(Start.chessboard2.b_queen);
		Start.chessboard2.board2[0][6].temp = Start.chessboard2.b_queen;
		Start.chessboard2.b_queen.setChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_QUEEN);
		Start.chessboard2.b_queen.x = 0; Start.chessboard2.b_queen.y = 7;
		
		Start.chessboard2.board2[13][6].add(Start.chessboard2.w_queen);
		Start.chessboard2.board2[13][6].temp = Start.chessboard2.w_queen;
		Start.chessboard2.w_queen.setChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_QUEEN);
		Start.chessboard2.w_queen.x = 13; Start.chessboard2.w_queen.y =6;
		
		Start.chessboard2.board2[6][0].add(Start.chessboard2.r_queen);
		Start.chessboard2.board2[6][0].temp = Start.chessboard2.r_queen;
		Start.chessboard2.r_queen.setChessPiece(ChessPieceSprite.ChessPieceSpriteType.RED_QUEEN);
		Start.chessboard2.r_queen.x = 6; Start.chessboard2.r_queen.y = 0;
		
		Start.chessboard2.board2[6][13].add(Start.chessboard2.g_queen);
		Start.chessboard2.board2[6][13].temp = Start.chessboard2.g_queen;
		Start.chessboard2.g_queen.setChessPiece(ChessPieceSprite.ChessPieceSpriteType.GREEN_QUEEN);
		Start.chessboard2.g_queen.x = 6; Start.chessboard2.g_queen.y = 13;
		
	}
	
	public void setKnight() {
		for(int i = 0; i < 2; i++)
			Start.chessboard2.b_knight[i] = new ChessPiece(Start.teamNum.BLACK);
		for(int i = 0; i < 2; i++)
			Start.chessboard2.w_knight[i] = new ChessPiece(Start.teamNum.WHITE);
		
		for(int i = 0; i < 2; i++)
			Start.chessboard2.r_knight[i] = new ChessPiece(Start.teamNum.RED);
		
		for(int i = 0; i < 2; i++)
			Start.chessboard2.g_knight[i] = new ChessPiece(Start.teamNum.GREEN);
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard2.board2[0][4 + i * 5].add(Start.chessboard2.b_knight[i]);
			Start.chessboard2.board2[0][4 + i * 5].temp = Start.chessboard2.b_knight[i];
			Start.chessboard2.b_knight[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_KNIGHT);
			Start.chessboard2.b_knight[i].x = 0; Start.chessboard2.b_knight[i].y = 4 + i * 5;
		}
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard2.board2[13][4 + i * 5].add(Start.chessboard2.w_knight[i]);
			Start.chessboard2.board2[13][4 + i * 5].temp = Start.chessboard2.w_knight[i];
			Start.chessboard2.w_knight[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_KNIGHT);
			Start.chessboard2.w_knight[i].x = 13; Start.chessboard2.w_knight[i].y = 4 + i * 5;
		}
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard2.board2[4 + i * 5][0].add(Start.chessboard2.r_knight[i]);
			Start.chessboard2.board2[4 + i * 5][0].temp = Start.chessboard2.r_knight[i];
			Start.chessboard2.r_knight[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.RED_KNIGHT);
			Start.chessboard2.r_knight[i].x = 4 + i * 5; Start.chessboard2.r_knight[i].y = 0;
		}
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard2.board2[4 + i * 5][13].add(Start.chessboard2.g_knight[i]);
			Start.chessboard2.board2[4 + i * 5][13].temp = Start.chessboard2.g_knight[i];
			Start.chessboard2.g_knight[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.GREEN_KNIGHT);
			Start.chessboard2.g_knight[i].x = 4 + i * 5; Start.chessboard2.g_knight[i].y = 13;
		}
	}
	
	public void setRook() {
		for(int i = 0; i < 2; i++)
			Start.chessboard2.b_rook[i] = new ChessPiece(Start.teamNum.BLACK);
		for(int i = 0; i < 2; i++)
			Start.chessboard2.w_rook[i] = new ChessPiece(Start.teamNum.WHITE);
		for(int i = 0; i < 2; i++)
			Start.chessboard2.r_rook[i] = new ChessPiece(Start.teamNum.RED);
		for(int i = 0; i < 2; i++)
			Start.chessboard2.g_rook[i] = new ChessPiece(Start.teamNum.GREEN);
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard2.board2[0][3 + i * 7].add(Start.chessboard2.b_rook[i]);
			Start.chessboard2.board2[0][3 + i * 7].temp = Start.chessboard2.b_rook[i];
			Start.chessboard2.b_rook[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_LOOK);
			Start.chessboard2.b_rook[i].x = 0; Start.chessboard2.b_rook[i].y = 3 + i * 7;
		}
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard2.board2[13][3 + i * 7].add(Start.chessboard2.w_rook[i]);
			Start.chessboard2.board2[13][3 + i * 7].temp = Start.chessboard2.w_rook[i];
			Start.chessboard2.w_rook[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_LOOK);
			Start.chessboard2.w_rook[i].x = 13; Start.chessboard2.w_rook[i].y = 3 + i * 7;
		}
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard2.board2[3 + i * 7][0].add(Start.chessboard2.r_rook[i]);
			Start.chessboard2.board2[3 + i * 7][0].temp = Start.chessboard2.r_rook[i];
			Start.chessboard2.r_rook[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.RED_LOOK);
			Start.chessboard2.r_rook[i].x = 3 + i * 7; Start.chessboard2.r_rook[i].y =0;
		}
		for(int i = 0; i < 2; i++) {
			Start.chessboard2.board2[3 + i * 7][13].add(Start.chessboard2.g_rook[i]);
			Start.chessboard2.board2[3 + i * 7][13].temp = Start.chessboard2.g_rook[i];
			Start.chessboard2.g_rook[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.GREEN_LOOK);
			Start.chessboard2.g_rook[i].x = 3 + i * 7; Start.chessboard2.g_rook[i].y =13;
		}
		
	}
	
	public void setBishop() {
		for(int i = 0; i < 2; i++)
			Start.chessboard2.b_bishop[i] = new ChessPiece(Start.teamNum.BLACK);
		for(int i = 0; i < 2; i++)
			Start.chessboard2.w_bishop[i] = new ChessPiece(Start.teamNum.WHITE);
		for(int i = 0; i < 2; i++)
			Start.chessboard2.r_bishop[i] = new ChessPiece(Start.teamNum.RED);
		for(int i = 0; i < 2; i++)
			Start.chessboard2.g_bishop[i] = new ChessPiece(Start.teamNum.GREEN);
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard2.board2[0][5 + i * 3].add(Start.chessboard2.b_bishop[i]);
			Start.chessboard2.board2[0][5 + i * 3].temp = Start.chessboard2.b_bishop[i];
			Start.chessboard2.b_bishop[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_BISHOP);
			Start.chessboard2.b_bishop[i].x = 0; Start.chessboard2.b_bishop[i].y = 5 + i * 3;
		}
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard2.board2[13][5 + i * 3].add(Start.chessboard2.w_bishop[i]);
			Start.chessboard2.board2[13][5 + i * 3].temp = Start.chessboard2.w_bishop[i];
			Start.chessboard2.w_bishop[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_BISHOP);
			Start.chessboard2.w_bishop[i].x = 13; Start.chessboard2.w_bishop[i].y = 5 + i * 3;
		}
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard2.board2[5 + i * 3][0].add(Start.chessboard2.r_bishop[i]);
			Start.chessboard2.board2[5 + i * 3][0].temp = Start.chessboard2.r_bishop[i];
			Start.chessboard2.r_bishop[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.RED_BISHOP);
			Start.chessboard2.r_bishop[i].x = 5 + i * 3; Start.chessboard2.r_bishop[i].y = 0;
		}
		
		for(int i = 0; i < 2; i++) {
			Start.chessboard2.board2[5 + i * 3][13].add(Start.chessboard2.g_bishop[i]);
			Start.chessboard2.board2[5 + i * 3][13].temp = Start.chessboard2.g_bishop[i];
			Start.chessboard2.g_bishop[i].setChessPiece(ChessPieceSprite.ChessPieceSpriteType.GREEN_BISHOP);
			Start.chessboard2.g_bishop[i].x = 5 + i * 3; Start.chessboard2.g_bishop[i].y = 13;
		}
	}
	
}

