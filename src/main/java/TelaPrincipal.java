//Karine Marques Hara - RA:2144484

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends javax.swing.JFrame {

    private static TelaPrincipal telaIncial;
    
    private gerUsuario gerUsuario;
    private Usuario usuario = new Usuario();
    
    private TelaPrincipal() {
        initComponents();
    }

    private TelaPrincipal(gerUsuario gerUsuario) {
        initComponents();
        this.gerUsuario = gerUsuario;
    }
    
    public static TelaPrincipal getTelaPrincipal(gerUsuario gerUsuario){
        telaIncial = new TelaPrincipal(gerUsuario);
        return telaIncial;
    }
    
    public static TelaPrincipal getTelaPrincipal(){
        if(telaIncial == null){
            telaIncial = new TelaPrincipal();
        }
        return telaIncial;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntrar = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblCadastrar = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        lblInf = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblUsername.setText("Digite seu nome de Usuário:");

        lblCadastrar.setText("Não possui uma conta? Cadastre-se");
        lblCadastrar.setToolTipText("");

        lblSenha.setText("Digite sua Senha:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblInf.setText("Faça Login para Continuar");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInf)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha)
                    .addComponent(txtUsername))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lblCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnCadastrar)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(lblInf)
                .addGap(18, 18, 18)
                .addComponent(lblUsername)
                .addGap(1, 1, 1)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEntrar)
                .addGap(26, 26, 26)
                .addComponent(lblCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addGap(42, 42, 42))
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        
        try{
            if(gerUsuario == null){
                JOptionPane.showMessageDialog(null, "Usuário não existente ou erro na entrada de dados ", "Erro ao efetuar login", 0);
            }
            else{
                usuario = new Usuario();
                usuario.setUsername(txtUsername.getText());
                usuario.setSenha(txtSenha.getText());
                usuario = gerUsuario.consUsuario(usuario);
                String user = usuario.getUsername();

                if(usuario != null){
                    TelaInicial.getTelaInicial(gerUsuario, user).setVisible(true);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Usuário não existente ou erro na entrada de dados ", "Erro ao efetuar login", 0);

                }
            }
        }
        catch(NullPointerException ne){
            JOptionPane.showMessageDialog(null, "Erro na entrada de dados ", "Erro ao efetuar login", 0);
        }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        TelaCadastroUsuario.getTelaCadastroUsuario().setVisible(true);
        dispose();

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
       
    }//GEN-LAST:event_txtUsernameActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblInf;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
