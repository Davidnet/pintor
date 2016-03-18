package co.edu.uniandes.pintor.mundo;

import java.awt.Color;
import java.awt.Graphics2D;

public class Cuadrado extends FiguraAbstracta{
	
	public Cuadrado(int nX, int nY, int nLado,Color nBorde, Color nRelleno){
		super(nX, nY, nLado, nBorde, nRelleno);
	}

	@Override
	public void pintar(Graphics2D g) {
		//define el color de borde
		g.setColor(borde);
		//dibuja el contorno del cuadrado
		g.drawRect(x, y, lado, lado);
		//define el color del relleno
		g.setColor(relleno);
		//Rellena el cuadrado
		g.fillRect(x, y, lado, lado);
		
	}


}
