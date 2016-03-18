package co.edu.uniandes.pintor.mundo;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangulo extends FiguraAbstracta {

	protected int alto;
	
	public Rectangulo(int nX, int nY, int nLado, int nAlto, Color nBorde, Color nRelleno){
		super(nX, nY, nLado, nBorde, nRelleno);
		alto = nAlto;
	}
	
	public int darAlto(){
		return alto;
	}

	@Override
	public void pintar(Graphics2D g) {
		// REVIEW TODO pintar el rectangulo
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
