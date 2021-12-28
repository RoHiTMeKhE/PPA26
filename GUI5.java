import java.awt.*;
import java.awt.event.*;

class marvellouswundow extends Frame implements ActionListener
{
	public Button b1;
   public TextField t1;
	
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
		b1.addActionListener(this);
		setLayout(null);
		setVisible(true);
		
	}
	public void ActionPerformed(ActionEvent obj)
	{
		t1.setText("PPA");
	}
	
}



class GUI5
{
	public static void main(String arg[])
	{
		marvellouswundow mobj = new marvellouswundow("First",500,500);
	}	
}
