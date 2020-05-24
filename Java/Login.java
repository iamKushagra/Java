import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Login
{
	JFrame f1;
	JLabel log, uname, pwd;
	JTextField tname, tpwd;
	JButton btnLog, btnCancel, btnForget, btnNew;
	PreparedStatement st;
    Connection con;
    {
    	f1=new JFrame("MCA III");
    	log=new JLabel("Login");
    	uname=new JLabel("Username");
    	pwd=new JLabel("Password");
    	tname=new JTextField(30);
    	tpwd=new JTextField(30);
    	btnLog=new JButton("Login");
    	btnCancel=new JButton("Cancel");
    	btnForget=new JButton("Forget");
    	btnNew=new JButton("New");
	    log.setBounds(130,30,300,30);
    }
}