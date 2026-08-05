/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package capa_presentacion;
import capa_datos.ProyectoDAO;
import capa_logica.Proyecto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Capa_Presentacion.jdManProyecto;
import Capa_Presentacion.jdManPedidos;



import java.awt.Color;

/**
 *
 * @author JIMMYSIN
 */
public class jdProyectos extends javax.swing.JDialog {
    
    int xMouse, yMouse;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(jdProyectos.class.getName());

    /**
     * Creates new form jdProyectos
     */
    public jdProyectos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setShape(new java.awt.geom.RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        setLocationRelativeTo(null);
        listarProyectos();
    }

   
    
    private void listarProyectos() {
        try {

            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("Código");
            modelo.addColumn("Nombre");
            modelo.addColumn("Ubicación");
            modelo.addColumn("Responsable");

            for (Proyecto p : ProyectoDAO.consultarTodos()) {

                modelo.addRow(new Object[]{
                    p.getCodigo(),
                    p.getNombre(),
                    p.getUbicacion(),
                    p.getResponsable()
                });

            }

            tblProyectos.setModel(modelo);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this,
                    ex.getMessage());

        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnAgregarPedido = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pnBarra = new javax.swing.JPanel();
        lblMarDer = new javax.swing.JLabel();
        lblMarIzq = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProyectos = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        lblAbajoIzq = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 1, 30)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(232, 108, 54));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/proyecto-removebg-preview.png"))); // NOI18N
        lblTitulo.setText("GESTIÓN DE PROYECTOS");
        lblTitulo.setIconTextGap(10);
        bg.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 470, -1));

        btnCerrar.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(232, 108, 54));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar.png"))); // NOI18N
        btnCerrar.setText("| Cerrar");
        btnCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 108, 54)));
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setHideActionText(true);
        btnCerrar.setIconTextGap(10);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);
        bg.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 110, 40));

        btnAgregarPedido.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnAgregarPedido.setForeground(new java.awt.Color(232, 108, 54));
        btnAgregarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/pedido.png"))); // NOI18N
        btnAgregarPedido.setText("| Agregar Pedido");
        btnAgregarPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 108, 54)));
        btnAgregarPedido.setContentAreaFilled(false);
        btnAgregarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPedido.setIconTextGap(10);
        btnAgregarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarPedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarPedidoMouseExited(evt);
            }
        });
        btnAgregarPedido.addActionListener(this::btnAgregarPedidoActionPerformed);
        bg.add(btnAgregarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 190, 40));

        btnEliminar.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(232, 108, 54));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/eliminar.png"))); // NOI18N
        btnEliminar.setText("| Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 108, 54)));
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setIconTextGap(10);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);
        bg.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 130, 40));

        pnBarra.setBackground(new java.awt.Color(255, 255, 255));
        pnBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnBarraMouseDragged(evt);
            }
        });
        pnBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnBarraMousePressed(evt);
            }
        });

        lblMarDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/orange-corner-corner-design-element-free-png.png"))); // NOI18N

        lblMarIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/marco_arriba_izq.png"))); // NOI18N

        javax.swing.GroupLayout pnBarraLayout = new javax.swing.GroupLayout(pnBarra);
        pnBarra.setLayout(pnBarraLayout);
        pnBarraLayout.setHorizontalGroup(
            pnBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBarraLayout.createSequentialGroup()
                .addComponent(lblMarIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 624, Short.MAX_VALUE)
                .addComponent(lblMarDer))
        );
        pnBarraLayout.setVerticalGroup(
            pnBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBarraLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(pnBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMarIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMarDer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        bg.add(pnBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 810, 60));

        tblProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProyectos);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 770, 320));

        btnEditar.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(232, 108, 54));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/editar.png"))); // NOI18N
        btnEditar.setText("| Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 108, 54)));
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setIconTextGap(10);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(this::btnEditarActionPerformed);
        bg.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 130, 40));

        lblAbajoIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/marco_abajo.png"))); // NOI18N
        bg.add(lblAbajoIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/marco_abajo_der.png"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 90, -1));

        btnAgregar.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(232, 108, 54));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/agregar.png"))); // NOI18N
        btnAgregar.setText("| Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 108, 54)));
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setIconTextGap(10);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);
        bg.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed

        int fila = tblProyectos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this,
                    "Seleccione un proyecto.");
            return;
        }
        String codigoProyecto =
                tblProyectos.getValueAt(fila, 0).toString();

        jdManPedidos frm = new jdManPedidos(
                (java.awt.Frame) getParent(),
                true,
                codigoProyecto);

        frm.setVisible(true);

        listarProyectos();

    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tblProyectos.getSelectedRow();

        if (fila == -1) {

            JOptionPane.showMessageDialog(this,
                    "Seleccione un proyecto.");

            return;
        }

        String codigo = tblProyectos.getValueAt(fila, 0).toString();

        jdManProyecto ventana = new jdManProyecto(
                (java.awt.Frame) getParent(),
                true,
                jdManProyecto.Modo.ELIMINAR,
                codigo);

        ventana.setVisible(true);

        listarProyectos();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void pnBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBarraMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pnBarraMouseDragged

    private void pnBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBarraMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnBarraMousePressed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
            
        int fila = tblProyectos.getSelectedRow();

        if (fila == -1) {

            JOptionPane.showMessageDialog(this,
                    "Seleccione un proyecto.");

            return;
        }

        String codigo = tblProyectos.getValueAt(fila, 0).toString();

        jdManProyecto ventana = new jdManProyecto(
                (java.awt.Frame) getParent(),
                true,
                jdManProyecto.Modo.EDITAR,
                codigo);

        ventana.setVisible(true);

        listarProyectos();

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        
        jdManProyecto ventana = new jdManProyecto(
                (java.awt.Frame) getParent(),
                true,
                jdManProyecto.Modo.AGREGAR,
                null);

        ventana.setVisible(true);

        listarProyectos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        // TODO add your handling code here:
        btnAgregar.setContentAreaFilled(true);
        btnAgregar.setBackground(new Color(255, 200, 150));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        // TODO add your handling code here:
        btnEditar.setContentAreaFilled(true);
        btnEditar.setBackground(new Color(255, 200, 150));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        // TODO add your handling code here:
        btnEliminar.setContentAreaFilled(true);
        btnEliminar.setBackground(new Color(255, 200, 150));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnAgregarPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPedidoMouseEntered
        // TODO add your handling code here:
        btnAgregarPedido.setContentAreaFilled(true);
        btnAgregarPedido.setBackground(new Color(255, 200, 150));
    }//GEN-LAST:event_btnAgregarPedidoMouseEntered

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        // TODO add your handling code here:
        btnCerrar.setContentAreaFilled(true);
        btnCerrar.setBackground(new Color(255, 200, 150));
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        // TODO add your handling code here:
        btnAgregar.setContentAreaFilled(false);
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        // TODO add your handling code here:
        btnEditar.setContentAreaFilled(false);
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        // TODO add your handling code here:
        btnEliminar.setContentAreaFilled(false);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnAgregarPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPedidoMouseExited
        // TODO add your handling code here:
        btnAgregarPedido.setContentAreaFilled(false);
    }//GEN-LAST:event_btnAgregarPedidoMouseExited

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        // TODO add your handling code here:
        btnCerrar.setContentAreaFilled(false);
    }//GEN-LAST:event_btnCerrarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAbajoIzq;
    private javax.swing.JLabel lblMarDer;
    private javax.swing.JLabel lblMarIzq;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnBarra;
    private javax.swing.JTable tblProyectos;
    // End of variables declaration//GEN-END:variables
}
