/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;


import Cliente.vistas.GUIIniciarSesion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import plugins.TextPrompt;

/**
 *
 * @author Luis Romero - Santiago Cordoba
 */
public class ConexionClienteGUI extends javax.swing.JFrame {

    /**
     * Creates new form ConexionClienteGUI
     */
    private static SGestionUsuariosOperations refUsuario;
    private static SGestionInformesOperations refGestion;
    private static SSeguimientoPacientesOperations refSeguimiento;
    
    static int Medicos = 0;
    static int Psicologos = 0;
    static int Fisios = 0;
    static int AdmRecep = 0;
    
    public ConexionClienteGUI() {
        initComponents();
        
        TextPrompt textDireccionIP = new TextPrompt("Dirección IP", txtDireccionIPConexionCliente);
        TextPrompt textPuerto = new TextPrompt("Puerto", txtPuertoConexionCliente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConexionCliente = new javax.swing.JPanel();
        lbUser = new javax.swing.JLabel();
        lbConexionCliente = new javax.swing.JLabel();
        lbDireccionIP = new javax.swing.JLabel();
        lbPuerto = new javax.swing.JLabel();
        txtDireccionIPConexionCliente = new javax.swing.JTextField();
        txtPuertoConexionCliente = new javax.swing.JTextField();
        btnConectarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Romero\\Documents\\Universidad\\Lab. de Sistemas Distribuidos\\Parcial 3 - Requerimiento CORBA\\Requerimiento-3-CORBA\\src\\imagenes\\usuario.png")); // NOI18N

        lbConexionCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbConexionCliente.setText("Conexión Cliente");

        lbDireccionIP.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Romero\\Documents\\Universidad\\Lab. de Sistemas Distribuidos\\Parcial 3 - Requerimiento CORBA\\Requerimiento-3-CORBA\\src\\imagenes\\direccion-ip.png")); // NOI18N

        lbPuerto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Romero\\Documents\\Universidad\\Lab. de Sistemas Distribuidos\\Parcial 3 - Requerimiento CORBA\\Requerimiento-3-CORBA\\src\\imagenes\\llave-de-casa.png")); // NOI18N

        txtDireccionIPConexionCliente.setText("localhost");

        txtPuertoConexionCliente.setText("5001");
        txtPuertoConexionCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPuertoConexionClienteKeyTyped(evt);
            }
        });

        btnConectarCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnConectarCliente.setText("¡Conectar Cliente!");
        btnConectarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConectarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConexionClienteLayout = new javax.swing.GroupLayout(pnlConexionCliente);
        pnlConexionCliente.setLayout(pnlConexionClienteLayout);
        pnlConexionClienteLayout.setHorizontalGroup(
            pnlConexionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConexionClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnConectarCliente)
                .addGap(77, 77, 77))
            .addGroup(pnlConexionClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConexionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlConexionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConexionClienteLayout.createSequentialGroup()
                            .addComponent(lbPuerto)
                            .addGap(18, 18, 18)
                            .addComponent(txtPuertoConexionCliente))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConexionClienteLayout.createSequentialGroup()
                            .addComponent(lbDireccionIP)
                            .addGap(18, 18, 18)
                            .addComponent(txtDireccionIPConexionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlConexionClienteLayout.createSequentialGroup()
                        .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbConexionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlConexionClienteLayout.setVerticalGroup(
            pnlConexionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConexionClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConexionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlConexionClienteLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lbConexionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(pnlConexionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbDireccionIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDireccionIPConexionCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlConexionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPuerto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPuertoConexionCliente))
                .addGap(18, 18, 18)
                .addComponent(btnConectarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlConexionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlConexionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarClienteActionPerformed
        try{
            if (txtDireccionIPConexionCliente.getText().equals("") && txtPuertoConexionCliente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No puede haber datos vacios");
            }else{
                String[] vec = new String[4];//almacena la información para localizar el ns
                vec[0] = "-ORBInitialHost";
                vec[1] = txtDireccionIPConexionCliente.getText();
                vec[2] = "-ORBInitialPort";
                vec[3] = txtPuertoConexionCliente.getText();

                ORB orb = ORB.init(vec, null);

                org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
                NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

                String name1 = "usuario";
                String name2 = "gestion";
                String name3 = "seguimiento";

                refUsuario = SGestionUsuariosHelper.narrow(ncRef.resolve_str(name1));
                refGestion = SGestionInformesHelper.narrow(ncRef.resolve_str(name2));
                refSeguimiento = SSeguimientoPacientesHelper.narrow(ncRef.resolve_str(name3));

                if (refUsuario == null && refGestion == null && refSeguimiento == null) {
                    JOptionPane.showMessageDialog(rootPane, "Error en la conexion");
                } else {
                    new GUIIniciarSesion(refUsuario, refGestion, refSeguimiento).setVisible(true);
                    super.dispose();
                }
            }
        }catch(Exception e){
            System.out.println("Error: " + e);
            e.printStackTrace(System.out);
        }  
    }//GEN-LAST:event_btnConectarClienteActionPerformed

    private void txtPuertoConexionClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuertoConexionClienteKeyTyped
        char validarNumero = evt.getKeyChar();
        if (Character.isLetter(validarNumero)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo se permite ingresar números.");
        }
    }//GEN-LAST:event_txtPuertoConexionClienteKeyTyped

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
            java.util.logging.Logger.getLogger(ConexionClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConexionClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConexionClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConexionClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConexionClienteGUI().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectarCliente;
    private javax.swing.JLabel lbConexionCliente;
    private javax.swing.JLabel lbDireccionIP;
    private javax.swing.JLabel lbPuerto;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel pnlConexionCliente;
    private javax.swing.JTextField txtDireccionIPConexionCliente;
    private javax.swing.JTextField txtPuertoConexionCliente;
    // End of variables declaration//GEN-END:variables
}
