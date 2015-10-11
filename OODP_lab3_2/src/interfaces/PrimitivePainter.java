package interfaces;

import figures.Vertex2D;

public interface PrimitivePainter {
	public void paintPoint(Vertex2D v);
	public void paintLine(Vertex2D v0, Vertex2D v1);
	public void paintCircle(Vertex2D center, double radie);
	public void paintRectangle(Vertex2D center, Vertex2D v0, Vertex2D v1, Vertex2D v2, Vertex2D v3);
	public void paintTriangle(Vertex2D center, Vertex2D v0, Vertex2D v1, Vertex2D v2);
}
