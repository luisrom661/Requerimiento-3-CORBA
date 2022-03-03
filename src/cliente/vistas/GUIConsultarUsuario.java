/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import S_Gestion_Pacientes.dto.PersonalDTO;
import S_Gestion_Pacientes.sop_rmi.GestionUsuariosInt;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Romero - Santiago Cordoba
 */
public class GUIConsultarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form GUIConsultarUsuario
     */
    private static GestionUsuariosInt objRemotoU1;
    
    public GUIConsultarUsuario() {
        initComponents();
    }
    
    public GUIConsultarUsuario(GestionUsuariosInt objRemotoU) {
        objRemotoU1 = objRemotoU;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConsultarPersonal = new javax.swing.JPanel();
        txtConsultarIdentificacion = new javax.swing.JTextField();
        lbNombreCompleto = new javax.swing.JLabel();
        lbFechaIngreso = new javax.swing.JLabel();
        lbOcupacion = new javax.swing.JLabel();
        lbTipoId = new javax.swing.JLabel();
        lbNombreUsuario = new javax.swing.JLabel();
        lbContrasena = new javax.swing.JLabel();
        lbConsultarPersonal = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        lbConsultarId = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        txtConsultarTipoID = new javax.swing.JLabel();
        txtConsultarNombreCompleto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtConsultarFechaIngreso = new javax.swing.JLabel();
        txtConsultarOcupacion = new javax.swing.JLabel();
        txtConsultarNombreUsuario = new javax.swing.JLabel();
        txtConsultarContrasena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtConsultarIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultarIdentificacionKeyTyped(evt);
            }
        });

        lbNombreCompleto.setText("Nombre Completo:");

        lbFechaIngreso.setText("Fecha de Ingreso:");

        lbOcupacion.setText("Ocupación: ");

        lbTipoId.setText("Tipo de identificación:");

        lbNombreUsuario.setText("Nombre de Usuario:");

        lbContrasena.setText("Contraseña: ");

        lbConsultarPersonal.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbConsultarPersonal.setText("Consultar Personal");

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        lbConsultarId.setText("Identificación:");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtConsultarTipoID.setText("-");

        txtConsultarNombreCompleto.setText("-");

        txtConsultarFechaIngreso.setText("-");

        txtConsultarOcupacion.setText("-");

        txtConsultarNombreUsuario.setText("-");

        txtConsultarContrasena.setText("-");

        javax.swing.GroupLayout pnlConsultarPersonalLayout = new javax.swing.GroupLayout(pnlConsultarPersonal);
        pnlConsultarPersonal.setLayout(pnlConsultarPersonalLayout);
        pnlConsultarPersonalLayout.setHorizontalGroup(
            pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarPersonalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarPersonalLayout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(lbConsultarPersonal))
                    .addGroup(pnlConsultarPersonalLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlConsultarPersonalLayout.createSequentialGroup()
                                .addGroup(pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTipoId)
                                    .addComponent(lbNombreCompleto)
                                    .addComponent(lbFechaIngreso)
                                    .addComponent(lbOcupacion)
                                    .addComponent(lbNombreUsuario)
                                    .addComponent(lbContrasena))
                                .addGap(18, 18, 18)
                                .addGroup(pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtConsultarContrasena, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtConsultarNombreUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtConsultarOcupacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtConsultarFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtConsultarNombreCompleto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtConsultarTipoID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(200, 200, 200)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlConsultarPersonalLayout.createSequentialGroup()
                                .addComponent(lbConsultarId)
                                .addGap(18, 18, 18)
                                .addComponent(txtConsultarIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConsultar))))))
        );
        pnlConsultarPersonalLayout.setVerticalGroup(
            pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbConsultarPersonal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33)
                .addGroup(pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbConsultarId)
                    .addComponent(txtConsultarIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarPersonalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(151, 151, 151))
                    .addGroup(pnlConsultarPersonalLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTipoId)
                            .addComponent(txtConsultarTipoID, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNombreCompleto)
                            .addComponent(txtConsultarNombreCompleto))
                        .addGap(18, 18, 18)
                        .addGroup(pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFechaIngreso)
                            .addComponent(txtConsultarFechaIngreso))
                        .addGap(18, 18, 18)
                        .addGroup(pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbOcupacion)
                            .addComponent(txtConsultarOcupacion))
                        .addGap(18, 18, 18)
                        .addGroup(pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNombreUsuario)
                            .addComponent(txtConsultarNombreUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(pnlConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbContrasena)
                            .addComponent(txtConsultarContrasena))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlConsultarPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlConsultarPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (objRemotoU1 == null) {
            JOptionPane.showMessageDialog(null, "No hay conexion con el servidor.");
        }else{
            if (!txtConsultarIdentificacion.getText().isEmpty()) {
                txtConsultarTipoID.setText("-");
                txtConsultarNombreCompleto.setText("-");
                txtConsultarFechaIngreso.setText("-");
                txtConsultarOcupacion.setText("-");
                txtConsultarNombreUsuario.setText("-");
                txtConsultarContrasena.setText("-");
                int idConsultar = Integer.parseInt(txtConsultarIdentificacion.getText());
                try{
                    PersonalDTO objPersonal = objRemotoU1.consultarPersonal(idConsultar);
                    if (objPersonal != null) {
                        txtConsultarTipoID.setText(objPersonal.getTipoIdentificacion());
                        txtConsultarNombreCompleto.setText(objPersonal.getNombreCompleto());
                        txtConsultarFechaIngreso.setText(objPersonal.getFechaIngreso());
                        txtConsultarOcupacion.setText(objPersonal.getTipoRol());
                        txtConsultarNombreUsuario.setText(objPersonal.getUsuario());
                        txtConsultarContrasena.setText(objPersonal.getClave());
                    }else{
                        JOptionPane.showMessageDialog(null, "Personal no encontrado.");
                    }
                }catch(RemoteException ex){
                    System.out.println("La operacion ha fallado, intente nuevamente...");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar una identifiación válida.");
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "¿Esta seguro que desea salir del consultar?", "Mensaje de Confirmacion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            new GUIAdministrador(objRemotoU1).setVisible(true);
            super.dispose();
        } else {
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtConsultarIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarIdentificacionKeyTyped
        char validarNumero = evt.getKeyChar();
        if (Character.isLetter(validarNumero)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo se permite ingresar numeros");
        }
    }//GEN-LAST:event_txtConsultarIdentificacionKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GUIConsultarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIConsultarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIConsultarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIConsultarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIConsultarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbConsultarId;
    private javax.swing.JLabel lbConsultarPersonal;
    private javax.swing.JLabel lbContrasena;
    private javax.swing.JLabel lbFechaIngreso;
    private javax.swing.JLabel lbNombreCompleto;
    private javax.swing.JLabel lbNombreUsuario;
    private javax.swing.JLabel lbOcupacion;
    private javax.swing.JLabel lbTipoId;
    private javax.swing.JPanel pnlConsultarPersonal;
    private javax.swing.JLabel txtConsultarContrasena;
    private javax.swing.JLabel txtConsultarFechaIngreso;
    private javax.swing.JTextField txtConsultarIdentificacion;
    private javax.swing.JLabel txtConsultarNombreCompleto;
    private javax.swing.JLabel txtConsultarNombreUsuario;
    private javax.swing.JLabel txtConsultarOcupacion;
    private javax.swing.JLabel txtConsultarTipoID;
    // End of variables declaration//GEN-END:variables
}
