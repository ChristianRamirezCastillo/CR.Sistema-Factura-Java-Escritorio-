package Formularios;

import Clases.Datos;
import javax.swing.JOptionPane;

public class frmUsuarios extends javax.swing.JInternalFrame {

    private Datos misDatos;
    private int usuAct = 0;
    private boolean nuevo = false;
    
    public frmUsuarios() {
        initComponents();
    }
    
    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtConfirmacion = new javax.swing.JPasswordField();
        cboPerfil = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Usuarios");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("ID Usuario *");

        txtIdUsuario.setEnabled(false);

        jLabel2.setText("Nombres *");

        txtNombre.setEnabled(false);

        txtApellidos.setEnabled(false);

        jLabel3.setText("Apellidos *");

        jLabel4.setText("Clave *");

        txtClave.setEnabled(false);

        jLabel5.setText("Confirmación *");

        txtConfirmacion.setEnabled(false);

        cboPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un Perfil", "Administrador", "Empleado" }));
        cboPerfil.setEnabled(false);

        jLabel6.setText("Perfil *");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/primero.png"))); // NOI18N
        btnPrimero.setToolTipText("Va al primer registro");

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/anterior.png"))); // NOI18N
        btnAnterior.setToolTipText("Va al anterior registro");

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/siguiente.png"))); // NOI18N
        btnSiguiente.setToolTipText("Va al siguiente registro");

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ultimo.png"))); // NOI18N
        btnUltimo.setToolTipText("Va al ultimo registro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrimero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnterior)
                .addGap(9, 9, 9)
                .addComponent(btnSiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUltimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrimero)
                    .addComponent(btnAnterior)
                    .addComponent(btnUltimo)
                    .addComponent(btnSiguiente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nuevo24x24.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo registro");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guardar24x24.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar registro");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancelar24x24.png"))); // NOI18N
        btnCancelar.setToolTipText("Guardar registro");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editar24x24.png"))); // NOI18N
        btnEditar.setToolTipText("Editar registro");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscar24x24.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar registro");

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/borrar24x24.png"))); // NOI18N
        btnBorrar.setToolTipText("Borrar registro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addComponent(btnBuscar)
                    .addComponent(btnEditar)
                    .addComponent(btnBorrar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        jLabel7.setForeground(java.awt.Color.blue);
        jLabel7.setText("* Campos Obligatorios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombre)
                            .addComponent(txtApellidos)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //habilitar botones
        btnPrimero.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnSiguiente.setEnabled(false);
        btnUltimo.setEnabled(false);
        
        btnNuevo.setEnabled(false);
        btnPrimero.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnEditar.setEnabled(false);
        
        btnCancelar.setEnabled(true);
        btnGuardar.setEnabled(true);
        
        //habilitar campos
        txtIdUsuario.setEnabled(true);
        txtClave.setEnabled(true);
        txtConfirmacion.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellidos.setEnabled(true);
        cboPerfil.setEnabled(true);
        
        //limpiar campos
        cboPerfil.setSelectedIndex(0);
        txtIdUsuario.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtClave.setText("");
        txtConfirmacion.setText("");
        
        //activamos el flag de registro nuevo
        nuevo = true;
        
        txtIdUsuario.requestFocusInWindow();
        
    }//GEN-LAST:event_btnNuevoActionPerformed
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //validaciones     
        if (txtIdUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un ID");
            txtIdUsuario.requestFocusInWindow();
            return;
        }
        if (cboPerfil.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un Perfil");
            cboPerfil.requestFocusInWindow();
            return;
        }
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un Nombre(s)");
            txtNombre.requestFocusInWindow();
            return;
        }
        if (txtApellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un Apellido(s)");
            txtApellidos.requestFocusInWindow();
            return;
        }
        
        String clave = new String(txtClave.getPassword());
        String confirmacion = new String(txtConfirmacion.getPassword());
        
        if (clave.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una Clave");
            txtClave.requestFocusInWindow();
            return;
        }
        if (confirmacion.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una Confirmación");
            txtConfirmacion.requestFocusInWindow();
            return;
        }
        if (!clave.equals(confirmacion)) {
            JOptionPane.showMessageDialog(rootPane, "La clave y la confirmacion no son iguales");
            txtClave.requestFocusInWindow();
            return;
        }
        
        //si es nuevo, validamos que el usuario no exista
        int pos = misDatos.posicionUsuario(txtIdUsuario.getText());
        if (nuevo) {
            if (pos != -1) {
                JOptionPane.showMessageDialog(rootPane, "Usuario ya existe");
                txtIdUsuario.requestFocusInWindow();
                return;
            }
        } else {
            if (pos == -1) {
                JOptionPane.showMessageDialog(rootPane, "Usuario no existe");
                txtApellidos.requestFocusInWindow();
                return;
            }
        }
        
        //creamos el objeto usuario y lo agregamos a datos
        
        btnPrimero.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnSiguiente.setEnabled(true);
        btnUltimo.setEnabled(true);
        
        btnNuevo.setEnabled(true);
        btnPrimero.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnEditar.setEnabled(true);
        
        btnCancelar.setEnabled(false);
        btnGuardar.setEnabled(false);
        
        //deshabilitar campos
        txtIdUsuario.setEnabled(false);
        txtClave.setEnabled(false);
        txtConfirmacion.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        cboPerfil.setEnabled(false);
        
        //limpiar campos
        cboPerfil.setSelectedIndex(0);
        txtIdUsuario.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtClave.setText("");
        txtConfirmacion.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnPrimero.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnSiguiente.setEnabled(true);
        btnUltimo.setEnabled(true);
        
        btnNuevo.setEnabled(true);
        btnPrimero.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnEditar.setEnabled(true);
        
        btnCancelar.setEnabled(false);
        btnGuardar.setEnabled(false);
        
        //deshabilitar campos
        txtIdUsuario.setEnabled(false);
        txtClave.setEnabled(false);
        txtConfirmacion.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        cboPerfil.setEnabled(false);
        
        //limpiar campos
        cboPerfil.setSelectedIndex(0);
        txtIdUsuario.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtClave.setText("");
        txtConfirmacion.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //habilitar botones
        btnPrimero.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnSiguiente.setEnabled(false);
        btnUltimo.setEnabled(false);
        
        btnNuevo.setEnabled(false);
        btnPrimero.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnEditar.setEnabled(false);
        
        btnCancelar.setEnabled(true);
        btnGuardar.setEnabled(true);
        
        //habilitar campos
        txtIdUsuario.setEnabled(false);
        txtClave.setEnabled(true);
        txtConfirmacion.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellidos.setEnabled(true);
        cboPerfil.setEnabled(true);
        
          //desactivamos el flag de registro nuevo
        nuevo = false;
        
        txtNombre.requestFocusInWindow();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       txtIdUsuario.setText(misDatos.getUsuarios()[usuAct].getIdUsuario());
       txtNombre.setText(misDatos.getUsuarios()[usuAct].getNombres());
       txtApellidos.setText(misDatos.getUsuarios()[usuAct].getApellidos());
       txtClave.setText(misDatos.getUsuarios()[usuAct].getClave());
       txtConfirmacion.setText(misDatos.getUsuarios()[usuAct].getClave());
       cboPerfil.setSelectedIndex((misDatos.getUsuarios()[usuAct].getPerfil()));
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cboPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JPasswordField txtConfirmacion;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
