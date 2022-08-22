package ue03RekursiveFiguren;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class RekursiveFigurBasis extends JComponent {
	//value for exit condition (Exit Condition: width < __MIN_WIDTH__)
	final int __MIN_WIDTH__;
	//Distance between recursive Figures
	final int __STEP_SIZE__;
	
	//coordinates and width of the starting point
	int firstX, firstY, firstWidth;
	Color color;
	Graphics g;
	
	/**
	 * 
	 * @param x coordinate of the starting point
	 * @param y coordinate of the starting point
	 * @param width of the starting point
	 * @param minWidth value for exit condition (Exit Condition: width < minWidth)
	 * @param stepSize Distance between recursive Figures
	 */
	public RekursiveFigurBasis(int x, int y, int width, int minWidth, int stepSize, Color color) {
		this.firstX = x;
		this.firstY = y;
		this.firstWidth = width;
		this.__MIN_WIDTH__ = minWidth;
		this.__STEP_SIZE__ = stepSize;
		this.color = color;
	}
	
	/**
	 * Sets default color
	 */
	public void paint(Graphics g) {
		g.setColor(color);
		this.g = g;
	}

}
