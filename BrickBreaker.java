import javax.swing.*;

public class BrickBreaker
{
	public static void main(String[] args) 
	{
		JFrame obj = new JFrame("Break Out!");
		GamePlay gamePlay = new GamePlay();
		obj.setBounds(10, 10, 700, 600);
		obj.setLocationRelativeTo(null);
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
		obj.setVisible(true);
	}
}