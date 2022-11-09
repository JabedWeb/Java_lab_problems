
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cse
 */
import javax.swing.*;  
import java.awt.event.*;  
public class FirstLab implements ActionListener{  
    JTextField tf1,tf2,tf3;  
    JButton b1;  
    FirstLab(){  
        JFrame f= new JFrame();  
        tf1=new JTextField(50);  
        tf1.setBounds(50,50,250,20);  
        tf2=new JTextField(20);  
        tf2.setBounds(50,100,250,20);  
        tf3=new JTextField();  
        tf3.setBounds(50,150,250,20);  
        tf3.setEditable(false);   
        b1=new JButton("CGPA CALCULATION");  
        b1.setBounds(50,200,250,50);  
        b1.addActionListener(this);  

        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        if(e.getSource()==b1){  
            c=a+b;  
        }
        double cgpa=c/2;
        String output="not found";
        
        if(a<33 || b <33){
            output="Failed";
        }
        else if (cgpa>50){
            output="3.00";
        }
        else if(cgpa>90){
            output="4.00";
        }
  
        tf3.setText(output);  
    }  
public static void main(String[] args) {  
    new FirstLab();  
} }  
