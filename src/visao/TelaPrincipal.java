/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Edilson
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternalFrame = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButtonCadMedicos = new javax.swing.JButton();
        jButtonCadClientes = new javax.swing.JButton();
        jButtonCadUsuario = new javax.swing.JButton();
        jButtonCadAgenda = new javax.swing.JButton();
        jButtonCadEnfermeira1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSairBemVindo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadMedicos = new javax.swing.JMenuItem();
        jMenuItemCadEnfermeiros = new javax.swing.JMenuItem();
        jMenuItemCadPacientes = new javax.swing.JMenuItem();
        jMenuItemCadUsuarios = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuFerrramenta = new javax.swing.JMenu();
        jMenuItemFerBemVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternalFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternalFrame.setLayout(null);

        jLabel4.setText("Cadastros:");
        jPanelInternalFrame.add(jLabel4);
        jLabel4.setBounds(10, 0, 80, 50);

        jButtonCadMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/doutor1.png"))); // NOI18N
        jButtonCadMedicos.setToolTipText("Cadastro de Médicos");
        jPanelInternalFrame.add(jButtonCadMedicos);
        jButtonCadMedicos.setBounds(10, 40, 130, 110);

        jButtonCadClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente_1.png"))); // NOI18N
        jButtonCadClientes.setToolTipText("Cadastro de Clientes");
        jButtonCadClientes.setAlignmentX(1.0F);
        jPanelInternalFrame.add(jButtonCadClientes);
        jButtonCadClientes.setBounds(290, 40, 130, 110);

        jButtonCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        jPanelInternalFrame.add(jButtonCadUsuario);
        jButtonCadUsuario.setBounds(430, 40, 130, 110);

        jButtonCadAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/agenda.png"))); // NOI18N
        jButtonCadAgenda.setToolTipText("Agenda");
        jButtonCadAgenda.setAlignmentX(1.0F);
        jPanelInternalFrame.add(jButtonCadAgenda);
        jButtonCadAgenda.setBounds(10, 160, 130, 110);

        jButtonCadEnfermeira1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/enfermeira_1.png"))); // NOI18N
        jButtonCadEnfermeira1.setToolTipText("Cadastro de Enfermeiros");
        jButtonCadEnfermeira1.setAlignmentX(1.0F);
        jPanelInternalFrame.add(jButtonCadEnfermeira1);
        jButtonCadEnfermeira1.setBounds(150, 40, 130, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagem-internal-frame.png"))); // NOI18N
        jPanelInternalFrame.add(jLabel3);
        jLabel3.setBounds(0, 0, 790, 280);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternalFrame);
        jPanelInternalFrame.setBounds(0, 60, 780, 270);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamento de:");
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 290, 30);

        jButtonSairBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonSairBemVindo.setToolTipText("Sair da Tela Bem Vindo");
        jButtonSairBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonSairBemVindo);
        jButtonSairBemVindo.setBounds(710, 10, 65, 41);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(0, 120, 810, 370);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo-principal.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-4, 0, 830, 479);

        jMenuCadastros.setText("Cadastros");

        jMenuItemCadMedicos.setText("Médicos");
        jMenuItemCadMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMedicosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadMedicos);

        jMenuItemCadEnfermeiros.setText("Enfermeiros");
        jMenuItemCadEnfermeiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadEnfermeirosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadEnfermeiros);

        jMenuItemCadPacientes.setText("Pacientes");
        jMenuCadastros.add(jMenuItemCadPacientes);

        jMenuItemCadUsuarios.setText("Usuários");
        jMenuItemCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadUsuarios);

        jMenuBar1.add(jMenuCadastros);

        jMenuRelatorio.setText("Relatórios");
        jMenuBar1.add(jMenuRelatorio);

        jMenuFerrramenta.setText("Ferramentas");

        jMenuItemFerBemVindo.setText("Tela Bem Vindo");
        jMenuFerrramenta.add(jMenuItemFerBemVindo);

        jMenuBar1.add(jMenuFerrramenta);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(816, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadEnfermeirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadEnfermeirosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadEnfermeirosActionPerformed

    private void jMenuItemCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadUsuariosActionPerformed

    private void jMenuItemCadMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadMedicosActionPerformed

    private void jButtonSairBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairBemVindoActionPerformed
        // TODO add your handling code here:
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonSairBemVindoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadAgenda;
    private javax.swing.JButton jButtonCadClientes;
    private javax.swing.JButton jButtonCadEnfermeira1;
    private javax.swing.JButton jButtonCadMedicos;
    private javax.swing.JButton jButtonCadUsuario;
    private javax.swing.JButton jButtonSairBemVindo;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuFerrramenta;
    private javax.swing.JMenuItem jMenuItemCadEnfermeiros;
    private javax.swing.JMenuItem jMenuItemCadMedicos;
    private javax.swing.JMenuItem jMenuItemCadPacientes;
    private javax.swing.JMenuItem jMenuItemCadUsuarios;
    private javax.swing.JMenuItem jMenuItemFerBemVindo;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInternalFrame;
    // End of variables declaration//GEN-END:variables
}
