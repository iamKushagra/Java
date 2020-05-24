import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.Choice;
/*<applet code="applets" width="300" height="300"></applet>*/

public class applets extends Applet implements ActionListener, ItemListener
{
	Label l1, l2, l3;
	TextField t1;
	Choice ch1, ch2;
	Button b1;
	String choice = null, chooice=null;
	public void init()
	{
		l1=new Label("Enter Name");
		l2=new Label("Select course");
		t1=new TextField();
		ch1=new Choice();
		ch2=new Choice();
		l3=new Label("");
		ch1.add("c");
		ch1.add("c++");
		ch1.add("Jaava");
		ch2.add("Python");
		ch2.add("JS");
        b1=new Button ("Submit");
        add(l1); add(t1); add(l2);
        add(ch1); add(ch2); add(b1); add(l3); 
        ch1.addItemListener(this);
        ch2.addItemListener(this);
        b1.addActionListener(this);
	}
	public void itemStateChanged(ItemEvent e)
		{
if (e.getStateChange()==1)
	choice = ch1.getSelectedItem();
	chooice = ch2.getSelectedItem();

	}
	public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==b1)
	
		l3.setText("Your name is "+t1.getText()+ " Selected course: " +choice+ " extra " +chooice);
	}
}