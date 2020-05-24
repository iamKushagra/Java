import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class form extends Applet implements ActionListener, ItemListener
/*<applet code="form" width="300" height="300"></applet>*/

{
Label l1, l2, l3;
Checkbox c1, c2, c3;
CheckboxGroup cb;
Button b1;
String gender, result;
TextField t1;
public void init()
{
	l1=new Label("Name");
	l2=new Label("Gender");
	l3=new Label("");
	t1=new TextField();
	cb=new CheckboxGroup();
	c1=new Checkbox("Male", cb, false);
	c2=new Checkbox("Female", cb, false);
	c3=new Checkbox("Other", cb, false);
	b1=new Button("Submit");
	add(l1);add(l2);add(l3);add(c1);add(c2);add(c3);add(b1);
	c1.addItemListener(this);
	c2.addItemListener(this);
	c3.addItemListener(this);
	b1.addActionListener(this);
	gender=null;
	result=null;
}
public void itemStateChanged(ItemEvent e)
{
	if(c1.getState()==true)
	{
		gender="Male";
	} else if (c2.getState()==true)
	{
		gender="Female";
	} else if (c1.getState()==true)
	gender="Other";
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		result="Your name " +t1.getText()+ "Gender: " +gender;
		l3.setText("+result");
	}
}
}