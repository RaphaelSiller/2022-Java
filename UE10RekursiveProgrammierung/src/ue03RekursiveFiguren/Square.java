package ue03RekursiveFiguren;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Square extends RekursiveFigurBasis {
	public Square(int x, int y, int width, int windowWidth, int stepSize, Color color) {
		super(x, y, width, windowWidth, stepSize, color);
	}

	public void paint(Graphics g) {
		super.paint(g);
		drawSquare(firstX, firstY, firstWidth);
	}

	public void drawSquare(int x, int y, int width) {
		if (x + width + __STEP_SIZE__ < __MIN_WIDTH__ && width > 0) {
			g.drawRect(x, y, width, width);
			drawSquare(x + width + __STEP_SIZE__, y, width - (2 * __STEP_SIZE__));
		}
	}

}
