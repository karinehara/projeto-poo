//Karine Marques Hara - RA:2144484
import javax.swing.JOptionPane;

public class Usuario {
    private String nome;
    private String username;
    private String email;
    private String senha;
    private int idade;

    public Usuario() {
        
        nome = "";
	username = "";
	email = "";
	senha = "";
	idade = 0;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
   
    

    public void cadastrarUsuario(String nome, String email, String senha, String user, int idade) throws VazioException, IdadeException{
        
	if(nome.equals("") || email.equals("") || senha.equals("") ||user.equals("") ||idade == 0){	
            System.out.println("Falha no cadastro\n");
            throw new VazioException();		
	}
	else if(idade<12){
		throw new IdadeException();		
	}

	else{
            this.nome = nome;
            this.email = email;
            this.senha = senha;
            this.username = user;
            this.idade = idade;	
	}	
    }
    
    
}
