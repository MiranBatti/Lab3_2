package logic;

import interfaces.FigurePainter;

import java.util.List;

import interfaces.Drawable;

public class FigurePainterImpl implements FigurePainter{
	
	public List<Drawable> drawableList;
	
	public FigurePainterImpl(List<Drawable> drawableList){
		this.drawableList = drawableList;
	}

	@Override
	public void paintAll() {
		for (Drawable drawable : drawableList) {
		}
	}

}
