import javax.swing.JFrame;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class code extends JFrame{
	
	private JLabel label;
	private JButton button;
	
	private Container c ;
	
	code(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(20, 30, 400, 400);
		this.setTitle("login demo");
		c=this.getContentPane();
		c.setLayout(null);
		
		
		
		
		label=new JLabel("HELLOW");
		label.setBounds(20, 30, 50, 30);
		c.add(label);
		button=new JButton("HELLOW");
		button.setBounds(20, 70, 40, 40);
		c.add(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				label.setVisible(false);
			}
			
			
		} );
		
		
	}
	public static void main(String[] args) {
		code window=new code();
		window.setVisible(true);
	}

}
