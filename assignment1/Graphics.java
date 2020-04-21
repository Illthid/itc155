//*******************************************************************
// Graphics.java
//
// A program that uses the DrawingPanel to make the MickeyBox image,
// using separate methods for each shape and a loop for recurring 
// shapes.
// 
// By: David Barnette 
// Date: 4/20/2020
//*******************************************************************
import java.awt.*;


public class Graphics {

	public static void main(String[] args) {
		
		// create the drawing panel
		DrawingPanel panel = new DrawingPanel(220, 150);
		
		//set background color
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();
		
		//ears
		g.setColor(Color.BLUE);
		g.fillOval(50,25,40,40);	
		g.fillOval(130,25,40,40);
		
		//head
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);

		//line
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);
	}

}
