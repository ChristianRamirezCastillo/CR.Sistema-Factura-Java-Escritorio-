package Formularios;

import Clases.Cliente;
import Clases.Datos;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmClientes extends javax.swing.JInternalFrame {

    private Datos misDatos;
    private int cliAct = 0;
    private boolean nuevo = false;
    private DefaultTableModel miTabla;
    
    public frmClientes() {
        initComponents();
    }
    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }
    private void mostrarResgistro() {
        txtIdCliente.setText(misDatos.getClientes()[cliAct].getIdCliente());
        cboIdentificacion.setSelectedIndex(misDatos.getClientes()[cliAct].getTipoIdentificacion());
        txtNombres.setText(misDatos.getClientes()[cliAct].getNombres());
        txtApellidos.setText(misDatos.getClientes()[cliAct].getApellidos());
        txtDireccion.setText(misDatos.getClientes()[cliAct].getDireccion());
        txtTelefono.setText(misDatos.getClientes()[cliAct].getTelefono());
        cboDistrito.setSelectedIndex(misDatos.getClientes()[cliAct].getIdDistrito());
        dchFechaNacimiento.setDate(misDatos.getClientes()[cliAct].getFechaNacimiento());
        dchFechaIngreso.setDate(misDatos.getClientes()[cliAct].getFechaIngreso());
    }
    private void llenarTabla() {
        String titulos[] = { "ID Cliente", "Tipo ID", "Nombres", "Apellidos", "Dirección", "Teléfono", "Distrito", "F. Nacimiento", "F. Ingreso" };
        String registro[] = new String[9];
        miTabla = new DefaultTableModel(null, titulos);
        
        for (int i = 0; i < misDatos.numeroClientes(); i++) {
            registro[0] = misDatos.getClientes()[i].getIdCliente();
            registro[1] = tipoIdentificacion(misDatos.getClientes()[i].getIdDistrito());
            registro[2] = misDatos.getClientes()[i].getNombres();
            registro[3] = misDatos.getClientes()[i].getApellidos();
            registro[4] = misDatos.getClientes()[i].getDireccion();
            registro[5] = misDatos.getClientes()[i].getTelefono();
            registro[6] = distrito(misDatos.getClientes()[i].getIdDistrito());
            registro[7] = "" + misDatos.getClientes()[i].getFechaNacimiento();
            registro[8] = "" + misDatos.getClientes()[i].getFechaIngreso();
            miTabla.addRow(registro);
        }
        tblCliente.setModel(miTabla);
    }
    private String tipoIdentificacion(int id) {
       switch(id) {
           case 1 : return "DNI";
           case 2 : return "Pasaporte";
           case 3 : return "DNI Extranjería"; 
           default: return "No definido";
       }       
    }
     private String distrito(int id) {
       switch(id) {
           case 1 : return "Comas";
            case 2 : return "Chaclacayo";
            case 3 : return "Chorrillos";
            case 4 : return "El Agustino";
            case 5 : return "Jesus Maria";
            case 6 : return "La Molina";
            case 7 : return "La Victoria";
            case 8 : return "Lince";
            case 9 : return "Lurigancho";
            case 10 : return "Lurin";
            case 11 : return "Magdalena";
            case 12 : return "Miraflores";
            case 13 : return "Pachacamac";
            case 14 : return "Pucusana";
            case 15 : return "Pueblo Libre";
            case 16 : return "Puente Piedra";
            case 17 : return "Punta Negra";
            case 18 : return "Punta Hermosa";
            case 19 : return "Rimac";
            case 20 : return "San Bartolo";
            case 21 : return "San Isidro";
            case 22 : return "Independencia";
            case 23 : return "San Juan De Miraflores";
            case 24 : return "San Luis";
            case 25 : return "San Martin De Porres";
            case 26 : return "San Miguel";
            case 27 : return "Santiago De Surco";
            case 28 : return "Surquillo";
            case 29 : return "Villa Maria Del Triunfo";
            case 30 : return "San Juan De Lurigancho";
            case 31 : return "Santa Maria Del Mar";
            case 32 : return "Santa Rosa";
            case 33 : return "Los Olivos";
            case 34 : return "Cieneguilla";
            case 35 : return "San Borja";
            case 36 : return "Villa El Salvador";
            case 37 : return "Santa Anita";
            default: return "No definido";
       }       
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
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
        tblCliente = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboIdentificacion = new javax.swing.JComboBox();
        txtApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboDistrito = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dchFechaNacimiento = new com.toedter.calendar.JDateChooser();
        dchFechaIngreso = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setTitle("Clientes");
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

        jLabel1.setText("Tipo de Identificación *");

        txtIdCliente.setEnabled(false);

        jLabel2.setText("Nombres*");

        txtNombres.setEnabled(false);

        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDireccion.setEnabled(false);

        jLabel3.setText("Dirección *");

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

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblCliente);

        jLabel5.setText("Apellidos *");

        jLabel6.setText("ID Cliente *");

        cboIdentificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar un Tipo", "DNI", "Pasaporte", "DNI Extranjería" }));
        cboIdentificacion.setEnabled(false);

        txtApellidos.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidos.setEnabled(false);

        jLabel4.setText("Distrito *");

        txtTelefono.setEnabled(false);

        jLabel8.setText("Teléfono *");

        cboDistrito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Comas", "Chaclacayo", "Chorrillos", "El Agustino", "Jesus Maria", "La Molina", "La Victoria", "Lince", "Lurigancho", "Lurin", "Magdalena", "Miraflores", "Pachacamac", "Pucusana", "Pueblo Libre", "Puente Piedra", "Punta Negra", "Punta Hermosa", "Rimac", "San Bartolo", "San Isidro", "Independencia", "San Juan De Miraflores", "San Luis", "San Martin De Porres", "San Miguel", "Santiago De Surco", "Surquillo", "Villa Maria Del Triunfo", "San Juan De Lurigancho", "Santa Maria Del Mar", "Santa Rosa", "Los Olivos", "Cieneguilla", "San Borja", "Villa El Salvador", "Santa Anita", " " }));
        cboDistrito.setEnabled(false);

        jLabel9.setText("Fecha Nac. *");

        jLabel10.setText("Fecha Ingreso *");

        dchFechaNacimiento.setEnabled(false);

        dchFechaIngreso.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel3)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dchFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dchFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDireccion)
                            .addComponent(txtApellidos)
                            .addComponent(txtNombres)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(cboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dchFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addComponent(dchFechaIngreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10))
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
        txtIdCliente.setEnabled(true);
        cboIdentificacion.setEnabled(true);
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtTelefono.setEnabled(true);
        cboDistrito.setEnabled(true);
        dchFechaNacimiento.setEnabled(true);
        
        //limpiar campos
        txtIdCliente.setText("");
        cboIdentificacion.setSelectedIndex(0);
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        cboDistrito.setSelectedIndex(0);
        dchFechaNacimiento.setDate(new Date());
        dchFechaIngreso.setDate(new Date());
        
        //activamos el flag de registro nuevo
        nuevo = true;
        
        txtIdCliente.requestFocusInWindow();
        
    }//GEN-LAST:event_btnNuevoActionPerformed
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        //validaciones
        if (txtIdCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un ID");
            txtIdCliente.requestFocusInWindow();
            return;
        }
        if (cboIdentificacion.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un Tipo de Identificación");
            cboIdentificacion.requestFocusInWindow();
            return;
        }
        if (txtNombres.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un Nombre");
            txtNombres.requestFocusInWindow();
            return;
        }
        if (txtApellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un Apellido");
            txtApellidos.requestFocusInWindow();
            return;
        }
        if (txtDireccion.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una Dirección");
            txtDireccion.requestFocusInWindow();
            return;
        }
        if (txtTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un Teléfono");
            txtTelefono.requestFocusInWindow();
            return;
        }
        if (dchFechaNacimiento.getDate().after(new Date())) {
            JOptionPane.showMessageDialog(rootPane, "La Fecha de Nacimiento debe ser anterior a la fecha actual");
            dchFechaNacimiento.requestFocusInWindow();
            return;
        }
        
        //si es nuevo, validamos que el usuario no exista
        int pos = misDatos.posicionCliente(txtIdCliente.getText());
        if (nuevo) {
            if (pos != -1) {
                JOptionPane.showMessageDialog(rootPane, "Cliente ya existe");
                txtIdCliente.requestFocusInWindow();
                return;
            }
        } else {
            if (pos == -1) {
                JOptionPane.showMessageDialog(rootPane, "Cliente no existe");
                txtNombres.requestFocusInWindow();
                return;
            }
        }
        
        //creamos el objeto usuario y lo agregamos a datos
        Cliente miCliente = new Cliente(txtIdCliente.getText(), cboIdentificacion.getSelectedIndex(), 
                txtNombres.getText(), txtApellidos.getText(), txtDireccion.getText(), txtTelefono.getText(), 
                cboDistrito.getSelectedIndex(), dchFechaNacimiento.getDate(), dchFechaIngreso.getDate());
        String  msg;
       
        if (nuevo) {
            msg = misDatos.agregarCliente(miCliente);
        } else {
            msg = misDatos.modificarCliente(miCliente, pos);
        }
        
        JOptionPane.showMessageDialog(rootPane, msg);
        
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
        txtIdCliente.setEnabled(false);
        cboIdentificacion.setEnabled(false);
        txtNombres.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtTelefono.setEnabled(false);
        cboDistrito.setEnabled(false);
        dchFechaNacimiento.setEnabled(false);
        
        //limpiar campos
        txtIdCliente.setText("");
        cboIdentificacion.setSelectedIndex(0);
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        cboDistrito.setSelectedIndex(0);
        
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
        txtIdCliente.setEnabled(false);
        cboIdentificacion.setEnabled(false);
        txtNombres.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtTelefono.setEnabled(false);
        cboDistrito.setEnabled(false);
        dchFechaNacimiento.setEnabled(false);
        
        //limpiar campos
        txtIdCliente.setText("");
        cboIdentificacion.setSelectedIndex(0);
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        cboDistrito.setSelectedIndex(0);
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
        txtIdCliente.setEnabled(false);
        cboIdentificacion.setEnabled(true);
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtTelefono.setEnabled(true);
        cboDistrito.setEnabled(true);
        dchFechaNacimiento.setEnabled(true);
        
          //desactivamos el flag de registro nuevo
        nuevo = false;
        
        txtNombres.requestFocusInWindow();
    }//GEN-LAST:event_btnEditarActionPerformed
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
      mostrarResgistro();
      llenarTabla();
    }//GEN-LAST:event_formInternalFrameOpened
    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        cliAct = 0;
        mostrarResgistro();
    }//GEN-LAST:event_btnPrimeroActionPerformed
    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        cliAct = misDatos.numeroClientes()- 1;
        mostrarResgistro();
    }//GEN-LAST:event_btnUltimoActionPerformed
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       cliAct++;
        if (cliAct == misDatos.numeroClientes()) {
            cliAct = 0;
        }
        mostrarResgistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed
    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
         cliAct--;
        if (cliAct == -1) {
            cliAct = misDatos.numeroClientes()- 1;;
        }
        mostrarResgistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int rta = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de borrar el registro?");
        if (rta !=  0) {
            return;
        }
        String msg;
        msg = misDatos.borrarCliente(cliAct);
        JOptionPane.showMessageDialog(rootPane, msg);
        cliAct = 0;
        mostrarResgistro();
        
          //actualizamos los cambios en la tabla
        llenarTabla();
    }//GEN-LAST:event_btnBorrarActionPerformed
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cliente = JOptionPane.showInputDialog("Ingrese código de Cliente");
        if (cliente.equals("")) {
            return;
        }
        int pos = misDatos.posicionCliente(cliente);
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Cliente no existe");
            return;
        }
        cliAct = pos;
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
    private javax.swing.JComboBox cboDistrito;
    private javax.swing.JComboBox cboIdentificacion;
    private com.toedter.calendar.JDateChooser dchFechaIngreso;
    private com.toedter.calendar.JDateChooser dchFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
