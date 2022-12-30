import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class voting extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	int a =0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					voting frame = new voting();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public voting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Voting", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(45, 128, 448, 363);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Vote");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=a+1;
				String coun =String.valueOf(a);
				textField.setText(coun);
			}
		});
		btnNewButton.setBounds(10, 33, 125, 37);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Count ");
		lblNewLabel.setBounds(21, 207, 45, 13);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(95, 204, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
	}
}
