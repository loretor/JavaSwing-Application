package piattaforma;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * Questo è un pannello che si ottiene dall'attività di controllo delle prenotazioni per poter visualizzare tutte le prenotazioni
 * associate al campo selezionato della struttura e inoltre può fare tutte le azioni implementate da PannelloGeneraleStruttura
 * E' un pannello speciale come S_2 in quanto essendo dinamico necessita di dover essere sempre istanziato nuovamente per 
 * poterlo tenere aggiornato
 * @author Torros
 *
 */
public class Pannello_S_6 extends PannelloGeneraleStruttura{
	
	/*
	 * questa variabile viene istanziata nel costruttore e assume il valore del campo o spogliatoio di cui bisogna andare a
	 * stampare le prenotazioni. Il suo valore verrà quindi fornito dal pannello che andrà a istanziare questo pannello stesso
	 * L'altra variabile è la struttura di cui si vogliono visualizzare le prenotazioni e verrà anche questa ottenuta dal pannello
	 * che istanzia questo
	 */
	String nomericerca;
	String nomestruttura;
	
	public Pannello_S_6(String struttura, String nomecampo) {
		super();
		
		this.setLayout(null);
		
		/*
		 * Da questo punto inzia la customizzazione vera e propria del pannello
		 */
		nomericerca = nomecampo;
		nomestruttura = struttura;
		
		JLabel titolo = new JLabel();
		titolo.setText("Prenotazioni "+nomericerca);
		titolo.setForeground(new Color(0xE98074));
		titolo.setHorizontalTextPosition(JLabel.RIGHT);
		titolo.setFont(new Font("Baskerville", Font.PLAIN, 35));
		titolo.setBounds(240,90,800,50);
		
		//bisogna avere il metodo che restituisce la lista di prenotazioni associate a quel campo di quella struttura
		//per ora metto solo una lista a caso
		//bisognerà andare quindi a creare anche dei pannelli che contengano le informazioni per ogni prenotazione
		String [] listaprenota = {"TRRLNZ00S16A794D", "CRDNDR03G12A765E","GDRPLO01D25F654E","CRDNDR03G12A765E"};
		String [] listaorario = {"09:00","20:00","21:00","17:00"};
		String [] listagiorni = {"14/02/2022", "15/02/2022","18/02/2022","20/02/2022"};
		
		//questo elemento serve come contenitore per tutte le prenotazioni associate a quel campo o spogliatoio
		JPanel contenitoreprenotazioni = new JPanel();
		contenitoreprenotazioni.setBounds(240,200,765,450);
		contenitoreprenotazioni.setLayout(new GridLayout(-1,1,10,10));
		contenitoreprenotazioni.setBackground(new Color(0xE98074));
		contenitoreprenotazioni.setAutoscrolls(true);
		
		//questo elemento aggiunge la possibilità di scrollare il contenitore
		JScrollPane scrollable = new JScrollPane(contenitoreprenotazioni, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollable.setBounds(240,200,765,450);
		
		//ciclo che va a creare tutte le prenotazioni trovate con la lista
		for(int i = 0; i < listaprenota.length; i++) {
			//pannello è un contenitore che rappresenta una prenotazione, è lui che viene aggiunto al contenitore.
			//tutte le caratteristiche della prenotazione vengono invece aggiunte al pannello stesso
			JPanel pannello = new JPanel();
			pannello.setLayout(null);
			pannello.setPreferredSize(new Dimension(765, 130));
			pannello.setBackground(new Color(0xD8C3A5));
			
			JLabel cf = new JLabel();
			cf.setText("Codice Fiscale prenotante: "+listaprenota[i]);
			cf.setForeground(new Color(0x8E8D8A));
			cf.setHorizontalTextPosition(JLabel.RIGHT);
			cf.setFont(new Font("Baskerville", Font.PLAIN, 25));
			cf.setBounds(20,20,800,25);
			
			JLabel data = new JLabel();
			data.setText("Data: "+listagiorni[i]);
			data.setForeground(new Color(0x8E8D8A));
			data.setHorizontalTextPosition(JLabel.RIGHT);
			data.setFont(new Font("Baskerville", Font.PLAIN, 17));
			data.setBounds(20,50,800,25);
			
			JLabel orario = new JLabel();
			orario.setText("Orario: "+listaorario[i]);
			orario.setForeground(new Color(0x8E8D8A));
			orario.setHorizontalTextPosition(JLabel.RIGHT);
			orario.setFont(new Font("Baskerville", Font.PLAIN, 17));
			orario.setBounds(20,70,800,25);
			
			pannello.add(cf);
			pannello.add(data);
			pannello.add(orario);
			
			contenitoreprenotazioni.add(pannello);
		}
		
		this.add(titolo);
		this.add(scrollable);
	}
}
