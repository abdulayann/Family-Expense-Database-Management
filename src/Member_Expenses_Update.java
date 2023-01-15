
import Backend.ConnectSQL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Member_Expenses_Update extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    Statement pst1;
    ResultSet rs;

    public Member_Expenses_Update() {
        initComponents();
        con  = ConnectSQL.createC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        FetchBut = new javax.swing.JButton();
        txtAmt = new javax.swing.JTextField();
        txtMode = new javax.swing.JTextField();
        txtEid = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(470, 120));
        setMaximumSize(new java.awt.Dimension(1040, 720));
        setMinimumSize(new java.awt.Dimension(1040, 720));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 242));
        jPanel7.setMaximumSize(new java.awt.Dimension(1010, 700));
        jPanel7.setMinimumSize(new java.awt.Dimension(1010, 700));
        jPanel7.setPreferredSize(new java.awt.Dimension(1010, 700));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(192, 223, 241));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FetchBut.setBackground(new java.awt.Color(255, 255, 242));
        FetchBut.setFont(new java.awt.Font("Rockwell", 0, 28)); // NOI18N
        FetchBut.setForeground(new java.awt.Color(42, 68, 146));
        FetchBut.setText("FETCH");
        FetchBut.setToolTipText("");
        FetchBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 68, 148), 2));
        FetchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FetchButActionPerformed(evt);
            }
        });
        jPanel8.add(FetchBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 100, 40));

        txtAmt.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtAmt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(26, 69, 124)));
        txtAmt.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmtActionPerformed(evt);
            }
        });
        jPanel8.add(txtAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 210, 40));

        txtMode.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtMode.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(26, 69, 124)));
        txtMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeActionPerformed(evt);
            }
        });
        jPanel8.add(txtMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 210, 40));

        txtEid.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtEid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(26, 69, 124)));
        txtEid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEidActionPerformed(evt);
            }
        });
        jPanel8.add(txtEid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 180, 40));

        txtDate.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(26, 69, 124)));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        jPanel8.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 210, 40));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(42, 55, 135));
        jLabel4.setText("AMOUNT :");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 170, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 55, 135));
        jLabel3.setText("CATEGORY :");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 210, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 55, 135));
        jLabel5.setText("MODE :");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(42, 55, 135));
        jLabel6.setText("EID :");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, 30));

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(42, 55, 135));
        jLabel7.setText("DATE :");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        txtCategory.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        txtCategory.setForeground(new java.awt.Color(42, 68, 148));
        txtCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Housing ", "Food ", "Transportation", "Childcare", "Healthcare", "Education", "Entertainment", "Clothing", "Debt payments", "Savings" }));
        txtCategory.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(26, 69, 124)));
        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });
        jPanel8.add(txtCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 210, 40));

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(42, 55, 135));
        jLabel8.setText("NAME :");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, 30));

        txtName.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(26, 69, 124)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel8.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 210, 40));

        jButton9.setBackground(new java.awt.Color(255, 255, 242));
        jButton9.setFont(new java.awt.Font("Rockwell", 0, 28)); // NOI18N
        jButton9.setForeground(new java.awt.Color(42, 68, 146));
        jButton9.setText("UPDATE");
        jButton9.setToolTipText("");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 68, 148), 2));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 150, 40));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 920, 540));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 34, 107));
        jLabel2.setText("EXPENSE DETAILS:");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 371, 69));

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
        jPanel7.add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 82, 40));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FetchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FetchButActionPerformed
             try {
           
             int EID = Integer.parseInt(txtEid.getText());
             
             pst1 = con.createStatement();
             rs = pst1.executeQuery("select * from expenses where eid='"+EID+"'and user='"+Login.usern+"'");
             if(rs.next())
             {
            txtName.setText(rs.getString(3));
            txtAmt.setText(rs.getString(4));
            txtCategory.setSelectedItem(rs.getString(5));
            txtDate.setText(rs.getString(6));
            txtMode.setText(rs.getString(7));
             }
        

            JOptionPane.showMessageDialog(this,"Fetched Successfully");

        } catch (SQLException ex) {
                    ex.printStackTrace();
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_FetchButActionPerformed

    private void txtAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmtActionPerformed

    private void txtModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeActionPerformed

    private void txtEidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEidActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryActionPerformed

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
            dispose();

    }//GEN-LAST:event_Back_buttonActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
          String name,amount,category,mode,date,eid;
            name = txtName.getText();
             amount = txtAmt.getText();
             category = txtCategory.getSelectedItem().toString();
             mode = txtMode.getText();
             date = txtDate.getText();
              eid = txtEid.getText();

        try {
            pst = con.prepareStatement("update expenses set name=?,amount=?,category=?,date=?,mode=? where eid=? and user=?");
      
            pst.setString(1,name);
            pst.setString(2,amount);
            pst.setString(3,category);
            pst.setString(4,date);
            pst.setString(5,mode);
            pst.setString(6, eid);
            pst.setString(7,Login.usern);
            pst.executeUpdate();
            
            
JOptionPane.showMessageDialog(this,"Updated Successfully");
     } catch (SQLException ex) {
        
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,ex);
            
        }

             txtName.setText("");
            txtAmt.setText("");
            txtMode.setText("");
            txtDate.setText("");
            txtEid.setText("");
            
            txtName.requestFocus();
            txtName.requestFocus();
    }//GEN-LAST:event_jButton9ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Member_Expenses_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_Expenses_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_Expenses_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_Expenses_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Expenses_Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton FetchBut;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtAmt;
    private javax.swing.JComboBox<String> txtCategory;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEid;
    private javax.swing.JTextField txtMode;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
