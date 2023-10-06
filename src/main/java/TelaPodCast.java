//Karine Marques Hara - RA:2144484

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaPodCast extends javax.swing.JFrame {

    private static TelaPodCast telaPdoCast;
    
    private gerPodCast gerPodCast = new gerPodCast();
    private PodCast podCast = new PodCast();
    
   
    public TelaPodCast() {
        initComponents();
    }
    
    public static TelaPodCast getTelaPodCast(){
        if(telaPdoCast == null){
            telaPdoCast = new TelaPodCast();
        }
        return telaPdoCast;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomePodCast = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        txtNomeParticipantes = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        txtDataLancamento = new javax.swing.JTextField();
        btnVotlar = new javax.swing.JButton();
        txtDuration = new javax.swing.JTextField();
        txtNumEp = new javax.swing.JTextField();
        lblNomePodCast = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        txtlNomeParticipantes = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblDataLancamento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPodCast = new javax.swing.JTable();
        lblPodCast = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        lblNumEp = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtQntdEp = new javax.swing.JTextField();
        lblQntdEp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        lblNomePodCast.setText("Nome do PodCast:");

        lblDescricao.setText("Descrição: ");

        txtlNomeParticipantes.setText("Nome dos Participantes :");

        lblDataLancamento.setText("Data de Lançamento:");

        tblPodCast.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome do PodCast", "Nome dos Participantes", "Data de Lançamento", "Duração do PodCast", "Número do Episodeo", "Quantidade total de Episodeos", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(tblPodCast);

        lblPodCast.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPodCast.setText("PodCast");

        lblDuration.setText("Duração do PodCast:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblNumEp.setText("Número do Episode:");
        lblNumEp.setToolTipText("");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblQntdEp.setText("Quantidade total de Capitulos: ");
        lblQntdEp.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPodCast)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblNomePodCast)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNomePodCast))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtlNomeParticipantes)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNomeParticipantes, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblDataLancamento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDataLancamento)))
                            .addComponent(btnVotlar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDescricao)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblNumEp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumEp))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblDuration)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDuration, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQntdEp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQntdEp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(lblPodCast)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomePodCast)
                            .addComponent(txtNomePodCast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlNomeParticipantes)
                            .addComponent(txtNomeParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataLancamento)
                            .addComponent(txtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDuration)
                            .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumEp)
                            .addComponent(txtNumEp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQntdEp)
                            .addComponent(txtQntdEp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescricao)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrar)
                            .addComponent(btnBuscar)
                            .addComponent(btnAlterar)
                            .addComponent(btnExcluir))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnVotlar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
        limpar();
        listarTabela();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
        limpar();
        listarTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVotlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotlarActionPerformed
        TelaInicial.getTelaInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVotlarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrar();
        listarTabela(); 

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        podCast = new PodCast();

        podCast.setNome(txtNomePodCast.getText());
        podCast = gerPodCast.consPC(podCast);

        if(podCast != null){
            txtNomePodCast.setText(podCast.getNome());
            txtNomeParticipantes.setText(podCast.getNomeParticipantes());
            txtDataLancamento.setText(podCast.getDataLancamento());
            txtNumEp.setText(Integer.toString((podCast.getNumEp())));
            txtQntdEp.setText(Integer.toString((podCast.getQntdEps())));
            txtDescricao.setText(podCast.getDescricao());
            txtDuration.setText(Double.toString(podCast.getDuration()));
        }
        else{
            JOptionPane.showMessageDialog(null, "Não existe uma PodCast com esse nome: "+txtNomePodCast.getText(), "Erro de consulta de PodCast", 0);
            limpar();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    
    public void cadastrar(){
       podCast = new PodCast();
 
       try{
           podCast.setNome(txtNomePodCast.getText());
           podCast.setNomeParticipantes(txtNomeParticipantes.getText());
           podCast.setDataLancamento(txtDataLancamento.getText());
           podCast.setNumEp(Integer.parseInt(txtNumEp.getText()));
           podCast.setQntdEps(Integer.parseInt(txtQntdEp.getText()));
           podCast.setDuration(Double.parseDouble(txtDuration.getText()));
           podCast.setDescricao(txtDescricao.getText());
           podCast = gerPodCast.cadastrarPC(podCast);

           if(podCast != null){
               JOptionPane.showMessageDialog(null, "PodCast cadastrado com sucesso!", "Cadastro de PodCast", 0);
               limpar();
           }
           else{
               JOptionPane.showMessageDialog(null, "Já existe uma PodCast com esse nome: "+txtNomePodCast.getText(), "Erro de cadastro de PodCast", 0);       
           }
       }
       catch(NumberFormatException nfe){
           JOptionPane.showMessageDialog(null, "Quantidade de episodeos, Duração e Numero do Episodeo deve ser representada por um número","Erro na entrada de dados", 0);
           limpar();
       }
    }
    
        public void alterar(){
        podCast = new PodCast();
       
        try{
            podCast.setNome(txtNomePodCast.getText());
            podCast.setNomeParticipantes(txtNomeParticipantes.getText());
            podCast.setDataLancamento(txtDataLancamento.getText());
            podCast.setNumEp(Integer.parseInt(txtNumEp.getText()));
            podCast.setQntdEps(Integer.parseInt(txtQntdEp.getText()));
            podCast.setDuration(Double.parseDouble(txtDuration.getText()));
            podCast.setDescricao(txtDescricao.getText());

            podCast = gerPodCast.attPC(podCast);


            if(podCast != null){
                podCast.setNome(txtNomePodCast.getText());
                podCast.setNomeParticipantes(txtNomeParticipantes.getText());
                podCast.setDataLancamento(txtDataLancamento.getText());
                podCast.setNumEp(Integer.parseInt(txtNumEp.getText()));
                podCast.setQntdEps(Integer.parseInt(txtQntdEp.getText()));
                podCast.setDuration(Double.parseDouble(txtDuration.getText()));
                podCast.setDescricao(txtDescricao.getText());
               JOptionPane.showMessageDialog(null, "PodCast atutalizada com sucesso", "Atualização de PodCast OK", 0);       
            }
           else{
               JOptionPane.showMessageDialog(null, "Não existe um PodCast com esse nome: "+txtNomePodCast.getText(), "Erro de Atualização de PodCast", 0);       
               limpar();
            }
        }
        
        catch(NumberFormatException nfe){
           JOptionPane.showMessageDialog(null, "Quantidade de episodeos, Duração e Numero do Episodeo deve ser representada por um número","Erro na entrada de dados", 0);
           limpar();
        }
    
    }
    
    public void excluir(){
        
        podCast = new PodCast();
        
        podCast.setNome(txtNomePodCast.getText());
        podCast = gerPodCast.removePC(podCast);

       
        if(podCast != null){
           JOptionPane.showMessageDialog(null, "PodCast removido com sucesso", "Remoção de PodCast OK", 0);       
        }
        else{
           JOptionPane.showMessageDialog(null, "Não existe um PodCast com esse nome: "+txtNomePodCast.getText(), "Erro de Remoção de PodCast", 0);       
           limpar();
        }
    }
    
    
    
    public void listarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tblPodCast.getModel();
        modelo.setRowCount(0);
        int posLin = 0;
        
        for(PodCast podCast: gerPodCast.getBdPodCast()){
            modelo.insertRow(posLin, new Object[]{podCast.getNome(),podCast.getNomeParticipantes(), podCast.getDataLancamento(), podCast.getDuration(), podCast.getNumEp(), podCast.getQntdEps(), podCast.getDescricao() });
            posLin++;
        }
    }
    
    public void limpar(){
        txtNomePodCast.setText("");
            txtNomeParticipantes.setText("");
            txtDataLancamento.setText("");
            txtNumEp.setText("");
            txtQntdEp.setText("");
            txtDescricao.setText("");
            txtDuration.setText("");
    
    
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
            java.util.logging.Logger.getLogger(TelaPodCast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPodCast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPodCast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPodCast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPodCast().setVisible(true);
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
    private javax.swing.JLabel lblDataLancamento;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblNomePodCast;
    private javax.swing.JLabel lblNumEp;
    private javax.swing.JLabel lblPodCast;
    private javax.swing.JLabel lblQntdEp;
    private javax.swing.JTable tblPodCast;
    private javax.swing.JTextField txtDataLancamento;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtNomeParticipantes;
    private javax.swing.JTextField txtNomePodCast;
    private javax.swing.JTextField txtNumEp;
    private javax.swing.JTextField txtQntdEp;
    private javax.swing.JLabel txtlNomeParticipantes;
    // End of variables declaration//GEN-END:variables
}
