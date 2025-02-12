/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DashBoard;

import Clases.SesionActual;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    private void showPanel(JPanel p){
        p.setSize(600, 510);
        p.setLocation(0, 0);
        Bg.removeAll();
        Bg.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        Bg.revalidate();
        Bg.repaint();
        
        String numeroMesa = SesionActual.getNumeroMesa();
        String nombrePersona = SesionActual.getNombrePersona();
        
        numesa.setText(numeroMesa);
        nombre.setText(nombrePersona);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg2 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cervezaBtn = new javax.swing.JPanel();
        cervezaTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        coctelesBtn = new javax.swing.JPanel();
        coctelesTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vinosBtn = new javax.swing.JPanel();
        vinosTxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        numesa = new javax.swing.JLabel();
        Bg = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 550));

        bg2.setBackground(new java.awt.Color(85, 85, 85));
        bg2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(141, 73, 37));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HUBSON");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 800, 40));

        bg2.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        jPanel1.setBackground(new java.awt.Color(141, 73, 37));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cervezaBtn.setBackground(new java.awt.Color(141, 73, 37));
        cervezaBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cervezaBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cervezaTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        cervezaTxt.setForeground(new java.awt.Color(255, 255, 255));
        cervezaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cervezaTxt.setText("Cerveza");
        cervezaTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cervezaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cervezaTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cervezaTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cervezaTxtMouseExited(evt);
            }
        });
        cervezaBtn.add(cervezaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cerveza.png"))); // NOI18N
        cervezaBtn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        jPanel1.add(cervezaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 200, 60));

        coctelesBtn.setBackground(new java.awt.Color(141, 73, 37));
        coctelesBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        coctelesBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        coctelesTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        coctelesTxt.setForeground(new java.awt.Color(255, 255, 255));
        coctelesTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coctelesTxt.setText("Cocteles");
        coctelesTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        coctelesTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coctelesTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                coctelesTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                coctelesTxtMouseExited(evt);
            }
        });
        coctelesBtn.add(coctelesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/coctel.png"))); // NOI18N
        coctelesBtn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        jPanel1.add(coctelesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 60));

        vinosBtn.setBackground(new java.awt.Color(141, 73, 37));
        vinosBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        vinosBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vinosTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        vinosTxt.setForeground(new java.awt.Color(255, 255, 255));
        vinosTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vinosTxt.setText("Vinos");
        vinosTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vinosTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vinosTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vinosTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vinosTxtMouseExited(evt);
            }
        });
        vinosBtn.add(vinosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vino.png"))); // NOI18N
        vinosBtn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        jPanel1.add(vinosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 200, 60));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grocery-store.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 40, 40));

        nombre.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("Nombre");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 246, 200, 30));

        numesa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numesa.setForeground(new java.awt.Color(255, 255, 255));
        numesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numesa.setText("Numero");
        jPanel1.add(numesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 200, 30));

        bg2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 550));

        Bg.setBackground(new java.awt.Color(141, 73, 37));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Bienvenido a HUBSON");
        Bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 510));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bginicio.jpg"))); // NOI18N
        Bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-410, 0, 1010, 510));

        bg2.add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 600, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cervezaTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cervezaTxtMouseEntered
        cervezaBtn.setBackground(new Color(111,57,29));
    }//GEN-LAST:event_cervezaTxtMouseEntered

    private void cervezaTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cervezaTxtMouseExited
        cervezaBtn.setBackground(new Color(141,73,37));
    }//GEN-LAST:event_cervezaTxtMouseExited

    private void coctelesTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coctelesTxtMouseEntered
        coctelesBtn.setBackground(new Color(111,57,29));
    }//GEN-LAST:event_coctelesTxtMouseEntered

    private void coctelesTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coctelesTxtMouseExited
        coctelesBtn.setBackground(new Color(141,73,37));
    }//GEN-LAST:event_coctelesTxtMouseExited

    private void vinosTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vinosTxtMouseEntered
        vinosBtn.setBackground(new Color(111,57,29));
    }//GEN-LAST:event_vinosTxtMouseEntered

    private void vinosTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vinosTxtMouseExited
        vinosBtn.setBackground(new Color(141,73,37));
    }//GEN-LAST:event_vinosTxtMouseExited

    private void cervezaTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cervezaTxtMouseClicked
        cervezas b = new cervezas();
        showPanel(b.getFondo());
    }//GEN-LAST:event_cervezaTxtMouseClicked

    private void coctelesTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coctelesTxtMouseClicked
        cocteles b = new cocteles();
        showPanel(b.getFondo());
    }//GEN-LAST:event_coctelesTxtMouseClicked

    private void vinosTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vinosTxtMouseClicked
        vinos b = new vinos();
        showPanel(b.getFondo());
    }//GEN-LAST:event_vinosTxtMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        carrito b = new carrito();
        showPanel(b.getFondo());
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JPanel cervezaBtn;
    private javax.swing.JLabel cervezaTxt;
    private javax.swing.JPanel coctelesBtn;
    private javax.swing.JLabel coctelesTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numesa;
    private javax.swing.JPanel vinosBtn;
    private javax.swing.JLabel vinosTxt;
    // End of variables declaration//GEN-END:variables

}
