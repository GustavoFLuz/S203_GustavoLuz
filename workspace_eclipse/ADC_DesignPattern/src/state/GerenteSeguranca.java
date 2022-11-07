package state;

public class GerenteSeguranca {
	private static GerenteSeguranca instance;
	private String usuarioCorrente;
	
	private GerenteSeguranca() {
		
	}
	
	public static GerenteSeguranca getInstance() {
		if(instance==null) {
			instance = new GerenteSeguranca();
		}
		
		return instance;
	}
	
	public String getUsuarioCorrente() {
		return usuarioCorrente;
	}
	public void setUsuarioCorrente(String usuarioCorrente) {
		this.usuarioCorrente = usuarioCorrente;
	}
	
	public boolean ehUsuarioModerador() {
		return "MODERADOR".equals(usuarioCorrente);
	}
	public boolean ehUsuarioAutor() {
		return "AUTOR".equals(usuarioCorrente);
	}
}
