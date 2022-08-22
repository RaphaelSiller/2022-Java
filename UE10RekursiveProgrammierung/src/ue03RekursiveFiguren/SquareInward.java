package ue03RekursiveFiguren;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class SquareInward extends RekursiveFigurBasis {
	public SquareInward(int x, int y, int width, int minWidth, int stepSize, Color color) {
		super(x, y, width, minWidth, stepSize, color);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		drawSquareInward(firstX, firstY, firstWidth);
	}
	
	public void drawSquareInward(int x, int y, int width) {
		if(width > __MIN_WIDTH__) {
			g.drawRect(x, y, width, width);
			drawSquareInward(x+__STEP_SIZE__, y+__STEP_SIZE__, width-(2*__STEP_SIZE__));
		}
	}
}
