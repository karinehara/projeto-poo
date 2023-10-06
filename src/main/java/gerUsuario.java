//Karine Marques Hara - RA:2144484
import java.util.ArrayList;
import java.util.List;

public class gerUsuario {
    private Usuario user;
    private List<Usuario> bdUsuario = new ArrayList<Usuario>();

    public List<Usuario> getBdUsuario(){
        return bdUsuario;
    }
        
    public Usuario cadastroUsuario(Usuario user){
	if(consultarUsuario(user)== null){
            bdUsuario.add(user);
            return user;
	}
	else{
            return null;
	}
    }

    public Usuario consUsuario(Usuario user){
	for(int i = 0; i < bdUsuario.size(); i++){
            if(user.getUsername().equals(bdUsuario.get(i).getUsername()) && user.getSenha().equals(bdUsuario.get(i).getSenha())){
		return bdUsuario.get(i);
            }
	}
	return null;
    }
        
    public Usuario consultarUsuario(Usuario user){
	for(int i = 0; i < bdUsuario.size(); i++){
            if(user.getUsername().equals(bdUsuario.get(i).getUsername())){
		return bdUsuario.get(i);
            }
	}
	return null;
    }

    public Usuario removeUsuario(Usuario user){
        user = consUsuario(user);
        if(user != null){
            bdUsuario.remove(user);
            return user;
        }
        else{    
            return null;
        }
    }

    public Usuario atualizaUsuario(Usuario user){
	for(int i = 0; i < bdUsuario.size(); i++){
            if(user.getUsername() == bdUsuario.get(i).getUsername()){
                //user.setNome(JOptionPane.showInputDialog(null,"informe o NOVO nome","Aualização de Pessoa", JOptionPane.INFORMATION_MESSAGE));
                bdUsuario.set(i, user);
                return user;
            }
        }
        return null;
    }
}
