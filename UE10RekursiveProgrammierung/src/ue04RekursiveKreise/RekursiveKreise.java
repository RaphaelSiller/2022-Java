package ue04RekursiveKreise;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class RekursiveKreise extends JComponent{

	int width, height,radius, nWiderholungen;
	Color color;
	Graphics g;
	
	public RekursiveKreise(int width, int height, int radius, int nWiderholungen) {
		this.color = color;
		this.width = width;
		this.height = height;
		this.radius = radius;
		this.nWiderholungen = nWiderholungen;
	}
	
	public void paint(Graphics g) {
		g.setColor(color);
		this.g = g;
		drawCircles(width/4, height/4, radius, nWiderholungen);
	}
	
	public void drawCircles(int x, int y, int radius, int nWiderholungen) {
		System.out.println(x + " " + y + " " + radius + " " + nWiderholungen);
		g.drawOval(x, y, radius, radius);
		if(nWiderholungen>0) {
			drawCircles(x+(radius/4),y-(radius/4),radius/2,nWiderholungen-1); //Up
			drawCircles(x-(radius/4),y+(radius/4),radius/2,nWiderholungen-1); //Left
			drawCircles(x+(3*radius/4),y+(radius/4),radius/2,nWiderholungen-1); //Right
			drawCircles(x+(radius/4),y+(3*radius/4),radius/2,nWiderholungen-1); //Down
		}
		
	}
}
