package co.edu.uniandes.pintor.mundo;

import java.awt.Color;

public abstract class FiguraAbstracta implements IFigura{

	protected int x;
	
	protected int y;
	
	protected int lado;
	
	protected Color borde;
	
	protected Color relleno;
	
	public FiguraAbstracta(int nX, int nY, int nLado, Color nBorde, Color nRelleno){
		x = nX;
		y = nY;
		lado = nLado;
		borde = nBorde;
		relleno = nRelleno;
	}
	
	public int darX(){
		return x;
	}
	
	public int darY(){
		return y;
	}
	
	public int darLado(){
		return lado;
	}
	
	public void darCambiaColorBorde(Color c){
		borde = c;
	}
	
	public void darCambiaColorRelleno(Color c){
		relleno = c;
	}
}
