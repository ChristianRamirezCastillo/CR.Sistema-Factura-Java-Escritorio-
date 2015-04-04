package Formularios;

import Clases.Datos;
import Clases.Opcion;
import Clases.Utilidades;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class frmFactura extends javax.swing.JInternalFrame {

    private Datos misDatos;
    private DefaultTableModel miTabla;

    public void limpiarTabla() {
        try {
            DefaultTableModel modelo = (DefaultTableModel)tblFactura.getModel();
            int filas = tblFactura.getRowCount();
            
            for (int i = 0; i < filas; i++) {
                modelo.removeRow(0);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void totales() {
        int num = tblFactura.getRowCount();
        int sumCant = 0;
        int sumVal = 0;
        
        for (int i = 0; i < num; i++) {
            sumCant += Utilidades.objectToInt( tblFactura.getValueAt(i, 3) );
            sumVal += Utilidades.objectToInt(tblFactura.getValueAt(i, 4) );
        }
        
        txtTotalCantidad.setText("" + sumCant);
        txtTotalValor.setText("" + sumVal);
    }
    private void llenarTabla() {
        String titulos[] = { "ID Producto", "Descripción", "Precio", "Cantidad", "Valor" };
        miTabla = new DefaultTableModel(null, titulos);
        tblFactura.setModel(miTabla);
        
        // Alinear campos numericos a la derecha
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tblFactura.getColumnModel().getColumn(2).setCellRenderer(tcr);
        tblFactura.getColumnModel().getColumn(3).setCellRenderer(tcr);
        tblFactura.getColumnModel().getColumn(4).setCellRenderer(tcr);
    }
    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }
    public frmFactura() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboCliente = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cboProducto = new javax.swing.JComboBox();
        btnBuscarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnBuscarCliente = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFactura = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtTotalValor = new javax.swing.JTextField();
        txtTotalCantidad = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Nueva Factura");
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

        jLabel1.setText("Fecha");

        txtFecha.setEnabled(false);

        jLabel2.setText("Cliente");

        jLabel3.setText("Producto");

        btnBuscarProducto.setText("...");
        btnBuscarProducto.setToolTipText("Buscar un producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad");

        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregar24x24.png"))); // NOI18N
        btnAgregar.setToolTipText("Adiciona un producto a la factura");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/borrar24x24.png"))); // NOI18N
        btnEliminar.setToolTipText("Elimina producto de la factura");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBorrarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminarTodo24x24.png"))); // NOI18N
        btnBorrarTodo.setToolTipText("Elimina todos los productos de la factura");
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aceptar24x24.png"))); // NOI18N
        btnGrabar.setToolTipText("Graba la factura");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnBuscarCliente.setText("...");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        tblFactura.setModel(new javax.swing.table.DefaultTableModel(
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
        tblFactura.setEnabled(false);
        jScrollPane1.setViewportView(tblFactura);

        jLabel5.setText("Totales");

        txtTotalValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalValor.setEnabled(false);

        txtTotalCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalCantidad.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCantidad))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jSeparator3)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnBuscarProducto)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBorrarTodo)
                    .addComponent(btnGrabar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // Cargamos los clientes
        Opcion opc;
        
        for (int i = 0; i < misDatos.numeroClientes(); i++) {
            opc = new Opcion(misDatos.getClientes()[i].getIdCliente(), 
                    misDatos.getClientes()[i].getNombres() + " "+ misDatos.getClientes()[i].getApellidos());
            cboCliente.addItem(opc);
        }
        
        // Cargamos los productos
        for (int i = 0; i < misDatos.numeroProductos(); i++) {
            opc = new Opcion( misDatos.getProductos()[i].getIdProducto(),
                    misDatos.getProductos()[i].getDescripcion());
            cboProducto.addItem(opc);
        }
        
        // Colocamos fecha del sistema
        txtFecha.setText(Utilidades.formatDate(new Date()));
        
        // Mostramos totales en 0
        txtTotalCantidad.setText("0");
        txtTotalValor.setText("0");
        
        // Cargamos la tabla
        llenarTabla();
    }//GEN-LAST:event_formInternalFrameOpened
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
//        if (cboProducto.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un producto");
//            cboProducto.requestFocusInWindow();
//            return;
//        }
//        if (cboCliente.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un cliente");
//            cboCliente.requestFocusInWindow();
//            return;
//        }
        if (txtCantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un cantidad");
            txtCantidad.requestFocusInWindow();
            return;
        }
        if (!Utilidades.isNumeric(txtCantidad.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un valor numérico");
            txtCantidad.requestFocusInWindow();
            return;
        }
        
        int cantidad = Integer.parseInt(txtCantidad.getText());
        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un valor mayor a 0");
            txtCantidad.requestFocusInWindow();
            return;
        }
        
        // Buscamos los datos del producto selecionado
        int pos = misDatos.posicionProducto(((Opcion)cboProducto.getSelectedItem()).getValor());
        
        // Adicionamos el producto a la tabla
        String registro[] = new String[5];
        registro[0] = misDatos.getProductos()[pos].getIdProducto();
        registro[1] = misDatos.getProductos()[pos].getDescripcion();
        registro[2] = "" + misDatos.getProductos()[pos].getPrecio();
        registro[3] = "" + cantidad;
        registro[4] = "" + (cantidad * misDatos.getProductos()[pos].getPrecio());
        miTabla.addRow(registro);
        
        // Inicializamos campos
        cboProducto.setSelectedIndex(0);
        txtCantidad.setText("");
        cboProducto.requestFocusInWindow();
        
        // Actualizamos totales
        totales();
 
    }//GEN-LAST:event_btnAgregarActionPerformed
    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
//        if (cboCliente.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un cliente");
//            cboCliente.requestFocusInWindow();
//            return;
//        }
        
        int totCan = new Integer(txtTotalCantidad.getText());
        if (totCan == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar detalle de la factura");
            cboProducto.requestFocusInWindow();
            return;
        }
        
        int rpta = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de grabar la factura?");
        if (rpta != 0) {
            return;
        }
        
        // adicionamos un consecutivo a la factura
        int numFac = misDatos.getNumFac() + 1;
        
        //grabamos la factura
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/facturas.txt", true);
            pw = new PrintWriter(fw);
            
            //encabezado de factura
            String aux = "1|" 
                    + numFac + "|" 
                    + ((Opcion)cboCliente.getSelectedItem()).getValor() + "|"
                    + ((Opcion)cboCliente.getSelectedItem()).getDescripcion() + "|"
                    + txtFecha.getText();
            pw.println(aux);
            
            //detalle de factura
            int num = tblFactura.getRowCount();          
            for (int i = 0; i < num; i++) {
                aux = "2|"
                        + Utilidades.objectToString(tblFactura.getValueAt(i, 0)) + "|"
                        + Utilidades.objectToString(tblFactura.getValueAt(i, 1)) + "|"
                        + Utilidades.objectToString(tblFactura.getValueAt(i, 2)) + "|"
                        + Utilidades.objectToString(tblFactura.getValueAt(i, 3)) + "|"
                        + Utilidades.objectToString(tblFactura.getValueAt(i, 4));
                pw.println(aux);
            }
            
        } catch (Exception ex1) {
            ex1.printStackTrace();
            
        } finally {
            try {
                if (fw != null)
                    fw.close();

            } catch (Exception ex2) {
                ex2.printStackTrace();
            }
        }
        
        JOptionPane.showMessageDialog(rootPane, "Factura " + numFac + " generada con éxito");
        misDatos.setNumFac(numFac);
        
        //inicializamos campos
        cboCliente.setSelectedIndex(0);
        cboProducto.setSelectedIndex(0);
        txtCantidad.setText("");
        limpiarTabla();
        totales();
        cboCliente.requestFocusInWindow();
        
    }//GEN-LAST:event_btnGrabarActionPerformed
    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        int rpta = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de borrar el detalle de la factura?");
        if (rpta != 0) {
            return;
        }
        limpiarTabla();
        totales();
    }//GEN-LAST:event_btnBorrarTodoActionPerformed
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (cboProducto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un producto");
            cboProducto.requestFocusInWindow();
            return;
        }
        
        try {
            DefaultTableModel modelo = (DefaultTableModel)tblFactura.getModel();
            int filas = tblFactura.getRowCount();
            
            for (int i = 0; i < filas; i++) {
                String idTabla =  Utilidades.objectToString(tblFactura.getValueAt(i, 0));
                String idCombo = ((Opcion)cboProducto.getSelectedItem()).getValor();
                if (idTabla.equals(idCombo)) {
                    modelo.removeRow(i);
                    totales();
                    return;
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        frmBusquedaCliente miBusquedaCliente = new frmBusquedaCliente(null, closable);
        miBusquedaCliente.setDatos(misDatos);
        miBusquedaCliente.setLocationRelativeTo(null);
        miBusquedaCliente.setVisible(true);
        String rpta = miBusquedaCliente.getRespuesta();
        
        if (rpta.equals(""))
            return;
        
        for (int i = 0; i < cboCliente.getItemCount(); i++) {
            if (((Opcion)cboCliente.getItemAt(i)).getValor().equals(rpta)) {
                cboCliente.setSelectedIndex(i);
                return;
            }
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed
    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        frmBusquedaProducto miBusquedaProducto= new frmBusquedaProducto(null, closable);
        miBusquedaProducto.setDatos(misDatos);
        miBusquedaProducto.setLocationRelativeTo(null);
        miBusquedaProducto.setVisible(true);
        String rpta = miBusquedaProducto.getRespuesta();
        
        if (rpta.equals(""))
            return;
        
        for (int i = 0; i < cboProducto.getItemCount(); i++) {
            if (((Opcion)cboProducto.getItemAt(i)).getValor().equals(rpta)) {
                cboProducto.setSelectedIndex(i);
                return;
            }
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox cboCliente;
    private javax.swing.JComboBox cboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblFactura;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTotalCantidad;
    private javax.swing.JTextField txtTotalValor;
    // End of variables declaration//GEN-END:variables
}
