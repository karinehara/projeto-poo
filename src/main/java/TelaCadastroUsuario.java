//Karine Marques Hara - RA:2144484
import javax.swing.JOptionPane;

public class TelaCadastroUsuario extends javax.swing.JFrame {

    private static TelaCadastroUsuario telaCadastroUsuarioUnico;
    private gerUsuario gerUsuario = new gerUsuario();
    private Usuario usuario = new Usuario();
    
    public TelaCadastroUsuario() {
        initComponents();
    }
    
    public static TelaCadastroUsuario getTelaCadastroUsuario(){
        if(telaCadastroUsuarioUnico == null){
            telaCadastroUsuarioUnico = new TelaCadastroUsuario();
        }
        return telaCadastroUsuarioUnico;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSenha = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDataNasc = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        lblSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        lblNome.setText("Digite seu nome:");

        jLabel1.setText("Cadastro ");

        lblEmail.setText("Digite sue email:");

        lblUsername.setText("Digite seu nome de Usuário:");

        lblDataNasc.setText("Informe sua idade: ");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar a tela Incial");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblSenha.setText("Digite sua senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(165, 165, 165)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnVoltar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(157, 157, 157)
                            .addComponent(btnCadastrar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEmail)
                                    .addComponent(lblNome)
                                    .addComponent(lblSenha))
                                .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblNome)
                .addGap(4, 4, 4)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addGap(3, 3, 3)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername)
                .addGap(1, 1, 1)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDataNasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        usuario = new Usuario();
        String nome="", email="", senha="", user="";
	int idade = 0;
        try{
            nome = txtNome.getText();
            email = txtEmail.getText();
            senha = txtSenha.getText();
            user = txtUsername.getText();
            idade = Integer.parseInt(txtIdade.getText());
            
            usuario.cadastrarUsuario(nome, email, senha, user, idade);
            
            /*usuario.setNome(txtNome.getText());
            usuario.setUsername(txtUsername.getText());
            usuario.setEmail(txtEmail.getText());
            usuario.setIdade(Integer.parseInt(txtIdade.getText()));
            usuario.setSenha(txtSenha.getText());

            usuario = gerUsuario.cadastroUsuario(usuario);*/
            
            usuario = gerUsuario.cadastroUsuario(usuario);
            if(usuario != null){
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!", "Cadastro de Usuário", 0);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Já existe uma usaruio com o mesmo user: "+txtUsername.getText(), "Erro ao cadastrar Usuário", 0);
            }
        
        }
        
        catch(VazioException ve){
            ve.verificarCadstroUsuario(usuario, nome, email, senha, user, idade);
        }
        catch(IdadeException ie){
            ie.verificarIdadeUsuario(usuario, nome, email, senha, user, idade);
        
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O valor da idade deve ser um número inteiro ", "Erro ao cadastrar Usuário", 0);
            
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        TelaPrincipal.getTelaPrincipal(gerUsuario).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public void limpar(){
        txtNome.setText("");
        txtUsername.setText("");
        txtSenha.setText("");
        txtIdade.setText("");
        txtEmail.setText("");
    
    }
    
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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
