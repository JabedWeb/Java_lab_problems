package framejava;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Voting {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

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
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(44, 373, 1138, 274);
		frame.getContentPane().add(scrollPane1);
		
		JTable table = new JTable();
		scrollPane1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		
		JButton btnVote = new JButton("Vote");
		btnVote.setForeground(new Color(255, 255, 255));
		btnVote.setFont(new Font("Dialog", Font.BOLD, 20));
		btnVote.setBackground(new Color(0, 128, 0));
		btnVote.setBounds(558, 244, 105, 46);
		frame.getContentPane().add(btnVote);
		
		JLabel lblName_1_1 = new JLabel("Candidate List");
		lblName_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName_1_1.setBounds(489, 321, 190, 27);
		frame.getContentPane().add(lblName_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(398, 196, 196, 38);
		frame.getContentPane().add(textField);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(451, 135, 126, 27);
		frame.getContentPane().add(lblName);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStudentId.setBounds(628, 135, 126, 27);
		frame.getContentPane().add(lblStudentId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(604, 196, 204, 38);
		frame.getContentPane().add(textField_1);
	}
}
