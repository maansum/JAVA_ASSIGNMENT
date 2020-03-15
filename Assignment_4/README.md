# java Graphics:
_public abstract class Graphics_
__extends Object__

The Graphics class is the abstract base class for all graphics contexts that allow an application to draw onto components that are realized on various devices, as well as onto off-screen images.
A Graphics object encapsulates state information needed for the basic rendering operations that Java supports. This state information includes the following properties:

The Component object on which to draw.
A translation origin for rendering and clipping coordinates.

- The current clip.
- The current color.
- The current font.
-The current logical pixel operation function (XOR or Paint).
- The current XOR alternation color (see setXORMode(java.awt.Color)).


_Coordinates are infinitely thin and lie between the pixels of the output device. Operations that draw the outline of a figure operate by traversing an infinitely thin path between pixels with a pixel-sized pen that hangs down and to the right of the anchor point on the path. Operations that fill a figure operate by filling the interior of that infinitely thin path. Operations that render horizontal text render the ascending portion of character glyphs entirely above the baseline coordinate._

The graphics pen hangs down and to the right from the path it traverses. This has the following implications:

If you draw a figure that covers a given rectangle, that figure occupies one extra row of pixels on the right and bottom edges as compared to filling a figure that is bounded by that same rectangle.
If you draw a horizontal line along the same y coordinate as the baseline of a line of text, that line is drawn entirely below the text, except for any descenders.
All coordinates that appear as arguments to the methods of this Graphics object are considered relative to the translation origin of this Graphics object prior to the invocation of the method.

All rendering operations modify only pixels which lie within the area bounded by the current clip, which is specified by a Shape in user space and is controlled by the program using the Graphics object. This user clip is transformed into device space and combined with the device clip, which is defined by the visibility of windows and device extents. The combination of the user clip and device clip defines the composite clip, which determines the final clipping region. The user clip cannot be modified by the rendering system to reflect the resulting composite clip. The user clip can only be changed through the setClip or clipRect methods. All drawing or writing is done in the current color, using the current paint mode, and in the current font.





Commonly used methods of Graphics class:

1. public abstract void drawString(String str, int x, int y): is used to draw the specified string.
2. public void drawRect(int x, int y, int width, int height): draws a rectangle with the specified width and height.
3. public abstract void fillRect(int x, int y, int width, int height): is used to fill rectangle with the default color and specified width and height.
4. public abstract void drawOval(int x, int y, int width, int height): is used to draw oval with the specified width and height.
5. public abstract void fillOval(int x, int y, int width, int height): is used to fill oval with the default color and specified width and height.
6. public abstract void drawLine(int x1, int y1, int x2, int y2): is used to draw line between the points(x1, y1) and (x2, y2).
7. public abstract boolean drawImage(Image img, int x, int y, ImageObserver observer): is used draw the specified image.
8. public abstract void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used draw a circular or elliptical arc.
9. public abstract void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used to fill a circular or elliptical arc.
10. public abstract void setColor(Color c): is used to set the graphics current color to the specified color.
11. public abstract void setFont(Font font): is used to set the graphics current font to the specified font.

```

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

```