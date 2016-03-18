package co.edu.uniandes.pintor.mundo;

import java.awt.Color;

public abstract class TrapecioAbstracto extends Rectangulo {

	protected int d;
	
	
	public TrapecioAbstracto(int nX, int nY, int nLado, int nAlto, int nD, Color nBorde, Color nRelleno) {
		super(nX, nY, nLado, nAlto, nBorde, nRelleno);
		d = nD;
	}
	
	public int darD(){
		return d;
	}

}
