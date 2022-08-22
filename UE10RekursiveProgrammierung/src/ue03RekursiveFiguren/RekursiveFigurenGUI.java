package ue03RekursiveFiguren;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class RekursiveFigurenGUI extends JFrame{
	
	final int __WINDOW_X__ = 25, __WINDOW_Y__ = 25, __WINDOW_WIDTH__ = 600, __WINDOW_HEIGHT__ = 600;
	Color figureColor = new Color(0,0,0);
	
	public RekursiveFigurenGUI() {
		super("RekursiveFiguren");
		setBounds(__WINDOW_X__, __WINDOW_Y__, __WINDOW_WIDTH__, __WINDOW_HEIGHT__);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Oberflaeche des Fensters auf welcher die Objekte platziert werden sollen
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);
		
		
		SquareInward squareInward = new SquareInward(5, 5, 200, 10, 2, figureColor);
		squareInward.setBounds(__WINDOW_X__, __WINDOW_Y__, __WINDOW_WIDTH__, __WINDOW_HEIGHT__);
		contentPane.add(squareInward);
		
		CircleInward circleInvard = new CircleInward(250, 5, 200, 10, 4, figureColor);
		circleInvard.setBounds(__WINDOW_X__, __WINDOW_Y__, __WINDOW_WIDTH__, __WINDOW_HEIGHT__);
		contentPane.add(circleInvard);
		
		Square square = new Square(5, 250, 100, __WINDOW_WIDTH__, 4, figureColor);
		square.setBounds(__WINDOW_X__, __WINDOW_Y__, __WINDOW_WIDTH__, __WINDOW_HEIGHT__);
		contentPane.add(square);
		
		Circle circle = new Circle(5, 400, 100, __WINDOW_WIDTH__, 4, figureColor);
		circle.setBounds(__WINDOW_X__, __WINDOW_Y__, __WINDOW_WIDTH__, __WINDOW_HEIGHT__);
		contentPane.add(circle);
		
		
		setVisible(true);
	}
}
