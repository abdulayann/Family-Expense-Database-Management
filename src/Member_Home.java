
import javax.swing.JOptionPane;


public class Member_Home extends javax.swing.JFrame {

    public Member_Home() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ExitBut2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setResizable(false);
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

        jPanel1.setBackground(new java.awt.Color(255, 253, 248));
        jPanel1.setMaximumSize(new java.awt.Dimension(1980, 920));
        jPanel1.setMinimumSize(new java.awt.Dimension(1980, 920));
        jPanel1.setPreferredSize(new java.awt.Dimension(1980, 920));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(163, 224, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(555, 980));
        jPanel5.setMinimumSize(new java.awt.Dimension(555, 980));
        jPanel5.setPreferredSize(new java.awt.Dimension(640, 500));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 33)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Welcome Member,");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 300, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 241));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jButton1.setForeground(new java.awt.Color(26, 69, 124));
        jButton1.setText("LOANS");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 320, 70));

        jButton2.setBackground(new java.awt.Color(255, 255, 241));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jButton2.setForeground(new java.awt.Color(26, 69, 124));
        jButton2.setText("LOGOUT");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 320, 60));

        jButton3.setBackground(new java.awt.Color(255, 255, 241));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jButton3.setForeground(new java.awt.Color(26, 69, 124));
        jButton3.setText("INCOMES");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 320, 70));

        jButton4.setBackground(new java.awt.Color(255, 255, 241));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jButton4.setForeground(new java.awt.Color(26, 69, 124));
        jButton4.setText("EXPENSES");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 320, 70));

        jButton6.setBackground(new java.awt.Color(255, 255, 241));
        jButton6.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jButton6.setForeground(new java.awt.Color(26, 69, 124));
        jButton6.setText("INFO");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 320, 70));

        jButton5.setBackground(new java.awt.Color(255, 255, 241));
        jButton5.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jButton5.setForeground(new java.awt.Color(26, 69, 124));
        jButton5.setText("SAVINGS");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 320, 70));

        jButton7.setBackground(new java.awt.Color(255, 255, 241));
        jButton7.setFont(new java.awt.Font("SansSerif", 1, 21)); // NOI18N
        jButton7.setForeground(new java.awt.Color(26, 69, 124));
        jButton7.setText("GOALS");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 320, 70));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 430, 710));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreejesh J Ballal\\Documents\\NetBeansProjects\\FamilyExpenseManagement\\src\\Images\\fam3.jpg")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 1030, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 100, 2080, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBut2ActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitBut2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
      Member_Loans.main(null);
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        Login.main(null);    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           dispose();
           Member_Incomes.main(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      dispose();
      Member_Expenses.main(null);
   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 
        Member_Info.main(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        Member_Savings.main(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
        Member_Goals.main(null);
    }//GEN-LAST:event_jButton7ActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Member_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBut2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
