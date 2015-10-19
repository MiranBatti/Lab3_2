package gui;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageExport {
	
	public ImageExport(DrawingPanel dp) {
		BufferedImage bi = new BufferedImage(dp.getWidth(), dp.getHeight(), BufferedImage.TYPE_INT_RGB);;
		Graphics2D g = bi.createGraphics();
		dp.paint(g);
		g.dispose();
	}
	
	public ImageExport() {
		
	}
	
	public void exportJPEG() throws IOException {
		
	}
}
