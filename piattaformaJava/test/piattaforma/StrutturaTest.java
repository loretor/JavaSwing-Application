package piattaforma;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class StrutturaTest {

	Struttura s =new Struttura("CSS","via Asiago","Stezzano");
	LocalDateTime d = LocalDateTime.of(2022,12,10, 11, 36);
	CampoBasket campo= new CampoBasket((float)100,s);
	Spogliatoio sp = new Spogliatoio((float)100,s);
	Prenotazione p =new Prenotazione(d,"Basket","TSRALS04S16A787",s,campo);
	Prenotazione p2 =new Prenotazione(d,"Basket","TSRALS04S16A787",s,campo,sp);
	Cliente c= new Cliente("Matteo","Carminati","CRMMTT80A12A794Q");
	Cliente c2= new Cliente("Mario","Caironi","CRMMTT80A12A754Q");
	
	@Test
	public void testGetNome() {
		assertEquals(s.getNome(),"CSS");
	}

	@Test
	public void testGetIndirizzo() {
		assertEquals(s.getIndirizzo(),"via Asiago");
	}

	@Test
	public void testGetCitta() {
		assertEquals(s.getCitta(),"Stezzano");
	}

	//sbagliato (come prenotazione)
	@Test
	public void testGetIDstruttura() {
		assertEquals(s.getIDstruttura(),"S_1");
	}

	@Test
	public void testGetConteggioPrenotazioni() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetListaClientiBan() {
		Set<Cliente> lista= new HashSet<>();
		lista.add(c);
		s.linkListaClientiBan(c);
		
		assertEquals(s.getListaClientiBan(), lista);
	}

	@Test
	public void testGetListaCampi() {
		Set<Campo> lista= new HashSet<>();
		lista.add(campo);
				
		assertEquals(s.getListaCampi(), lista);
	}

	@Test
	public void testGetListaSpogliatoi() {
		Set<Spogliatoio> lista= new HashSet<>();
		lista.add(sp);
			
		assertEquals(s.getListaSpogliatoi(), lista);
	}

	@Test
	public void testSetNome() {
		s.setNome("centro Sportivo");
		assertEquals(s.getNome(), "centro Sportivo");
	}

	@Test
	public void testSetIndirizzo() {
		s.setIndirizzo("via Puccini");
		assertEquals(s.getIndirizzo(), "via Puccini");
	}

	@Test
	public void testSetCitta() {
		s.setCitta("Azzano");
		assertEquals(s.getCitta(), "Azzano");
	}

	@Test
	public void testLinkListaClientiBan() {
		s.linkListaClientiBan(c);
		s.linkListaClientiBan(c2);

		Set<Cliente> lista= new HashSet<>();
		lista.add(c);	
		lista.add(c2);
		
		assertEquals(s.getListaClientiBan(), lista);
	}

	@Test
	public void testLinkListaCampi() {
		CampoBasket campo2= new CampoBasket((float)200,s);
		s.linkListaCampi(campo2);
		
		Set<CampoBasket> lista= new HashSet<>();
		lista.add(campo);	
		lista.add(campo2);
		
		assertEquals(s.getListaCampi(), lista);
	}

	@Test
	public void testLinkListaSpogliatoi() {
		Set<Spogliatoio> lista= new HashSet<>();
		lista.add(sp);	
		Spogliatoio sp2 = new Spogliatoio((float)60,s);
		lista.add(sp2);
		
		assertEquals(s.getListaSpogliatoi(), lista);
	}

	//sistemare (non funziona)
	@Test
	public void testUnlinkListaClientiBan() {
		Set<Cliente> lista= new HashSet<>();
		lista.add(c2);
		
		s.unlinkListaClientiBan(c);	
		
		assertEquals(s.getListaClientiBan(), null);
	}

	//sistemare (non funziona)
	@Test
	public void testUnlinkListaCampi() {
		s.unlinkListaCampi(campo);		
		assertEquals(s.getListaCampi(), null);
	}

	//sistemare (non funziona)
	@Test
	public void testUnlinkListaSpogliatoi() {
		s.unlinkListaSpogliatoi(sp);		
		assertEquals(s.getListaSpogliatoi(), null);
	}

	@Test
	public void testStampaPrenotazioniCampo() {		
		Set<Prenotazione> lista= new HashSet<>();
		lista.add(p);	
		lista.add(p2);
		
		assertEquals(s.stampaPrenotazioni(campo), lista);
	}

	@Test
	public void testStampaPrenotazioniSpogliatoio() {
		Set<Prenotazione> lista= new HashSet<>();
		lista.add(p2);
		
		assertEquals(s.stampaPrenotazioni(sp), lista);
	}

	@Test
	public void testControllaBan() {
		fail("Not yet implemented");
	}

	@Test
	public void testAggiornaConteggioPrenotazioni() {
		fail("Not yet implemented");
	}

}
