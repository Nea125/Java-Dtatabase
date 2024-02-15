
package Database;
import javax.swing.JOptionPane;
public class Student_Information extends javax.swing.JFrame {
    Student_CRUD stu = new Student_CRUD();
    public Student_Information() {
        initComponents();
        tbtable.setModel(stu.getModel());
        stu.FetchData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtphp = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtjava = new javax.swing.JTextField();
        txtcsharp = new javax.swing.JTextField();
        cbgender = new javax.swing.JComboBox<>();
        btnexit = new necesario.MaterialButton();
        btnremove = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtable = new rojeru_san.complementos.RSTableMetro();
        btnsave = new com.k33ptoo.components.KButton();
        btnupdate = new necesario.MaterialButton();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnreset = new rojerusan.RSButtonMetro();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1261, 463));
        setMinimumSize(new java.awt.Dimension(1261, 463));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Gender :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 200, 70, 21);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Name   :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 140, 70, 21);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("ID      :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 100, 60, 21);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("C#       :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 300, 70, 21);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Java     :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 250, 70, 21);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("PHP    :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(290, 350, 70, 21);

        txtphp.setBackground(new java.awt.Color(51, 51, 51));
        txtphp.setForeground(new java.awt.Color(255, 255, 255));
        txtphp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtphp);
        txtphp.setBounds(370, 340, 160, 40);

        txtid.setEditable(false);
        txtid.setBackground(new java.awt.Color(51, 51, 51));
        txtid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 255, 255));
        txtid.setText("Auto ID");
        txtid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtid);
        txtid.setBounds(370, 80, 160, 40);

        txtname.setBackground(new java.awt.Color(51, 51, 51));
        txtname.setForeground(new java.awt.Color(255, 255, 255));
        txtname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtname);
        txtname.setBounds(370, 130, 160, 40);

        txtjava.setBackground(new java.awt.Color(51, 51, 51));
        txtjava.setForeground(new java.awt.Color(255, 255, 255));
        txtjava.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtjava);
        txtjava.setBounds(370, 240, 160, 40);

        txtcsharp.setBackground(new java.awt.Color(51, 51, 51));
        txtcsharp.setForeground(new java.awt.Color(255, 255, 255));
        txtcsharp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtcsharp);
        txtcsharp.setBounds(370, 290, 160, 40);

        cbgender.setBackground(new java.awt.Color(51, 51, 51));
        cbgender.setForeground(new java.awt.Color(255, 255, 255));
        cbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbgender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cbgender);
        cbgender.setBounds(370, 190, 160, 40);

        btnexit.setBackground(new java.awt.Color(102, 51, 255));
        btnexit.setForeground(new java.awt.Color(255, 102, 102));
        btnexit.setText("Exit");
        btnexit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit);
        btnexit.setBounds(1120, 110, 100, 40);

        btnremove.setForeground(new java.awt.Color(0, 153, 0));
        btnremove.setText("Remove");
        btnremove.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnremove);
        btnremove.setBounds(850, 110, 110, 40);

        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Java", "C#", "PHP", "Total", "Average", "Grade"
            }
        ));
        tbtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbtable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(540, 170, 700, 220);

        btnsave.setBackground(new java.awt.Color(204, 0, 0));
        btnsave.setText("Save");
        btnsave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave);
        btnsave.setBounds(550, 110, 120, 40);

        btnupdate.setBackground(new java.awt.Color(102, 51, 255));
        btnupdate.setForeground(new java.awt.Color(255, 102, 0));
        btnupdate.setText("Update");
        btnupdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(700, 110, 110, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Student Information");
        kGradientPanel1.add(jLabel1);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 1260, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\information.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 50, 300, 340);

        btnreset.setBackground(new java.awt.Color(0, 102, 102));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset);
        btnreset.setBounds(990, 110, 110, 40);

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 400, 1260, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String name = txtname.getText();
        String gender= cbgender.getSelectedItem().toString();
        double java = Double.parseDouble(txtjava.getText());
        double csharp = Double.parseDouble(txtcsharp.getText());
        double php = Double.parseDouble(txtphp.getText());
        stu.Save(name,gender,java,csharp,php);
        stu.FetchData();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tbtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtableMouseClicked
        int row = tbtable.getSelectedRow();
        txtid.setText(stu.getModel().getValueAt(row, 0).toString());
        txtname.setText(stu.getModel().getValueAt(row, 1).toString());
        cbgender.setSelectedItem(stu.getModel().getValueAt(row, 2));
        txtjava.setText(stu.getModel().getValueAt(row, 3).toString());
        txtcsharp.setText(stu.getModel().getValueAt(row, 4).toString());
        txtphp.setText(stu.getModel().getValueAt(row, 5).toString());
    }//GEN-LAST:event_tbtableMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        if(JOptionPane.showConfirmDialog(null,"Do you want to Update?","Update",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
                int id = Integer.parseInt(txtid.getText());
                String name = txtname.getText();
                String gender= cbgender.getSelectedItem().toString();
                double java = Double.parseDouble(txtjava.getText());
                double csharp = Double.parseDouble(txtcsharp.getText());
                double php = Double.parseDouble(txtphp.getText());
                stu.Update(id,name,gender,java,csharp,php);
                stu.FetchData();
            
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        int id = Integer.parseInt(txtid.getText());
        if(JOptionPane.showConfirmDialog(null,"Do You want to Remove ","Remove",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
           
            stu.Remove(id);
            stu.FetchData();
        }
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
       if(JOptionPane.showConfirmDialog(null,"Do You want to Remove ","Remove",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
           
            stu.Reset();
            stu.FetchData();
        }
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
       dispose();
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.MaterialButton btnexit;
    private com.k33ptoo.components.KButton btnremove;
    private rojerusan.RSButtonMetro btnreset;
    private com.k33ptoo.components.KButton btnsave;
    private necesario.MaterialButton btnupdate;
    private javax.swing.JComboBox<String> cbgender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private rojeru_san.complementos.RSTableMetro tbtable;
    private javax.swing.JTextField txtcsharp;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtjava;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphp;
    // End of variables declaration//GEN-END:variables
}
