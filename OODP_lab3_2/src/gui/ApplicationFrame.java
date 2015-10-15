package gui;

/*
 * OODP, laboration 3
 *
 * ControlPanel.java
 *
 * Peter Jenke, 2015-01-10
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ApplicationFrame extends JFrame
{
	DrawingPanel drawingPanel;
	
	
	public ApplicationFrame (String title) throws HeadlessException
	{
		super (title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize (new Dimension (1100, 820));

		// mainPanel innehåller
		// - DrawingPanel - en JPanel där figurerna ritas ut
		// - ControlPanel - en JPanel som innehåller styrelementen
		JPanel mainPanel = new JPanel ();
		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);

		drawingPanel = new DrawingPanel();
		
		ControlPanel controlPanel = new ControlPanel(drawingPanel);
		JMenuBar menubar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");		
		JMenuItem exportPNG = new JMenuItem("Export PNG");
		JMenuItem exportJPEG = new JMenuItem("Export JPEG");
		
		mainPanel.add(drawingPanel, BorderLayout.CENTER);
		mainPanel.add(controlPanel, BorderLayout.SOUTH);
		
		// Creates a menubar
		menubar.add(fileMenu);
		fileMenu.add(exportJPEG);
		fileMenu.add(exportPNG);
		setJMenuBar(menubar);
		exportJPEG.addActionListener(new ExportJPEGListener());

		pack();
		setVisible(true);
	}
	
	// Uppgifter:
	// Skapa metoder som kan användas för att tilldela handler-objekt
	// till ControlPanel-instansen.
	private class ExportJPEGListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			ImageExport ie = new ImageExport(drawingPanel);
			try {
				ie.exportJPEG();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
