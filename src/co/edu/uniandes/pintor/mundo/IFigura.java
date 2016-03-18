package co.edu.uniandes.pintor.mundo;

import java.awt.Color;
import java.awt.Graphics2D;

public interface IFigura {

	public int darX();
	
	public int darY();
	
	public int darLado();
	
	public void darCambiaColorBorde(Color c);
	
	public void darCambiaColorRelleno(Color c);
	
	public void pintar(Graphics2D g);
}
