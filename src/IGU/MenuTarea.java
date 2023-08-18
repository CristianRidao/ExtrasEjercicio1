/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IGU;

import Logica.Tarea;
import java.util.ArrayList;

/**
 *
 * @author barzo
 */
public class MenuTarea extends javax.swing.JFrame {
public static ArrayList<Tarea> ListaTareasCreadas = new ArrayList<>();
public static ArrayList<Tarea> ListaTareasProgreso = new ArrayList<>();
public static ArrayList<Tarea> ListaTareasCompletadas = new ArrayList<>();
    /**
     * Creates new form MenuTarea
     */
    public MenuTarea() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabelProgreso = new javax.swing.JLabel();
        jLabelCrearTarea = new javax.swing.JLabel();
        jLabelConsultarTarea1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestor de tareas");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 40));

        jLabelProgreso.setBackground(new java.awt.Color(0, 51, 102));
        jLabelProgreso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelProgreso.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProgreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProgreso.setText("Progreso");
        jLabelProgreso.setOpaque(true);
        jLabelProgreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProgresoMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 110, 60));

        jLabelCrearTarea.setBackground(new java.awt.Color(0, 51, 102));
        jLabelCrearTarea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCrearTarea.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCrearTarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCrearTarea.setText("Crear tarea");
        jLabelCrearTarea.setOpaque(true);
        jLabelCrearTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCrearTareaMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelCrearTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 110, 60));

        jLabelConsultarTarea1.setBackground(new java.awt.Color(0, 51, 102));
        jLabelConsultarTarea1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelConsultarTarea1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConsultarTarea1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConsultarTarea1.setText("Consultar");
        jLabelConsultarTarea1.setOpaque(true);
        jLabelConsultarTarea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConsultarTarea1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabelConsultarTarea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 110, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondo2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 20, 230));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/images.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 190, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelProgresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProgresoMouseClicked
        // TODO add your handling code here:
        Progreso pro = new Progreso();
        pro.setVisible(true);
        
    }//GEN-LAST:event_jLabelProgresoMouseClicked

    private void jLabelCrearTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCrearTareaMouseClicked
        // TODO add your handling code here:
        CrearTarea ct = new CrearTarea();
        ct.setVisible(true);
    }//GEN-LAST:event_jLabelCrearTareaMouseClicked

    private void jLabelConsultarTarea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConsultarTarea1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelConsultarTarea1MouseClicked

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
//            java.util.logging.Logger.getLogger(MenuTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuTarea().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelConsultarTarea1;
    private javax.swing.JLabel jLabelCrearTarea;
    private javax.swing.JLabel jLabelProgreso;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
