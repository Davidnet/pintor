package co.edu.uniandes.graphics.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelLienzo extends JPanel implements MouseListener {

	private InterfazPrincipal principal;
	
	public PanelLienzo(InterfazPrincipal p){
		setPreferredSize(new Dimension(700, 700));
		principal = p;
		setDoubleBuffered( true );
	    setBorder( new TitledBorder( "" ) );
	    addMouseListener(this);
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
        g2d.setColor( getBackground( ) );
        g2d.fillRect( 0, 0, getWidth( ), getHeight( ) );
        
		principal.pintar(g2d);

	}
	
	public void refrescar(){
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent a) {
		// TODO Auto-generated method stub
		if( a.getButton() == MouseEvent.BUTTON3 && a.getClickCount() == 2){
			principal.borrar();
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
