package piattaforma;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
	
	
	JButton submit;
	
	/*
	 * il costruttore deve creare un pannello sulla base dei possibili risultati della ricerca
	 * - CASO 1: richiesta di solo campo prenotabile all'orario stabilito per quella struttura
	 * 	Display della prenotazione con bottone da premere
	 * - CASO 2: richiesta di campo e spogliatoio prenotabile all'orario stabilito per quella struttura
	 * 	situazione uguale a CASO1
	 * - CASO 3: richiesta di campo e spogliatoio, ma con spogliatio NON prenotabile all'orario stabilito per quella struttura
	 * 	Display di una richiesta per prenotare comunque il campo senza lo spogliatoio
	 */
	public Pannello_U_2(String sport, Struttura strut, LocalDateTime orario, boolean spogliatoio) {
		super(); //si richiama super per dare al pannello le caratteristiche di JPanel e i settaggi generali
		
		//settiamo il Layout che utilizzeremo per questo pannello
		this.setLayout(null);
					
		
		/*
		 * Da questo punto inzia la customizzazione vera e propria del pannello
		 */	
		this.sport=sport;
		this.struttura = strut;
		this.orario=orario;
		this.spogliatoio=spogliatoio;
		
		
		if(!spogliatoio) {
			//CASO 1
			
			JLabel titolo1 = new JLabel();
			titolo1.setText("La tua ricerca ha avuto esito POSITIVO");
			titolo1.setForeground(new Color(0x8E8D8A));
			titolo1.setHorizontalTextPosition(JLabel.RIGHT);
			titolo1.setFont(new Font("Baskerville", Font.PLAIN, 20));
			titolo1.setBounds(50,130,800,25);
			
			
			
			
			submit = new JButton("Submit");
			submit.setFont(new Font("Baskerville", Font.BOLD, 10));
			submit.setBounds(490,550,100,30);
			submit.setBackground(new Color(0xD8C3A5));
			submit.setBorder(BorderFactory.createLineBorder(new Color(0xE98074),1));
			submit.addActionListener(this);
			
			this.add(titolo1);
			this.add(submit);
			
		}
		else {
			//CASO 2
			//CASO 3
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
		
		
	}
}
