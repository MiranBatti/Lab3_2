package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageExport {
	BufferedImage bi;
	Graphics g;
	DrawingPanel dp;
	
	public ImageExport(DrawingPanel dp) {
		this.dp = dp;
		bi = new BufferedImage(this.dp.getWidth(), this.dp.getHeight(), BufferedImage.TYPE_INT_RGB);
		this.dp.paint(this.dp.getGraphics2D());
		g = bi.getGraphics();
		g = bi.createGraphics();
	}
	
	public void exportJPEG() throws IOException {
		try {
			bi = ImageIO.read(new File("figures.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		ImageIO.write(bi, "jpeg", new File("figures.jpg"));
	}
}
