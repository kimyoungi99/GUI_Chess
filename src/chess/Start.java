package chess;

public class Start {
	static Chesspan_1 chessboard = new Chesspan_1();
	static Chesspan_2 chessboard2 = new Chesspan_2();

	enum teamNum {
		WHITE, BLACK, RED, GREEN
	}
	
	public static void main(String[] args) {
		ChessUi startUI = new ChessUi();
		chessboard.isClicked = false;

	}
}
