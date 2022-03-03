/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import S_Gestion_Pacientes.dto.FRCP02FormatoDTO;
import S_Gestion_Pacientes.dto.PersonalDTO;
import S_Gestion_Pacientes.sop_rmi.GestionInformesInt;
import S_Gestion_Pacientes.sop_rmi.GestionUsuariosInt;
import java.rmi.RemoteException;
import java.util.Date;
import javax.swing.JOptionPane;
import S_Seguimiento_Pacientes.sop_rmi.GestionNotificacionesInt;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Romero - Santiago Cordoba
 */
public class GUIRegistrarFormatoFRCP02 extends javax.swing.JFrame {

    private static GestionInformesInt objRemotoI1;
    private static GestionUsuariosInt objRemotoU1;
    private String objRol;
    private static GestionNotificacionesInt objNotificaciones;
    
    /**
     * Creates new form GUIRegistrarFormatoFRCP02
     * @param objRemotoI
     */
    
    public GUIRegistrarFormatoFRCP02(GestionInformesInt objRemotoI,String Rol) {
        objRemotoI1 = objRemotoI;
        objRol = Rol;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public GUIRegistrarFormatoFRCP02() {
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

        lbRegistrarFormatoFRCP02 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        lbIDPaciente = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        txtConceptoPaciente = new javax.swing.JTextField();
        txtNombreProfesional = new javax.swing.JTextField();
        lbConceptoPaciente = new javax.swing.JLabel();
        lbObservacionesPaciente = new javax.swing.JLabel();
        lbFechaValoracion = new javax.swing.JLabel();
        lbProfesionPersonal = new javax.swing.JLabel();
        lbNombreProfesional = new javax.swing.JLabel();
        dtFechaValoracion = new com.toedter.calendar.JDateChooser();
        cbxOcupacionPersonal = new javax.swing.JComboBox<>();
        btnRegistrarPaciente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacionesPaciente = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbRegistrarFormatoFRCP02.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbRegistrarFormatoFRCP02.setText("Registrar Formato FRCP02");

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        lbIDPaciente.setText("Identificación del Paciente:");

        txtIDPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDPacienteKeyTyped(evt);
            }
        });

        lbConceptoPaciente.setText("Concepto:");

        lbObservacionesPaciente.setText("Observaciones:");

        lbFechaValoracion.setText("Fecha de valoración/seguimiento:");

        lbProfesionPersonal.setText("Profesión:");

        lbNombreProfesional.setText("Nombre del profesional:");

        cbxOcupacionPersonal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medico Especialista", "Psicologo", "Fisioterapeuta" }));

        btnRegistrarPaciente.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        btnRegistrarPaciente.setText("Registrar Paciente");
        btnRegistrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPacienteActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtObservacionesPaciente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(lbRegistrarFormatoFRCP02)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbNombreProfesional)
                                            .addComponent(lbObservacionesPaciente)
                                            .addComponent(lbProfesionPersonal))
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbFechaValoracion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbxOcupacionPersonal, javax.swing.GroupLayout.Alignment.LEADING, 0, 245, Short.MAX_VALUE)
                                    .addComponent(txtNombreProfesional, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dtFechaValoracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbIDPaciente)
                                    .addComponent(lbConceptoPaciente))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIDPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(txtConceptoPaciente)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnRegistrarPaciente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbRegistrarFormatoFRCP02)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIDPaciente)
                    .addComponent(txtIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConceptoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbConceptoPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFechaValoracion)
                    .addComponent(dtFechaValoracion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProfesionPersonal)
                    .addComponent(cbxOcupacionPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombreProfesional))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbObservacionesPaciente)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnRegistrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "¿Esta seguro que desea salir del registrar?", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            if (objRol.equals("Medico Especialista")) {
                new GUIOpcionesMedicPsico(objRemotoU1, objRemotoI1).setVisible(true);
                super.dispose();
            }else{
                new GUIOpcionesFisio(objRemotoU1, objRemotoI1).setVisible(true);
                super.dispose();
            }   
        } else {
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPacienteActionPerformed
        if (objRemotoI1 == null) {
            JOptionPane.showMessageDialog(null, "No hay conexion con el servidor.");
        } else {
            if (txtIDPaciente.getText().equals("") && txtConceptoPaciente.getText().equals("") && txtNombreProfesional.getText().equals("") && txtObservacionesPaciente.getText().equals("") && (dtFechaValoracion.getDate() == null)) {
                JOptionPane.showMessageDialog(null, "No pueden haber espacios vacíos");
            } else {
                try{
                    int idPaciente = Integer.parseInt(txtIDPaciente.getText());
                    String conceptoPaciente = txtConceptoPaciente.getText();
                    Date fechaValoracion = dtFechaValoracion.getDate();
                    String fecha_cambiada = String.valueOf(fechaValoracion);
                    String tipoRol = (String) cbxOcupacionPersonal.getSelectedItem();
                    String nombreProfesional = txtNombreProfesional.getText();
                    String observaciones = txtObservacionesPaciente.getText();
                    FRCP02FormatoDTO objFormato02 = new FRCP02FormatoDTO(idPaciente, conceptoPaciente, observaciones, fecha_cambiada, tipoRol,nombreProfesional);
                    int IdValido = objRemotoI1.validarIdPaciente(idPaciente);
                    if (IdValido == idPaciente) {
                        boolean valor = objRemotoI1.registrarFormatoFRCP02(objFormato02);
                        
                        //objNotificaciones.registrarHistorialPacientes(objFormato02);
                        
                        if (valor == true) {
                            JOptionPane.showMessageDialog(null, "Registro realizado correctamente");
                            if (objRol.equals("Medico Especialista")) {
                                new GUIOpcionesMedicPsico(objRemotoU1,objRemotoI1).setVisible(true);
                                super.dispose();
                            } else {
                                new GUIOpcionesFisio(objRemotoU1,objRemotoI1).setVisible(true);
                                super.dispose();
                            }    
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "EL paciente con el id " + idPaciente + " no existe. ");
                    }
                }catch(RemoteException ex){
                    JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente...");
                } catch (IOException ex) {
                    Logger.getLogger(GUIRegistrarFormatoFRCP02.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarPacienteActionPerformed

    private void txtIDPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDPacienteKeyTyped
        char validarNumero = evt.getKeyChar();
        if (Character.isLetter(validarNumero)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo se permite ingresar números.");
        }
    }//GEN-LAST:event_txtIDPacienteKeyTyped

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
            java.util.logging.Logger.getLogger(GUIRegistrarFormatoFRCP02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarFormatoFRCP02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarFormatoFRCP02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarFormatoFRCP02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRegistrarFormatoFRCP02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnRegistrarPaciente;
    private javax.swing.JComboBox<String> cbxOcupacionPersonal;
    private com.toedter.calendar.JDateChooser dtFechaValoracion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbConceptoPaciente;
    private javax.swing.JLabel lbFechaValoracion;
    private javax.swing.JLabel lbIDPaciente;
    private javax.swing.JLabel lbNombreProfesional;
    private javax.swing.JLabel lbObservacionesPaciente;
    private javax.swing.JLabel lbProfesionPersonal;
    private javax.swing.JLabel lbRegistrarFormatoFRCP02;
    private javax.swing.JTextField txtConceptoPaciente;
    private javax.swing.JTextField txtIDPaciente;
    private javax.swing.JTextField txtNombreProfesional;
    private javax.swing.JTextPane txtObservacionesPaciente;
    // End of variables declaration//GEN-END:variables
}
