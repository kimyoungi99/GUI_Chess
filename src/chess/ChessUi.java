package chess;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ChessUi extends JFrame {
	
	private static final long serialVersionUID = 1L;

	/*
   private Image screenImage;
   private Graphics screenGraphic;
   private Image Background = new ImageIcon(Main.class.getResource("cau.jpg")).getImage();

     public void paint(Graphics g) {
         screenImage = createImage(450,300);
         screenGraphic = screenImage.getGraphics();
         screenDraw(screenGraphic);
         g.drawImage(screenImage,0,0,null);
      }
      public void screenDraw(Graphics g) {
         g.drawImage(Background,0,0,null);
         this.repaint();
      }
	 */

	public ChessUi() {
		
		try {
			this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("chess.jpeg")))));
		} catch (IOException e) {
			e.printStackTrace();
		}

		setTitle("Chess");
		setSize(450, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(Color.WHITE);
		
		/*
		JLabel label = new JLabel();
		label.setText("Chess");
		label.setFont(label.getFont().deriveFont(35.0f));
		label.setForeground(Color.DARK_GRAY);

		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label);
		
		jbtSingle.setBorderPainted(false);
		jbtDuo.setBorderPainted(false);
		jbtExit.setBorderPainted(false);
		*/

		JButton jbtSingle = new JButton("1vs1");
		JButton jbtDuo = new JButton("2vs2");
		JButton jbtExit = new JButton("Exit");
		

		
		add(jbtSingle);
		add(jbtDuo);
		add(jbtExit);
		

		jbtSingle.setBounds(158,65,120,50);
		jbtSingle.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if((JButton) obj == jbtSingle) {
					dispose();
					Start.chessboard.setChessBoard();
				}
			}
		});
		//add(jbtSingle);

		jbtDuo.setBounds(158,120,120,50);
		jbtDuo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if((JButton) obj == jbtDuo) {
					dispose();
					Start.chessboard2.setChessBoard();
				}
			}
		});
		//add(jbtDuo);

		jbtExit.setBounds(158,175,120,50);
		jbtExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//add(jbtExit);
		


	}
}

