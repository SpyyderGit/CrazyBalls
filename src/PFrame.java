import java.awt.Color;

import javax.swing.JFrame;

public class PFrame extends JFrame
{
	public PFrame()
	{
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(450, 50, 1000, 800);

		PPanel ppan = new PPanel();
		ppan.setBounds(150, 50, 800, 600);
		ppan.setBackground(Color.black);
		add(ppan);

		setVisible(true);
	}
}
