package framejava;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Voting {

	private JFrame frame;
	private JTextField Cname;
	private JTextField StudentId;
	private JTable table;
	private int Key=-1;
	private int Electid;
	private JLabel vote;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Voting window = new Voting();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Voting() {
		initialize();
		connect();
		table_load();
		vote.setVisible(false);
		
	}
	
	   Connection con1;
	   PreparedStatement insert;
	   ResultSet rs;
	public void connect() {
		
	       try {
	           System.out.println("Connected Database2");
	           Class.forName("com.mysql.cj.jdbc.Driver"); 
	             System.out.println("Connected Database3");
	            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb", "root", "");    

	       } catch (ClassNotFoundException | SQLException ex) {
	    	   ex.printStackTrace();
	       }
		
	}

	
	  public void table_load()
	    {
	    	try 
	    	{
		    insert = con1.prepareStatement("select * from candidatetbl");
		    rs = insert.executeQuery();
		    table.setModel(DbUtils.resultSetToTableModel(rs));
		    
		   
		} 
	    	catch (SQLException e) 
	    	 {
	    		e.printStackTrace();
		  } 
	    }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Project\\images.png"));
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 1220, 710);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("CR VOTING SYSTEM");
		frame.getContentPane().setLayout(null);
		
		JButton button_3_1 = new JButton("Back");
		button_3_1.setBounds(511, 673, 105, 46);
		button_3_1.setForeground(new Color(0, 0, 0));
		button_3_1.setFont(new Font("Dialog", Font.BOLD, 20));
		button_3_1.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(button_3_1);
		
		JLabel lblYourCandidate = new JLabel("Your Candidate");
		lblYourCandidate.setBounds(146, 197, 190, 27);
		lblYourCandidate.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblYourCandidate);
		
		JLabel lblNewLabel_1_1 = new JLabel("CR VOTING SYSTEM", SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(416, 10, 313, 73);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblManageCandidates_1 = new JLabel("Welcome In CR Voting System");
		lblManageCandidates_1.setBounds(426, 81, 496, 27);
		lblManageCandidates_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblManageCandidates_1);
		
		JButton btnVote = new JButton("Vote");
		btnVote.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Cname.getText().isEmpty()) {
					vote.setVisible(false);
				}
				else {
					vote.setVisible(true);
				}
				
				
				 
				try {

					insert = con1.prepareStatement("insert into voterstbl (VoterId,ElectionId,CandidateId ) values(?,?,?)");
					System.out.println("Connected Database5");
					insert.setInt(1, Electid);
					insert.setInt(2, Electid);
					insert.setInt(3, Key);
					
					insert.executeUpdate();
					System.out.println("Connected Database6");
					
					System.out.println("Connected Database7");
					table_load();
//					System.out.println("Connected Database8");
//					ElectionNameTb.setText("");
//					System.out.println("Connected Database9");
//					ElectionNameTb.requestFocus();

				}
				catch (SQLException ex) {
					
					ex.printStackTrace();
					
				}
				
			}
		});
		btnVote.setForeground(new Color(255, 255, 255));
		btnVote.setFont(new Font("Dialog", Font.BOLD, 20));
		btnVote.setBackground(new Color(0, 128, 0));
		btnVote.setBounds(558, 244, 105, 46);
		frame.getContentPane().add(btnVote);
		
		JLabel lblName_1_1 = new JLabel("Candidate List");
		lblName_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName_1_1.setBounds(990, 312, 190, 27);
		frame.getContentPane().add(lblName_1_1);
		
		Cname = new JTextField();
		Cname.setEditable(false);
		Cname.setColumns(10);
		Cname.setBounds(398, 196, 196, 38);
		frame.getContentPane().add(Cname);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(451, 135, 126, 27);
		frame.getContentPane().add(lblName);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStudentId.setBounds(628, 135, 126, 27);
		frame.getContentPane().add(lblStudentId);
		
		StudentId = new JTextField();
		StudentId.setEditable(false);
		StudentId.setColumns(10);
		StudentId.setBounds(604, 196, 204, 38);
		frame.getContentPane().add(StudentId);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model= (DefaultTableModel) table.getModel();
				int MyIndex =table.getSelectedRow();
				Key=Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
				Cname.setText(model.getValueAt(MyIndex, 1).toString());
				StudentId.setText(model.getValueAt(MyIndex, 2).toString());
			}
		});
		scrollPane.setBounds(58, 343, 1138, 320);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
	    vote = new JLabel("Vote Counted !!");
		vote.setForeground(new Color(0, 128, 0));
		vote.setHorizontalAlignment(SwingConstants.LEFT);
		vote.setFont(new Font("Tahoma", Font.BOLD, 20));
		vote.setBounds(542, 312, 190, 27);
		frame.getContentPane().add(vote);
	}
}
