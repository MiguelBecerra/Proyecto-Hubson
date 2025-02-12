/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;
import Clases.SesionActual;
import DashBoard.Dashboard;
import java.awt.Color;

/**
 *
 * @author USUARIO
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nombrePersona1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        entrarBtn = new javax.swing.JPanel();
        entrarTxt = new javax.swing.JLabel();
        numeroMesa1 = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(85, 85, 85));

        bg.setBackground(new java.awt.Color(141, 73, 37));
        bg.setPreferredSize(new java.awt.Dimension(600, 400));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg-hubson.png"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 400));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIAR SESION");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 280, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mesa");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 250, 10));

        nombrePersona1.setBackground(new java.awt.Color(141, 73, 37));
        nombrePersona1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombrePersona1.setForeground(new java.awt.Color(153, 153, 153));
        nombrePersona1.setText("Ingrese su nombre");
        nombrePersona1.setBorder(null);
        nombrePersona1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombrePersona1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombrePersona1MousePressed(evt);
            }
        });
        nombrePersona1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePersona1ActionPerformed(evt);
            }
        });
        bg.add(nombrePersona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 250, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 250, 10));

        entrarBtn.setBackground(new java.awt.Color(0, 102, 153));

        entrarTxt.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        entrarTxt.setForeground(new java.awt.Color(255, 255, 255));
        entrarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrarTxt.setText("ENTRAR");
        entrarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout entrarBtnLayout = new javax.swing.GroupLayout(entrarBtn);
        entrarBtn.setLayout(entrarBtnLayout);
        entrarBtnLayout.setHorizontalGroup(
            entrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        entrarBtnLayout.setVerticalGroup(
            entrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(entrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 250, 40));

        numeroMesa1.setBackground(new java.awt.Color(141, 73, 37));
        numeroMesa1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        numeroMesa1.setForeground(new java.awt.Color(153, 153, 153));
        numeroMesa1.setText("Ingrese el numero de su mesa");
        numeroMesa1.setBorder(null);
        numeroMesa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numeroMesa1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                numeroMesa1MousePressed(evt);
            }
        });
        numeroMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroMesa1ActionPerformed(evt);
            }
        });
        bg.add(numeroMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 250, 20));

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

    private void nombrePersona1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePersona1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePersona1ActionPerformed

    private void numeroMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroMesa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroMesa1ActionPerformed

    private void entrarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarTxtMouseClicked
        // TODO add your handling code here:
        String numeroMesa = numeroMesa1.getText();
        String nombrePersona = nombrePersona1.getText();
        
        SesionActual.setNumeroMesa(numeroMesa);
        SesionActual.setNombrePersona(nombrePersona);
        
        String numeroMesa1 = SesionActual.getNumeroMesa();
        String nombrePersona1 = SesionActual.getNombrePersona();
        
        this.dispose(); 
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_entrarTxtMouseClicked

    private void numeroMesa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numeroMesa1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_numeroMesa1MouseClicked

    private void nombrePersona1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombrePersona1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nombrePersona1MouseClicked

    private void numeroMesa1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numeroMesa1MousePressed
        // TODO add your handling code here:
        if (numeroMesa1.getText().equals("Ingrese el numero de su mesa")){
            numeroMesa1.setText("");
            numeroMesa1.setForeground(Color.white);
        }
        
        if (nombrePersona1.getText().isEmpty()){
            nombrePersona1.setText("Ingrese su nombre");
            nombrePersona1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_numeroMesa1MousePressed

    private void nombrePersona1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombrePersona1MousePressed
        // TODO add your handling code here:
        if (nombrePersona1.getText().equals("Ingrese su nombre")){
            nombrePersona1.setText("");
            nombrePersona1.setForeground(Color.white);
        }
        
        if (numeroMesa1.getText().isEmpty()){
            numeroMesa1.setText("Ingrese el numero de su mesa");
            numeroMesa1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nombrePersona1MousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel entrarBtn;
    private javax.swing.JLabel entrarTxt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nombrePersona1;
    private javax.swing.JTextField numeroMesa1;
    // End of variables declaration//GEN-END:variables
}
