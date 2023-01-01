package framejava;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class login{

	private JFrame frame;
	private JTextField username;
	private JPasswordField password ;
	private JComboBox RoleCb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Project\\images.png"));
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 1220, 710);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setTitle("CR VOTING SYSTEM");
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(543, 260, 126, 27);
		frame.getContentPane().add(lblNewLabel);
		
		username = new JTextField();
		username.setBounds(700, 249, 204, 38);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(543, 332, 126, 27);
		frame.getContentPane().add(lblPassword);

		
		 password = new JPasswordField();
		password.setBounds(700, 331, 207, 38);
		frame.getContentPane().add(password);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(RoleCb.getSelectedIndex()==-1) {
					JOptionPane.showMessageDialog(null, "Are you voter or Admin");
					
				}
				else if (RoleCb.getSelectedIndex()==-0) {
					if(username.getText().isEmpty() || password.getText().isEmpty()) {
						
						JOptionPane.showMessageDialog(null, "Enter Username and Password");

					}
					else if (username.getText().equals("Admin") || password.getText().equals("Password")) {
						
						try {
						 new Candidates().setVisible(true);
						 frame.dispose();
						
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Wrong Username and password");
					}
				}
				
			}
		});
		loginBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		loginBtn.setBounds(807, 409, 99, 38);
		frame.getContentPane().add(loginBtn);
		
		String[] colum= {"Voter","admin"};
		
		RoleCb = new JComboBox(colum);
		RoleCb.setFont(new Font("Tahoma", Font.BOLD, 14));
		RoleCb.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Voter"}));
		RoleCb.setBounds(470, 93, 204, 57);
		frame.getContentPane().add(RoleCb);
		
		JLabel lblNewLabel_1 = new JLabel("CR VOTING SYSTEM", SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(441, 10, 313, 73);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("E:\\Project\\images.png"));
		lblNewLabel_1_1.setBounds(97, 211, 243, 258);
		frame.getContentPane().add(lblNewLabel_1_1);
	}
}
