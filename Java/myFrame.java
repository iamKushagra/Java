import javax.swing.*;
import java.awt.*;
class myFrame
{
	JFrame f1;
	myFrame()
	{
		f1=new JFrame();
		f1.setTitle("My JFC frame");
		f1.setSize(400,400);
		f1.setground(Color.blue);
		f1.setLayout(null);
		f1.setVisible(true);

	}}
	class showframe
	{
	public static void main(String arg[])
	{
		new myFrame();
	}
}