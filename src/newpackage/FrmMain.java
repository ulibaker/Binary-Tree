package newpackage;
/*
    Hecho por el equipo conformado por:
    
        Perla Liliana Covarrubias Pérez  -   (20550202)
        Marilee Armenta Acosta           -   (20550227)
        Gisely Mayram Terán Ramírez      -   (20550225)
        Nubia Estefany Castro Martinez   -   (20550210)  
        María Kassandra Lara Aguirre     -   (20550213)
        René Ulises Delgado García       -   (20550195)

        El 18 de Junio del 2021.
*/
import javax.swing.JOptionPane;

public class FrmMain extends javax.swing.JFrame {
    BinaryTree t = new BinaryTree();
    
    public FrmMain() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnInOrder = new javax.swing.JButton();
        btnPreOrder = new javax.swing.JButton();
        bntPostOrder = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAdd.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnAdd.setText("Añadir nodo");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnInOrder.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnInOrder.setText("inOrder");
        btnInOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInOrderActionPerformed(evt);
            }
        });

        btnPreOrder.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnPreOrder.setText("preOrder");
        btnPreOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreOrderActionPerformed(evt);
            }
        });

        bntPostOrder.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        bntPostOrder.setText("postOrder");
        bntPostOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPostOrderActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnSearch.setText("Buscar nodo");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnDelete.setText("Borrar Nodo");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/bt.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPreOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntPostOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPreOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntPostOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInOrderActionPerformed
        t.cleanString();
        if(!t.isVoid()) {
            JOptionPane.showMessageDialog(this, t.inOrder(t.root));
        }
        else {
            JOptionPane.showMessageDialog(this, "El árbol está vacío");
        }
    }//GEN-LAST:event_btnInOrderActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int data = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor del nodo: "));
        String name = JOptionPane.showInputDialog(null, "Ingrese el nombre del nodo: ");
        t.addNode(data, name);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPreOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreOrderActionPerformed
        t.cleanString();
        if(!t.isVoid()) {
        JOptionPane.showMessageDialog(this, t.preOrder(t.root));
        }
        else {
            JOptionPane.showMessageDialog(this, "El árbol está vacío");
        }
    }//GEN-LAST:event_btnPreOrderActionPerformed

    private void bntPostOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPostOrderActionPerformed
        t.cleanString();
        if(!t.isVoid()) {
        JOptionPane.showMessageDialog(this, t.postOrder(t.root));
        }
        else {
            JOptionPane.showMessageDialog(this, "El árbol está vacío");
        }
    }//GEN-LAST:event_bntPostOrderActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(!t.isVoid()) {
            int data = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor del nodo buscado: "));
            if(t.searchNode(data) == null) {
                JOptionPane.showMessageDialog(this, "Nodo no encontrado");
            }
            else {
                JOptionPane.showMessageDialog(this, t.searchNode(data).toString()+", fue encontrado con éxito");
            }         
        }
        else {
            JOptionPane.showMessageDialog(this, "El árbol está vacío");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(!t.isVoid()) {
            int data = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué nodo desea eliminar? "));
            if(t.delete(data) == false) {
                JOptionPane.showMessageDialog(this, "Nodo no encontrado");
            }
            else {
                JOptionPane.showMessageDialog(this,"El nodo fue eliminado con éxito");
            }         
        }
        else {
            JOptionPane.showMessageDialog(this, "El árbol está vacío");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntPostOrder;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInOrder;
    private javax.swing.JButton btnPreOrder;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
