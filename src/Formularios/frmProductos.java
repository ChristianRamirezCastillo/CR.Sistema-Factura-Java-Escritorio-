package Formularios;

import Clases.Datos;
import Clases.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmProductos extends javax.swing.JInternalFrame {

    private Datos misDatos;
    private int proAct = 0;
    private boolean nuevo = false;
    private DefaultTableModel miTabla;
    
    public frmProductos() {
        initComponents();
    }
    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }
    private void mostrarResgistro() {
        txtIdProducto.setText(misDatos.getUsuarios()[usuAct].getIdUsuario());
        txtDescripcion.setText(misDatos.getUsuarios()[usuAct].getNombres());
        txtPrecio.setText(misDatos.getUsuarios()[usuAct].getApellidos());
        txtClave.setText(misDatos.getUsuarios()[usuAct].getClave());
        txtConfirmacion.setText(misDatos.getUsuarios()[usuAct].getClave());
        cboPerfil.setSelectedIndex((misDatos.getUsuarios()[usuAct].getPerfil()));
    }
    private void llenarTabla() {
        String titulos[] = { "ID Usuario", "Nombres", "Apellidos", "Perfil" };
        String registro[] = new String[4];
        miTabla = new DefaultTableModel(null, titulos);
        
        for (int i = 0; i < misDatos.numeroUsuarios(); i++) {
            registro[0] = misDatos.getUsuarios()[i].getIdUsuario();
            registro[1] = misDatos.getUsuarios()[i].getNombres();
            registro[2] = misDatos.getUsuarios()[i].getApellidos();
            registro[3] = perfil(misDatos.getUsuarios()[i].getPerfil());
            miTabla.addRow(registro);
        }
        tblProducto.setModel(miTabla);
    }
    private String perfil(int idPerfil) {
        if (idPerfil == 1) return "Administrador";
        else return "Empleado";
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        cboIGV = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Productos");
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

        jLabel1.setText("ID Producto *");

        txtIdProducto.setEnabled(false);

        jLabel2.setText("Descripción *");

        txtDescripcion.setEnabled(false);

        txtPrecio.setEnabled(false);

        jLabel3.setText("Nota");

        jLabel4.setText("IGV *");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/primero.png"))); // NOI18N
        btnPrimero.setToolTipText("Va al primer registro");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/anterior.png"))); // NOI18N
        btnAnterior.setToolTipText("Va al anterior registro");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/siguiente.png"))); // NOI18N
        btnSiguiente.setToolTipText("Va al siguiente registro");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ultimo.png"))); // NOI18N
        btnUltimo.setToolTipText("Va al ultimo registro");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

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
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/borrar24x24.png"))); // NOI18N
        btnBorrar.setToolTipText("Borrar registro");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

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

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProducto);

        cboIGV.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0 %", "18 %", "19 %" }));
        cboIGV.setEnabled(false);

        jLabel5.setText("Precio *");

        txtNota.setColumns(20);
        txtNota.setRows(5);
        jScrollPane2.setViewportView(txtNota);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescripcion)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboIGV, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cboIGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
        txtIdProducto.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtPrecio.setEnabled(true);
        cboIGV.setEnabled(true);
        
        //limpiar campos
        cboIGV.setSelectedIndex(0);
        txtIdProducto.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        
        //activamos el flag de registro nuevo
        nuevo = true;
        
        txtIdProducto.requestFocusInWindow();
        
    }//GEN-LAST:event_btnNuevoActionPerformed
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
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
        
        //validaciones     
        if (txtIdProducto.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un ID");
            txtIdProducto.requestFocusInWindow();
            return;
        }
        if (txtDescripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una Descripcion");
            txtDescripcion.requestFocusInWindow();
            return;
        }
        if (txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un Precio");
            txtPrecio.requestFocusInWindow();
            return;
        }
        if (cboIGV.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un IGV");
            cboIGV.requestFocusInWindow();
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
            txtClave.setText("");
            txtConfirmacion.setText("");
            txtClave.requestFocusInWindow();
            return;
        }
        
        //si es nuevo, validamos que el usuario no exista
        int pos = misDatos.posicionUsuario(txtIdProducto.getText());
        if (nuevo) {
            if (pos != -1) {
                JOptionPane.showMessageDialog(rootPane, "Usuario ya existe");
                txtIdProducto.requestFocusInWindow();
                return;
            }
        } else {
            if (pos == -1) {
                JOptionPane.showMessageDialog(rootPane, "Usuario no existe");
                txtPrecio.requestFocusInWindow();
                return;
            }
        }
        
        //creamos el objeto usuario y lo agregamos a datos
       Usuario miUsuario = new Usuario(txtIdProducto.getText(), txtDescripcion.getText(), txtPrecio.getText(), clave, cboPerfil.getSelectedIndex());
       String  msg;
       
       if (nuevo) {
            msg = misDatos.agregarUsuario(miUsuario);
        } else {
           msg = misDatos.modificarUsuario(miUsuario, pos);
       }
       
       JOptionPane.showMessageDialog(rootPane, msg);

        //deshabilitar campos
        txtIdProducto.setEnabled(false);
        txtClave.setEnabled(false);
        txtConfirmacion.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        cboPerfil.setEnabled(false);
        
        //limpiar campos
        cboPerfil.setSelectedIndex(0);
        txtIdProducto.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtClave.setText("");
        txtConfirmacion.setText("");
        
        //actualizamos los cambios en la tabla
        llenarTabla();
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
        txtIdProducto.setEnabled(false);
        txtClave.setEnabled(false);
        txtConfirmacion.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        cboPerfil.setEnabled(false);
        
        //limpiar campos
        cboPerfil.setSelectedIndex(0);
        txtIdProducto.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
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
        txtIdProducto.setEnabled(false);
        txtClave.setEnabled(true);
        txtConfirmacion.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtPrecio.setEnabled(true);
        cboPerfil.setEnabled(true);
        
          //desactivamos el flag de registro nuevo
        nuevo = false;
        
        txtDescripcion.requestFocusInWindow();
    }//GEN-LAST:event_btnEditarActionPerformed
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
      mostrarResgistro();
      llenarTabla();
    }//GEN-LAST:event_formInternalFrameOpened
    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        usuAct = 0;
        mostrarResgistro();
    }//GEN-LAST:event_btnPrimeroActionPerformed
    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        usuAct = misDatos.numeroUsuarios() - 1;
        mostrarResgistro();
    }//GEN-LAST:event_btnUltimoActionPerformed
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       usuAct++;
        if (usuAct == misDatos.numeroUsuarios()) {
            usuAct = 0;
        }
        mostrarResgistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed
    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
         usuAct--;
        if (usuAct == -1) {
            usuAct = misDatos.numeroUsuarios() - 1;;
        }
        mostrarResgistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int rta = JOptionPane.showConfirmDialog(rootPane, "¿Es seguro de borrar el registro?");
        if (rta !=  0) {
            return;
        }
        String msg;
        msg = misDatos.borrarUsuario(usuAct);
        JOptionPane.showMessageDialog(rootPane, msg);
        usuAct = 0;
        mostrarResgistro();
        
          //actualizamos los cambios en la tabla
        llenarTabla();
    }//GEN-LAST:event_btnBorrarActionPerformed
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String usuario = JOptionPane.showInputDialog("Ingrese código de usuario");
        if (usuario.equals("")) {
            return;
        }
        int pos = misDatos.posicionUsuario(usuario);
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Usuario no existe");
            return;
        }
        usuAct = pos;
        mostrarResgistro();
    }//GEN-LAST:event_btnBuscarActionPerformed


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
    private javax.swing.JComboBox cboIGV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextArea txtNota;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
