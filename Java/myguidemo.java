    import javax.swing.*;
    import javax.swing.table.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.sql.*;
    public class myguidemo extends JFrame implements ActionListener{
    	//variables for oracle
    	Connection connection;
    	Statement stmt;
    	String query = "SELECT * FROM DOCTOR";
    	ResultSet results, execute;
    	ResultSetMetaData md;
    	int numrows, numcols;
    	AbstractTableModel dataModel;
    	Object [][] data;
    		
    	//variables for GUI
    	JTextField jtf;
    	JTable jtb;
    	JPanel jp;
    	JScrollPane jsp;
    	JButton button1, button2, button3, button4, button5;
    	JLabel label;
    		public myguidemo() throws Exception{
                    	
                    		//driver and connection
                    		Class.forName("oracle.jdbc.driver.OracleDriver");
                    		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","user","pass");
                    		
                    		//create the GUI
                    		jtf = new JTextField("Enter SQL command here");
                                    add(jtf,BorderLayout.NORTH);
                    		jtb = new JTable();
                                    add(jtb,BorderLayout.CENTER);
                                    jp = new JPanel();
                    		add(jp,BorderLayout.SOUTH);
                                    
                                    
                    		//query the oracle database, program defaults to show the DOCTOR table
                                    stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                                    results = stmt.executeQuery(query);
                                    
                                    
                                    //get the number of columns and rows for JTable
                                    md = results.getMetaData();
                    		numcols = md.getColumnCount();
                    		numrows = 0;
                    		while(results.next())
                    			numrows++;
                    		results.beforeFirst();
                    		data = new Object[numrows][numcols];
                    		results.next();
                    		for(int i=0; i<numrows; i++){
                    			for(int j=1; j<=numcols; j++){
                    				data[i][j-1] = results.getString(j);
                    			}
                    			results.next();
                    		}
                                    
                                    //get the data from oracle
                    		dataModel = new AbstractTableModel(){
                                    	public int getColumnCount() {return numcols;}
                                    	public int getRowCount() {return numrows;}
                                    	public Object getValueAt(int row, int col) {return data[row][col];}
                                    };
                                    
                                    //put the query output in the JTable and add scrolling
                                    jtf.addActionListener(this);
                                    jtb = new JTable(dataModel);
                                    jsp = new JScrollPane(jtb);
                                    add(jsp);
                                    label = new JLabel("");
                                    
                                    //names buttons
                                    button1 = new JButton("Doctor");
                                    button2 = new JButton("Medication");
                                    button3 = new JButton("Patient");
                                    button4 = new JButton("Prescription");
                                    button5 = new JButton("Supplier");
                                    //add buttons to bottom panel
                                    jp.add(button1);
                                    jp.add(button2);
                                    jp.add(button3);
                                    jp.add(button4);
                                    jp.add(button5);
                                    //use label to check that query variable works properly
                                    jp.add(label);
                                    //makes clicking the button an ActionEvent
                                    button1.addActionListener(this);
                                    button2.addActionListener(this);
                                    button3.addActionListener(this);
                                    button4.addActionListener(this);
                                    button5.addActionListener(this);
                                    //set title, size, and close
                                    setTitle("Java/Oracle");
                                    setSize(800, 600);
                                    setDefaultCloseOperation(EXIT_ON_CLOSE);
                                    setVisible(true);
                    }
                    public void actionPerformed(ActionEvent e){
                    	if (e.getSource() == jtf){
                    		query = jtf.getText();
                    		label.setText(query);
                                    jtf.setText("");
                            }
                            
                            
                            if (e.getSource() == button1){
                            	jtb.setBackground(Color.RED);
                            	//put query in JLabel in JPanel to verify button works, reset JTextField text
                            	query = "SELECT * FROM DOCTOR";
                            	label.setText(query);
                            	jtf.setText("");
                            	//execute query
                            	execute = stmt.executeQuery(query);
                            }
                            if (e.getSource() == button2){
                            	jtb.setBackground(Color.GREEN);
                            	//put query in JLabel in JPanel to verify button works, reset JTextField text
                            	query = "SELECT * FROM MEDICATION";
                            	label.setText(query);
                            	jtf.setText("");
                            	//execute query
                            	execute = stmt.executeQuery(query);
                            }
                            if (e.getSource() == button3){
                            	jtb.setBackground(Color.BLUE);
                            	//put query in JLabel in JPanel to verify button works, reset JTextField text
                            	query = "SELECT * FROM PATIENT";
                            	label.setText(query);
                            	jtf.setText("");
                            	//execute query
                            	execute = stmt.executeQuery(query);
                            }
                            if (e.getSource() == button4){
                            	jtb.setBackground(Color.ORANGE);
                            	//put query in JLabel in JPanel to verify button works, reset JTextField text
                            	query = "SELECT * FROM PRESCRIPTION";
                            	label.setText(query);
                            	jtf.setText("");
                            	//execute query
                            	execute = stmt.executeQuery(query);
                            }
                            if (e.getSource() == button5){
                            	jtb.setBackground(Color.YELLOW);
                            	//put query in JLabel in JPanel to verify button works, reset JTextField text
                            	query = "SELECT * FROM SUPPLIER";
                            	label.setText(query);
                            	jtf.setText("");
                            	//execute query
                            	execute = stmt.executeQuery(query);
                            }
                    }
                    public static void main(String args[]) throws Exception{
                    	new myguidemo();  
                    }
    }