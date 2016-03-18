package co.edu.uniandes.pintor.mundo;

import java.awt.Color;
import java.awt.Graphics2D;

public class Circulo extends FiguraAbstracta{

	public Circulo(int nX, int nY, int nLado, Color nBorde, Color nRelleno) {
		super(nX, nY, nLado, nBorde, nRelleno);
	}

	@Override
	public void pintar(Graphics2D g) {
		//REVIEW TODO completar pintando el circulo
		g.setColor(borde);
		g.drawOval(x, y, lado, lado);
        g.setColor(relleno);
        g.fillOval(x, y, lado, lado);
	}

}
