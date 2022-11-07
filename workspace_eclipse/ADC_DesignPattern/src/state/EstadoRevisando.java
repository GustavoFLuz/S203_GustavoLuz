package state;

public class EstadoRevisando implements Estado {
	private Artigo artigo;

	public EstadoRevisando(Artigo artigo) {
		this.artigo = artigo;
	}
	@Override
	public void publicar() {
		GerenteSeguranca gerenteDeSeguranca = GerenteSeguranca.getInstance();
		if(gerenteDeSeguranca.ehUsuarioModerador()){
			this.artigo.transitarEstadoPara(new EstadoAprovado(artigo));
			this.artigo.getLogHistorico().add("Transitando para APROVADO");
			return; 
		}
		throw new RuntimeException("Usuario não tem permissão para aprovar");
		
	}

	@Override
	public void reprovar() {
		GerenteSeguranca gerenteDeSeguranca = GerenteSeguranca.getInstance();
		if(gerenteDeSeguranca.ehUsuarioModerador()){
			this.artigo.transitarEstadoPara(new EstadoRascunho(artigo));
			this.artigo.getLogHistorico().add("Transitando para RASCUNHO");
			return; 
		}
		throw new RuntimeException("Usuario não tem permissão para reprovar");
	}
}
