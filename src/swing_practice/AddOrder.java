/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing_practice;

import javafx.scene.control.RadioButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Boruto
 */
public class AddOrder extends javax.swing.JFrame {

    /**
     * Creates new form AddOrder
     */
    public AddOrder() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        size_btnGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jtext = new javax.swing.JLabel();
        flavor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        small_rb = new javax.swing.JRadioButton();
        medium_rb = new javax.swing.JRadioButton();
        large_rb = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        qty = new javax.swing.JSpinner();
        cancel = new javax.swing.JButton();
        add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 424));
        jPanel2.setLayout(new java.awt.GridLayout(5, 2));

        jtext.setText("FLAVOR : ");
        jtext.setName("jtext"); // NOI18N
        jPanel2.add(jtext);

        flavor.setBorder(new javax.swing.border.MatteBorder(null));
        flavor.setName("flavor"); // NOI18N
        jPanel2.add(flavor);

        jLabel3.setText("SIZE");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel2.add(jLabel3);

        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(1, 3));

        size_btnGroup.add(small_rb);
        small_rb.setText("S");
        small_rb.setName("small_rb"); // NOI18N
        small_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                small_rbActionPerformed(evt);
            }
        });
        jPanel3.add(small_rb);

        size_btnGroup.add(medium_rb);
        medium_rb.setText("M");
        medium_rb.setName("medium_rb"); // NOI18N
        medium_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medium_rbActionPerformed(evt);
            }
        });
        jPanel3.add(medium_rb);

        size_btnGroup.add(large_rb);
        large_rb.setText("L");
        large_rb.setName("large_rb"); // NOI18N
        large_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                large_rbActionPerformed(evt);
            }
        });
        jPanel3.add(large_rb);

        jPanel2.add(jPanel3);

        jLabel6.setText("PRICE");
        jLabel6.setToolTipText("");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel2.add(jLabel6);

        price.setBorder(new javax.swing.border.MatteBorder(null));
        price.setName("price"); // NOI18N
        jPanel2.add(price);

        jLabel7.setText("QTY");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel2.add(jLabel7);

        qty.setName("qty"); // NOI18N
        qty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyStateChanged(evt);
            }
        });
        jPanel2.add(qty);

        cancel.setText("CANCEL");
        cancel.setName("cancel"); // NOI18N
        jPanel2.add(cancel);

        add.setText("ADD");
        add.setName("add"); // NOI18N
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add);

        getContentPane().add(jPanel2, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void small_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_small_rbActionPerformed
        Billing.SetPrice(price, "10");
        
    }//GEN-LAST:event_small_rbActionPerformed

    private void large_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_large_rbActionPerformed
        Billing.SetPrice(price, "30");
       
    }//GEN-LAST:event_large_rbActionPerformed

    private void medium_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medium_rbActionPerformed
        Billing.SetPrice(price, "20");
       
    }//GEN-LAST:event_medium_rbActionPerformed

    private void qtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyStateChanged
       
    }//GEN-LAST:event_qtyStateChanged

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
         
        // Store JRadioButtons to an array to pass it to the Size method(JButton[] argumenmt) at Billing class
        JRadioButton[] r_buttons = 
        {
            this.small_rb,
            this.medium_rb,
            this.large_rb
        
        };
       
        
       Billing.Sizes size = new Billing.Sizes(r_buttons);
       
       //===============================================================================================
       
       // Create am Object Array to pass it to addOrder method Parameter Object Array
       
        Object datas[] = 
        {
            this.flavor.getText(),
            size.size,
            this.price.getText(),
            false,
            false,
            this.price.getText()
        };
        
       
        Billing.addOrder(Billing_v1.customer_order_tb, datas, this.qty);
        

    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton cancel;
    public static javax.swing.JLabel flavor;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jtext;
    private javax.swing.JRadioButton large_rb;
    private javax.swing.JRadioButton medium_rb;
    private javax.swing.JLabel price;
    private javax.swing.JSpinner qty;
    private javax.swing.ButtonGroup size_btnGroup;
    private javax.swing.JRadioButton small_rb;
    // End of variables declaration//GEN-END:variables
}
