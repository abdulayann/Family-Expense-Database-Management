
public class Admin_Member_Info extends javax.swing.JFrame {

    public Admin_Member_Info() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Back_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtUsername1 = new javax.swing.JTextField();
        SearchBut = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(487, 120));
        setMaximumSize(new java.awt.Dimension(1010, 700));
        setMinimumSize(new java.awt.Dimension(1010, 700));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1010, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 242));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back_button.setBackground(new java.awt.Color(255, 255, 242));
        Back_button.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Back_button.setForeground(new java.awt.Color(42, 68, 146));
        Back_button.setText("Back");
        Back_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        jPanel3.add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 82, 40));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 34, 107));
        jLabel2.setText("TABLE :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 180, 69));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(42, 55, 135));
        jLabel12.setText("CRITERIA:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 120, 60));

        txtUsername1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtUsername1.setToolTipText("");
        txtUsername1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        txtUsername1.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtUsername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsername1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 200, 40));

        SearchBut.setBackground(new java.awt.Color(255, 255, 242));
        SearchBut.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        SearchBut.setForeground(new java.awt.Color(42, 68, 146));
        SearchBut.setText("SEARCH");
        SearchBut.setToolTipText("");
        SearchBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 68, 148), 2));
        SearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButActionPerformed(evt);
            }
        });
        jPanel3.add(SearchBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 90, 40));

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(42, 55, 135));
        jLabel13.setText("USERNAME :");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 210, 60));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 90, 232));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Expenses", "Loans", "Goals", "Savings", "Incomes", " " }));
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 140, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed

        dispose();

    }//GEN-LAST:event_Back_buttonActionPerformed

    private void txtUsername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsername1ActionPerformed

    }//GEN-LAST:event_txtUsername1ActionPerformed

    private void SearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButActionPerformed
//        try {
//
//            String name,age,dob,gender,occupation,role,username,pw;
//            name = txtName.getText();
//            age = txtAge.getText();
//            dob = txtDOB.getText();
//            gender = txtGender.getText();
//            occupation = txtOccupation.getText();
//            role = txtRole.getText();
//
//            //            income = txtIncome.getText();
//            username = txtUsername.getText();
//            pw = txtPw.getText();
//
//            pst = con.prepareStatement("insert into members(name,age,dob,gender,occupation,role,username,pw)values(?,?,?,?,?,?,?,?)");
//            pst.setString(1,name);
//            pst.setString(2,age);
//            pst.setString(3,dob);
//            pst.setString(4,gender);
//            pst.setString(5,occupation);
//            pst.setString(6,role);
//            pst.setString(7, username);
//            pst.setString(8, pw);
//            pst.executeUpdate();
//
//            txtName.setText("");
//            txtAge.setText("");
//            txtDOB.setText("");
//            txtGender.setText("");
//            txtOccupation.setText("");
//            txtRole.setText("");
//            txtUsername.setText("");
//            txtPw.setText("");
//            txtName.requestFocus();
//
//            JOptionPane.showMessageDialog(this,"Added Successfully\nUsername :"+username+"\nPassword:"+pw);
//
//        } catch (SQLException ex) {
//
//            JOptionPane.showMessageDialog(this,"Please fill the details properly!");
//        }
    }//GEN-LAST:event_SearchButActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Member_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Member_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Member_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Member_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Member_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton SearchBut;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtUsername1;
    // End of variables declaration//GEN-END:variables
}
