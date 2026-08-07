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
import capa_logica.Pedido;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;

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
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
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
            modelo.addColumn("Cantidad de Pedidos");

            for (Proyecto p : ProyectoDAO.consultarTodos()) {

                modelo.addRow(new Object[]{
                    p.getCodigo(),
                    p.getNombre(),
                    p.getUbicacion(),
                    p.getResponsable(),
                    p.getCantidadPedidos()
                });

            }

            tblProyectos.setModel(modelo);
            alinearColumnasNumericas(SwingConstants.RIGHT, 4);

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
        btnEliminarPedido = new javax.swing.JButton();
        pnBarra = new javax.swing.JPanel();
        lblMarDer = new javax.swing.JLabel();
        lblMarIzq = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProyectos = new javax.swing.JTable();
        btnEditarPedido = new javax.swing.JButton();
        lblAbajoIzq = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarProyecto = new javax.swing.JButton();
        btnEditarProyecto = new javax.swing.JButton();
        btnEliminarProyecto = new javax.swing.JButton();

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
        bg.add(btnAgregarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 200, 40));

        btnEliminarPedido.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnEliminarPedido.setForeground(new java.awt.Color(232, 108, 54));
        btnEliminarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/eliminar.png"))); // NOI18N
        btnEliminarPedido.setText("| Eliminar Pedido");
        btnEliminarPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 108, 54)));
        btnEliminarPedido.setContentAreaFilled(false);
        btnEliminarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPedido.setIconTextGap(10);
        btnEliminarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarPedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarPedidoMouseExited(evt);
            }
        });
        btnEliminarPedido.addActionListener(this::btnEliminarPedidoActionPerformed);
        bg.add(btnEliminarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 200, 40));

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

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 770, 290));

        btnEditarPedido.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnEditarPedido.setForeground(new java.awt.Color(232, 108, 54));
        btnEditarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/editar.png"))); // NOI18N
        btnEditarPedido.setText("| Editar Pedido");
        btnEditarPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 108, 54)));
        btnEditarPedido.setContentAreaFilled(false);
        btnEditarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPedido.setIconTextGap(10);
        btnEditarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarPedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarPedidoMouseExited(evt);
            }
        });
        btnEditarPedido.addActionListener(this::btnEditarPedidoActionPerformed);
        bg.add(btnEditarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 200, 40));

        lblAbajoIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/marco_abajo.png"))); // NOI18N
        bg.add(lblAbajoIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/marco_abajo_der.png"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 90, -1));

        btnAgregarProyecto.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnAgregarProyecto.setForeground(new java.awt.Color(232, 108, 54));
        btnAgregarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/agregar.png"))); // NOI18N
        btnAgregarProyecto.setText("| Agregar Proyecto");
        btnAgregarProyecto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 108, 54)));
        btnAgregarProyecto.setContentAreaFilled(false);
        btnAgregarProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProyecto.setIconTextGap(10);
        btnAgregarProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarProyectoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarProyectoMouseExited(evt);
            }
        });
        btnAgregarProyecto.addActionListener(this::btnAgregarProyectoActionPerformed);
        bg.add(btnAgregarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 200, 40));

        btnEditarProyecto.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnEditarProyecto.setForeground(new java.awt.Color(232, 108, 54));
        btnEditarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/editar.png"))); // NOI18N
        btnEditarProyecto.setText("| Editar Proyecto");
        btnEditarProyecto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 108, 54)));
        btnEditarProyecto.setContentAreaFilled(false);
        btnEditarProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProyecto.setIconTextGap(10);
        btnEditarProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarProyectoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarProyectoMouseExited(evt);
            }
        });
        btnEditarProyecto.addActionListener(this::btnEditarProyectoActionPerformed);
        bg.add(btnEditarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 200, 40));

        btnEliminarProyecto.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnEliminarProyecto.setForeground(new java.awt.Color(232, 108, 54));
        btnEliminarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/eliminar.png"))); // NOI18N
        btnEliminarProyecto.setText("| Eliminar Proyecto");
        btnEliminarProyecto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 108, 54)));
        btnEliminarProyecto.setContentAreaFilled(false);
        btnEliminarProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProyecto.setIconTextGap(10);
        btnEliminarProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarProyectoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarProyectoMouseExited(evt);
            }
        });
        btnEliminarProyecto.addActionListener(this::btnEliminarProyectoActionPerformed);
        bg.add(btnEliminarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 200, 40));

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
            JOptionPane.showMessageDialog(this, "Seleccione un proyecto.");
            return;
        }
        String codigoProyecto = tblProyectos.getValueAt(fila, 0).toString();

        jdManPedidos frm = new jdManPedidos(
                (java.awt.Frame) getParent(),
                true,
                jdManPedidos.Modo.AGREGAR,
                codigoProyecto,
                null
        );
        frm.setVisible(true);

        listarProyectos();
    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

    private void btnEliminarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPedidoActionPerformed
        int fila = tblProyectos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un proyecto.");
            return;
        }
        String codigoProyecto = tblProyectos.getValueAt(fila, 0).toString();

        String codigoPedido = seleccionarPedido(codigoProyecto);
        if (codigoPedido == null) {
            return;
        }

        jdManPedidos frm = new jdManPedidos(
                (java.awt.Frame) getParent(),
                true,
                jdManPedidos.Modo.ELIMINAR,
                codigoProyecto,
                codigoPedido
        );
        frm.setVisible(true);
        listarProyectos();
    }//GEN-LAST:event_btnEliminarPedidoActionPerformed

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

    private void btnEditarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPedidoActionPerformed
        int fila = tblProyectos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un proyecto.");
            return;
        }
        String codigoProyecto = tblProyectos.getValueAt(fila, 0).toString();

        String codigoPedido = seleccionarPedido(codigoProyecto);
        if (codigoPedido == null) {
            return;
        }

        jdManPedidos frm = new jdManPedidos(
                (java.awt.Frame) getParent(),
                true,
                jdManPedidos.Modo.EDITAR,
                codigoProyecto,
                codigoPedido
        );
        frm.setVisible(true);
        listarProyectos();

    }//GEN-LAST:event_btnEditarPedidoActionPerformed

    private void btnAgregarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProyectoActionPerformed
        // TODO add your handling code here:

        jdManProyecto ventana = new jdManProyecto(
                (java.awt.Frame) getParent(),
                true,
                jdManProyecto.Modo.AGREGAR,
                null);

        ventana.setVisible(true);

        listarProyectos();
    }//GEN-LAST:event_btnAgregarProyectoActionPerformed

    private void btnAgregarProyectoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProyectoMouseEntered
        // TODO add your handling code here:
        btnAgregarProyecto.setContentAreaFilled(true);
        btnAgregarProyecto.setBackground(new Color(255, 200, 150));
    }//GEN-LAST:event_btnAgregarProyectoMouseEntered

    private void btnEditarPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarPedidoMouseEntered
        // TODO add your handling code here:
        btnEditarPedido.setContentAreaFilled(true);
        btnEditarPedido.setBackground(new Color(255, 200, 150));
    }//GEN-LAST:event_btnEditarPedidoMouseEntered

    private void btnEliminarPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarPedidoMouseEntered
        // TODO add your handling code here:
        btnEliminarPedido.setContentAreaFilled(true);
        btnEliminarPedido.setBackground(new Color(255, 200, 150));
    }//GEN-LAST:event_btnEliminarPedidoMouseEntered

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

    private void btnAgregarProyectoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProyectoMouseExited
        // TODO add your handling code here:
        btnAgregarProyecto.setContentAreaFilled(false);
    }//GEN-LAST:event_btnAgregarProyectoMouseExited

    private void btnEditarPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarPedidoMouseExited
        // TODO add your handling code here:
        btnEditarPedido.setContentAreaFilled(false);
    }//GEN-LAST:event_btnEditarPedidoMouseExited

    private void btnEliminarPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarPedidoMouseExited
        // TODO add your handling code here:
        btnEliminarPedido.setContentAreaFilled(false);
    }//GEN-LAST:event_btnEliminarPedidoMouseExited

    private void btnAgregarPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPedidoMouseExited
        // TODO add your handling code here:
        btnAgregarPedido.setContentAreaFilled(false);
    }//GEN-LAST:event_btnAgregarPedidoMouseExited

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        // TODO add your handling code here:
        btnCerrar.setContentAreaFilled(false);
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnEditarProyectoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarProyectoMouseEntered
        // TODO add your handling code here:
        btnEditarProyecto.setContentAreaFilled(true);
        btnEditarProyecto.setBackground(new Color(255, 200, 150));
    }//GEN-LAST:event_btnEditarProyectoMouseEntered

    private void btnEditarProyectoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarProyectoMouseExited
        // TODO add your handling code here:
        btnEditarProyecto.setContentAreaFilled(false);
    }//GEN-LAST:event_btnEditarProyectoMouseExited

    private void btnEditarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProyectoActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_btnEditarProyectoActionPerformed

    private void btnEliminarProyectoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProyectoMouseEntered
        // TODO add your handling code here:
        btnEliminarProyecto.setContentAreaFilled(true);
        btnEliminarProyecto.setBackground(new Color(255, 200, 150));
    }//GEN-LAST:event_btnEliminarProyectoMouseEntered

    private void btnEliminarProyectoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProyectoMouseExited
        // TODO add your handling code here:
        btnEliminarProyecto.setContentAreaFilled(false);
    }//GEN-LAST:event_btnEliminarProyectoMouseExited

    private void btnEliminarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProyectoActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_btnEliminarProyectoActionPerformed

    private String seleccionarPedido(String codigoProyecto) {
        try {
            Proyecto proyecto = ProyectoDAO.consultarPorCodigo(codigoProyecto);
            if (proyecto == null || proyecto.getPedidos().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Este proyecto no tiene pedidos.");
                return null;
            }

            // Crear un array con los codigos de los pedidos
            String[] opciones = new String[proyecto.getPedidos().size()];
            for (int i = 0; i < proyecto.getPedidos().size(); i++) {
                Pedido p = proyecto.getPedidos().get(i);
                opciones[i] = p.getCodigo() + " - " + p.getMaterial().getNombre() + " x" + p.getCantidad();
            }

            // Mostrar diálogo para seleccionar
            String seleccion = (String) JOptionPane.showInputDialog(
                    this,
                    "Seleccione el pedido que desea editar/eliminar:",
                    "Seleccionar Pedido",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (seleccion == null) {
                return null; // Usuario canceló
            }

            // Extraer solo el código (antes del " - ")
            return seleccion.split(" - ")[0];

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            return null;
        }
    }

    private void alinearColumnasNumericas(int alineacion, int... indicesColumnas) {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(alineacion);

        for (int col : indicesColumnas) {
            if (col < tblProyectos.getColumnCount()) {
                tblProyectos.getColumnModel().getColumn(col).setCellRenderer(renderer);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnAgregarProyecto;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditarPedido;
    private javax.swing.JButton btnEditarProyecto;
    private javax.swing.JButton btnEliminarPedido;
    private javax.swing.JButton btnEliminarProyecto;
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
