package piattaforma;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Classe che rappresenta il primo pannello nell'ambiente dedicato alla struttura. 
 * Il sistema ritorna all'utente i risultati della ricerca della prenotazione. Estende la classe PannelloGenerale per 
 * usufruire anche di quelle attività come la pressione dei bottoni superiori
 * @author Torros
 *
 */

public class Pannello_U_2 extends PannelloGenerale{
	String sport;
	Struttura struttura;
	LocalDateTime orario;
	boolean spogliatoio;
	
	/*
	 * il costruttore deve creare un pannello sulla base dei possibili risultati della ricerca
	 * - CASO 1: richiesta di solo campo prenotabile all'orario stabilito per quella struttura
	 * 	Display della prenotazione con bottone da premere
	 * - CASO 2: richiesta di solo campo NON prenotabile all'orario stabilito per quella struttura
	 * 	Display messaggio di errore, con proposte di altri orari o date per cui quella struttura è disponibile
	 * - CASO 3: richiesta di campo e spogliatoio prenotabile all'orario stabilito per quella struttura
	 * 	situazione uguale a CASO1
	 * - CASO 4: richiesta di campo e spogliatoio, ma con spogliatio NON prenotabile all'orario stabilito per quella struttura
	 * 	Display di una richiesta per prenotare comunque il campo senza lo spogliatoio
	 * - CASO 5: richiesta di campo e spogliatoio, ma con campo NON prenotabile all'orario stabilito per quella struttura
	 * 	Abbiamo deciso per fare un display di un messaggio di errore perchè non avrebbe senso prenotare solo lo spogliatoio senza campo
	 * - CASO 6: richiesta di campo e spogliatoio, ma con campo e spogliatoio NON prenotabile all'orario stabilito per quella struttura
	 * 	situazione uguale a CASO2?
	 */
	public Pannello_U_2(String sport, String strut, LocalDateTime orario, boolean spogliatoio) {
		super(); //si richiama super per dare al pannello le caratteristiche di JPanel e i settaggi generali
		
		//settiamo il Layout che utilizzeremo per questo pannello
		this.setLayout(null);
					
		
		/*
		 * Da questo punto inzia la customizzazione vera e propria del pannello
		 */	
		this.sport=sport;
		for(Struttura s: RegistroStrutture.getInstance().getListaStrutture()) {
			if(s.getNome().compareTo(strut) == 0) {
				this.struttura=s;
				break;
			}
		}
		this.orario=orario;
		this.spogliatoio=spogliatoio;
		
		JLabel titolo = new JLabel();;
		
		if(!spogliatoio) {
			try {
				//CASO1
				Campo c=RegistroStrutture.getInstance().controlloDisponibilitaCampo(sport, orario, struttura);
				
				titolo.setText("Risultati ricerca");
				titolo.setForeground(new Color(0xE98074));
				titolo.setHorizontalTextPosition(JLabel.RIGHT);
				titolo.setFont(new Font("Baskerville", Font.PLAIN, 35));
				titolo.setBounds(50,80,800,50);
				
			} catch (Exception e) {
				// TODO: handle exception
				//CASO2
				JOptionPane.showMessageDialog(null, "Campo non disponibile nell'orario richiesto", "Errore Ricerca", JOptionPane.ERROR_MESSAGE);
				}
		}
		else {
			//if(ricercacampoOK && ricercaspogliatoiOK) --CASO3
			//if(ricercacampoOK && ricercaspogliatoiNOTOK) --CASO4
			//if(ricercacampoNOTOK && ricercaspogliatoiOK) --CASO5 
			//if(ricercacampoNOTOK && ricercaspogliatoiNOTOK) --CASO6
		}
		
		
		/*
		int estrazione = (int) (Math.random() * 60); 
		System.out.println(estrazione);
		
		
		//--CASO1
		if(estrazione >= 0 && estrazione < 10) {
			JLabel titolo1 = new JLabel();
			titolo1.setText("La tua ricerca ha avuto esito POSITIVO");
			titolo1.setForeground(new Color(0x8E8D8A));
			titolo1.setHorizontalTextPosition(JLabel.RIGHT);
			titolo1.setFont(new Font("Baskerville", Font.PLAIN, 20));
			titolo1.setBounds(50,130,800,25);
			
			this.add(titolo1);
		}
		//--CASO1
		else if(estrazione >= 10 && estrazione < 20) {
			JLabel titolo1 = new JLabel();
			titolo1.setText("La tua ricerca ha avuto esito POSITIVO");
			titolo1.setForeground(new Color(0x8E8D8A));
			titolo1.setHorizontalTextPosition(JLabel.RIGHT);
			titolo1.setFont(new Font("Baskerville", Font.PLAIN, 20));
			titolo1.setBounds(50,130,800,25);
			
			this.add(titolo1);
		}
		//--CASO2
		else if(estrazione >= 20 && estrazione < 30) {
			JLabel titolo1 = new JLabel();
			titolo1.setText("La tua ricerca ha avuto esito POSITIVO");
			titolo1.setForeground(new Color(0x8E8D8A));
			titolo1.setHorizontalTextPosition(JLabel.RIGHT);
			titolo1.setFont(new Font("Baskerville", Font.PLAIN, 20));
			titolo1.setBounds(50,130,800,25);
			
			this.add(titolo1);
		}
		//--CASO3
		else if(estrazione >= 30 && estrazione < 40) {
			JLabel titolo1 = new JLabel();
			titolo1.setText("La tua ricerca ha avuto esito POSITIVO");
			titolo1.setForeground(new Color(0x8E8D8A));
			titolo1.setHorizontalTextPosition(JLabel.RIGHT);
			titolo1.setFont(new Font("Baskerville", Font.PLAIN, 20));
			titolo1.setBounds(50,130,800,25);
			
			this.add(titolo1);
		}
		//--CASO4
		else if(estrazione >= 40 && estrazione < 50) {
			JLabel titolo1 = new JLabel();
			titolo1.setText("La tua ricerca ha avuto esito POSITIVO");
			titolo1.setForeground(new Color(0x8E8D8A));
			titolo1.setHorizontalTextPosition(JLabel.RIGHT);
			titolo1.setFont(new Font("Baskerville", Font.PLAIN, 20));
			titolo1.setBounds(50,130,800,25);
			
			this.add(titolo1);
		}
		//--CASO5
		else if(estrazione >= 40 && estrazione < 59) {
			JLabel titolo1 = new JLabel();
			titolo1.setText("La tua ricerca ha avuto esito POSITIVO");
			titolo1.setForeground(new Color(0x8E8D8A));
			titolo1.setHorizontalTextPosition(JLabel.RIGHT);
			titolo1.setFont(new Font("Baskerville", Font.PLAIN, 20));
			titolo1.setBounds(50,130,800,25);
			
			this.add(titolo1);
		}
		//--CASO6
		else {
			JLabel titolo1 = new JLabel();
			titolo1.setText("La tua ricerca ha avuto esito POSITIVO");
			titolo1.setForeground(new Color(0x8E8D8A));
			titolo1.setHorizontalTextPosition(JLabel.RIGHT);
			titolo1.setFont(new Font("Baskerville", Font.PLAIN, 20));
			titolo1.setBounds(50,130,800,25);
			
			this.add(titolo1);
		}
		*/
		
		this.add(titolo);
	}
}
