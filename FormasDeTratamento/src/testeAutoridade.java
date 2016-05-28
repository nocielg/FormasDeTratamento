import static org.junit.Assert.*;

import org.junit.Test;


public class testeAutoridade {

	@Test
	public void testeRespeitoso() {
		Autoridade autoridade = new Autoridade("respeitoso", "mestre", "masculino", "Anderson", "Silva");
		assertEquals("Sr.AndersonSilva", autoridade.getTratamento());
	}
	
	@Test
	public void testeInformal() {
		Autoridade autoridade = new Autoridade("informal", "mestre", "masculino", "Anderson", "Silva");
		assertEquals("Anderson", autoridade.getTratamento());
	}
	
	@Test
	public void testeTitulacao() {
		Autoridade autoridade = new Autoridade("titulacao", "mestre", "masculino", "Anderson", "Silva");
		assertEquals("mestreAndersonSilva", autoridade.getTratamento());
	}
}
