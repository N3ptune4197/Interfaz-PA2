/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Capa_Presentacion;

import capa_datos.MaterialDAO;
import capa_logica.Material;
import capa_logica.Pedido;
import capa_logica.Proyecto;
import java.awt.Color;
import java.awt.Frame;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import capa_datos.ProyectoDAO;

/**
 *
 * @author User
 */
public class jdManPedidos extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(jdManPedidos.class.getName());

    public enum Modo {
        AGREGAR,
        EDITAR,
        ELIMINAR
    }

    private Modo modoActual;
    private String codigoProyecto;
    private String codigoPedidoSeleccionado;
    private Proyecto proyecto;

    public jdManPedidos(java.awt.Frame parent, boolean modal, Modo modo, String codigoProyecto, String codigoPedido) {

        super(parent, modal);
        initComponents();

        setResizable(false);

        this.modoActual = modo;
        this.codigoProyecto = codigoProyecto;
        this.codigoPedidoSeleccionado = codigoPedido;

        setLocationRelativeTo(null);

        jspCantidad.setModel(new SpinnerNumberModel(1, 1, 100000, 1));

        txtFecha.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        cargarDatosProyecto();
        cargarMateriales();

        configurarModoVisual();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanelContenedor = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo1 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        cboMaterial = new javax.swing.JComboBox<>();
        jspCantidad = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelContenedor.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true));

        lblNombre.setText("Material");

        lblCodigo.setText("Código");

        txtCodigo.addActionListener(this::txtCodigotxtCodigoActionPerformed);

        lblCodigo1.setText("Cantidad");

        lblNombre1.setText("Fecha");

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jspCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(lblCodigo1)
                    .addComponent(lblNombre1)
                    .addComponent(lblCodigo)
                    .addComponent(lblNombre)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txtFecha)
                    .addComponent(cboMaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCodigo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanelFondo.add(jPanelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 400, 300));

        btnGuardar.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(232, 108, 54));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/agregar.png"))); // NOI18N
        btnGuardar.setText("| Guardar");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 1, true));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusPainted(false);
        btnGuardar.setHideActionText(true);
        btnGuardar.setIconTextGap(15);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);
        jPanelFondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 180, -1));

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 102));
        lblTitulo.setText("Pedido de:");
        jPanelFondo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 102));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jPanelFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 400, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoTecnico.png"))); // NOI18N
        jPanelFondo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 510, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigotxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigotxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigotxtCodigoActionPerformed

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        // TODO add your handling code here:
        btnGuardar.setContentAreaFilled(true);
        btnGuardar.setBackground(new Color(255, 200, 150));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        // TODO add your handling code here:
        btnGuardar.setContentAreaFilled(false);
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!validarCampos()) {
            return;
        }

        try {
            proyecto = ProyectoDAO.consultarPorCodigo(codigoProyecto);
            if (proyecto == null) {
                JOptionPane.showMessageDialog(this, "Proyecto no encontrado.");
                return;
            }
            Material material = (Material) cboMaterial.getSelectedItem();
            int cantidad = (Integer) jspCantidad.getValue();

            // Si estamos editando, recuperamos el pedido anterior para "liberar" su cantidad
            int cantidadAnterior = 0;
            Material materialAnterior = null;

            if (modoActual == Modo.EDITAR) {
                for (Pedido p : proyecto.getPedidos()) {
                    if (p.getCodigo().equals(codigoPedidoSeleccionado)) {
                        cantidadAnterior = p.getCantidad();
                        materialAnterior = p.getMaterial();
                        break;
                    }
                }
            }

            // Stock disponible real: si es el mismo material que antes, se suma lo que se libera
            int stockDisponible = material.getStock();
            if (modoActual == Modo.EDITAR && materialAnterior != null
                    && materialAnterior.getCodigo().equals(material.getCodigo())) {
                stockDisponible += cantidadAnterior;
            }

            if (modoActual != Modo.ELIMINAR && cantidad > stockDisponible) {
                JOptionPane.showMessageDialog(
                        this,
                        """
                    No hay suficiente stock.
                    Material: """ + material.getNombre()
                        + "\nDisponible: " + stockDisponible
                        + "\nSolicitado: " + cantidad,
                        "Stock insuficiente",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (modoActual == Modo.AGREGAR) {
                for (Pedido p : proyecto.getPedidos()) {
                    if (p.getCodigo().equalsIgnoreCase(txtCodigo.getText().trim())) {
                        JOptionPane.showMessageDialog(this, "Ya existe un pedido con ese código.");
                        return;
                    }
                }
            }

            Pedido pedido = new Pedido(
                    txtCodigo.getText().trim(),
                    proyecto,
                    material,
                    cantidad,
                    LocalDate.parse(txtFecha.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            );

            switch (modoActual) {
                case AGREGAR:
                    proyecto.agregarPedido(pedido);
                    ProyectoDAO.modificar(proyecto);
                    descontarStock(material, cantidad);
                    JOptionPane.showMessageDialog(this, "Pedido registrado correctamente.");
                    break;

                case EDITAR:
                    proyecto.getPedidos().removeIf(p -> p.getCodigo().equals(codigoPedidoSeleccionado));
                    proyecto.agregarPedido(pedido);
                    ProyectoDAO.modificar(proyecto);
                    if (materialAnterior != null) {
                        devolverStock(materialAnterior, cantidadAnterior);
                    }
                    descontarStock(material, cantidad);
                    JOptionPane.showMessageDialog(this, "Pedido actualizado correctamente.");
                    break;

                case ELIMINAR:
                    int confirm = JOptionPane.showConfirmDialog(this,
                            "¿Está seguro de eliminar el pedido \"" + txtCodigo.getText() + "\"?",
                            "Confirmar eliminación",
                            JOptionPane.YES_NO_OPTION);
                    if (confirm != JOptionPane.YES_OPTION) {
                        return;
                    }

                    int cantidadAEliminar = 0;
                    Material materialAEliminar = null;
                    for (Pedido p : proyecto.getPedidos()) {
                        if (p.getCodigo().equals(codigoPedidoSeleccionado)) {
                            cantidadAEliminar = p.getCantidad();
                            materialAEliminar = p.getMaterial();
                            break;
                        }
                    }

                    proyecto.getPedidos().removeIf(p -> p.getCodigo().equals(codigoPedidoSeleccionado));
                    ProyectoDAO.modificar(proyecto);

                    if (materialAEliminar != null) {
                        devolverStock(materialAEliminar, cantidadAEliminar);
                    }
                    JOptionPane.showMessageDialog(this, "Pedido eliminado correctamente.");
                    break;
            }

            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private boolean validarCampos() {
        if (txtCodigo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el código.");
            txtCodigo.requestFocus();
            return false;
        }

        if (cboMaterial.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un material.");
            cboMaterial.requestFocus();
            return false;
        }

        Material materialSeleccionado = (Material) cboMaterial.getSelectedItem();
        if (!materialSeleccionado.isVigencia() && modoActual == Modo.AGREGAR) {
            JOptionPane.showMessageDialog(this,
                    "El material \"" + materialSeleccionado.getNombre() + "\" no está vigente. "
                    + "No se pueden registrar pedidos nuevos con este material.");
            cboMaterial.requestFocus();
            return false;
        }

        if ((Integer) jspCantidad.getValue() <= 0) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor a cero.");
            jspCantidad.requestFocus();
            return false;
        }

        // Validar fecha
        try {
            LocalDate.parse(txtFecha.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Fecha inválida. Use formato dd/MM/yyyy.");
            txtFecha.requestFocus();
            return false;
        }

        return true;
    }

    private void cargarMateriales() {
        try {
            cboMaterial.removeAllItems();
            for (Material m : MaterialDAO.consultarTodos()) {
                
                if (modoActual == Modo.AGREGAR && !m.isVigencia()) {
                    continue;
                }
                cboMaterial.addItem(m);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void cargarDatosProyecto() {
        try {
            Proyecto p = ProyectoDAO.consultarPorCodigo(codigoProyecto);
            if (p != null) {
                lblTitulo.setText("Pedido de: " + p.getNombre());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void configurarModoVisual() {
        switch (modoActual) {
            case AGREGAR:
                setTitle("Registrar Pedido");
                btnGuardar.setText("GUARDAR");
                limpiarCampos();
                txtCodigo.setEditable(true);
                break;

            case EDITAR:
                setTitle("Editar Pedido");
                btnGuardar.setText("ACTUALIZAR");
                cargarPedido();
                txtCodigo.setEditable(false);
                break;

            case ELIMINAR:
                setTitle("Eliminar Pedido");
                btnGuardar.setText("ELIMINAR");
                cargarPedido();
                bloquearCampos(false);
                break;
        }
    }

    private void limpiarCampos() {
        txtCodigo.setText("");
        txtFecha.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        jspCantidad.setValue(1);
        if (cboMaterial.getItemCount() > 0) {
            cboMaterial.setSelectedIndex(0);
        }
    }

    private void bloquearCampos(boolean activar) {
        txtCodigo.setEnabled(activar);
        cboMaterial.setEnabled(activar);
        jspCantidad.setEnabled(activar);
        txtFecha.setEnabled(activar);
    }

    private void cargarPedido() {
        try {
            proyecto = ProyectoDAO.consultarPorCodigo(codigoProyecto);
            if (proyecto == null) {
                JOptionPane.showMessageDialog(this, "Proyecto no encontrado.");
                return;
            }

            for (Pedido p : proyecto.getPedidos()) {
                if (p.getCodigo().equals(codigoPedidoSeleccionado)) {
                    txtCodigo.setText(p.getCodigo());
                    txtFecha.setText(p.getFechaFormateada());
                    jspCantidad.setValue(p.getCantidad());
                    // Seleccionar el material en el combo
                    for (int i = 0; i < cboMaterial.getItemCount(); i++) {
                        Material m = cboMaterial.getItemAt(i);
                        if (m.getCodigo().equals(p.getMaterial().getCodigo())) {
                            cboMaterial.setSelectedIndex(i);
                            break;
                        }
                    }
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Pedido no encontrado.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar pedido: " + ex.getMessage());
        }
    }

    // Descuenta stock cuando se crea/edita un pedido
    private void descontarStock(Material material, int cantidad) throws Exception {
        Material actualizado = MaterialDAO.consultarPorCodigo(material.getCodigo());
        if (actualizado != null) {
            actualizado.setStock(actualizado.getStock() - cantidad);
            MaterialDAO.modificar(actualizado);
        }
    }

// Devuelve stock cuando se elimina o se edita (cantidad anterior)
    private void devolverStock(Material material, int cantidad) throws Exception {
        Material actualizado = MaterialDAO.consultarPorCodigo(material.getCodigo());
        if (actualizado != null) {
            actualizado.setStock(actualizado.getStock() + cantidad);
            MaterialDAO.modificar(actualizado);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Material> cboMaterial;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jspCantidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
