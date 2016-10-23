import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PPanel extends JPanel implements MouseListener, MouseMotionListener
{
	ArrayList<PBall> pb = new ArrayList<>();

	int x = 1;
	int y = 1;

	public PPanel()
	{
		setLayout(null);
		addMouseListener(this);
		addMouseMotionListener(this);
		Timer t = new Timer(10, new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{

			}
		});
		t.start();

	}

	@Override
	public void paint(Graphics e)
	{
		super.paint(e);

		for (PBall p : pb)
		{
			p.paint((Graphics2D) e);
			p.moveBall();
		}
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{

	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		Random rnd = new Random();
		Color col;
		col = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
		x = e.getX();
		y = e.getY();
		pb.add(new PBall(x, y, 80, 80, col));
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e)
	{

	}
}
