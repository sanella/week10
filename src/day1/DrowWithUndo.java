package day1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrowWithUndo extends JPanel implements MouseListener {
	
	
	//konstruktor za PANEL
	public DrowWithUndo() { 
		setBackground(Color.GRAY);
		addMouseListener(this);
	}

	protected void paintComponent(Graphics g){
		super.paintComponent(g);
	}
	
	@Override
 	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.isShiftDown()) {	
			return;
		}

		int x = e.getX();
		int y = e.getY();
		Graphics g = getGraphics();
		
		g.setColor(Color.MAGENTA); 
		g.fillRect(x-15, y-15 , 30, 30);
		g.drawRect(x-15 , y-15 , 30, 30);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	
	//-------------------MAIN-----------------------//
	public static void main(String[] args) {
		JFrame window = new JFrame("DrowWithUndo");
		DrowWithUndo content = new DrowWithUndo();
		window.setContentPane(content);
		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
