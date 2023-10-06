//Karine Marques Hara - RA:2144484
import javax.swing.JOptionPane;

public class TelaPerfil extends javax.swing.JFrame {
private static TelaPerfil telaPerfil;
    private static String user;
    private gerUsuario gerUsuario;
    private Usuario usuario = new Usuario();
    
    
    private TelaPerfil() {
        initComponents();
        if(gerUsuario == null){
            JOptionPane.showMessageDialog(null, "Não existe uma Usuário logado ", "Erro de consulta de Usuário", 0);  
        }
  
    }
   
    private TelaPerfil(gerUsuario gerUsuario,String user) {
        initComponents();      
        this.gerUsuario = gerUsuario;
        usuario = new Usuario();
        lblUsername.setText(user);
        usuario.setUsername(user);
        
        try{
            usuario = gerUsuario.consultarUsuario(usuario);

            if(usuario != null){
               txtNome.setText(usuario.getNome());
               txtSenha.setText(usuario.getSenha());
               txtEmail.setText(usuario.getEmail());
               txtIdade.setText(Integer.toString(usuario.getIdade()));
            }
            else{
               JOptionPane.showMessageDialog(null, "Não existe uma Usuário logado ", "Erro de consulta de Usuário", 0);
            }
        }
        catch(NullPointerException ne){
            JOptionPane.showMessageDialog(null, "Não existe uma Usuário logado ", "Erro de consulta de Usuário", 0);
        }
            
    }
   
    public static TelaPerfil getTelaPerfil(){
        if(telaPerfil == null){
            telaPerfil = new TelaPerfil();
        }
        return telaPerfil;
    }
    
    public static TelaPerfil getTelaPerfil(gerUsuario gerUsuario,String userName){
        telaPerfil = new TelaPerfil(gerUsuario, userName);
        user = userName;
        return telaPerfil;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDataNasc = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnVoltar = new java.awt.Button();
        btnAlterar = new java.awt.Button();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDataNasc.setText("Idade:");

        btnVoltar.setActionCommand("btnVoltar");
        btnVoltar.setLabel("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAlterar.setLabel("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblSenha.setText("Senha:");

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        lblNome.setText("Nome:");

        lblEmail.setText("Email:");

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsername.setText("----");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSenha)
                                    .addComponent(lblEmail)
                                    .addComponent(lblNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 67, Short.MAX_VALUE)))
                        .addGap(99, 99, 99))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblUsername)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataNasc)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaInicial.getTelaInicial(gerUsuario, user);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        usuario = new Usuario();
        usuario.setUsername(user);
        
        try{
        usuario = gerUsuario.atualizaUsuario(usuario);
            if(usuario != null){
                usuario.setNome(txtNome.getText());
                usuario.setUsername(user);
                usuario.setEmail(txtEmail.getText());
                usuario.setIdade(Integer.parseInt(txtIdade.getText()));
                usuario.setSenha(txtSenha.getText());
                JOptionPane.showMessageDialog(null, "Dados do Usuário: " +user + " atulizados com sucesso", "Atualização concluida", 0);
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro ao atualizar dados: ", "Erro de atualização de Usuário", 0);
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O valor da idade deve ser um número inteiro ", "Erro ao cadastrar Usuário", 0);
        }
        catch(NullPointerException ne){
            JOptionPane.showMessageDialog(null, "Não existe uma Usuário logado ", "Erro de consulta de Usuário", 0);
        }
        
        

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        
    }//GEN-LAST:event_txtSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAlterar;
    private java.awt.Button btnVoltar;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
