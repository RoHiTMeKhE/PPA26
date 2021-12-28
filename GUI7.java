import java.awt.*;
import jawa.awt.event.*;

class marvellouswundow extends WindowAdapter
{
   Frame fobj;
    public marvellouswundow(String str,int x,int y)
	{
		
		fobj.setTitle("marvellous");
		fobj.setSize(300,300);
		fobj.setVisible(true);
		fobj.addWindowListener(this);
	}
	public void windowClosing(WindowEvent obj)
	{
	System.exit(0);
	}
}


class GUI2
{
	public static void main(String arg[])
	{
		marvellouswundow mobj = new marvellouswundow();
		
	}
}