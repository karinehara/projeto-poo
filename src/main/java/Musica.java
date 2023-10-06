//Karine Marques Hara - RA:2144484

public class Musica extends Audio{
    
    private String nomeArtista;
    private String nomeAlbum;
    private String genero;

    public Musica() {
        nomeArtista = "";
	nomeAlbum = "";
	genero = "";
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
