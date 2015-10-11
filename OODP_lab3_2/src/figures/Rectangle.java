package figures;

import interfaces.Rotatable;
import interfaces.Scalable;

public class Rectangle extends FigureType implements Rotatable, Scalable {
	
	private Vertex2D center;
	
	/**
	 * Konstruktor som tar höjd, bredd och centrum för att skapa en rektangel
	 * @param height
	 * @param width
	 * @param center
	 */
	public Rectangle(double height, double width, double centerX, double centerY) {
		center = new Vertex2D(centerX, centerY);
		vertex2DArray.add(new Vertex2D((center.getX() - (width / 2)), (center.getY() + (height / 2))));
		vertex2DArray.add(new Vertex2D((center.getX() + (width / 2)), (center.getY() + (height / 2))));
		vertex2DArray.add(new Vertex2D((center.getX() - (width / 2)), (center.getY() - (height / 2))));
		vertex2DArray.add(new Vertex2D((center.getX() + (width / 2)), (center.getY() - (height / 2))));
	}
	
	/**
	 * Retunerar Vertex2D v0
	 * @return
	 */
	public Vertex2D getV0() {
		return vertex2DArray.get(0);
	}
	
	/**
	 * Retunerar Vertex2D v1
	 * @return
	 */
	public Vertex2D getV1() {
		return vertex2DArray.get(1);
	}
	
	/**
	 * Retunerar Vertex2D v2
	 * @return
	 */
	public Vertex2D getV2() {
		return vertex2DArray.get(2);
	}
	
	/**
	 * Retunerar Vertex2D v3
	 * @return
	 */
	public Vertex2D getV3() {
		return vertex2DArray.get(3);
	}

	/**
	 * Retunerar centrum av rektangeln
	 * @return
	 */
	@Override
	public Vertex2D getCenter() {
		return center;
	}

	/**
	 * Roterar rektangeln med inskickad vinkel
	 * @param angle
	 */
	@Override
	public void rotate(double angle) {
		center = getCenter();
		
		for (int i = 0; i < vertex2DArray.size(); i++) {
			Vertex2D _vertex2D = vertex2DArray.get(i).rotate(center, angle);
			vertex2DArray.set(i, _vertex2D);
		}
	}
	
	/**
	 * Scalar rektangeln i x-led och y-led
	 * @param factor_x
	 * @param factor_y
	 */
	@Override
	public void scale(double factor_x, double factor_y) {
		center = getCenter();
		
		for (int i = 0; i < vertex2DArray.size(); i++) {
			Vertex2D _vertex2D = vertex2DArray.get(i).scale(center, factor_x, factor_y);
			vertex2DArray.set(i, _vertex2D);
		}
	}
	
	@Override
	public void moveBy(double d_x, double d_y){
		for (int i = 0; i < vertex2DArray.size(); i++) {
			Vertex2D _vertex2D = new Vertex2D((vertex2DArray.get(i).getX() + d_x), (vertex2DArray.get(i).getY() + d_y));
			vertex2DArray.set(i, _vertex2D);
		}
	}
	
	/**
	 * Retunerar string med info om objektet
	 */
	@Override
	public String toString() {
		return ("Rectangle: V0: " + getV0() + ", V1: " + getV1() + ", V2: " + getV2() + ", V3: " + getV3());
	}
	
	/** 
	 * equals metod för att jämföra objekt
	 */
	@Override
	public boolean equals (Object objecjt) {
		if (!(objecjt instanceof Vertex2D))
			return false;
		Rectangle rec = (Rectangle) objecjt;
		return (rec.getV0() == getV0() && rec.getV1() == getV1() && rec.getV2() == getV2() && rec.getV3() == getV3());
	}
}
