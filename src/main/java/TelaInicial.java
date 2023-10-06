//Karine Marques Hara - RA:2144484
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    private static TelaInicial telaPrincipal ;
    private gerUsuario gerUsuario;
    private Usuario usuario = new Usuario();
    private static String user;
    private gerMusica gerMusica;
    
    public TelaInicial() {
        initComponents();
    }
    
    public static TelaInicial getTelaInicial(){
        if(telaPrincipal == null){
            telaPrincipal = new TelaInicial();
        }
        return telaPrincipal;
    }
    
    private TelaInicial(gerUsuario gerUsuario,String userName) {
        initComponents();
        this.gerUsuario = gerUsuario;
              
    }
    
    public static TelaInicial getTelaInicial(gerUsuario gerUsuario,String userName){
        
        user = userName;
        telaPrincipal = new TelaInicial(gerUsuario, userName);   
        return telaPrincipal;
        
    }
    
    private TelaInicial(gerUsuario gerUsuario,String userName, gerMusica gerMusica) {
        initComponents();
        this.gerUsuario = gerUsuario;
        this.gerMusica = gerMusica;
              
    }
    
    public static TelaInicial getTelaInicial(gerUsuario gerUsuario,String userName, gerMusica gerMusica){
        telaPrincipal = new TelaInicial(gerUsuario, userName, gerMusica);

        return telaPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jPrincipal = new javax.swing.JMenu();
        itmMusica = new javax.swing.JMenuItem();
        itmPodCast = new javax.swing.JMenuItem();
        itmPlayList = new javax.swing.JMenuItem();
        jPerfil = new javax.swing.JMenu();
        jPerfilAtt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jPrincipal.setText("Principal");

        itmMusica.setText("Música");
        itmMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMusicaActionPerformed(evt);
            }
        });
        jPrincipal.add(itmMusica);

        itmPodCast.setText("PodCast");
        itmPodCast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPodCastActionPerformed(evt);
            }
        });
        jPrincipal.add(itmPodCast);

        itmPlayList.setText("Playlist");
        itmPlayList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPlayListActionPerformed(evt);
            }
        });
        jPrincipal.add(itmPlayList);

        jMenuBar1.add(jPrincipal);

        jPerfil.setText("Perfil");
        jPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPerfilActionPerformed(evt);
            }
        });

        jPerfilAtt.setText("Alterar Perfil");
        jPerfilAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPerfilAttActionPerformed(evt);
            }
        });
        jPerfil.add(jPerfilAtt);

        jMenuBar1.add(jPerfil);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void itmMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMusicaActionPerformed
       TelaMusica.getTelaMusica(gerUsuario, user).setVisible(true);
        dispose();
    }//GEN-LAST:event_itmMusicaActionPerformed

    private void itmPodCastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPodCastActionPerformed
        TelaPodCast.getTelaPodCast().setVisible(true);
        dispose();
    }//GEN-LAST:event_itmPodCastActionPerformed

    private void itmPlayListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPlayListActionPerformed
        TelaPlaylist.getTelaPlaylist(gerUsuario, user, gerMusica).setVisible(true);
        dispose();
    }//GEN-LAST:event_itmPlayListActionPerformed

    private void jPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPerfilActionPerformed
        
    }//GEN-LAST:event_jPerfilActionPerformed

    private void jPerfilAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPerfilAttActionPerformed
        TelaPerfil.getTelaPerfil(gerUsuario, user).setVisible(true);
    }//GEN-LAST:event_jPerfilAttActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JMenuItem itmMusica;
    private javax.swing.JMenuItem itmPlayList;
    private javax.swing.JMenuItem itmPodCast;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jPerfil;
    private javax.swing.JMenuItem jPerfilAtt;
    private javax.swing.JMenu jPrincipal;
    // End of variables declaration//GEN-END:variables
}
