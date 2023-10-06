//Karine Marques Hara - RA:2144484
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class gerMusica {
    private Musica music;
    private List<Musica> bdMusica = new ArrayList<Musica>();

    public List<Musica> getBdMusica(){
        return bdMusica;
    }
        
    public Musica cadastrarMusica(Musica music){
	if(consMusica(music)== null){
            bdMusica.add(music);
            return music;
	}
	else{
            return null;
	}
    }
        
    public Musica consMusica(Musica music){
	for(int i = 0; i < bdMusica.size(); i++){
            if(music.getNome().equals(bdMusica.get(i).getNome())){
		return bdMusica.get(i);
            }
	}
	return null;
    }

    public Musica removeMusica(Musica music){
        music = consMusica(music);
        if(music != null){
            bdMusica.remove(music);
            return music;
        }
        else{    
            return null;
        }
    }

    public Musica attMusica(Musica music){
	for(int i = 0; i < bdMusica.size(); i++){
            if(music.getNome().equals(bdMusica.get(i).getNome())){
                bdMusica.set(i, music);
                return music;
            }
        }
        return null;
    }     
}
