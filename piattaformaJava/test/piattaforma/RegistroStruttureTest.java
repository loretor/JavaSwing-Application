package piattaforma;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegistroStruttureTest {

	RegistroStrutture r = new RegistroStrutture();

	@Test
	public void testGetListaStrutture() {
		fail("Not yet implemented");
		
	}

	@Test
	public void testLinkListaStrutture() {
		RegistroStrutture r1 = r;
		Struttura s = new Struttura();
		r.linkListaStrutture(s);
		r1.getListaStrutture().add(s);
		
	}

	@Test
	public void testUnlinkListaStrutture() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheck() {
		fail("Not yet implemented");
	}

}
