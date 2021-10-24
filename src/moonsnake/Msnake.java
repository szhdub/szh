package moonsnake;

import javax.swing.JFrame;

public class Msnake {

	public static void main(String[] args) {
		JFrame frame = new JFrame(); 
		frame.setBounds(400, 180, 900, 720);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MPanel());
		frame.setVisible(true);
	}

}
