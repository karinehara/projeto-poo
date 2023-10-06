//Karine Marques Hara - RA:2144484
import java.util.ArrayList;
import java.util.List;

public class gerPlaylist {
    private Playlist pl;
    private List<Playlist> bdPL = new ArrayList<Playlist>();

    public List<Playlist> getPlaylist(){
        return bdPL;
    }
        
    public Playlist cadastrarPl(Playlist pl){
	if(consPl(pl)== null){
            bdPL.add(pl);
            return pl;
	}
	else{
            return null;
	}
    }
    
     public Playlist addMusicaPl(Playlist pl){
	if(consPl(pl)!= null){
            bdPL.add(pl);
            return pl;
	}
	else{
            return null;
	}
    }
        
    public Playlist consPl(Playlist pl){
	for(int i = 0; i < bdPL.size(); i++){
            if(pl.getNomePlaylist().equals(bdPL.get(i).getNomePlaylist())){
		return bdPL.get(i);
            }
	}
	return null;
    }

    public Playlist removePl(Playlist pl){
        pl = consPl(pl);
        if(pl != null){
            bdPL.remove(pl);
            return pl;
        }
        else{    
            return null;
        }
    }

    public Playlist attPl(Playlist pl){
	for(int i = 0; i < bdPL.size(); i++){
            if(pl.getNomePlaylist().equals(bdPL.get(i).getNomePlaylist())){
                bdPL.set(i, pl);
                return pl;
            }
        }
        return null;
    }        
}
