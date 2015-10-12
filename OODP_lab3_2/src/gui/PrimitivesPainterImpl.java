package gui;

import java.awt.Graphics;

import figures.Vertex2D;
import interfaces.PrimitivesPainter;

public class PrimitivesPainterImpl implements PrimitivesPainter{
	private Graphics g;
	
	public void setGraphics(Graphics g){
		this.g = g;
	}

	@Override
	public void paintPoint(Vertex2D v) {
		g.fillOval( (int) v.getX(), (int) v.getY(), 3, 3);
	}

	@Override
	public void paintLine(Vertex2D v0, Vertex2D v1) {
		g.drawLine( (int) v0.getX(), (int) v0.getY(), (int) v1.getY(), (int) v1.getY());
	}

	@Override
	public void paintCircle(Vertex2D center, double radie) {
		g.drawOval( (int) center.getX(), (int) center.getY(), (int) radie, (int) radie);
	}

	@Override
	public void paintRectangle(Vertex2D center, double height, double width) {
		g.drawRect( (int) center.getX(), (int) center.getY(), (int) height, (int) width);
	}

	@Override
	public void paintTriangle(Vertex2D center, Vertex2D v0, Vertex2D v1,
			Vertex2D v2) {
		g.drawLine( (int) v0.getX(), (int) v0.getY(), (int) v1.getY(), (int) v1.getY());
		g.drawLine( (int) v0.getX(), (int) v0.getY(), (int) v2.getY(), (int) v2.getY());
		g.drawLine( (int) v1.getX(), (int) v1.getY(), (int) v2.getY(), (int) v2.getY());
	}

}
