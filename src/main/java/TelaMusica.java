//Karine Marques Hara - RA:2144484
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaMusica extends javax.swing.JFrame {

    private static TelaMusica telaMusica;
    private gerMusica gerMusica = new gerMusica();
    private Musica musica = new Musica();
    private gerUsuario gerUsuario;
    private static String user;

    public TelaMusica() {
        initComponents();
    }
    
    public static TelaMusica getTelaMusica(){
        if(telaMusica == null){
            telaMusica = new TelaMusica();
        }
        return telaMusica;
    }
    
    private TelaMusica(gerUsuario gerUsuario,String userName) {
        initComponents();
        this.gerUsuario = gerUsuario;
              
    }
    
    public static TelaMusica getTelaMusica(gerUsuario gerUsuario,String userName){
        
        if(telaMusica == null){
            user = userName;
            telaMusica = new TelaMusica(gerUsuario, user);    
        }
        return telaMusica;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeMusica = new javax.swing.JLabel();
        lblArtista = new javax.swing.JLabel();
        lblDataLancamento = new javax.swing.JLabel();
        lblMusica = new javax.swing.JLabel();
        lblDuracaoMusica = new javax.swing.JLabel();
        lblNomeAlbum = new javax.swing.JLabel();
        txtNomeMusica = new javax.swing.JTextField();
        txtArtista = new javax.swing.JTextField();
        txtDataLancamento = new javax.swing.JTextField();
        txtDuracaoMusica = new javax.swing.JTextField();
        txtAlbum = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMusica = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVotlar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeMusica.setText("Nome da Música:");

        lblArtista.setText("Nome do Cantor/Grupo/Banda:");

        lblDataLancamento.setText("Data de Lançamento:");

        lblMusica.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMusica.setText("Música");

        lblDuracaoMusica.setText("Duração da música:");

        lblNomeAlbum.setText("Nome do Album:");
        lblNomeAlbum.setToolTipText("");

        lblGenero.setText("Genêro Musical: ");

        tblMusica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome da Música", "Artista", "Data de Lançamento", "Duração da Música", "Nome do Album", "Genêro Musical"
            }
        ));
        jScrollPane1.setViewportView(tblMusica);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVotlar.setText("Voltar");
        btnVotlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotlarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMusica)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblNomeMusica)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNomeMusica))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblArtista)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtArtista, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblDataLancamento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtDataLancamento)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblNomeAlbum)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtAlbum))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblDuracaoMusica)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtDuracaoMusica, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCadastrar)
                            .addComponent(lblGenero))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGenero)
                                .addGap(90, 90, 90))))
                    .addComponent(btnVotlar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMusica)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeMusica)
                            .addComponent(txtNomeMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArtista)
                            .addComponent(txtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataLancamento)
                            .addComponent(txtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDuracaoMusica)
                            .addComponent(txtDuracaoMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeAlbum)
                            .addComponent(txtAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenero)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrar)
                            .addComponent(btnBuscar)
                            .addComponent(btnAlterar)
                            .addComponent(btnExcluir))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnVotlar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVotlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotlarActionPerformed
       limpar();
       TelaInicial.getTelaInicial(gerUsuario, user, gerMusica).setVisible(true);
       dispose();
       
       
    }//GEN-LAST:event_btnVotlarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrar();
        listarTabela();
     
    }//GEN-LAST:event_btnCadastrarActionPerformed

    
    public void cadastrar(){
       musica = new Musica();
       try{
           musica.setNome(txtNomeMusica.getText());
           musica.setNomeArtista(txtArtista.getText());
           musica.setDataLancamento(txtDataLancamento.getText());
           musica.setNomeAlbum(txtAlbum.getText());
           musica.setGenero(txtGenero.getText());
           musica.setDuration(Double.parseDouble(txtDuracaoMusica.getText()));
           musica = gerMusica.cadastrarMusica(musica);

           if(musica != null){
               JOptionPane.showMessageDialog(null, "Música cadastrada com sucesso!", "Cadastro de Música", 0);
               limpar();
           }
           else{
               JOptionPane.showMessageDialog(null, "Já existe uma música com esse nome: "+txtNomeMusica.getText(), "Erro de cadastro de Música", 0);       
           }
       }
       catch(NumberFormatException nfe){
           JOptionPane.showMessageDialog(null, "A duração deve ser um número","Erro na entrada de dados", 0);
           limpar();
       }
    }
    
    public void alterar(){
        musica = new Musica();
        
        try{
        
            musica.setNome(txtNomeMusica.getText());
            musica.setNomeArtista(txtArtista.getText());
            musica.setDataLancamento(txtDataLancamento.getText());
            musica.setNomeAlbum(txtAlbum.getText());
            musica.setGenero(txtGenero.getText());
            musica.setDuration(Double.parseDouble(txtDuracaoMusica.getText()));


            musica = gerMusica.attMusica(musica);

            if(musica != null){
                txtNomeMusica.setText(musica.getNome());
                txtArtista.setText(musica.getNomeArtista());
                txtDataLancamento.setText(musica.getDataLancamento());
                txtAlbum.setText(musica.getNomeAlbum());
                txtGenero.setText(musica.getGenero());
                txtDuracaoMusica.setText(Double.toString(musica.getDuration()));
               JOptionPane.showMessageDialog(null, "Música atutalizada com sucesso", "Atualização de Música OK", 0);       
            }
           else{
               JOptionPane.showMessageDialog(null, "Não existe uma música com esse nome: "+txtNomeMusica.getText(), "Erro de Atualização de Música", 0);       
               limpar();
            }
        }
        catch(NumberFormatException nfe){
           JOptionPane.showMessageDialog(null, "A duração deve ser um número","Erro na entrada de dados", 0);
           limpar();
       }
    
    }
    
    public void excluir(){
        musica = new Musica();
        musica.setNome(txtNomeMusica.getText());
        musica = gerMusica.removeMusica(musica);
       
        if(musica != null){
           JOptionPane.showMessageDialog(null, "Música removida com sucesso", "Remoção de Música OK", 0);       
        }
        else{
           JOptionPane.showMessageDialog(null, "Não existe uma música com esse nome: "+txtNomeMusica.getText(), "Erro de Remoção de Música", 0);       
           limpar();
        }
    }
    
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        musica = new Musica();
        musica.setNome(txtNomeMusica.getText());
        musica = gerMusica.consMusica(musica);
    
        if(musica != null){
            txtNomeMusica.setText(musica.getNome());
            txtArtista.setText(musica.getNomeArtista());
            txtDataLancamento.setText(musica.getDataLancamento());
            txtAlbum.setText(musica.getNomeAlbum());
            txtGenero.setText(musica.getGenero());
            txtDuracaoMusica.setText(Double.toString(musica.getDuration()));
        }
        else{
           JOptionPane.showMessageDialog(null, "Não existe uma música com esse nome: "+txtNomeMusica.getText(), "Erro de consulta de Música", 0);       
           limpar();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
        limpar();
        listarTabela();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
        listarTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    
    public void listarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tblMusica.getModel();
        modelo.setRowCount(0);
        int posLin = 0;
        
        for(Musica musica: gerMusica.getBdMusica()){
            modelo.insertRow(posLin, new Object[]{musica.getNome(),musica.getNomeArtista(), musica.getDataLancamento(), musica.getDuration(), musica.getNomeAlbum(), musica.getGenero()});
            posLin++;
        }
    }
    
    public void limpar(){
        txtNomeMusica.setText("");
        txtArtista.setText("");
        txtDataLancamento.setText("");
        txtAlbum.setText("");
        txtGenero.setText("");
        txtDuracaoMusica.setText("");
    
    
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
            java.util.logging.Logger.getLogger(TelaMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMusica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVotlar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArtista;
    private javax.swing.JLabel lblDataLancamento;
    private javax.swing.JLabel lblDuracaoMusica;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblMusica;
    private javax.swing.JLabel lblNomeAlbum;
    private javax.swing.JLabel lblNomeMusica;
    private javax.swing.JTable tblMusica;
    private javax.swing.JTextField txtAlbum;
    private javax.swing.JTextField txtArtista;
    private javax.swing.JTextField txtDataLancamento;
    private javax.swing.JTextField txtDuracaoMusica;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNomeMusica;
    // End of variables declaration//GEN-END:variables
}
