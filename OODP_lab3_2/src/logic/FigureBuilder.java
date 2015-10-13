package logic;

import gui.PrimitivesPainterImpl;

public class FigureBuilder {
	private FigureHandlerImpl handlerImpl;
	private FigureMoverImpl moverImpl;
	private FigurePrinterImpl printerImpl;
	private FigureRotorImpl rotorImpl;
	private FigureScalorImpl scalorImpl;
	private FigurePainterImpl painterImpl;
	private PrimitivesPainterImpl ppainter;
	
	/**
	 * Initilize FigureHandlerImpl för att undvika error
	 */
	public FigureBuilder() {
		handlerImpl = new FigureHandlerImpl();
		ppainter = new PrimitivesPainterImpl();
	}
	
	/**
	 * Retunerar FigureHandlerImpl okjekt
	 * @return
	 */
	public FigureHandlerImpl getFigureHandlerImpl() {
		return handlerImpl;
	}
	
	/**
	 * Retunerar FigureMoverImpl okjekt
	 * @return
	 */
	public FigureMoverImpl getFigureMoverImpl() {
		moverImpl = new FigureMoverImpl(handlerImpl.getAllFigures());
		return moverImpl;
	}
	
	/**
	 * Retunerar FigureMoverImpl okjekt
	 * @return
	 */
	public FigurePrinterImpl getFigurePrinterImpl() {
		printerImpl = new FigurePrinterImpl(handlerImpl.getAllFigures());
		return printerImpl;
	}
	
	/**
	 * Retunerar FigureRotorImpl okjekt
	 * @return
	 */
	public FigureRotorImpl getFigureRotorImpl() {
		rotorImpl = new FigureRotorImpl(handlerImpl.getRotatableFigures());
		return rotorImpl;
	}
	
	/**
	 * Retunerar FigureScalorImpl objekt
	 * @return
	 */
	public FigureScalorImpl getFigureScalorImpl() {
		scalorImpl = new FigureScalorImpl(handlerImpl.getScalableFigures());
		return scalorImpl;
	}
	
	public FigurePainterImpl getFigurePainterImpl() {
		painterImpl = new FigurePainterImpl(handlerImpl.getDrawableFigures(), ppainter);
		return painterImpl;
	}
	
	public PrimitivesPainterImpl getPrimitivesPainter() {
		return ppainter;
	}
}
