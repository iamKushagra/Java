import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class appllet
{
	JFrame f1;
	JLabel l1, l2;
	JButton b1;
	JTextArea ta;
	String s;
	appllet()
	{
		f1= new JFrame ("Text Count");
		l1= new JLabel ("Enter Text");
		l2= new JLabel ("");
		b1= new JButton("Count");
		ta= new JTextArea(30,70);
		s= null;
		l1.setBounds(30,30,250,40);
		ta.setBounds(30,70,400,300);
		b1.setBounds(300,380,100,40);
		l2.setBounds(30,450,200,40);
		f1.add(l1);
		f1.add(ta);
		f1.add(b1);
		f1.add(l2);
		f1.setSize(400,500);
		f1.setLayout(null);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				s=ta.getText();
				l2.setText("Total Character" +s.length());

			}
		}); 
				f1.setVisible(true);
				b1.addKeyListener(new KeyAdapter()
				{
					public void keyPressed(KeyEvent e)
					{
					if(e.getKeyCode () == KeyEvent.VK_ENTER)
					{
						ta.setText("");
					}
				}}); 
				f1.setVisible(true);

	} 
	public static void main(String args[])
{
	new appllet();
}
}