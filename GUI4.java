import java.awt.*;


class marvellouswundow extends Frame
{
	Button b1;
    TextField t1;
	public marvellouswundow(String str,int x,int y)
	{
		super();
		setTitle(str);
		setSize(x,y);
		
		b1=new Button("submit");
	    b1.setBounds(50,50,100,50);
		t1=new TextField();
		t1.setBounds(50,150,100,50);
		add(t1);
		add(b1);
		setLayout(null);
		setVisible(true);
		
	}
}


class GUI4
{
	public static void main(String arg[])
	{
		marvellouswundow mobj = new marvellouswundow("First",500,500);
	}	
}
