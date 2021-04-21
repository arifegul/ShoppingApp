package shopping_app;

import javax.swing.JFrame;

public class Shopping extends javax.swing.JFrame {

    public Shopping() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel.setBackground(new java.awt.Color(235, 235, 235));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg")));

        jMenuBar1.setBackground(new java.awt.Color(235, 235, 235));
        jMenuBar1.setForeground(new java.awt.Color(235, 235, 235));
        jMenuBar1.setAlignmentY(20.0F);

        jMenu1.setBackground(new java.awt.Color(255, 0, 153));
        jMenu1.setForeground(new java.awt.Color(0, 204, 153));
        jMenu1.setText("HOME");
        jMenu1.setActionCommand("");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jMenu1.setIconTextGap(25);
        jMenu1.setMargin(new java.awt.Insets(15, 5, 15, 5));
        jMenu1.setMinimumSize(new java.awt.Dimension(50, 50));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 0, 153));
        jMenu2.setForeground(new java.awt.Color(255, 102, 51));
        jMenu2.setText("CATEGORIES");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jMenu2.setIconTextGap(20);
        jMenu2.setMargin(new java.awt.Insets(15, 5, 15, 5));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(255, 0, 153));
        jMenu3.setForeground(new java.awt.Color(255, 153, 204));
        jMenu3.setText("INFORMATION");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jMenu3.setIconTextGap(20);
        jMenu3.setMargin(new java.awt.Insets(15, 5, 15, 5));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(255, 0, 51));
        jMenu4.setForeground(new java.awt.Color(0, 102, 255));
        jMenu4.setText("BASKET");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jMenu4.setIconTextGap(20);
        jMenu4.setMargin(new java.awt.Insets(15, 5, 15, 5));
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
              
        Shopping shp = new Shopping();
        shp.setVisible(true);
        shp.pack();
        shp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
 
        CustomerInfo c = new CustomerInfo();
        c.setVisible(true);
        c.pack();
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
		
                JFrame frame = Factory.getFrame("iphone");
		frame.setVisible(true);
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame frame1 = Factory.getFrame("iphonepro");
		frame1.setVisible(true);
                frame1.pack();
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
       
        ShoppingCart sc = new ShoppingCart();
        sc.setVisible(true);
        sc.pack();
        sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jMenu4MouseClicked

  
    public static void main(String args[]) {
        
        
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shopping().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
