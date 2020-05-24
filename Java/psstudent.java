import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class psstudent
{
 JFrame f1;
 JLabel l1,lid,lname,laddress, lblmsg, lbl;
 JTextField txtId, tname, taddress;
 JButton btnSearch, btnDelete, btnUpdate;
 JPanel p1;
 PreparedStatement st;
 Connection con;

 psstudent() throws ClassNotFoundException,SQLException
 {

	 f1=new JFrame("Search Student Record");
	 l1=new JLabel("Enter Student Id");
	 lid=new JLabel("Student Id");
	 lname=new JLabel("Name");
	 laddress=new JLabel("Address");
	 lblmsg=new JLabel(" ");
	 lbl=new JLabel("~~~~~~~~~~ Enter the details to Update ~~~~~~~~~~");
	 txtId=new JTextField(30);
	 tname=new JTextField(30);
	 taddress=new JTextField(30);
	 btnSearch=new JButton("Search");
	 btnDelete=new JButton("Delete");
	 btnUpdate=new JButton("Update");
	 p1=new JPanel();
	 l1.setBounds(130,30,300,30);
	 txtId.setBounds(290,30,210,30);
	 btnSearch.setBounds(290,70,100,30);
	 btnDelete.setBounds(400,70,100,30);
	 btnUpdate.setBounds(660,350,100,30);
	 p1.setBounds(20,200,500,130);
	 lid.setBounds(30,20,150,30);
	 lname.setBounds(30,50,250,30);
	 laddress.setBounds(30,80,250,30);
	 lblmsg.setBounds(30,50,250,30);
	 lbl.setBounds(560,200,300,30);
	 tname.setBounds(560,250,300,30);
	 taddress.setBounds(560,300,300,30);


	 f1.add(p1); f1.add(lbl);
	 f1.add(l1); f1.add(txtId); f1.add(btnSearch); f1.add(btnUpdate);
	 f1.add(btnSearch); f1.add(btnDelete); p1.add(lblmsg);
	 p1.add(lid); p1.add(lname); p1.add(laddress); 
	 f1.add(tname); f1.add(taddress);

	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");

	 btnSearch.addActionListener (new ActionListener()
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			 ResultSet rs;
			 try
			 {
			 int id= Integer.parseInt(txtId.getText().trim());	
			 st=con.prepareStatement("SELECT * From Students where std_id=?");
			 st.setInt(1, id);
			 rs=st.executeQuery();
			 if(rs.next())
			 {
				 lid.setText("Student Id: "+rs.getInt("std_id"));
				 lname.setText("Student Name: "+rs.getString("Name"));
				 laddress.setText("Student Address: "+rs.getString("address"));
				 lblmsg.setText("");

			 }
			 else 
			 {
				 JOptionPane.showMessageDialog(null,"Record Not Found","Error in id",0);
			 }
 
		 } 
		 catch(SQLException ex)
		 {
			 JOptionPane.showMessageDialog(null,"exception" +ex.toString(),"exception",0);
		 }
		
        }
	
});
btnUpdate.addActionListener (new ActionListener()
	 {
		 public void actionPerformed(ActionEvent e)
		 { 
		 	try
{
				int id=Integer.parseInt(txtId.getText().trim());
                st=con.prepareStatement("UPDATE Students SET Name=?, Address=? where std_id=?");
                st.setString(1, tname.getText());
                st.setString(2, taddress.getText());
                st.setInt(3, id);
                int count = st.executeUpdate();
				JOptionPane.showMessageDialog(null, "Record affected: " +count, "Update", 1);
			}
			catch(Exception ex)
			{
JOptionPane.showMessageDialog(null, ex.toString(), "Update Exception", 0);			}
		}
	}
	);
btnDelete.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{ 
		try
		{
		int id= Integer.parseInt(txtId.getText());
        st=con.prepareStatement("DELETE from Students where std_id=?");
		st.setInt(1, id);
		int count=st.executeUpdate();
		if(count>0)
		{
		JOptionPane.showMessageDialog(null, "Record Deleted and Affected rows: " +count, "Delete", 1);
}else{
	JOptionPane.showMessageDialog(null, "Record Not Found", "Delete", 0);
}}
catch(Exception ex)
{
	JOptionPane.showMessageDialog(null, ex.toString(), "Delete Exception", 0);
}}});

f1.setLayout(null);
p1.setLayout(null);
f1.setSize(1050,500);
f1.setVisible(true);
	}
	public static void main (String [] args) throws ClassNotFoundException, Exception
	{
		new psstudent();
	} }