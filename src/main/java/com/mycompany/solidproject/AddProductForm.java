
package com.mycompany.solidproject;

import java.util.List;
import javax.swing.JOptionPane;

public class AddProductForm extends javax.swing.JFrame {

    private Main mainFrame;
    private List<Product> products;
    private int lastProductId;
       
    public void setLastProductId(int productId) {
     lblIdValue.setText(productId+1+"");
     this.lastProductId = productId;
}

    public AddProductForm(List<Product> products, Main main) {
        initComponents();
        initObjects();
        this.products = products;
        this.mainFrame = main;
    }
    public AddProductForm() {
        initComponents();
        initObjects();
    }
    
    private boolean isValidData(){
        boolean isValidData = true;
        if (txtName.getText().isBlank()){
            lblNameError.setVisible(true);
            isValidData = false;
        }
        else{
            lblNameError.setVisible(false);
        }
        try {
            if(txtPrice.getText().isBlank() || Float.parseFloat(txtPrice.getText())<0){
              throw new Exception();
            }
            else{
            lblPriceError.setVisible(false);
        }
        } catch (Exception e) {
            lblPriceError.setVisible(true);
            isValidData = false;
        }
        try {
            if(txtStock.getText().isBlank() || Integer.parseInt(txtStock.getText())<0){
              throw new Exception();
            }
            else{
            lblStockError.setVisible(false);
        }
        } catch (Exception e) {
            lblStockError.setVisible(true);
            isValidData = false;
        }
        return isValidData;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblIdValue = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lblStock = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        btnConfirmProduct = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblNameError = new javax.swing.JLabel();
        lblPriceError = new javax.swing.JLabel();
        lblStockError = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setText("ADD PRODUCT FORM");

        lblId.setText("Product Id ");

        lblIdValue.setText("jLabel1");

        lblName.setText("Name");

        txtName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtName.setMaximumSize(new java.awt.Dimension(168, 16));
        txtName.setMinimumSize(new java.awt.Dimension(168, 16));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblPrice.setText("Price");

        txtPrice.setMaximumSize(new java.awt.Dimension(168, 16));
        txtPrice.setMinimumSize(new java.awt.Dimension(168, 16));
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        lblStock.setText("Stock");

        txtStock.setMaximumSize(new java.awt.Dimension(168, 16));
        txtStock.setMinimumSize(new java.awt.Dimension(168, 16));

        btnConfirmProduct.setText("Save Product");
        btnConfirmProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmProductActionPerformed(evt);
            }
        });

        btnBack.setText("<--");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblNameError.setForeground(new java.awt.Color(204, 0, 0));
        lblNameError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameError.setText("Product name must be required");

        lblPriceError.setForeground(new java.awt.Color(204, 0, 0));
        lblPriceError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPriceError.setText("Price must be a valid value");

        lblStockError.setForeground(new java.awt.Color(204, 0, 0));
        lblStockError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStockError.setText("Stock must be a valid value");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnBack)
                        .addGap(157, 157, 157)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId)
                                .addGap(204, 204, 204)
                                .addComponent(lblIdValue))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addComponent(lblPrice)
                                    .addComponent(lblStock))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPriceError, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(lblStockError, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btnConfirmProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(lblIdValue))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNameError)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPriceError)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStock)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStockError)
                .addGap(38, 38, 38)
                .addComponent(btnConfirmProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        initObjects();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmProductActionPerformed
        if(!isValidData()){
            JOptionPane.showMessageDialog(null, "You have some errors in form");
            return;
        }
        Product product = new Product();
        product.setId(lastProductId+1);
        product.setName(txtName.getText());
        product.setPrice(Float.parseFloat(txtPrice.getText()));
        product.setStock(Integer.parseInt(txtStock.getText()));
        products.add(product);
        initObjects();
        mainFrame.initObjects();
        this.setVisible(false);
    }//GEN-LAST:event_btnConfirmProductActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

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
            java.util.logging.Logger.getLogger(AddProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductForm().setVisible(true);
            }
        });
    }
    
    private void initObjects(){
        txtName.setText("");
        txtPrice.setText("");
        txtStock.setText("");
        lblNameError.setVisible(false);
        lblPriceError.setVisible(false);
        lblStockError.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirmProduct;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdValue;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPriceError;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblStockError;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

}
