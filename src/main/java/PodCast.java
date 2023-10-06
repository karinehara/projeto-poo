//Karine Marques Hara - RA:2144484

public class PodCast extends Audio {
    private String nomeParticipantes;
    private int numEp;
    private int qntdEps;
    private String descricao;

    public PodCast() {
        nomeParticipantes = "";
	numEp=0;
	qntdEps=0;
	descricao="";
        
    }

    public String getNomeParticipantes() {
        return nomeParticipantes;
    }

    public void setNomeParticipantes(String nomeParticipantes) {
        this.nomeParticipantes = nomeParticipantes;
    }

    public int getNumEp() {
        return numEp;
    }

    public void setNumEp(int numEp) {
        this.numEp = numEp;
    }

    public int getQntdEps() {
        return qntdEps;
    }

    public void setQntdEps(int qntdEps) {
        this.qntdEps = qntdEps;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    

}
