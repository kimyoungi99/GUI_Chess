package chess;

public interface ChessPieceInterface {
	public void setChessPiece(ChessPieceSprite.ChessPieceSpriteType type);
	public void setChessPieceType(ChessPieceSprite.ChessPieceSpriteType type);
	public ChessPieceSprite.ChessPieceSpriteType getChessPieceType();
	public Start.teamNum getTeam();
	public void showWhitePawnPath(int x, int y);
	public void showBlackPawnPath(int x, int y);
	public void showKnightPath(int x, int y);
	public void showKingPath(int x, int y);
	public void showRookPath(int x, int y);
	public void showBishopPath(int x, int y);
	public void showQueenPath(int x, int y);
}
