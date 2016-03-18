package co.edu.uniandes.pintor.mundo;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Pintor {

	private Collection figuras;
	
	public Pintor (){
		figuras = new ArrayList();
		miDibujo();
	}
	
	/**
	 * Pinta las figuras de la colección de figuras sobre la superficie que lelga por parametro
	 * @param g la superficie sobre la que se pintan las figuras
	 */
	public void pintar(Graphics2D g){
		// REVIEW TODO Recorra la colección de figuras
		// REVIEW TODO pinte cada figura de la colección sobre la superfice g
		for (Iterator iterator = figuras.iterator(); iterator.hasNext();){
			FiguraAbstracta x = (FiguraAbstracta) iterator.next();
            x.pintar(g);
		}
	}
	
	/**
	 * Agrega las figuras que hacen parte del dibujo a la colección de figuras
	 */
	private void miDibujo(){
		//Define la primera figura del dibujo y a agrega a la colección
		IFigura c = new Rectangulo(100, 350, 500, 300, Color.BLACK, new Color(235,229,202));
		figuras.add(c);
		
		// REVIEW TODO crear y agregar las demas figuras al dibujo
		c = new TrapecioIsoceles(80, 250, 540, 100, 60, Color.RED, new Color(240, 122, 144));
        figuras.add(c);
        // Añadir recatangulo
        c = new Rectangulo(400, 500, 100, 150, Color.BLACK, Color.BLUE);
        figuras.add(c);
        // Añadir cuadrado
        c = new Cuadrado(200, 400, 50, Color.BLACK, Color.BLUE);
        figuras.add(c);
        // Añadir TrapecioRectangulo
        c = new TrapecioRectangulo(400,400, 50, 50, 20, Color.BLACK, Color.RED);
        figuras.add(c);
        //Añadir otro rectangulo
        c = new Rectangulo(224,400, 4, 50, Color.BLACK, Color.RED);
        figuras.add(c);
        c = new Rectangulo(200, 424, 50, 4, Color.WHITE, Color.WHITE);
        figuras.add(c);
        c = new Circulo(80, 120, 100, Color.RED, Color.YELLOW);
        figuras.add(c);
        c = new Circulo(240, 120, 100, Color.BLUE, Color.BLUE);
        figuras.add(c);
    }
	
	public void borrar(){
		figuras = new ArrayList();
	}
}
