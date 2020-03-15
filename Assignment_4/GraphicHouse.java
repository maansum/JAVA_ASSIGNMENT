import java.awt.*;
import javax.swing.JFrame;

class GraphicHouse extends Canvas
{
	public void paint(Graphics g)
	{
		//backgroundColor(Color.GREEN);
		// main bulding rectangle
		g.drawRect(100, 300, 400, 300);
		// windows
		g.drawRect(290, 450, 150, 150);
		//g.setColor(Color.YELLOW);
		g.fillRect(290,450,150,150);

		//g.drawRect(380, 350, 70, 70);
		// door
     //g.drawRect(250, 430, 100, 170);

		// roof
		g.drawLine(300, 50, 100, 300);
		g.drawLine(300, 50, 500, 300);
		//g.setAreaColor(Color.BLUE);
		// coloring roof
		//g.setColor(Color.BLUE);
		//g.fillArc(100, 5, 300, 500, 225, 90);  

		// coloring building
		g.setColor(Color.RED);
		g.fillRect(100, 300, 400, 300);

		// coloring the window and door
		g.setColor(Color.WHITE);
		g.drawRect(190, 350, 100, 70);
		//g.fillRect(150, 350, 70, 70);
		//g.fillRect(380, 350, 70, 70);

		//g.fillRect(250, 430, 100, 170);

		// color for the rims
		//g.setColor(Color.BLACK);

		// window rims
		g.drawLine(210, 350, 210, 420);
		g.drawLine(245,350, 245, 420);
		g.drawLine(280, 350, 280, 420);
		//g.drawLine(300, 450, 200, 420);
		//g.drawLine(360, 450, 400, 420);
		//g.drawLine(420, 350, 420, 420);
		//g.drawLine(440, 350, 440, 420);
	}	

	public static void main(String[] args) 
	{
		GraphicHouse ob = new GraphicHouse();

		JFrame f = new JFrame();

			f.add(ob);
			f.setSize(800, 800);
			f.setVisible(true);
	}
}
