import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.nio.channels.SelectableChannel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Random;

import javax.swing.JPanel;

public class PBall extends JPanel
{
	int x1;
	int y1;
	int x2;
	int y2;
	int dx = 1;
	int dy = 1;
	Color col;

	public PBall(int x1, int y1, int x2, int y2, Color col)
	{
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.col = col;
	}

	public void paint(Graphics2D gg)
	{
//		 Random rnd = new Random();
//		 col = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

		gg.setColor(col);
		gg.setStroke(new BasicStroke(2));
		// gg.setColor(col);
		gg.fillOval(x1, y1, x2, y2);

		// dx = rnd.nextInt(10) - 5;
		// dy = rnd.nextInt(10) - 5;
	}

	void moveBall()
	{
		Random rnd = new Random();
		x1 += dx;
		y1 += dy;
		if (x1 <= 0 || x1 >= rnd.nextInt(500) + 700)
		{
			dx = -dx;
		}
		if (y1 <= 0 || y1 >= rnd.nextInt(800) + 450)
		{
			dy = -dy;
		}
	}
}
