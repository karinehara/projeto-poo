//Karine Marques Hara - RA:2144484
import java.util.ArrayList;
import java.util.List;


public class gerPodCast {
    private PodCast pc;
    private List<PodCast> bdPC = new ArrayList<PodCast>();

    public List<PodCast> getBdPodCast(){
        return bdPC;
    }
        
    public PodCast cadastrarPC(PodCast pc){
	if(consPC(pc)== null){
            bdPC.add(pc);
            return pc;
	}
	else{
            return null;
	}
    }
        
    public PodCast consPC(PodCast pc){
	for(int i = 0; i < bdPC.size(); i++){
            if(pc.getNome().equals(bdPC.get(i).getNome())){
		return bdPC.get(i);
            }
	}
	return null;
    }

    public PodCast removePC(PodCast pc){
        pc = consPC(pc);
        if(pc != null){
            bdPC.remove(pc);
            return pc;
        }
        else{    
            return null;
        }
    }

    public PodCast attPC(PodCast pc){
	for(int i = 0; i < bdPC.size(); i++){
            if(pc.getNome().equals(bdPC.get(i).getNome())){
                bdPC.set(i, pc);
                return pc;
            }
        }
        return null;
    }    
}
