/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sici.vistas;

/**
 *
 * @author londe
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnArticulo = new javax.swing.JButton();
        btnEmpresa = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnResponsable = new javax.swing.JButton();
        btnGestion = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("SICI 1.0");
        jPanel1.setLayout(new java.awt.GridLayout(2, 4, 5, 5));

        btnArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/shopping-cart-150.png"))); // NOI18N
        btnArticulo.setText("Artículos");
        btnArticulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnArticulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticuloActionPerformed(evt);
            }
        });
        jPanel1.add(btnArticulo);

        btnEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/suitcase-150.png"))); // NOI18N
        btnEmpresa.setText("Empresas");
        btnEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpresa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnEmpresa);

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/user-150.png"))); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnUsuarios);

        btnResponsable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/shirt-150.png"))); // NOI18N
        btnResponsable.setText("Responsables");
        btnResponsable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResponsable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponsableActionPerformed(evt);
            }
        });
        jPanel1.add(btnResponsable);

        btnGestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/settings-150.png"))); // NOI18N
        btnGestion.setText("Gestión");
        btnGestion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGestion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnGestion);

        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/list-150.png"))); // NOI18N
        btnConsulta.setText("Consulta");
        btnConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnConsulta);

        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/delivery-truck-150.png"))); // NOI18N
        btnPedido.setText("Pedido");
        btnPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPedido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnPedido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArticuloActionPerformed

    private void btnResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponsableActionPerformed
        // TODO add your handling code here:
        crudResponsable crud = new crudResponsable(this, true);
        crud.setVisible(true);
        
    }//GEN-LAST:event_btnResponsableActionPerformed

    public void pruebaGithub(){
        System.out.println("Prueba Github");
    }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArticulo;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnGestion;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnResponsable;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
