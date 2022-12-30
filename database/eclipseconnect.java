package database;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.*;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eclipseconnect extends JFrame {

	private JPanel contentPane;
	private JTextField studentname;
	private JTextField studentid;
	private JTextField batch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eclipseconnect frame = new eclipseconnect();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public eclipseconnect() {
		initialize();
		connect();
	}
	
	   Connection con1;
	   PreparedStatement insert;
	
	public void connect() {
		
	       try {
	          
	           Class.forName("com.mysql.cj.jdbc.Driver"); 
	           con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "");    

	       } catch (ClassNotFoundException | SQLException ex) {
	          
	       }
		
	}
	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Shop");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(460, 28, 131, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(45, 96, 168, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Student ID");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(45, 187, 168, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Batch");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(45, 281, 168, 29);
		contentPane.add(lblNewLabel_1_1_1);
		
		studentname = new JTextField();
		studentname.setBounds(258, 103, 189, 22);
		contentPane.add(studentname);
		studentname.setColumns(10);
		
		studentid = new JTextField();
		studentid.setColumns(10);
		studentid.setBounds(258, 193, 189, 22);
		contentPane.add(studentid);
		
		batch = new JTextField();
		batch.setColumns(10);
		batch.setBounds(258, 288, 189, 22);
		contentPane.add(batch);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String name = studentname.getText();
			       String Batch = batch.getText();
			       String studentId = studentid.getText();
			       System.out.println("Connected Database");

			       try {
			           System.out.println("Connected Database2");
			           Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
			             System.out.println("Connected Database3");
			           con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "");
			             System.out.println("Connected Database4");
			           insert = con1.prepareStatement("insert into book (Name,Batch,StudentId)values(?,?,?)");
			           
			            System.out.println("Connected Database5");
			           insert.setString(1, name);
			           insert.setString(2, Batch);
			           insert.setString(3, studentId);
			            System.out.println("Connected Database6");
			           insert.executeUpdate();
			           JOptionPane.showMessageDialog(null, "Record Saved");

			           studentname.setText("");
			           batch.setText("");
			           studentid.setText("");
			           studentname.requestFocus();
			             

			       } catch (ClassNotFoundException | SQLException ex) {
			           ex.printStackTrace();
			       }
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(90, 386, 102, 39);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(233, 386, 102, 39);
		contentPane.add(btnClear);
	}
}
