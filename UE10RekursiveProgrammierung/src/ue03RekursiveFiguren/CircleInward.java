package ue03RekursiveFiguren;

import java.awt.Color;
import java.awt.Graphics;

public class CircleInward extends RekursiveFigurBasis {
	public CircleInward(int x, int y, int radius, int minWidth, int stepSize, Color color) {
		super(x, y, radius, minWidth, stepSize, color);
	}

	public void paint(Graphics g) {
		super.paint(g);
		drawCircleInward(firstX, firstY, firstWidth);
	}

	public void drawCircleInward(int x, int y, int width) {
		if (width > __MIN_WIDTH__) {
			g.drawOval(x, y, width, width);
			drawCircleInward(x + __STEP_SIZE__, y + __STEP_SIZE__, width - (2 * __STEP_SIZE__));
		}
	}
}
