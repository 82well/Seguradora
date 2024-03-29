/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import java.io.IOException;



/**
 *
 * @author Windows.lite
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        JdpPrincipal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCli = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuAuto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuOco = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuAjuda = new javax.swing.JMenuItem();
        mnusobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/img_fundo.jpg"))); // NOI18N

        JdpPrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JdpPrincipalLayout = new javax.swing.GroupLayout(JdpPrincipal);
        JdpPrincipal.setLayout(JdpPrincipalLayout);
        JdpPrincipalLayout.setHorizontalGroup(
            JdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JdpPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JdpPrincipalLayout.setVerticalGroup(
            JdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JdpPrincipalLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jMenu1.setText("CLIENTE");

        mnuCli.setText("FUNÇÃO");
        mnuCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCliActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCli);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("AUTOMÓVEL");

        mnuAuto.setText("FUNÇÃO");
        mnuAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAutoActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAuto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("OCORRÊNCIA");

        mnuOco.setText("FUNÇÃO");
        mnuOco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOcoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuOco);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("AJUDA");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        mnuAjuda.setText("FUNÇÃO");
        mnuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAjudaActionPerformed(evt);
            }
        });
        jMenu4.add(mnuAjuda);

        jMenuBar1.add(jMenu4);

        mnusobre.setText("SOBRE");
        mnusobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnusobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnusobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JdpPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JdpPrincipal)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCliActionPerformed
        // TODO add your handling code here:
        TelaCliente carregar = new TelaCliente();
        JdpPrincipal.add(carregar);
        carregar.setVisible(true);
    }//GEN-LAST:event_mnuCliActionPerformed

    private void mnuAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAutoActionPerformed
        // TODO add your handling code here:
        TelaAutomovel carregar = new TelaAutomovel();
        JdpPrincipal.add(carregar);
        carregar.setVisible(true);
    }//GEN-LAST:event_mnuAutoActionPerformed

    private void mnuOcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOcoActionPerformed
        // TODO add your handling code here:
        TelaOcorrencia carregar = new TelaOcorrencia();
        JdpPrincipal.add(carregar);
        carregar.setVisible(true);
    }//GEN-LAST:event_mnuOcoActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void mnuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAjudaActionPerformed
        // TODO add your handling code here:
        ajuda();
    }//GEN-LAST:event_mnuAjudaActionPerformed

    private void mnusobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnusobreActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnusobreActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JdpPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAjuda;
    private javax.swing.JMenuItem mnuAuto;
    private javax.swing.JMenuItem mnuCli;
    private javax.swing.JMenuItem mnuOco;
    private javax.swing.JMenu mnusobre;
    // End of variables declaration//GEN-END:variables

private void ajuda() {
        String chmFile = "cmd.exe /c ajuda.chm";
        Runtime run = Runtime.getRuntime();
        try {
            run.exec(chmFile);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
