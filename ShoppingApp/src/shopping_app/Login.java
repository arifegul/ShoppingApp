package shopping_app;


import java.awt.Color;
import static java.awt.Color.yellow;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;

public class Login extends javax.swing.JFrame {

 
    public Login() {
        initComponents();
        
        
        this.setLocationRelativeTo(null);
        
        
        //for yellow border
        Border loginpanel_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);
        //set the border
        loginpanel.setBorder(loginpanel_border);
        
        Border label_create_account_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        jLabel_mini.setBorder(label_create_account_border);
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_mini.setBorder(label_border);
        jLabel_close.setBorder(label_border);
        
        Border label_icons_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153));
        jLabel_user.setBorder(label_icons_border);
        jLabel_pass.setBorder(label_icons_border);
        
        Border field_border = BorderFactory.createMatteBorder(1, 0, 1, 1, Color.white);
        jTextField_username.setBorder(field_border);
        jPasswordField.setBorder(field_border);
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_pass = new javax.swing.JLabel();
        jLabel_user = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButton_log = new javax.swing.JButton();
        jLabel_Create_Account = new javax.swing.JLabel();
        jLabel_mini = new javax.swing.JLabel();
        loginpanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel_pass.setOpaque(true);

        jLabel_user.setOpaque(true);

        jTextField_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_username.setText("username");
        jTextField_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusLost(evt);
            }
        });
        jTextField_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_usernameActionPerformed(evt);
            }
        });

        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField.setText("PasswordF");
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });

        jButton_log.setBackground(new java.awt.Color(0, 84, 140));
        jButton_log.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton_log.setForeground(new java.awt.Color(255, 255, 255));
        jButton_log.setText("Login");
        jButton_log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_logMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_logMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_logMouseExited(evt);
            }
        });
        jButton_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logActionPerformed(evt);
            }
        });

        jLabel_Create_Account.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Create_Account.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_Create_Account.setText(">> No Account? Create One");
        jLabel_Create_Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Create_Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Create_AccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Create_AccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Create_AccountMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_username)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                    .addComponent(jButton_log, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Create_Account)
                .addGap(167, 167, 167))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jLabel_user, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(454, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton_log, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel_Create_Account)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(jLabel_user, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(169, Short.MAX_VALUE)))
        );

        jLabel_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pass.png")));
        jLabel_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png")));

        jLabel_mini.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_mini.setText("-");
        jLabel_mini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_miniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_miniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_miniMouseExited(evt);
            }
        });

        loginpanel.setBackground(new java.awt.Color(153, 102, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_close.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_close.setText("X");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel_mini, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_close)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_close)
                            .addComponent(jLabel_mini))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseEntered
         
        Border label_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.white);
        jLabel_mini.setBorder(label_border);
        jLabel_mini.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_miniMouseEntered

    private void jLabel_miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseExited
            
          Border label_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.black);
          jLabel_mini.setBorder(label_border);
          jLabel_mini.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_miniMouseExited

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        
        Border label_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.white);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited

          Border label_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.black);
          jLabel_close.setBorder(label_border);
          jLabel_close.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jTextField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_usernameActionPerformed

    private void jTextField_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusGained
   
        
        // clear textfield for "username" part
        
        if(jTextField_username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_username.setText("");
            jTextField_username.setForeground(Color.black);
        }
        
        Border jLabel_icon = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);
        //set the border
        jLabel_user.setBorder(jLabel_icon);
        
    }//GEN-LAST:event_jTextField_usernameFocusGained

    private void jTextField_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusLost
       

        
        if(jTextField_username.getText().trim().equals("") ||
              jTextField_username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_username.setText("username");
            jTextField_username.setForeground(new Color(153,153,153));
        }
        
       
         Border label_icons_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153));
  
         jLabel_user.setBorder(label_icons_border);
        
    }//GEN-LAST:event_jTextField_usernameFocusLost

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
                
        // clear textfield for "pass" part
        
        //get pass
        String pass = String.valueOf(jPasswordField.getPassword());
        
        if(pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField.setText("");
            jPasswordField.setForeground(Color.black);
        }
        
        Border jLabel_icon = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow);
        //set the border
        jPasswordField.setBorder(jLabel_icon);
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost

               
        String pass = String.valueOf(jPasswordField.getPassword());
        
  
        if(pass.trim().equals("") ||
              pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField.setText("password");
            jPasswordField.setForeground(new Color(153,153,153));
        }
        
   
          Border label_icons_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153));
      
        jLabel_pass.setBorder(label_icons_border);
        
    }//GEN-LAST:event_jPasswordFieldFocusLost

    private void jButton_logMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_logMouseEntered
      
         jButton_log.setBackground(new Color(0,84,104));
        
    }//GEN-LAST:event_jButton_logMouseEntered

    private void jButton_logMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_logMouseExited

        jButton_log.setBackground(new Color(0,84,104));
        

    }//GEN-LAST:event_jButton_logMouseExited

    private void jButton_logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_logMouseClicked
  
    }//GEN-LAST:event_jButton_logMouseClicked

    private void jLabel_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseClicked
          
        this.setState(JFrame.ICONIFIED);
      
    }//GEN-LAST:event_jLabel_miniMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jButton_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logActionPerformed
        
        PreparedStatement st;
        ResultSet rs;
        
        
        // username&pass
        String username = jTextField_username.getText();
        String password = String.valueOf(jPasswordField.getPassword());
        
        
        //check query user&pass
        String query = "SELECT * FROM `users` WHERE `username` = ? AND `password` = ?";
        
        try {
            st = Log.getConnection().prepareStatement(query);
            
               
            st.setString(1, username);
            st.setString(2, password);      
            rs = st.executeQuery();
            
            if(rs.next()) {
                
                              
        Shopping s = new Shopping();
        s.setVisible(true);
        s.pack();
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
            }else {
                
                //error
                JOptionPane.showMessageDialog(null,"Invalid Username/Password","Login Error",2);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_jButton_logActionPerformed

    private void jLabel_Create_AccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Create_Account.setBorder(label_border);
    }//GEN-LAST:event_jLabel_Create_AccountMouseEntered

    private void jLabel_Create_AccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseExited
        Border label_create_account_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        jLabel_mini.setBorder(label_create_account_border);
    }//GEN-LAST:event_jLabel_Create_AccountMouseExited

    private void jLabel_Create_AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseClicked
        
        Register r = new Register();
        r.setVisible(true);
        r.pack();
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jLabel_Create_AccountMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_log;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Create_Account;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_mini;
    private javax.swing.JLabel jLabel_pass;
    private javax.swing.JLabel jLabel_user;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_username;
    private javax.swing.JPanel loginpanel;
    // End of variables declaration//GEN-END:variables

    
}
