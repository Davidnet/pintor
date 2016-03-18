package co.edu.uniandes.graphics.gui;

import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

import co.edu.uniandes.pintor.mundo.Pintor;

public class InterfazPrincipal extends JFrame {

	private PanelLienzo lienzo;
	
	private Pintor miPintor;
	
	public InterfazPrincipal(){
		miPintor = new Pintor();
		
		setSize(700, 700);
		setLayout( new GridLayout(1,1));
		setTitle("Pintor");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lienzo = new PanelLienzo(this);
		add( lienzo );
		
		setLocationRelativeTo(null);
	}
	
	public void pintar(Graphics2D g ){
		miPintor.pintar(g);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InterfazPrincipal i = new InterfazPrincipal();
		i.setVisible(true);

	}

	public void borrar() {
		// TODO Auto-generated method stub
		miPintor.borrar();
		lienzo.refrescar();
		
	}

}
