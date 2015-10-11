package figures;

public class Point extends FigureType {
	
	private Vertex2D v;
	
	/**
	 * Konstruktor som tar in en Vertex2D som punkt
	 * @param center
	 */
	public Point(double x, double y) {
		v = new Vertex2D(x, y);
	}
	
	/**
	 * Flyttar punkten i x och y led
	 * @param x
	 * @param y
	 */
	@Override
	public void moveBy(double x, double y) {
		v = new Vertex2D((v.getX() + x), (v.getY() + y));
	}
	
	/**
	 * Retunerar vektorn
	 */
	public Vertex2D getV() {
		return v;
	}
	
	/**
	 * Retunerar centrum
	 */
	@Override
	public Vertex2D getCenter() {
		return v;
	}
	
	/**
	 * Retunerar string med info om objektet
	 */
	@Override
	public String toString() {
		return ("Point: V: " + getV());
	}
	
	/** 
	 * equals metod för att jämföra objekt
	 */
	@Override
	public boolean equals (Object objecjt) {
		if (!(objecjt instanceof Vertex2D))
			return false;
		Point point = (Point) objecjt;
		return (point.getV() == getV());
	}
}
