package shopping_app;

import java.awt.Color;
import static java.awt.Color.yellow;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Register extends javax.swing.JFrame {


    String image_path = null;
    
    public Register() {
        initComponents();
        
        this.setLocationRelativeTo(null);
   
        Border loginpanel_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);

        loginpanel.setBorder(loginpanel_border);
        
                
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_mini.setBorder(label_border);
        jLabel_close.setBorder(label_border);
                
        
        Border field_border = BorderFactory.createMatteBorder(1, 5, 1, 1, Color.white);
        jTextField_uname.setBorder(field_border);
        jTextField_fullname.setBorder(field_border);
        jTextField_phone.setBorder(field_border);
        jPasswordField_pass.setBorder(field_border);
        jPasswordField_cpass.setBorder(field_border);
       
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_f);
        bg.add(jRadioButton_m);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton_reg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField_fullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_uname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton_f = new javax.swing.JRadioButton();
        jRadioButton_m = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jButton_selectimg = new javax.swing.JButton();
        jLabel_imgpath = new javax.swing.JLabel();
        jPasswordField_pass = new javax.swing.JPasswordField();
        jPasswordField_cpass = new javax.swing.JPasswordField();
        jLabel_logi = new javax.swing.JLabel();
        jLabel_mini = new javax.swing.JLabel();
        loginpanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jButton_reg.setBackground(new java.awt.Color(0, 153, 204));
        jButton_reg.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jButton_reg.setForeground(new java.awt.Color(255, 255, 255));
        jButton_reg.setText("Register");
        jButton_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_regMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_regMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_regMouseExited(evt);
            }
        });
        jButton_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_regActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Full Name:");

        jTextField_fullname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Username:");

        jTextField_uname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Confirm Password:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Phone:");

        jTextField_phone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_phoneKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Gender:");

        jRadioButton_f.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton_f.setText("Famale");
        jRadioButton_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_fActionPerformed(evt);
            }
        });

        jRadioButton_m.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton_m.setText("Male");
        jRadioButton_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_mActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Image:");

        jButton_selectimg.setText("Select Image");
        jButton_selectimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_selectimgActionPerformed(evt);
            }
        });

        jLabel_imgpath.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel_imgpath.setText("image path");

        jPasswordField_pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPasswordField_cpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel_logi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_logi.setForeground(new java.awt.Color(0, 153, 153));
        jLabel_logi.setText(">> Login");
        jLabel_logi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_logi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_logiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_logiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_logiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton_f)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_m))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton_selectimg)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_imgpath))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_uname)
                                .addComponent(jTextField_fullname)
                                .addComponent(jPasswordField_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                .addComponent(jPasswordField_cpass)
                                .addComponent(jTextField_phone)))
                        .addComponent(jLabel_logi)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField_cpass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton_f)
                    .addComponent(jRadioButton_m))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton_selectimg)
                    .addComponent(jLabel_imgpath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_logi)
                .addGap(20, 20, 20))
        );

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
        jLabel2.setText("REGISTER");

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(23, 23, 23))
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
                .addGap(54, 54, 54)
                .addComponent(jLabel_mini, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_close)
                        .addComponent(jLabel_mini))
                    .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_regMouseClicked

    }//GEN-LAST:event_jButton_regMouseClicked

    private void jButton_regMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_regMouseEntered

        jButton_reg.setBackground(new Color(225,20,2));

    }//GEN-LAST:event_jButton_regMouseEntered

    private void jButton_regMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_regMouseExited

        jButton_reg.setBackground(new Color(235,47,6));

    }//GEN-LAST:event_jButton_regMouseExited

    private void jButton_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_regActionPerformed

        String fname = jTextField_fullname.getText();
        String uname = jTextField_uname.getText();
        String phone = jTextField_phone.getText();
        String pass1 = String.valueOf(jPasswordField_pass.getPassword());
        String pass2 = String.valueOf(jPasswordField_cpass.getPassword());
        String gender = "Male";
        
        if(jRadioButton_f.isSelected()) {
            gender = "Famale";
        }
       
        if(verifyFields()) {
            if(!checkUsername(uname)) {
                PreparedStatement ps;
                ResultSet rs;
                String registerUserQuery = "INSERT INTO `users`(`full_name`, `username`, `password`, `phone`, `gender`, `picture`) VALUES (?,?,?,?,?,?)";
                
                try {
                    ps = Log.getConnection().prepareStatement(registerUserQuery);
                      ps.setString(1, fname);
                      ps.setString(2, uname);
                      ps.setString(3, pass1);
                      ps.setString(4, phone);
                      ps.setString(5, gender);
                      
                    try {
                        
                        if(image_path != null) {
                                                    
                           InputStream image = new FileInputStream(new File(image_path));
                           ps.setBlob(6, image);
                        
                        }else{
                              ps.setNull(6, java.sql.Types.NULL);
                        }
 
                        if(ps.executeUpdate() != 0) {
                            JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                        }else {
                             JOptionPane.showMessageDialog(null, "Error: Chect Your Information");
                        }
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
              ;                
            }
        }

    }//GEN-LAST:event_jButton_regActionPerformed

    private void jLabel_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabel_miniMouseClicked

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

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

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

    private void jRadioButton_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_fActionPerformed
        
    }//GEN-LAST:event_jRadioButton_fActionPerformed

    private void jRadioButton_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_mActionPerformed
       
    }//GEN-LAST:event_jRadioButton_mActionPerformed

    private void jTextField_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_phoneKeyTyped
        
        //allow num
        if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_phoneKeyTyped

    private void jButton_selectimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_selectimgActionPerformed
        
        // photo selection
        String path = null;
        JFileChooser chs = new JFileChooser();
        
        chs.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter extension = new FileNameExtensionFilter("*Images",".jpg",".png",".jpeg");
        
        chs.addChoosableFileFilter(extension);
        
        int filestate = chs.showSaveDialog(null);
        
        if(filestate == JFileChooser.APPROVE_OPTION) {
            
            File selectedImage = chs.getSelectedFile();
            path = selectedImage.getAbsolutePath();
            jLabel_imgpath.setText(path);
            
            image_path = path;
        }
        
    }//GEN-LAST:event_jButton_selectimgActionPerformed

    private void jLabel_logiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logiMouseClicked

        Login l = new Login();
        l.setVisible(true);
        l.pack();
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_jLabel_logiMouseClicked

    private void jLabel_logiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logiMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_logi.setBorder(label_border);
    }//GEN-LAST:event_jLabel_logiMouseEntered

    private void jLabel_logiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logiMouseExited
        Border label_create_account_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        jLabel_mini.setBorder(label_create_account_border);
    }//GEN-LAST:event_jLabel_logiMouseExited

    public boolean verifyFields() {
        
        String fname = jTextField_fullname.getText();
        String uname = jTextField_uname.getText();
        String phone = jTextField_phone.getText();
        String pass1 = String.valueOf(jPasswordField_pass.getPassword());
        String pass2 = String.valueOf(jPasswordField_cpass.getPassword());
        
        if(fname.trim().equals("") || uname.trim().equals("") || phone.trim().equals("") 
                || pass1.trim().equals("") || pass2.trim().equals("")) {
            
            JOptionPane.showMessageDialog(null,"One or More Fields Are Empty","Empty Fields",2);
            return false;
        }
        // two pass equals?
        else if(!pass1.equals(pass2)) {
            JOptionPane.showMessageDialog(null,"Password Doesn't Match","Confirm Password",2);
            return false;
        }
        
        else {
            return true;
        }
        
    }
    
    
    // check username in db
    
    public boolean checkUsername(String username) {
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `users` WHERE `username` = ?";
        
        try {
            st = Log.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
            
            if(rs.next()) {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }

        return username_exist;
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_reg;
    private javax.swing.JButton jButton_selectimg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_imgpath;
    private javax.swing.JLabel jLabel_logi;
    private javax.swing.JLabel jLabel_mini;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField_cpass;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JRadioButton jRadioButton_f;
    private javax.swing.JRadioButton jRadioButton_m;
    private javax.swing.JTextField jTextField_fullname;
    private javax.swing.JTextField jTextField_phone;
    private javax.swing.JTextField jTextField_uname;
    private javax.swing.JPanel loginpanel;
    // End of variables declaration//GEN-END:variables
}
