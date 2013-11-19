import java.awt.*;
import java.applet.*;


public class FractalLab80 extends Applet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int x,y,appletWidth,appletHeight,width,height;
	private double root3,root2;
	
	public void init()
	{
		setSize(1000,650);
		appletWidth = getWidth();
		appletHeight = getHeight();
		x = 450;
		y = 500;
		width = height = 100;
		root3 = Math.sqrt(3);
		root2 = Math.sqrt(2);
		

		
	}
	
	
	public void paint(Graphics g)
	{
		drawSquare(g,x,y,height,width);


	}
	
	public void drawSquare( Graphics g, int x, int y, int height, int width)
	{
		g.fillRect(x,y,width,height);
		
		drawLeftSquare(g,x,y,height,width);
		drawRightSquare(g,x,y,height,width);
	}
	
	public void drawLeftSquare(Graphics g,int x, int y, int height, int width)
	{
		int x1 = width/2;
		int y1 = height/2;
		int polyX[] = {x,x-x1,x,x+x1,x};
		int polyY[] = {y,y-y1,y-(2*y1),y-y1,y};
		g.fillPolygon(polyX,polyY,4);
		
	}
	
	public void drawRightSquare(Graphics g, int x, int y, int height, int width)
	{
		int x1 = width/2;
		int y1 = height/2;
		int polyX[] = {x+width,x + x1, x+width, x + width + x1, x + width};
		int polyY[] = {y, y - y1, y - (2*y1), y-y1,y};
		g.fillPolygon(polyX,polyY,4);
		
		int newHeight = (int) (y1 * root2);
		int newWidth = (int) (x1 * root2);
		if(height > 1)
		{
		drawLeftSquare(g,x-(x1),y-y1,height/2,newWidth);
		
		
		}
		
	}
	
	
	
	
}