//Karine Marques Hara - RA:2144484
import javax.swing.JOptionPane;

public class Playlist {
    
    private String nomePlaylist;
    private int qntdMusicas;
    private double duration;
    private String nomeUsuario;
    
    private gerMusica gerMusica;
    
    private Musica music;
    private Usuario user;

   
    public Playlist() {
        nomePlaylist = "";
	qntdMusicas=0;
	duration = 0;
	music = new Musica();
        user = new Usuario();
        
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }

    public int getQntdMusicas() {
        return qntdMusicas;
    }

    public void setQntdMusicas(int qntdMusicas) {
        this.qntdMusicas = qntdMusicas;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Musica getMusic() {
        return music;
    }

    public void setMusic(Musica music) {
        this.music = music;
    }
    
    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void addMusica(String nomeMusica, gerMusica gerMusica){
        music = new Musica();
        
        this.gerMusica = gerMusica;
        
        music.setNome(nomeMusica);
        
        if(gerMusica == null){
            JOptionPane.showMessageDialog(null, "Não existe uma música com esse nome: ", "Erro de Adicionar Música", 0);
        }
        
        music = this.gerMusica.consMusica(music);
        
        if(music != null){
            //music.setNome(nomeMusica);
            setMusic(music);
        }
        else{
            JOptionPane.showMessageDialog(null, "Não existe uma música com esse nome: ", "Erro de Adicionar Música", 0);
        }
    }
}
