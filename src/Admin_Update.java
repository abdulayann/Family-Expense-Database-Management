import java.sql.*;
import Backend.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Admin_Update extends javax.swing.JFrame {
     
    public Admin_Update() {
        initComponents();
        con = ConnectSQL.createC();
    }
    Connection con;
    PreparedStatement pst;
    Statement pst1;
    ResultSet rs;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        FetchBut = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtRelation = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtOccupation = new javax.swing.JTextField();
        txtPw = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        FetchUsername = new javax.swing.JTextField();
        UpdateBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(487, 120));
        setMaximizedBounds(new java.awt.Rectangle(1010, 700, 700, 700));
        setMaximumSize(new java.awt.Dimension(1010, 700));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1010, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 242));
        jPanel1.setMaximumSize(new java.awt.Dimension(1010, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(1010, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(192, 223, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FetchBut.setBackground(new java.awt.Color(255, 255, 242));
        FetchBut.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        FetchBut.setForeground(new java.awt.Color(42, 68, 146));
        FetchBut.setText("SEARCH");
        FetchBut.setToolTipText("");
        FetchBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 68, 148), 2));
        FetchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FetchButActionPerformed(evt);
            }
        });
        jPanel3.add(FetchBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 90, 40));

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(42, 55, 135));
        jLabel8.setText("RELATION :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        txtRelation.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtRelation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        txtRelation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRelationActionPerformed(evt);
            }
        });
        jPanel3.add(txtRelation, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 210, 40));

        txtName.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        txtName.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 210, 40));

        txtAge.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtAge.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        jPanel3.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 210, 40));

        txtDOB.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtDOB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });
        jPanel3.add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 210, 40));

        txtGender.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtGender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        jPanel3.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 210, 40));

        txtOccupation.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtOccupation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        txtOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOccupationActionPerformed(evt);
            }
        });
        jPanel3.add(txtOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 210, 40));

        txtPw.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtPw.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        txtPw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwActionPerformed(evt);
            }
        });
        jPanel3.add(txtPw, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 210, 40));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(42, 55, 135));
        jLabel4.setText("NAME :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 170, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 55, 135));
        jLabel3.setText("AGE :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 140, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 55, 135));
        jLabel5.setText("DOB :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(42, 55, 135));
        jLabel6.setText("GENDER :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, 30));

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(42, 55, 135));
        jLabel7.setText("OCCUPATION :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(42, 55, 135));
        jLabel11.setText("PASSWORD :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(42, 55, 135));
        jLabel12.setText("ENTER USERNAME :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 320, 60));

        FetchUsername.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        FetchUsername.setToolTipText("");
        FetchUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        FetchUsername.setMargin(new java.awt.Insets(2, 10, 2, 6));
        FetchUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FetchUsernameActionPerformed(evt);
            }
        });
        jPanel3.add(FetchUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 220, 40));

        UpdateBut.setBackground(new java.awt.Color(255, 255, 242));
        UpdateBut.setFont(new java.awt.Font("Rockwell", 0, 28)); // NOI18N
        UpdateBut.setForeground(new java.awt.Color(42, 68, 146));
        UpdateBut.setText("UPDATE");
        UpdateBut.setToolTipText("");
        UpdateBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 68, 148), 2));
        UpdateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButActionPerformed(evt);
            }
        });
        jPanel3.add(UpdateBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 130, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 920, 550));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 34, 107));
        jLabel2.setText("FILL THE FORM:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 371, 69));

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
        jPanel1.add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 82, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FetchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FetchButActionPerformed
        try {
             String uname = FetchUsername.getText();
             System.out.println(uname);
             pst1 = con.createStatement();
             rs = pst1.executeQuery("select * from members where username='"+uname+"'");
             if(rs.next())
             {
            txtName.setText(rs.getString(2));
            txtAge.setText(rs.getString(3));
            txtDOB.setText(rs.getString(4));
            txtGender.setText(rs.getString(5));
            txtOccupation.setText(rs.getString(6));
            txtRelation.setText(rs.getString(7));
            txtPw.setText(rs.getString(8));
             }
        

            JOptionPane.showMessageDialog(this,"Fetched Successfully");

        } catch (SQLException ex) {
                    ex.printStackTrace();
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_FetchButActionPerformed

    private void txtRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRelationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelationActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccupationActionPerformed

    private void txtPwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPwActionPerformed

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void FetchUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FetchUsernameActionPerformed

    }//GEN-LAST:event_FetchUsernameActionPerformed

    private void UpdateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButActionPerformed
            String uname = FetchUsername.getText();
            String name,age,dob,gender,occupation,relation,pw;
            name = txtName.getText();
            age = txtAge.getText();
            dob = txtDOB.getText();
            gender = txtGender.getText();
            occupation = txtOccupation.getText();
            relation = txtRelation.getText();
            pw = txtPw.getText();

        try {
            pst = con.prepareStatement("update members set name=?,age=?,dob=?,gender=?,occupation=?,relation=?,pw=? where username=?");
      
            pst.setString(1,name);
            pst.setString(2,age);
            pst.setString(3,dob);
            pst.setString(4,gender);
            pst.setString(5,occupation);
            pst.setString(6,relation);
            pst.setString(7, pw);
            pst.setString(8, uname);
            pst.executeUpdate();
JOptionPane.showMessageDialog(this,"Updated Successfully");
     } catch (SQLException ex) {
            Logger.getLogger(Admin_Update.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            
            JOptionPane.showMessageDialog(this,ex);
        }

            txtName.setText("");
            txtAge.setText("");
            txtDOB.setText("");
            txtGender.setText("");
            txtOccupation.setText("");
            txtRelation.setText("");
            FetchUsername.setText("");
            txtPw.setText("");
            txtName.requestFocus();
    }//GEN-LAST:event_UpdateButActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton FetchBut;
    private javax.swing.JTextField FetchUsername;
    private javax.swing.JButton UpdateBut;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JPasswordField txtPw;
    private javax.swing.JTextField txtRelation;
    // End of variables declaration//GEN-END:variables
}
