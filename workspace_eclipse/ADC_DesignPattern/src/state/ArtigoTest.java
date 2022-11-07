package state;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArtigoTest {

	@Test
	public void deveArtigoTransitarDeRascunhoAteAprovado() {
		GerenteSeguranca gerenteDeSeguranca = GerenteSeguranca.getInstance();

		Artigo artigo = new Artigo();
		
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
		
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.publicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoAprovado);
		
	}

}
