
package Database;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;  // throw data into database
import java.sql.ResultSet;         // fecth data from database
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Person extends javax.swing.JFrame
{   
    PreparedStatement ps;
    ResultSet r;
    DefaultTableModel model;
    
    public Person()
    {
        initComponents();
        model = (DefaultTableModel) tbtable.getModel();
        FetchData();
       
    }
    Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb?autoReconnect=true&useSSL=false","root","");
            System.out.println("Completed.....");
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Error: "+e.getMessage());
        }
     return con;
  }
  void FetchData()
   {
        try {
            ps = connection().prepareStatement("SELECT *FROM tbperson");
            r = ps.executeQuery();
            while(r.next())
            {
                Object row[]={
                    r.getInt("ID"),
                    r.getString("Name"),
                    r.getString("Gender"),
                    r.getInt("Age"),
                    
                };
                model.addRow(row);
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
  void Clear()
  {
      txtid.setText("");
      txtname.setText("");
      buttonGroup1.clearSelection();
      txtage.setText("");
  }
   
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtable = new javax.swing.JTable();
        btnexit = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(869, 369));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("PERSON INFORMtioin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 20, 260, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Age");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 280, 40, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 80, 40, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 150, 70, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 210, 70, 30);
        getContentPane().add(txtage);
        txtage.setBounds(160, 280, 180, 30);

        txtid.setEditable(false);
        txtid.setText("Auto ID");
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid);
        txtid.setBounds(170, 80, 170, 30);
        getContentPane().add(txtname);
        txtname.setBounds(170, 150, 170, 30);

        buttonGroup1.add(rbmale);
        rbmale.setText("Male");
        getContentPane().add(rbmale);
        rbmale.setBounds(160, 220, 70, 21);

        buttonGroup1.add(rbfemale);
        rbfemale.setText("Female");
        getContentPane().add(rbfemale);
        rbfemale.setBounds(250, 220, 80, 21);

        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Age"
            }
        ));
        tbtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbtable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 80, 480, 190);

        btnexit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit);
        btnexit.setBounds(740, 280, 100, 30);

        btnsave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave);
        btnsave.setBounds(360, 280, 100, 30);

        btnupdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(490, 280, 100, 30);

        btnremove.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnremove);
        btnremove.setBounds(620, 280, 100, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
      String name = txtname.getText();
      String gender;
      if(rbmale.isSelected())
      {
          gender="Male";
      }
      else
      {
          gender="Female";
      }
      int age = Integer.parseInt(txtage.getText());
        try {
            ps = connection().prepareStatement("INSERT INTO tbperson(Name,Gender,Age)VALUES(?,?,?)");
            ps.setString(1,name);
            ps.setString(2, gender);
            ps.setInt(3, age);
            int index = ps.executeUpdate();
            if(index>0)
            {
                model.setRowCount(0);
                FetchData();
                JOptionPane.showMessageDialog(null,"Data Saved....");
                Clear();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
      
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tbtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtableMouseClicked
      int row = tbtable.getSelectedRow();
      txtid.setText(model.getValueAt(row, 0).toString());
      txtname.setText(model.getValueAt(row, 1).toString());
      String gender= model.getValueAt(row, 2).toString();
      if(gender.equals("Male"))
      {
          rbmale.setSelected(true);
      }
      else
      {
          rbfemale.setSelected(true);
      }
      txtage.setText(model.getValueAt(row, 3).toString());

    }//GEN-LAST:event_tbtableMouseClicked

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
    int id = Integer.parseInt(txtid.getText());
    String name = txtname.getText();
      String gender;
      if(rbmale.isSelected())
      {
          gender="Male";
      }
      else
      {
          gender="Female";
      }
      int age = Integer.parseInt(txtage.getText());
        try {
            ps = connection().prepareStatement("UPDATE  tbperson SET Name=?,Gender=?,Age=? WHERE ID=?");
           
            ps.setString(1,name);
            ps.setString(2, gender);
            ps.setInt(3, age);
            ps.setInt(4, id);
            int index = ps.executeUpdate();
            if(index>0)
            {
                model.setRowCount(0);
                FetchData();
                JOptionPane.showMessageDialog(null,"Data Updated....");
                Clear();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
       int id = Integer.parseInt(txtid.getText());
        try {
            ps = connection().prepareStatement("DELETE FROM tbperson WHERE ID =?");
            ps.setInt(1, id);
            int index = ps.executeUpdate();
            if(index>0)
            {
                model.setRowCount(0);
                FetchData();
                JOptionPane.showMessageDialog(null,"Delete Success....");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnremoveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Person().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JTable tbtable;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
