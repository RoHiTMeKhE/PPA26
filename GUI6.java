import java.awt.*;
import java.awt.event.*;

class marvellouswundow extends Frame WindowListener
{

	public marvellouswundow(String str,int x,int y)
	{
	super();
	setTitle(str);
	setSize(x,y);
	addWindowListener(this);
	setVisible(true);
	}
	public void windowDeactivated(WindowEvent obj) {}
	public void windowActivated(WindowEvent obj) {}
	public void windowDeiconified(WindowEvent obj) {}
	public void windowIconified(WindowEvent obj) {}
	public void windowClosed(WindowEvent obj) 
	{
	 System.exit(0);	
	}
	public void windowClosing(WindowEvent obj) 
	{
		
	}
	public void windowOpened(WindowEvent obj) {}
	}
	
	class GUI6
	{
	public static void main(String arg[])
	{
	marvellouswundow mobj=new marvellouswundow("first",500,500);
	}
	}