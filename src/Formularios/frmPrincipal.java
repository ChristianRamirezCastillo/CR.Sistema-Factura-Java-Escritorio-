package Formularios;

import Clases.Datos;

public class frmPrincipal extends javax.swing.JFrame {

    private Datos misDatos;
    
    public frmPrincipal() {
        initComponents();
    }
    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuArchivoProductos = new javax.swing.JMenuItem();
        mnuArchivoUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArchivoCAmbioUsuario = new javax.swing.JMenuItem();
        mnuArchivoSalir = new javax.swing.JMenuItem();
        mnuArchivoClientes = new javax.swing.JMenuItem();
        mnuMovimientos = new javax.swing.JMenu();
        mnuMovimientosNuevaFactura = new javax.swing.JMenuItem();
        mnuMovimientosReporteFactura = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAyudaAcercaDe = new javax.swing.JMenuItem();
        mnuAyudaAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Facturación");

        dpnEscritorio.setBackground(java.awt.Color.lightGray);

        mnuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/archivo24x24.png"))); // NOI18N
        mnuArchivo.setText("Archivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clientes24x24.png"))); // NOI18N
        jMenuItem1.setText("Clientes");
        mnuArchivo.add(jMenuItem1);

        mnuArchivoProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto24x24.png"))); // NOI18N
        mnuArchivoProductos.setText("Productos");
        mnuArchivoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoProductosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoProductos);

        mnuArchivoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/usuarios24x24.png"))); // NOI18N
        mnuArchivoUsuario.setText("Usuarios");
        mnuArchivoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoUsuarioActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoUsuario);
        mnuArchivo.add(jSeparator1);

        mnuArchivoCAmbioUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password24x24.png"))); // NOI18N
        mnuArchivoCAmbioUsuario.setText("Cambio Clave");
        mnuArchivo.add(mnuArchivoCAmbioUsuario);

        mnuArchivoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/usuarioCambio24x24.png"))); // NOI18N
        mnuArchivoSalir.setText("Cambio Usuario");
        mnuArchivo.add(mnuArchivoSalir);

        mnuArchivoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir24x24.png"))); // NOI18N
        mnuArchivoClientes.setText("Salir");
        mnuArchivoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoClientesActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoClientes);

        jMenuBar1.add(mnuArchivo);

        mnuMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/movimientos24x24.png"))); // NOI18N
        mnuMovimientos.setText("Movimientos");

        mnuMovimientosNuevaFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/facturaNuevo24x24.png"))); // NOI18N
        mnuMovimientosNuevaFactura.setText("Nueva Factura");
        mnuMovimientos.add(mnuMovimientosNuevaFactura);

        mnuMovimientosReporteFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/facturaReporte24x24.png"))); // NOI18N
        mnuMovimientosReporteFactura.setText("Reporte Factura");
        mnuMovimientos.add(mnuMovimientosReporteFactura);

        jMenuBar1.add(mnuMovimientos);

        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ayuda24x24.png"))); // NOI18N
        mnuAyuda.setText("Ayuda");

        mnuAyudaAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/acercaDe24x24.png"))); // NOI18N
        mnuAyudaAcercaDe.setText("Acerca De");
        mnuAyuda.add(mnuAyudaAcercaDe);

        mnuAyudaAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ayuda.ayuda24x24.png"))); // NOI18N
        mnuAyudaAyuda.setText("Ayuda");
        mnuAyuda.add(mnuAyudaAyuda);

        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArchivoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoProductosActionPerformed
        frmProductos misProductos = new frmProductos();
        misProductos.setDatos(misDatos);
        dpnEscritorio.add(misProductos);
        misProductos.show();
    }//GEN-LAST:event_mnuArchivoProductosActionPerformed
    private void mnuArchivoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoUsuarioActionPerformed
        frmUsuarios misUsuarios = new frmUsuarios();
        misUsuarios.setDatos(misDatos);
        dpnEscritorio.add(misUsuarios);
        misUsuarios.show();
    }//GEN-LAST:event_mnuArchivoUsuarioActionPerformed
    private void mnuArchivoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoClientesActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuArchivoClientesActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenuItem mnuArchivoCAmbioUsuario;
    private javax.swing.JMenuItem mnuArchivoClientes;
    private javax.swing.JMenuItem mnuArchivoProductos;
    private javax.swing.JMenuItem mnuArchivoSalir;
    private javax.swing.JMenuItem mnuArchivoUsuario;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuAyudaAcercaDe;
    private javax.swing.JMenuItem mnuAyudaAyuda;
    private javax.swing.JMenu mnuMovimientos;
    private javax.swing.JMenuItem mnuMovimientosNuevaFactura;
    private javax.swing.JMenuItem mnuMovimientosReporteFactura;
    // End of variables declaration//GEN-END:variables
}
