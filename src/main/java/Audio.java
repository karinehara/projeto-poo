//Karine Marques Hara - RA:2144484
public abstract class Audio{
    
        private double duration;
	private String nome;
	private String dataLancamento;

	public Audio(){
		duration = 0;
		nome = "";
		dataLancamento = "";
	}
	
	public double getDuration(){
		return duration;
	}

	public String getNome(){
		return nome;
	}
	
	public String getDataLancamento(){
		return dataLancamento;
	}

	public void setDuration(double duration){
		this.duration = duration;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setDataLancamento(String dataLancamento){
		this.dataLancamento = dataLancamento;
	}
}
