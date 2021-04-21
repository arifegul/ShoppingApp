
package shopping_app;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class PayMthd extends javax.swing.JFrame {

    PayPal pp = new PayPal();
    Visa v = new Visa();
    Cash csh = new Cash();
    
    
    public PayMthd() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnvisa = new javax.swing.JButton();
        btnpp = new javax.swing.JButton();
        btncash = new javax.swing.JButton();
        jLabelback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 253, 253));

        btnvisa.setBackground(new java.awt.Color(255, 255, 255));
        btnvisa.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnvisa.setForeground(new java.awt.Color(255, 0, 0));
        btnvisa.setText("VISA");
        btnvisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvisaMouseClicked(evt);
            }
        });

        btnpp.setBackground(new java.awt.Color(255, 255, 255));
        btnpp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnpp.setForeground(new java.awt.Color(0, 153, 255));
        btnpp.setText("PayPal");
        btnpp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnppMouseClicked(evt);
            }
        });
        btnpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnppActionPerformed(evt);
            }
        });

        btncash.setBackground(new java.awt.Color(255, 255, 255));
        btncash.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btncash.setForeground(new java.awt.Color(0, 153, 153));
        btncash.setText("CASH");
        btncash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncashMouseClicked(evt);
            }
        });

        jLabelback.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelback.setText("<<- SHOPPING CARD");
        jLabelback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelbackMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelback, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btncash)
                            .addComponent(btnpp)
                            .addComponent(btnvisa))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnpp)
                .addGap(71, 71, 71)
                .addComponent(btnvisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btncash)
                .addGap(100, 100, 100)
                .addComponent(jLabelback, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paym.jpg")));

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

    private void btnppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnppActionPerformed
    
        
    }//GEN-LAST:event_btnppActionPerformed

    private void jLabelbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelbackMouseClicked

        ShoppingCart sc = new ShoppingCart();
        sc.setVisible(true);
        sc.pack();
        sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelbackMouseClicked

    private void jLabelbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelbackMouseEntered

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabelback.setBorder(label_border);
    }//GEN-LAST:event_jLabelbackMouseEntered

    private void btnppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnppMouseClicked
        
        pypl py = new pypl();
        py.setVisible(true);
        py.pack();
        py.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_btnppMouseClicked

    private void btnvisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvisaMouseClicked
        
        visamethod vm = new visamethod();
        vm.setVisible(true);
        vm.pack();
        vm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnvisaMouseClicked

    private void btncashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncashMouseClicked
        
        cashmethod cm = new cashmethod();
        cm.setVisible(true);
        cm.pack();
        cm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btncashMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayMthd().setVisible(true);
            }
          
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncash;
    private javax.swing.JButton btnpp;
    private javax.swing.JButton btnvisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelback;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
