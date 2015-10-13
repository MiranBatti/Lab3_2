package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import figures.Vertex2D;
import interfaces.PrimitivesPainter;

public class PrimitivesPainterImpl implements PrimitivesPainter{
	private Graphics g;
	private double presetPointDiameter = 3;
	
	public void setGraphics(Graphics g){
		this.g = g;
	}

	@Override
	public void paintPoint(Vertex2D v) {
		g.fillOval( (int) v.getX(), (int) v.getY(), (int) presetPointDiameter, (int) presetPointDiameter);
	}

	@Override
	public void paintLine(Vertex2D v0, Vertex2D v1) {
		g.drawLine( (int) v0.getX(), (int) v0.getY(), (int) v1.getY(), (int) v1.getY());
	}

	@Override
	public void paintCircle(Vertex2D center, double radie) {
		g.drawOval( (int) center.getX(), (int) center.getY(), (int) radie, (int) radie);
	}
/*
	@Override
	public void paintRectangle(Vertex2D center, double height, double width) {
		g.drawRect( (int) center.getX(), (int) center.getY(), (int) width, (int) height);
	}*/
	
	@Override
	public void paintRectangle(ArrayList<Vertex2D> v) {
		int xPoints[] = new int[v.size()];
		int yPoints[] = new int[v.size()];		
		int nPoints = v.size();		

		for (int i = 0; i < v.size(); i++) {
			xPoints[i] = (int) v.get(i).getX();
			yPoints[i] = (int) v.get(i).getY();
		}		
	
		g.drawPolygon(xPoints, yPoints, nPoints);
		g.setColor(Color.BLUE);
		g.fillPolygon(xPoints, yPoints, nPoints);
	}
	
	@Override
	public void paintTriangle(ArrayList<Vertex2D> v) {		
		int xPoints[] = new int[v.size()];
		int yPoints[] = new int[v.size()];		
		int nPoints = v.size();		
		
		for (int i = 0; i < v.size(); i++) {
			xPoints[i] = (int) v.get(i).getX();
			yPoints[i] = (int) v.get(i).getY();
		}		
		g.drawPolygon(xPoints, yPoints, nPoints);
		g.setColor(Color.RED);
		g.fillPolygon(xPoints, yPoints, nPoints);
	}
	
}
