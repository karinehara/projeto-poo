//Karine Marques Hara - RA:2144484

import javax.swing.JOptionPane;

public class IdadeException extends Exception {
    
    public void verificarIdadeUsuario(Usuario u, String nome, String email, String senha, String user, int idade){
        JOptionPane.showMessageDialog(null, "Idade não pode ser menor que 12 ", "Erro ao cadastrar Usuário", 0);		
    }
}
