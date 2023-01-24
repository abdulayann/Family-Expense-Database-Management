
import Backend.ConnectSQL;
import java.sql.*;
import javax.swing.JOptionPane;

public class Admin_Memeber_Manage extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Admin_Memeber_Manage() {
        initComponents();
        con = ConnectSQL.createC();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtRelation = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtOccupation = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPw = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        FetchBut = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        UpdateBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(540, 20, 925, 625));
        setLocation(new java.awt.Point(487, 120));
        setMinimumSize(new java.awt.Dimension(1040, 720));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 242));
        jPanel1.setMaximumSize(new java.awt.Dimension(1010, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(1010, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(192, 223, 241));

        jButton5.setBackground(new java.awt.Color(255, 255, 242));
        jButton5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(42, 68, 146));
        jButton5.setText(" ADD");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(42, 55, 135));
        jLabel8.setText("RELATION :");

        txtRelation.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtRelation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRelation.setPreferredSize(new java.awt.Dimension(200, 50));
        txtRelation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRelationActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtName.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtName.setPreferredSize(new java.awt.Dimension(200, 50));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAge.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAge.setPreferredSize(new java.awt.Dimension(200, 50));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtDOB.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtDOB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDOB.setPreferredSize(new java.awt.Dimension(200, 50));
        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        txtGender.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtGender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGender.setPreferredSize(new java.awt.Dimension(200, 50));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        txtOccupation.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtOccupation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOccupation.setPreferredSize(new java.awt.Dimension(200, 50));
        txtOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOccupationActionPerformed(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsername.setPreferredSize(new java.awt.Dimension(200, 50));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtPw.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtPw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPw.setPreferredSize(new java.awt.Dimension(200, 50));
        txtPw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(42, 55, 135));
        jLabel4.setText("NAME :");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 55, 135));
        jLabel3.setText("AGE :");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 55, 135));
        jLabel5.setText("DOB :");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(42, 55, 135));
        jLabel6.setText("GENDER :");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(42, 55, 135));
        jLabel7.setText("OCCUPATION :");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(42, 55, 135));
        jLabel11.setText("PASSWORD :");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(42, 55, 135));
        jLabel10.setText("USERNAME :");

        FetchBut.setBackground(new java.awt.Color(255, 255, 242));
        FetchBut.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        FetchBut.setForeground(new java.awt.Color(42, 68, 146));
        FetchBut.setText("SEARCH");
        FetchBut.setToolTipText("");
        FetchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FetchButActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 242));
        jButton6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(42, 68, 146));
        jButton6.setText("DELETE");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        UpdateBut.setBackground(new java.awt.Color(255, 255, 242));
        UpdateBut.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        UpdateBut.setForeground(new java.awt.Color(42, 68, 146));
        UpdateBut.setText("UPDATE");
        UpdateBut.setToolTipText("");
        UpdateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 410, Short.MAX_VALUE)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDOB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRelation, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPw, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(260, 260, 260))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(310, 310, 310)
                        .addComponent(FetchBut))
                    .addComponent(jLabel11))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateBut, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FetchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtOccupation, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRelation, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtPw, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UpdateBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 920, 560));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 34, 107));
        jLabel2.setText("MEMBER FORM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 371, 70));

        Back_button.setBackground(new java.awt.Color(255, 255, 242));
        Back_button.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Back_button.setForeground(new java.awt.Color(42, 68, 146));
        Back_button.setText("BACK");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 82, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_Back_buttonActionPerformed

    private void txtPwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPwActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccupationActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRelationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelationActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String name, age, dob, gender, occupation, relation, username, pw;
            name = txtName.getText();
            age = txtAge.getText();
            dob = txtDOB.getText();
            gender = txtGender.getText();
            occupation = txtOccupation.getText();
            relation = txtRelation.getText();
            username = txtUsername.getText();
            pw = txtPw.getText();

            pst = con.prepareStatement("insert into members(name,age,dob,gender,occupation,relation,username,pw)values(?,?,?,?,?,?,?,?)");
            pst.setString(1, name);
            pst.setString(2, age);
            pst.setString(3, dob);
            pst.setString(4, gender);
            pst.setString(5, occupation);
            pst.setString(6, relation);
            pst.setString(7, username);
            pst.setString(8, pw);
            pst.executeUpdate();
            txtName.setText("");
            txtAge.setText("");
            txtDOB.setText("");
            txtGender.setText("");
            txtOccupation.setText("");
            txtRelation.setText("");
            txtUsername.setText("");
            txtPw.setText("");
            txtUsername.requestFocus();
            JOptionPane.showMessageDialog(this, "Added Successfully\nUsername :" + username + "\nPassword:" + pw);

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void FetchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FetchButActionPerformed
        try {
            String uname = txtUsername.getText();
            System.out.println(uname);

            pst = con.prepareStatement("select * from members where username = ?");
            pst.setString(1, uname);
            rs = pst.executeQuery();
            if (rs.next()) {
                txtName.setText(rs.getString(2));
                txtAge.setText(rs.getString(3));
                txtDOB.setText(rs.getString(4));
                txtGender.setText(rs.getString(5));
                txtOccupation.setText(rs.getString(6));
                txtRelation.setText(rs.getString(7));
                txtPw.setText(rs.getString(8));
                JOptionPane.showMessageDialog(this, "Fetched Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "User not found!");
                txtName.setText("");
                txtAge.setText("");
                txtDOB.setText("");
                txtGender.setText("");
                txtOccupation.setText("");
                txtRelation.setText("");
                txtUsername.setText("");
                txtPw.setText("");
                txtUsername.requestFocus();

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_FetchButActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {

            String username = txtUsername.getText();
            if (username.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter a valid username ");
            } else {

                pst = con.prepareStatement("select * from department where username=?");
                pst.setString(1, username);
                rs = pst.executeQuery();
                if (rs.next()) {
                    pst = con.prepareStatement("delete from members where username=?");
                    pst.setString(1, username);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Record Deleted!");
                    txtName.setText("");
                    txtAge.setText("");
                    txtDOB.setText("");
                    txtGender.setText("");
                    txtOccupation.setText("");
                    txtRelation.setText("");
                    txtUsername.setText("");
                    txtPw.setText("");
                    txtUsername.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, "No user found with username=" + username);
                }

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void UpdateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButActionPerformed

        String name, age, dob, gender, occupation, relation, pw;
        String uname = txtUsername.getText();
        name = txtName.getText();
        age = txtAge.getText();
        dob = txtDOB.getText();
        gender = txtGender.getText();
        occupation = txtOccupation.getText();
        relation = txtRelation.getText();
        pw = txtPw.getText();

        try {

            if (!uname.isEmpty()) {

                if (!name.isEmpty() || !age.isEmpty() || !dob.isEmpty() || !gender.isEmpty() || !occupation.isEmpty() || !relation.isEmpty() || !pw.isEmpty()) {

                    pst = con.prepareStatement("select * from members where username=?");
                    pst.setString(1, uname);
                    rs = pst.executeQuery();

                    if (rs.next()) {
                        pst = con.prepareStatement("update members set name=?,age=?,dob=?,gender=?,occupation=?,relation=?,pw=? where username=?");
                        pst.setString(1, name);
                        pst.setString(2, age);
                        pst.setString(3, dob);
                        pst.setString(4, gender);
                        pst.setString(5, occupation);
                        pst.setString(6, relation);
                        pst.setString(7, pw);
                        pst.setString(8, uname);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Successfully updated the record!");

                        txtName.setText("");
                        txtAge.setText("");
                        txtDOB.setText("");
                        txtGender.setText("");
                        txtOccupation.setText("");
                        txtRelation.setText("");
                        txtUsername.setText("");
                        txtPw.setText("");
                        txtUsername.requestFocus();

                    } else {
                        JOptionPane.showMessageDialog(this, "No user found with username=" + uname);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please fill in all the details !");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill the username !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            ex.printStackTrace();
        }

    }//GEN-LAST:event_UpdateButActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Member_Expenses_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_Expenses_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_Expenses_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_Expenses_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Memeber_Manage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton FetchBut;
    private javax.swing.JButton UpdateBut;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
