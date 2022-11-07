package state;

public class EstadoRascunho implements Estado {
	private Artigo artigo;

	public EstadoRascunho(Artigo artigo) {
		this.artigo = artigo;
	}
	
	@Override
	public void publicar() {
		GerenteSeguranca gerenteDeSeguranca = GerenteSeguranca.getInstance();
		if(gerenteDeSeguranca.ehUsuarioAutor()){
			this.artigo.transitarEstadoPara(new EstadoRevisando(artigo));
			this.artigo.getLogHistorico().add("Transitando para REVISANDO");
			return; 
		}
		throw new RuntimeException("Usuario não tem permissão para publicar");
		
	}

	@Override
	public void reprovar() {
		// TODO Auto-generated method stub
		
	}
}
