import java.awt.Color;

import javax.swing.*;
	
	public class GitHubTest extends JFrame {

		public GitHubTest() {

			super("5Binf rules");

			super.add(new JLabel("Hello Monolithic",JLabel.CENTER)).setForeground(Color.BLUE);

			super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			
			getContentPane().setBackground(Color.YELLOW);

			super.pack();

			super.setVisible(true);
			
			super.setSize(400, 300);

		}


	public static void main(String[] args) {
		
		new GitHubTest();

	}

}