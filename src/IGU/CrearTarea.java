/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IGU;

import Logica.Tarea;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author barzo
 */
public class CrearTarea extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form CrearTarea
     */
    public CrearTarea() {
        initComponents();
        setLocationRelativeTo(null);
        armarCabecera();
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
        jLabelCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextIngreseTarea = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextRecibirFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabeCrearTarea = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTareasCreadas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabeEliminarTarea = new javax.swing.JLabel();
        jTextHI = new javax.swing.JTextField();
        jTextMI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCerrar.setBackground(new java.awt.Color(0, 0, 153));
        jLabelCerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCerrar.setText("Cerrar");
        jLabelCerrar.setOpaque(true);
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 100, 40));

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear tareas");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 40));

        jTextIngreseTarea.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextIngreseTarea.setText("Ingrese la tarea");
        jTextIngreseTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextIngreseTareaMouseClicked(evt);
            }
        });
        jTextIngreseTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIngreseTareaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextIngreseTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, 40));

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jTextAreaDescripcion.setText("Ingrese Descripcion");
        jTextAreaDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaDescripcionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 250, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese Fecha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 20));

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 120, 30));

        jTextRecibirFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextRecibirFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Hora Inicio Tarea");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Limpiar");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 250, 50));

        jLabeCrearTarea.setBackground(new java.awt.Color(0, 0, 102));
        jLabeCrearTarea.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabeCrearTarea.setForeground(new java.awt.Color(255, 255, 255));
        jLabeCrearTarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeCrearTarea.setText("Crear Tarea");
        jLabeCrearTarea.setOpaque(true);
        jLabeCrearTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabeCrearTareaMouseClicked(evt);
            }
        });
        jPanel1.add(jLabeCrearTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 250, 50));

        jTableTareasCreadas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableTareasCreadas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 430, 260));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tareas Cargadas");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabeEliminarTarea.setBackground(new java.awt.Color(0, 0, 102));
        jLabeEliminarTarea.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabeEliminarTarea.setForeground(new java.awt.Color(255, 255, 255));
        jLabeEliminarTarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeEliminarTarea.setText("Eliminar Tarea");
        jLabeEliminarTarea.setOpaque(true);
        jLabeEliminarTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabeEliminarTareaMouseClicked(evt);
            }
        });
        jPanel1.add(jLabeEliminarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 210, 50));

        jTextHI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextHI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextHI.setText("00");
        jTextHI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHIActionPerformed(evt);
            }
        });
        jPanel1.add(jTextHI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 40, 30));

        jTextMI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextMI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextMI.setText("00");
        jPanel1.add(jTextMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 40, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText(":");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextIngreseTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIngreseTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIngreseTareaActionPerformed

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jTextIngreseTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextIngreseTareaMouseClicked
        // TODO add your handling code here:

        jTextIngreseTarea.setText("");


    }//GEN-LAST:event_jTextIngreseTareaMouseClicked

    private void jTextAreaDescripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaDescripcionMouseClicked
        // TODO add your handling code here:
        jTextAreaDescripcion.setText("");
    }//GEN-LAST:event_jTextAreaDescripcionMouseClicked

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
        if (jDateChooser1.getDate() != null) {

            LocalDate fechaN = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            jTextRecibirFecha.setText(fechaN.format(dtf));
        }

    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jLabeCrearTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeCrearTareaMouseClicked
        // TODO add your handling code here:
        String tarea = jTextIngreseTarea.getText();
        String descripcion = jTextAreaDescripcion.getText();
        String fecha = jTextRecibirFecha.getText();
        String hi = jTextHI.getText();
        String mi = jTextMI.getText();
        String hmi= hi +":"+ mi;
        
        
        Tarea tar = new Tarea(tarea, descripcion, fecha,hmi);
        cargarTarea(tar);
        MenuTarea.ListaTareasCreadas.add(tar);
        setting();
        settingTextField();

    }//GEN-LAST:event_jLabeCrearTareaMouseClicked

    private void jLabeEliminarTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeEliminarTareaMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = jTableTareasCreadas.getSelectedRow();
        ImageIcon exitoIcon = new ImageIcon("src//IMG//exito.png");
        if (filaSeleccionada != -1) {
            modelo.removeRow(filaSeleccionada);

            JOptionPane.showMessageDialog(this, "Operacion exitosa", "EXITO", JOptionPane.INFORMATION_MESSAGE, exitoIcon);
        } else {
            JOptionPane.showMessageDialog(this, "debes seleccionar una fila", "ERROR SELECCION FILA", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabeEliminarTareaMouseClicked

    private void jTextHIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHIActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CrearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CrearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CrearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CrearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CrearTarea().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabeCrearTarea;
    private javax.swing.JLabel jLabeEliminarTarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTareasCreadas;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextHI;
    private javax.swing.JTextField jTextIngreseTarea;
    private javax.swing.JTextField jTextMI;
    private javax.swing.JTextField jTextRecibirFecha;
    // End of variables declaration//GEN-END:variables
private void armarCabecera() {
        modelo.addColumn("Tarea");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Inicio");
        
        jTableTareasCreadas.setModel(modelo);
    }

    private void cargarTarea(Tarea tarea) {
        modelo.addRow(new Object[]{tarea.getTarea(), tarea.getDescripcion(), tarea.getFecha(),tarea.getHoraInicio()});
    }

   private void setting() {
        jTextIngreseTarea.setText("");
        jTextAreaDescripcion.setText("");
        jTextRecibirFecha.setText("");
        
        jTextHI.setText("00");
        
        jTextMI.setText("00");
    }
      private void settingTextField(){
        jTextIngreseTarea.setText("Ingrese La Tarea");
        jTextAreaDescripcion.setText("Descripcion");
    }
}
