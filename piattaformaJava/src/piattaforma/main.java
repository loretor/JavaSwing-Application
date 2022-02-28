package piattaforma;

import static org.junit.Assert.assertFalse;

import java.time.LocalDateTime;

public class main {

	public static void main(String[] args) {
		
		RegistroStrutture r = RegistroStrutture.getInstance();
		Struttura s =new Struttura("CSS","via Asiago","Stezzano");
		
		LocalDateTime d = LocalDateTime.of(2022,12,10, 11, 36);
		CampoBasket campo = new CampoBasket((float)100,s);
		Spogliatoio sp = new Spogliatoio((float)100,s);
		
		
		Prenotazione p21 =new Prenotazione(d,"Basket","TSRALS04S16A997",s,campo,sp);
		r.confermaPrenotazioneCONSpogliatoio(d,"Basket","TSRALS04S16A997",s,campo,sp);
		Prenotazione p22 =new Prenotazione(d,"Basket","TSRALS04S16A997",s,campo,sp);
		r.confermaPrenotazioneCONSpogliatoio(d,"Basket","TSRALS04S16A997",s,campo,sp);
		Prenotazione p23 =new Prenotazione(d,"Basket","TSRALS04S16A997",s,campo,sp);
		r.confermaPrenotazioneCONSpogliatoio(d,"Basket","TSRALS04S16A997",s,campo,sp);
		Prenotazione p24 =new Prenotazione(d,"Basket","TSRALS04S16A997",s,campo,sp);
		r.confermaPrenotazioneCONSpogliatoio(d,"Basket","TSRALS04S16A997",s,campo,sp);
		Prenotazione p25 =new Prenotazione(d,"Basket","TSRALS04S16A997",s,campo,sp);
		r.confermaPrenotazioneCONSpogliatoio(d,"Basket","TSRALS04S16A997",s,campo,sp);
		Prenotazione p26 =new Prenotazione(d,"Basket","TSRALS04S16A997",s,campo,sp);
		r.confermaPrenotazioneCONSpogliatoio(d,"Basket","TSRALS04S16A997",s,campo,sp);
		
		System.out.println(p26.getPrezzo());
	}

}
