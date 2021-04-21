
package shopping_app;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


public class ShoppingCart extends javax.swing.JFrame {
    
    public double runningCost;
    public double rowCost;
    TotalPrice p = new TotalPrice();
    Customer_Basket o = new Customer_Basket();
 
    DefaultTableModel model;

    public ShoppingCart() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblshp = new javax.swing.JTable();
        btns = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFinish1 = new javax.swing.JButton();
        jLabelsc = new javax.swing.JLabel();
        txtStarterValue = new javax.swing.JTextField();
        txtStarterPrice = new javax.swing.JTextField();
        txtCost = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancel1 = new javax.swing.JButton();
        txtTable = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(194, 191, 255));

        panel2.setBackground(new java.awt.Color(194, 191, 255));

        label1.setBackground(new java.awt.Color(194, 191, 255));
        label1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("SHOPPING CARD");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        tblshp.setBackground(new java.awt.Color(204, 204, 255));
        tblshp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tblshp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CaseId", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblshp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblshpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblshp);

        btns.setBackground(new java.awt.Color(153, 153, 255));
        btns.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btns.setForeground(new java.awt.Color(255, 255, 255));
        btns.setText("SHOPPING CARD");
        btns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(194, 191, 255));

        txtFinish1.setBackground(new java.awt.Color(0, 153, 153));
        txtFinish1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFinish1.setText("Finish Order");
        txtFinish1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinish1ActionPerformed(evt);
            }
        });

        jLabelsc.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelsc.setText("PAYMENT ->>");
        jLabelsc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelscMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelscMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtFinish1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabelsc)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFinish1)
                    .addComponent(jLabelsc))
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pay.jpg")));

        txtStarterValue.setEditable(false);
        txtStarterValue.setText("-");
        txtStarterValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStarterValueActionPerformed(evt);
            }
        });

        txtStarterPrice.setEditable(false);
        txtStarterPrice.setText("0.0");

        txtCost.setEditable(false);
        txtCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 204, 204));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setText("Add Basket");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel1.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel1.setText("Cancel ");
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });

        txtTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTableActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("User Name");

        jLabelback.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelback.setText("<<- MENU");
        jLabelback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelbackMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(txtStarterValue, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtStarterPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(btnAdd)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnCancel1)))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelback, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(btns, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(92, 92, 92)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btns, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStarterValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStarterPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnCancel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelback))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblshpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblshpMouseClicked

        int row = tblshp.getSelectedRow();

        String selected = tblshp.getValueAt(row, 0).toString();
        DefaultTableModel model= (DefaultTableModel)tblshp.getModel();
        try{
            if(selected !=null ){
                txtStarterValue.setText(String.valueOf(model.getValueAt(tblshp.getSelectedRow(), 1)));
                txtStarterPrice.setText(String.valueOf(model.getValueAt(tblshp.getSelectedRow(), 2)));
            }
        } catch(NullPointerException database){
            JOptionPane.showMessageDialog(null, "Deleted");
        }
    }//GEN-LAST:event_tblshpMouseClicked

    private void btnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsActionPerformed

      
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ShoppingCart.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/users_db","root","");
            Statement st = (Statement) con.createStatement();

            try ( ResultSet rs = st.executeQuery("Select * from basket")) {
                int colcount = rs.getMetaData().getColumnCount();
                DefaultTableModel tm = new DefaultTableModel();

                for(int i = 1;i<=colcount;i++)
                tm.addColumn(rs.getMetaData().getColumnName(i));

                while(rs.next())
                {
                    Object[] row = new Object[colcount];

                    for(int i=1;i<=colcount;i++)
                    row[i-1] = rs.getObject(i);
                    tm.addRow(row);

                }

                tblshp.setModel(tm);

            }
            con.close();

        }
         catch (SQLException ex) {
            Logger.getLogger(ShoppingCart.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnsActionPerformed

    private void txtStarterValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStarterValueActionPerformed

    }//GEN-LAST:event_txtStarterValueActionPerformed

    private void txtCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostActionPerformed
       
    }//GEN-LAST:event_txtCostActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        //This is used to add up all the the costs and get a total
        String starter = txtStarterPrice.getText();
        runningCost += Double.parseDouble(starter);
        rowCost += Double.parseDouble(starter);
        txtCost.setText(String.valueOf(runningCost));
        
        String rowCost1 = Double.toString(rowCost);
        Object xx = null;
        //

        o.setPrice(rowCost1);

        model.insertRow(model.getRowCount(), new Object[]{xx, txtStarterValue.getText(), rowCost1});
        txtStarterValue.setText("-");
        txtStarterPrice.setText("0.0");

        rowCost = 0;
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        // TODO add your handling code here:

        //This is used to add up all the the costs and get a total
        String starter = txtStarterPrice.getText();
        runningCost -= Double.parseDouble(starter);
        rowCost -= Double.parseDouble(starter);
        txtCost.setText(String.valueOf(runningCost));
 
        String rowCost1 = Double.toString(rowCost);
        Object xx = null;
        //

        o.setPrice(rowCost1);

        model.insertRow(model.getRowCount(), new Object[]{xx, txtStarterValue.getText(), rowCost1});
        txtStarterValue.setText("-");
        txtStarterPrice.setText("0.0");
        rowCost = 0;

    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void txtFinish1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinish1ActionPerformed

        String username = txtTable.getText();
        String price= txtCost.getText();

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/users_db","root","");
            PreparedStatement pst = con.prepareStatement("insert into c_basket(username,price) values(?,?)");
            pst.setString(1, username);
            pst.setString(2, price);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null,"You can go to the payment section");

        }

        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        try{
            model.insertRow(model.getRowCount(), new Object[]{txtTable.getText(),txtCost.getText()});
            txtTable.setText(null);
            txtCost.setText(null);

        } catch(NumberFormatException c){
            //catched the error if a number isn't entered in the price text field
            JOptionPane.showMessageDialog(null, "");

            txtTable.setText(null);
            txtCost.setText(null);
            txtFinish1.setEnabled(false);
        }

    }//GEN-LAST:event_txtFinish1ActionPerformed

    private void txtTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTableActionPerformed
  
        txtTable.setVisible(true);
    }//GEN-LAST:event_txtTableActionPerformed

    private void jLabelbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelbackMouseClicked

        Shopping s = new Shopping();
        s.setVisible(true);
        s.pack();
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_jLabelbackMouseClicked

    private void jLabelbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelbackMouseEntered

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabelback.setBorder(label_border);

    }//GEN-LAST:event_jLabelbackMouseEntered

    private void jLabelscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelscMouseClicked

        PayMthd pp = new PayMthd();
        pp.setVisible(true);
        pp.pack();
        pp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_jLabelscMouseClicked

    private void jLabelscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelscMouseEntered

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabelsc.setBorder(label_border);

    }//GEN-LAST:event_jLabelscMouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShoppingCart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btns;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelback;
    private javax.swing.JLabel jLabelsc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTable tblshp;
    private javax.swing.JTextField txtCost;
    private javax.swing.JButton txtFinish1;
    private javax.swing.JTextField txtStarterPrice;
    private javax.swing.JTextField txtStarterValue;
    private javax.swing.JTextField txtTable;
    // End of variables declaration//GEN-END:variables
}
