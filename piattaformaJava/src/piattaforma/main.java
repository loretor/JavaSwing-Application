package piattaforma;

public class main {

	public static void main(String[] args) {
		
		RegistroStrutture r = RegistroStrutture.getInstance();
		Struttura s =new Struttura("CSS","via Asiago","Stezzano");
		Struttura s2 =new Struttura("CSS2","via Asiago","Stezzano");
		
		r.linkListaStrutture(s);
		r.linkListaStrutture(s2);
		
		for(Struttura st: r.getListaStrutture()) {
			System.out.println(st.getIDstruttura());
		}
		
		System.out.println(r.check("Struttura_1").getNome());

	}

}
