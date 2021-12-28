import java.awt.*;

class marvellouswundow extends Frame
{
	public marvellouswundow(String str,int x,int y)
	{
		super();
		setTitle(str);
		setSize(x,y);
		setVisible(true);
		
	}
}


class GUI3
{
	public static void main(String arg[])
	{
		marvellouswundow mobj1 = new marvellouswundow("First",500,500);
		marvellouswundow mobj2 = new marvellouswundow("second",400,400);
	}
}
