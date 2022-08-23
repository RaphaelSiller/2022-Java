package ue04RekursiveKreise;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RekursiveKreiseGUI extends JFrame {
	final int __WINDOW_X__ = 25, __WINDOW_Y__ = 25, __WINDOW_WIDTH__ = 600, __WINDOW_HEIGHT__ = 600;
	Color figureColor = new Color(0,0,0);
	
	public RekursiveKreiseGUI(int nWiderholungen) {
		//Standardgedoens
		super("RekursiveFiguren");
		setBounds(__WINDOW_X__, __WINDOW_Y__, __WINDOW_WIDTH__+50, __WINDOW_HEIGHT__+50);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);
		setVisible(true);
		
		RekursiveKreise rekursiveKreise = new RekursiveKreise(__WINDOW_WIDTH__, __WINDOW_HEIGHT__,__WINDOW_WIDTH__/2 ,nWiderholungen);
		rekursiveKreise.setBounds(0, 0, __WINDOW_WIDTH__, __WINDOW_HEIGHT__);
		contentPane.add(rekursiveKreise);
	}
}
