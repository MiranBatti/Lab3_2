package gui;

import java.awt.Graphics;

import figures.Vertex2D;
import interfaces.PrimitivePainter;

public class PrimitivePainterImpl implements PrimitivePainter{
	private Graphics g;
	
	public void setGraphics(Graphics g){
		this.g = g;
	}

	@Override
	public void paintPoint(Vertex2D v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paintLine(Vertex2D v0, Vertex2D v1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paintCircle(Vertex2D center, double radie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paintRectangle(Vertex2D center, Vertex2D v0, Vertex2D v1,
			Vertex2D v2, Vertex2D v3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paintTriangle(Vertex2D center, Vertex2D v0, Vertex2D v1,
			Vertex2D v2) {
		// TODO Auto-generated method stub
		
	}

}
