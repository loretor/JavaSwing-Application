package piattaforma;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


public class RegistroStruttureTest {

	//RegistroStrutture r = RegistroStrutture.getInstance();
	//Struttura s =new Struttura("CSS","via Asiago","Stezzano");
	//Struttura s2 =new Struttura("CSS2","via Asiago","Stezzano");

	
	@Test
	public void testGetInstance() {
		assertEquals(RegistroStrutture.getInstance(), RegistroStrutture.registro);
	}

	@Test
	public void testGetListaStrutture() {
		RegistroStrutture r = RegistroStrutture.getInstance();
		Struttura s =new Struttura("CSS","via Asiago","Stezzano");
		
		Set<Struttura> lista= new HashSet<>();
		lista.add(s);
		
		r.getListaStrutture().add(s);
		assertEquals(r.getListaStrutture(), lista);
		
	}

	@Test
	public void testLinkListaStrutture() {
		RegistroStrutture r = RegistroStrutture.getInstance();
		Struttura s =new Struttura("CSS","via Asiago","Stezzano");
		
		r.linkListaStrutture(s);
		
		Set<Struttura> lista= new HashSet<>();
		lista.add(s);
				
		assertEquals(r.getListaStrutture(), lista);
	}

	@Test
	public void testUnlinkListaStrutture() {
		RegistroStrutture r = RegistroStrutture.getInstance();
		Struttura s =new Struttura("CSS","via Asiago","Stezzano");
		Struttura s2 =new Struttura("CSS2","via Asiago","Stezzano");
		
		Set<Struttura> lista= new HashSet<>();
		lista.add(s);
		
		r.linkListaStrutture(s);
		r.linkListaStrutture(s2);
		r.unlinkListaStrutture(s2);
		assertEquals(r.getListaStrutture(), lista);
	}

	@Test
	public void testCheck() {
		//RegistroStrutture r = RegistroStrutture.getInstance();
		Struttura s =new Struttura("CSS","via Asiago","Stezzano");
		
		//r.getListaStrutture().add(s);
		assertEquals(s.getIDstruttura(), "Struttura_2");
		//assertEquals(r.check("Struttura_2"), s);
	}

	@Test
	public void testControlloDisponibilitaCampo() {
		fail("Not yet implemented");
	}

	@Test
	public void testControlloDisponibilitaSpogliatoio() {
		fail("Not yet implemented");
	}

	@Test
	public void testConfermaPrenotazioneNOSpogliatoio() {
		fail("Not yet implemented");
	}

	@Test
	public void testConfermaPrenotazioneCONSpogliatoio() {
		fail("Not yet implemented");
	}

}
