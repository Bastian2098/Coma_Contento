/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author USUARIO
 */
public class index extends javax.swing.JFrame {

    encargado panel2 = new encargado();
    menu panel3 = new menu();
    plato panel4 = new plato();
    receta panel5 = new receta();

    public index() {
        initComponents();
        this.setLocationRelativeTo(null);
        Contenedor.add(panel3);
        panel3.setVisible(true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelReceta = new javax.swing.JLabel();
        labelEmpleado = new javax.swing.JLabel();
        labelCarta = new javax.swing.JLabel();
        LabelPlato = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, 30));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Coma contento");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelReceta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desayuno.png"))); // NOI18N
        labelReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRecetaMouseClicked(evt);
            }
        });
        jPanel3.add(labelReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 70, 70));

        labelEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/camarero.png"))); // NOI18N
        labelEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelEmpleadoMouseClicked(evt);
            }
        });
        jPanel3.add(labelEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, 70));

        labelCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tenedor.png"))); // NOI18N
        labelCarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCartaMouseClicked(evt);
            }
        });
        jPanel3.add(labelCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 70, 70));

        LabelPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pierna-de-pollo.png"))); // NOI18N
        LabelPlato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelPlatoMouseClicked(evt);
            }
        });
        jPanel3.add(LabelPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 60, 70));

        jLabel9.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Carta");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 60, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 70, 70));

        jLabel12.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Empleados");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 110, 30));

        jLabel14.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Plato");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 60, 30));

        jLabel11.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Recetas");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 80, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("___________________________");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 200, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tienda.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 60, 70));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("___________________________");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, -1));

        jLabel7.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bienvenido");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tarjeta1.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 620));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 220, 620));

        Contenedor.setLayout(new java.awt.BorderLayout());
        jPanel1.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 790, 620));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void labelRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRecetaMouseClicked
        Contenedor.add(panel5);
        Contenedor.validate();
        panel2.setVisible(false);
        panel4.setVisible(false);
        panel3.setVisible(false);
        panel5.setVisible(true);
    }//GEN-LAST:event_labelRecetaMouseClicked

    private void labelEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEmpleadoMouseClicked
        Contenedor.add(panel2);
        Contenedor.validate();
        panel2.setVisible(true);
        panel4.setVisible(false);
        panel3.setVisible(false);
        panel5.setVisible(false);
    }//GEN-LAST:event_labelEmpleadoMouseClicked

    private void LabelPlatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelPlatoMouseClicked
        Contenedor.add(panel4);
        Contenedor.validate();
        panel2.setVisible(false);
        panel4.setVisible(true);
        panel3.setVisible(false);
        panel5.setVisible(false);
    }//GEN-LAST:event_LabelPlatoMouseClicked

    private void labelCartaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCartaMouseClicked

    }//GEN-LAST:event_labelCartaMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Contenedor.add(panel5);
        Contenedor.validate();
        panel2.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(true);
        panel3.setVisible(false);

    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        Contenedor.add(panel2);
        Contenedor.validate();
        panel2.setVisible(true);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel3.setVisible(false);

    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        Contenedor.add(panel4);
        Contenedor.validate();
        panel2.setVisible(false);
        panel4.setVisible(true);
        panel5.setVisible(false);
        panel3.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        Contenedor.validate();
        panel2.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel3.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel LabelPlato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelCarta;
    private javax.swing.JLabel labelEmpleado;
    private javax.swing.JLabel labelReceta;
    // End of variables declaration//GEN-END:variables
}
