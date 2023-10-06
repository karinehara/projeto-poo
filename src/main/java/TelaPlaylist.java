//Karine Marques Hara - RA: 2144484


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaPlaylist extends javax.swing.JFrame {

    private static TelaPlaylist telaPL ;
    private gerUsuario gerUsuario;
    private Usuario usuario = new Usuario();
    private gerMusica gerMusica;
    private static String userName;
    
    private Playlist playlist = new Playlist();
    private gerPlaylist gerPlaylist = new gerPlaylist();
    
    private static String user;
    
    public TelaPlaylist() {
        initComponents();
        listarTabelaMusica();
             
    }
    
    public static TelaPlaylist getTelaPL(){
        if(telaPL == null){
            telaPL = new TelaPlaylist();
        }
        
        return telaPL;
    }
   
    
    private TelaPlaylist(gerUsuario gerUsuario,String userName, gerMusica gerMusica) {
        initComponents();
        this.gerUsuario = gerUsuario;
        
        this.userName = userName;
        this.gerMusica = gerMusica;
        
        try{

        }
        catch(NullPointerException npe){
            JOptionPane.showMessageDialog(null, "Nenhuma música cadastrada no sistema!", "", 0);
        }
        
        listarTabelaMusica();
              
    }
    
    public static TelaPlaylist getTelaPlaylist(gerUsuario gerUsuario,String userName, gerMusica gerMusica){
        if(telaPL == null){
            telaPL = new TelaPlaylist(gerUsuario, userName, gerMusica);
            user = userName;
        }
        return telaPL;
    }
    
    
    public void cadastrar(){
        
        playlist = new Playlist();
        playlist.setNomePlaylist(txtNomePL.getText());
        playlist.setNomeUsuario(user);
        playlist = gerPlaylist.cadastrarPl(playlist);
        
        if(playlist != null){
            JOptionPane.showMessageDialog(null, "Playlist cadastrada com sucesso!", "Cadastro de Playlist", 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Já existe uma música com esse nome: "+txtNomePL.getText(), "Erro de cadastro de playlist", 0);       
        }

        
    }
    
    public void addMusica(){
        playlist = new Playlist();
        try{
            playlist.setNomePlaylist(txtNomeAddPl.getText());
            playlist.setNomeUsuario(user);

            //playlist = gerPlaylist.addMusicaPl(playlist); 
            //Descobrir um metodo add mais músicas em uma playlist

            playlist = gerPlaylist.attPl(playlist);

            if(playlist != null){
                playlist.addMusica(txtNomeMusica.getText(), gerMusica);
            }
            else{
                JOptionPane.showMessageDialog(null, "Não existe Playlist com esse nome: "+txtNomePL.getText(), "Erro ao buscar playlist", 0);       
            }
        }
        catch(NullPointerException npe){
            JOptionPane.showMessageDialog(null, "Nenhuma música cadastrada no sistema!", "Cadastro de Playlist", 0);
        }
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPL = new javax.swing.JLabel();
        lblNomePL = new javax.swing.JLabel();
        lblNomePl2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPl = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        txtNomePL = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JToggleButton();
        btnExcluir = new javax.swing.JButton();
        lblNomeMusica = new javax.swing.JLabel();
        btnAddMusica = new javax.swing.JToggleButton();
        txtNomeAddPl = new javax.swing.JTextField();
        txtNomeMusica = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMusica = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPL.setText("Playlist");

        lblNomePL.setText("Nome da Playlist:");

        lblNomePl2.setText("Nome da Playlist");

        tblPl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome da Playlist", "Nome do Usuário ", "Nome da Música"
            }
        ));
        jScrollPane1.setViewportView(tblPl);

        btnCadastrar.setText("Criar Playlist");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir Playlist");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblNomeMusica.setText("Nome da Música:");

        btnAddMusica.setText("Adicionar Música");
        btnAddMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMusicaActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Lista Playlist");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Lista de Músicas ");

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
        jScrollPane3.setViewportView(tblMusica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPL)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNomePL)
                                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtNomePL, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(btnExcluir))))
                                    .addComponent(btnAddMusica)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblNomePl2)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtNomeAddPl))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblNomeMusica)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtNomeMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(93, 93, 93)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPL)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomePL)
                    .addComponent(txtNomePL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrar)
                            .addComponent(btnExcluir))
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomePl2)
                            .addComponent(txtNomeAddPl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeMusica)
                            .addComponent(txtNomeMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(btnAddMusica)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(btnVoltar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrar();
        listarTabela();
     
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAddMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMusicaActionPerformed
        addMusica();
        listarTabela();
        limpar();
    }//GEN-LAST:event_btnAddMusicaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaInicial.getTelaInicial(gerUsuario, userName, gerMusica).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
        listarTabela();
        limpar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    public void limpar(){
        txtNomePL.setText("");
        txtNomeMusica.setText("");
        txtNomeAddPl.setText("");
    }
 
    public void excluir(){
        playlist = new Playlist();
        playlist.setNomePlaylist(txtNomePL.getText());
        playlist = gerPlaylist.removePl(playlist);
       
        if(playlist != null){
           JOptionPane.showMessageDialog(null, "Playlist removida com sucesso", "Remoção de Playlist OK", 0);       
        }
        else{
           JOptionPane.showMessageDialog(null, "Não existe uma música com esse nome: "+txtNomeMusica.getText(), "Erro de Remoção de Playlist", 0);       
        }
    }
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPlaylist().setVisible(true);
            }
        });
    }
    
    public void listarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tblPl.getModel();
        modelo.setRowCount(0);
        int posLin = 0;
        
        for(Playlist playlist: gerPlaylist.getPlaylist()){
            modelo.insertRow(posLin, new Object[]{playlist.getNomePlaylist(), playlist.getNomeUsuario(), playlist.getMusic().getNome()});
            posLin++;
        }
    }
    
    public void listarTabelaMusica(){
        DefaultTableModel modelo = (DefaultTableModel) tblMusica.getModel();
        modelo.setRowCount(0);
        int posLin = 0;
        try{
            for(Musica musica: gerMusica.getBdMusica()){
                modelo.insertRow(posLin, new Object[]{musica.getNome(),musica.getNomeArtista(), musica.getDataLancamento(), musica.getDuration(), musica.getNomeAlbum(), musica.getGenero()});
                posLin++;
            }
        }
        catch(NullPointerException npe){
            JOptionPane.showMessageDialog(null, "Nenhuma música cadastrada no sistema!", "Erro ao gerar tabela de músicas", 0);
        }
        
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAddMusica;
    private javax.swing.JToggleButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNomeMusica;
    private javax.swing.JLabel lblNomePL;
    private javax.swing.JLabel lblNomePl2;
    private javax.swing.JLabel lblPL;
    private javax.swing.JTable tblMusica;
    private javax.swing.JTable tblPl;
    private javax.swing.JTextField txtNomeAddPl;
    private javax.swing.JTextField txtNomeMusica;
    private javax.swing.JTextField txtNomePL;
    // End of variables declaration//GEN-END:variables
}
