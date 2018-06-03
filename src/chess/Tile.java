package chess;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLayeredPane;

public class Tile extends JLayeredPane{
	private static final long serialVersionUID = 1L;
	public int x, y;
	public boolean isOccupied;
	public ChessPiece temp;
	public Color defaultBackground;

	Tile(int i, int j) {
		x = i;
		y = j;
		setPreferredSize(new Dimension(80, 80));
		setBackground((i + j) % 2 == 0 ? Color.WHITE : Color.GRAY);
		defaultBackground = ((i + j) % 2 == 0 ? Color.WHITE : Color.GRAY);
		addMouseListener(new MouseAdapter() {
			boolean clicked = false;
			@Override
			public void mousePressed(MouseEvent e) {
				clicked = !clicked;
				if(clicked && !Start.chessboard.isClicked && isOccupied) {
					Start.chessboard.move.notClickedNotEmpty(i, j);
				}
				else if(clicked && Start.chessboard.isClicked) {
					Start.chessboard.move.clicked(i, j);
				}
			}
			
			public void mouseClicked(MouseEvent e) {
				clicked = !clicked;
				if(clicked && !Start.chessboard.isClicked && isOccupied) {
					Start.chessboard.move.notClickedNotEmpty(i, j);
				}
				else if(clicked && Start.chessboard.isClicked) {
					Start.chessboard.move.clicked(i, j);
				}
			}
			

			public void mouseReleased(MouseEvent e) {
				
			}
		});
	}
}
