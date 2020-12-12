package brickBreaker;

import javax.swing.JFrame;

public class Main 
{
	public static void main(String []args)
	{
		JFrame jf = new JFrame();
		Gameplay gp = new Gameplay();
		jf.setBounds(10, 10, 700, 600);
		jf.setTitle("Breakout Ball");
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(gp);
	}
}