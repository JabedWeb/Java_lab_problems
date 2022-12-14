import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
*
* @author User
*/
public class Front extends javax.swing.JFrame {

   /**
    * Creates new form Front
    */
   public Front() {
       initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   private void initComponents() {

       jLabel1 = new javax.swing.JLabel();
       jPanel1 = new javax.swing.JPanel();
       jLabel2 = new javax.swing.JLabel();
       jLabel3 = new javax.swing.JLabel();
       jLabel4 = new javax.swing.JLabel();
       studentname = new javax.swing.JTextField();
       studentid = new javax.swing.JTextField();
       batch = new javax.swing.JTextField();
       jButton1 = new javax.swing.JButton();
       jButton2 = new javax.swing.JButton();
       jButton3 = new javax.swing.JButton();
       jScrollPane1 = new javax.swing.JScrollPane();
       jTable1 = new javax.swing.JTable();
       jPanel2 = new javax.swing.JPanel();
       jLabel5 = new javax.swing.JLabel();
       jTextField4 = new javax.swing.JTextField();
       jButton4 = new javax.swing.JButton();
       jButton5 = new javax.swing.JButton();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
       jLabel1.setText("Book Shop");

       jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registration"));

       jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
       jLabel2.setText("Student Name");

       jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
       jLabel3.setText("Student ID");

       jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
       jLabel4.setText("Batch");

       studentname.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               studentnameActionPerformed(evt);
           }
       });

       studentid.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               studentidActionPerformed(evt);
           }
       });

       batch.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               batchActionPerformed(evt);
           }
       });

       jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
       jButton1.setText("Exit");
       jButton1.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton1ActionPerformed(evt);
           }
       });

       jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
       jButton2.setText("Clear");
       jButton2.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton2ActionPerformed(evt);
           }
       });

       jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
       jButton3.setText("Save");
       jButton3.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton3ActionPerformed(evt);
           }
       });

       javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
       jPanel1.setLayout(jPanel1Layout);
       jPanel1Layout.setHorizontalGroup(
           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanel1Layout.createSequentialGroup()
               .addGap(39, 39, 39)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGroup(jPanel1Layout.createSequentialGroup()
                       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                       .addGap(40, 40, 40)
                       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(studentid, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                           .addComponent(studentname)
                           .addComponent(batch)))
                   .addGroup(jPanel1Layout.createSequentialGroup()
                       .addGap(13, 13, 13)
                       .addComponent(jButton3)
                       .addGap(68, 68, 68)
                       .addComponent(jButton1)
                       .addGap(65, 65, 65)
                       .addComponent(jButton2)))
               .addContainerGap(40, Short.MAX_VALUE))
       );
       jPanel1Layout.setVerticalGroup(
           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanel1Layout.createSequentialGroup()
               .addGap(22, 22, 22)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                   .addComponent(studentname)
                   .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGap(56, 56, 56)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel4)
                   .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(54, 54, 54)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel3)
                   .addComponent(studentid))
               .addGap(98, 98, 98)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jButton2)
                   .addComponent(jButton1)
                   .addComponent(jButton3))
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );

       jTable1.setModel(new javax.swing.table.DefaultTableModel(
           new Object [][] {
               {null, null, null, null},
               {null, null, null, null},
               {null, null, null, null},
               {null, null, null, null}
           },
           new String [] {
               "Title 1", "Title 2", "Title 3", "Title 4"
           }
       ));
       jScrollPane1.setViewportView(jTable1);

       jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

       jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
       jLabel5.setText("Student ID");

       jTextField4.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jTextField4ActionPerformed(evt);
           }
       });

       javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
       jPanel2.setLayout(jPanel2Layout);
       jPanel2Layout.setHorizontalGroup(
           jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
               .addContainerGap(45, Short.MAX_VALUE)
               .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(39, 39, 39)
               .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(83, 83, 83))
       );
       jPanel2Layout.setVerticalGroup(
           jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanel2Layout.createSequentialGroup()
               .addGap(11, 11, 11)
               .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel5))
               .addContainerGap(21, Short.MAX_VALUE))
       );

       jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
       jButton4.setText("Update");
       jButton4.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton4ActionPerformed(evt);
           }
       });

       jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
       jButton5.setText("Delete");
       jButton5.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton5ActionPerformed(evt);
           }
       });

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                   .addGroup(layout.createSequentialGroup()
                       .addContainerGap()
                       .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                       .addGap(40, 40, 40)
                       .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createSequentialGroup()
                       .addGap(56, 56, 56)
                       .addComponent(jButton4)
                       .addGap(68, 68, 68)
                       .addComponent(jButton5)
                       .addContainerGap())
                   .addGroup(layout.createSequentialGroup()
                       .addGap(26, 26, 26)
                       .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))))
           .addGroup(layout.createSequentialGroup()
               .addGap(483, 483, 483)
               .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap())
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGap(47, 47, 47)
               .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(40, 40, 40)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createSequentialGroup()
                       .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                       .addGap(18, 18, 18))
                   .addGroup(layout.createSequentialGroup()
                       .addGap(8, 8, 8)
                       .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                       .addComponent(jButton4)
                       .addComponent(jButton5)))
               .addContainerGap())
       );

       pack();
   }// </editor-fold>                        

   private void studentnameActionPerformed(java.awt.event.ActionEvent evt) {                                            
       // TODO add your handling code here:
   }                                           

   private void studentidActionPerformed(java.awt.event.ActionEvent evt) {                                          
       // TODO add your handling code here:
   }                                         

   private void batchActionPerformed(java.awt.event.ActionEvent evt) {                                      
       // TODO add your handling code here:
   }                                     

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
   }                                        

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
   }                                        
   Connection con1;
   PreparedStatement insert;

   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       

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
           JOptionPane.showMessageDialog(this, "Record Saved");

           studentname.setText("");
           batch.setText("");
           studentid.setText("");
             

       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(Front.class.getName()).log(Level.SEVERE, null, ex);
       }

   }                                        

   private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            

   }                                           

   private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
   }                                        

   private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
   }                                        

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
       try {
           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               if ("Nimbus".equals(info.getName())) {
                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   break;
               }
           }
       } catch (ClassNotFoundException ex) {
           java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }

       /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           @Override
           public void run() {
               new Front().setVisible(true);
           }
       });
   }

   // Variables declaration - do not modify                     
   private javax.swing.JTextField batch;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JButton jButton4;
   private javax.swing.JButton jButton5;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTable1;
   private javax.swing.JTextField jTextField4;
   private javax.swing.JTextField studentid;
   private javax.swing.JTextField studentname;
   // End of variables declaration                   
}
{
    
}


