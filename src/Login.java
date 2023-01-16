
import Backend.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public static String usern ;
   Connection con;
   Statement pst ;
    ResultSet rs;
  
   
    public Login() {
        initComponents();
         con  =  ConnectSQL.createC();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        butLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPw = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ExitBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 253, 248));
        jPanel1.setMaximumSize(new java.awt.Dimension(1980, 920));
        jPanel1.setMinimumSize(new java.awt.Dimension(1980, 920));
        jPanel1.setPreferredSize(new java.awt.Dimension(1980, 920));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(163, 224, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(555, 980));
        jPanel3.setMinimumSize(new java.awt.Dimension(555, 980));
        jPanel3.setPreferredSize(new java.awt.Dimension(555, 980));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreejesh J Ballal\\Documents\\NetBeansProjects\\FamilyExpenseManagement\\src\\Images\\fam1.jpg")); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 980));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 0, 710, -1));

        jPanel4.setBackground(new java.awt.Color(163, 224, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(26, 69, 124));
        jLabel2.setText("PASSWORD :");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 260, 50));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(26, 69, 124));
        jLabel4.setText("USERNAME :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 280, 50));

        txtUser.setFont(new java.awt.Font("Tw Cen MT", 1, 22)); // NOI18N
        txtUser.setBorder(null);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel4.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 240, 40));

        butLogin.setBackground(new java.awt.Color(255, 255, 241));
        butLogin.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        butLogin.setForeground(new java.awt.Color(51, 51, 51));
        butLogin.setText("Login");
        butLogin.setBorder(null);
        butLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLoginActionPerformed(evt);
            }
        });
        jPanel4.add(butLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 110, 50));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel3.setText("LOGIN");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 190, 50));

        txtPw.setFont(new java.awt.Font("Tw Cen MT", 1, 22)); // NOI18N
        txtPw.setBorder(null);
        txtPw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwActionPerformed(evt);
            }
        });
        jPanel4.add(txtPw, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 240, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 650, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 100, 1970, 980));

        jPanel2.setBackground(new java.awt.Color(26, 69, 124));
        jPanel2.setForeground(new java.awt.Color(255, 255, 241));
        jPanel2.setMaximumSize(new java.awt.Dimension(1980, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(1980, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(1980, 100));
        jPanel2.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 241));
        jLabel1.setText("FAMILY EXPENSE MANAGER");

        ExitBut.setBackground(new java.awt.Color(26, 69, 124));
        ExitBut.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 23)); // NOI18N
        ExitBut.setForeground(new java.awt.Color(255, 255, 255));
        ExitBut.setText("CLOSE");
        ExitBut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        ExitBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBut.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        ExitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 775, Short.MAX_VALUE)
                .addComponent(ExitBut, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(484, 484, 484))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ExitBut, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed

    }//GEN-LAST:event_txtUserActionPerformed

    private void butLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLoginActionPerformed
        
      usern = txtUser.getText();
    String password,username;
    username = txtUser.getText();
    
    password = String.valueOf(txtPw.getPassword());


   if("admin".equals(username) && "admin".equals(password))
    {
            dispose();
            Admin_Home.main(null);
      }
        else
   {
       try{
             pst = con.createStatement();
             rs = pst.executeQuery("select  username,pw from members where username='"+username+"' and pw= '"+password+"'");
             rs.next();
             if(rs.getString("username")!=null && rs.getString("pw")!=null)
             {
                 dispose();
                 Member_Home.main(null);
             }
       }
       catch(SQLException e){
               JOptionPane.showMessageDialog(this,"User does not exist! Please try again!");
                 txtUser.setText("");
                 txtPw.setText("");
            }    
        }
    }//GEN-LAST:event_butLoginActionPerformed

    private void txtPwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPwActionPerformed

    private void ExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButActionPerformed

    
  public static void main(String args[]) {
            
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBut;
    private javax.swing.JButton butLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField txtPw;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
