package ue03RekursiveFiguren;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends RekursiveFigurBasis {
	public Circle(int x, int y, int radius, int windowWidth, int stepSize, Color color) {
		super(x, y, radius, windowWidth, stepSize, color);
	}

	public void paint(Graphics g) {
		super.paint(g);
		drawCircle(firstX, firstY, firstWidth);
	}

	public void drawCircle(int x, int y, int width) {
		if (x + (2*width) + __STEP_SIZE__ < __MIN_WIDTH__) {
			g.drawOval(x, y, width, width);
			drawCircle(x + __STEP_SIZE__, y, width);
		}
	}
}