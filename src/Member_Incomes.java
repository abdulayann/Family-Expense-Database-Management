
import javax.swing.JOptionPane;


public class Member_Incomes extends javax.swing.JFrame {

    public Member_Incomes() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ExitBut2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(26, 69, 124));
        jPanel4.setForeground(new java.awt.Color(255, 255, 241));
        jPanel4.setMaximumSize(new java.awt.Dimension(1980, 100));
        jPanel4.setMinimumSize(new java.awt.Dimension(1980, 100));
        jPanel4.setRequestFocusEnabled(false);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 241));
        jLabel3.setText("FAMILY EXPENSE MANAGER");

        ExitBut2.setBackground(new java.awt.Color(26, 69, 124));
        ExitBut2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 23)); // NOI18N
        ExitBut2.setForeground(new java.awt.Color(255, 255, 255));
        ExitBut2.setText("CLOSE");
        ExitBut2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        ExitBut2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBut2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        ExitBut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBut2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 842, Short.MAX_VALUE)
                .addComponent(ExitBut2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(561, 561, 561))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitBut2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2030, -1));

        jPanel3.setBackground(new java.awt.Color(255, 253, 248));
        jPanel3.setMaximumSize(new java.awt.Dimension(1980, 920));
        jPanel3.setMinimumSize(new java.awt.Dimension(1980, 920));
        jPanel3.setPreferredSize(new java.awt.Dimension(1980, 920));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(163, 224, 255));
        jPanel7.setMaximumSize(new java.awt.Dimension(555, 980));
        jPanel7.setMinimumSize(new java.awt.Dimension(555, 980));
        jPanel7.setPreferredSize(new java.awt.Dimension(640, 500));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 33)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("MANAGE INCOMES,");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 360, 50));

        jButton3.setBackground(new java.awt.Color(255, 255, 241));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jButton3.setForeground(new java.awt.Color(26, 69, 124));
        jButton3.setText("DELETE");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 320, 60));

        jButton4.setBackground(new java.awt.Color(255, 255, 241));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jButton4.setForeground(new java.awt.Color(26, 69, 124));
        jButton4.setText("LOGOUT");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 320, 60));

        jButton5.setBackground(new java.awt.Color(255, 255, 241));
        jButton5.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jButton5.setForeground(new java.awt.Color(26, 69, 124));
        jButton5.setText("UPDATE");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 320, 70));

        jButton6.setBackground(new java.awt.Color(255, 255, 241));
        jButton6.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jButton6.setForeground(new java.awt.Color(26, 69, 124));
        jButton6.setText("ADD");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 320, 70));

        jButton8.setBackground(new java.awt.Color(255, 255, 241));
        jButton8.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jButton8.setForeground(new java.awt.Color(26, 69, 124));
        jButton8.setText("BACK");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 320, 70));

        jButton9.setBackground(new java.awt.Color(255, 255, 241));
        jButton9.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jButton9.setForeground(new java.awt.Color(26, 69, 124));
        jButton9.setText("VIEW");
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 320, 80));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 430, 720));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreejesh J Ballal\\Documents\\NetBeansProjects\\FamilyExpenseManagement\\src\\Images\\income.jpg")); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 1040, 720));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 100, 2080, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBut2ActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitBut2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Member_Incomes_Delete.main(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Login.main(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Member_Incomes_Update.main(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Member_Incomes_Insert.main(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            Member_Incomes_View.main(null);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         dispose();   
        Member_Home.main(null);
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Member_Incomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_Incomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_Incomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_Incomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Incomes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBut2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
