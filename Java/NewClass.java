import java.sql.*;
import javax.swing.*;

public class NewClass extends JFrame {
JFrame f1;
JLabel l1;
    NewClass() throws SQLException
{
    f1=new JFrame("Hello");
    l1=new JLabel("Enter");
    l1.setBounds(10,10,200,200);
    f1.add(l1);
    f1.setLayout(null);
    f1.setSize(400,500);
    
    try
			 {
			 Connection con; Statement st; ResultSet rs;
			
			
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
			 st=con.createStatement();
                         l1.setText("Hooray! You are Connected..");
		 }
		 catch(ClassNotFoundException ex1)
		 {
			 JOptionPane.showMessageDialog(null,"exception" +ex1.toString(),"exception",0);
		 }
f1.setVisible(true);
}
    public static void main(String[] args) throws SQLException{
        new NewClass();
    }
}
