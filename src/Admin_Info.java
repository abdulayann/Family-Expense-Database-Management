
import java.sql.*;
import Backend.*;

public class Admin_Info extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst,pst2;
    ResultSet rs1,rs2;
    public Admin_Info() {
        initComponents();
        con = ConnectSQL.createC();
        update_info();
    }

    

    public void update_info() {
        int c = 0;
        float income, loan, expense, saving;
        try {
            pst = con.prepareStatement("select count(username)  from members");
           
            
             rs1= pst.executeQuery();

            while (rs1.next()) {
                c = rs1.getInt(1);
            }
            
            count.setText(String.valueOf(c));
//            Expense.setText(String);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        count = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Savings = new javax.swing.JLabel();
        Income = new javax.swing.JLabel();
        Loans = new javax.swing.JLabel();
        Expense = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Loans1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(487, 120));
        setMaximumSize(new java.awt.Dimension(1010, 700));
        setMinimumSize(new java.awt.Dimension(1010, 700));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1010, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 242));
        jPanel1.setMinimumSize(new java.awt.Dimension(925, 625));
        jPanel1.setPreferredSize(new java.awt.Dimension(925, 625));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(192, 223, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 26, -1, 319));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 36, 51));
        jLabel4.setText("MEMBER COUNT :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 330, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 36, 51));
        jLabel5.setText("TOTAL INCOME :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 330, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 36, 51));
        jLabel6.setText("TOTAL EXPENSES :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 390, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 36, 51));
        jLabel7.setText("TOTAL GOAL COUNT :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 370, -1));

        count.setBackground(new java.awt.Color(255, 255, 242));
        count.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        count.setText("0");
        jPanel3.add(count, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 98, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 36, 51));
        jLabel8.setText("TOTAL SAVINGS :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 330, -1));

        Savings.setBackground(new java.awt.Color(255, 255, 242));
        Savings.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        Savings.setText("0 ");
        jPanel3.add(Savings, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 98, -1));

        Income.setBackground(new java.awt.Color(255, 255, 242));
        Income.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        Income.setText("0");
        jPanel3.add(Income, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 98, -1));

        Loans.setBackground(new java.awt.Color(255, 255, 242));
        Loans.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        Loans.setText("0");
        jPanel3.add(Loans, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 98, -1));

        Expense.setBackground(new java.awt.Color(255, 255, 242));
        Expense.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        Expense.setText("0");
        jPanel3.add(Expense, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 98, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(64, 36, 51));
        jLabel9.setText("TOTAL LOAN :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 330, -1));

        Loans1.setBackground(new java.awt.Color(255, 255, 242));
        Loans1.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        Loans1.setText("0");
        jPanel3.add(Loans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 98, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 900, 470));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 16, 108));
        jLabel2.setText("FAMILY INFO ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 329, 80));

        jButton3.setBackground(new java.awt.Color(255, 255, 242));
        jButton3.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jButton3.setForeground(new java.awt.Color(42, 68, 148));
        jButton3.setText("Back");
        jButton3.setToolTipText("");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Expense;
    private javax.swing.JLabel Income;
    private javax.swing.JLabel Loans;
    private javax.swing.JLabel Loans1;
    private javax.swing.JLabel Savings;
    private javax.swing.JLabel count;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
