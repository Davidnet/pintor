package co.edu.uniandes.pintor.mundo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class TrapecioRectangulo extends TrapecioAbstracto{

	public TrapecioRectangulo(int nX, int nY, int nLado, int nAlto, int nD, Color nBorde, Color nRelleno) {
		super(nX, nY, nLado, nAlto, nD, nBorde, nRelleno);
	}
	
	@Override
	public void pintar(Graphics2D g) {
		int[] puntosX = new int[]{x, x+lado-d, x+lado, x};
		int[] puntosY = new int[]{y, y, y+alto, y+alto};
		Polygon p = new Polygon(puntosX, puntosY, 4);
		g.setColor(borde);
		g.drawPolygon(p);
		g.setColor(relleno);
		g.fillPolygon(p);
		
	}

}
