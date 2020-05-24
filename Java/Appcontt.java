import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
/*<applet code="Appcontt" width="500" height="500"></applet>*/

public class Appcontt extends Applet implements ActionListener 
{
  Label l1,l2,l3,l4;
  TextField t1,t2,t3;
  Button b1,b2,b3,b4;
  public void init()
  {
  l4=new Label("Calculator");
  l1=new Label("First Number");
  l2=new Label("Second Number");
  l3=new Label("Result");
  t1=new TextField();
  t2=new TextField();
  t3=new TextField();
  b1=new Button("Add");
  b2=new Button("Subtract");
  b3=new Button("Multiply");
  b4=new Button("Divide");
  setLayout(null);
  l1.setBounds(30,50,100,20);
  l2.setBounds(30,100,100,20);
  t1.setBounds(150,50,100,20);
  t2.setBounds(150,100,100,20);
  b1.setBounds(30,200,80,20);
  b2.setBounds(120,200,80,20);
  b3.setBounds(210,200,80,20);
  b4.setBounds(300,200,80,20);
  l3.setBounds(30,150,100,20);

  add(l4);
  add(l1);
  add(t1);
  add(l2);
  add(t2);
  add(l3);
  add(t3);
  add(b1);
  add(b2);
  add(b3);
  add(b4);

  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  }

    public void actionPerformed(ActionEvent e)
	{
		int a,b,s=0;
    float g;
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
      if (e.getSource()==b1)
    {
      s=a+b;
    } 
    else if (e.getSource()==b2){
      s=a-b;

    }
    else if (e.getSource()==b3){
      s=a*b;
    } 
    else if (e.getSource()==b4){
      s=a/b;
    }
      l3.setText("Result is " +s);
    }
  } 
