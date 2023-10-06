//Karine Marques Hara - RA:2144484
import javax.swing.JOptionPane;

public class VazioException extends Exception{

	public void verificarCadstroUsuario(Usuario u, String nome, String email, String senha, String user, int idade){

		
		if(nome.length() == 0){
                    JOptionPane.showMessageDialog(null, "Nome não foi preenchido ", "Erro ao cadastrar Usuário", 0);
		}
		else if(email.length() == 0){
                    JOptionPane.showMessageDialog(null, "Email não foi preenchido ", "Erro ao cadastrar Usuário", 0);
		}
		else if(senha.length() == 0){
                    JOptionPane.showMessageDialog(null, "Senha não foi preenchido ", "Erro ao cadastrar Usuário", 0);
		}
		else if(user.length() == 0){
                    JOptionPane.showMessageDialog(null, "Username não foi preenchido ", "Erro ao cadastrar Usuário", 0);
		}
		else if(idade == 0){
                    JOptionPane.showMessageDialog(null, "Idade não foi preenchido ", "Erro ao cadastrar Usuário", 0);
		}

	}
}

