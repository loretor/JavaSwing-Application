package piattaforma;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.*;

/**
 * Questo è uno dei pannelli delle attività fruibili nella area privata della struttura. Da qui l'utente può scegliere
 * cosa andare ad aggiungere alla propria struttura e inoltre può fare tutte le azioni implementate da PannelloGeneraleStruttura
 * @author Torros
 *
 */
public class Pannello_S_3 extends PannelloGeneraleStruttura{
	
	JRadioButton tennis;
	JRadioButton calcetto;
	JRadioButton basket;
	JRadioButton spogliatoio;
	JButton submit;
	
	/*
	 * questa variabile è un intero inizialmente settato a -1 che cambia valore in base a quale dei quattro pulsanti si va
	 * a premere per aggiungere un campo o spogliatoio. I valori sono i seguenti
	 * - -1 nessun aggiunta
	 * - 0 tennis
	 * - 1 calcetto
	 * - 2 basket
	 * - 3 spogliatoio
	 */
	int valorerisposta = -1;
	
	public Pannello_S_3() {
		super();
		
		this.setLayout(null);
		
		/*
		 * Da questo punto inzia la customizzazione vera e propria del pannello
		 */
		
		JLabel titolo = new JLabel();
		titolo.setText("Aggiungi Campi o Spogliatoi");
		titolo.setForeground(new Color(0xE98074));
		titolo.setHorizontalTextPosition(JLabel.RIGHT);
		titolo.setFont(new Font("Baskerville", Font.PLAIN, 35));
		titolo.setBounds(240,90,700,50);
		
		JLabel titolo1 = new JLabel();
		titolo1.setText("In questa area puoi aggiungere nuovi campi o spogliatoi per la tua struttura");
		titolo1.setForeground(new Color(0x8E8D8A));
		titolo1.setHorizontalTextPosition(JLabel.RIGHT);
		titolo1.setFont(new Font("Baskerville", Font.PLAIN, 20));
		titolo1.setBounds(240,150,800,25);
		
		JLabel descrizione1 = new JLabel();
		descrizione1.setText("Attenzione, eventuali aggiunte non potranno essere poi eliminate dal database");
		descrizione1.setForeground(new Color(0x8E8D8A));
		descrizione1.setHorizontalTextPosition(JLabel.RIGHT);
		descrizione1.setFont(new Font("Baskerville", Font.PLAIN, 17));
		descrizione1.setBounds(240,180,900,25);
		
		JLabel descrizione2 = new JLabel();
		descrizione2.setText("Premuto il pulsante di submit verrà comunque richiesta una ulteriore conferma delle modifiche");
		descrizione2.setForeground(new Color(0x8E8D8A));
		descrizione2.setHorizontalTextPosition(JLabel.RIGHT);
		descrizione2.setFont(new Font("Baskerville", Font.PLAIN, 17));
		descrizione2.setBounds(240,200,900,25);
		
		JLabel titolo2 = new JLabel();
		titolo2.setText("Cosa si desidera aggiungere?");
		titolo2.setForeground(new Color(0x8E8D8A));
		titolo2.setHorizontalTextPosition(JLabel.RIGHT);
		titolo2.setFont(new Font("Baskerville", Font.PLAIN, 20));
		titolo2.setBounds(240,280,800,25);
		
		//variabile per raggruppare tennis basket e calcetto dato che vogliamo che solo uno di questi possa essere scelto
		ButtonGroup group = new ButtonGroup();
				
		tennis = new JRadioButton("Un campo da tennis");
		tennis.setBounds(260,320,300,25);
		tennis.setBackground(new Color(0xEAE7DC));
		tennis.setFont(new Font("Baskerville", Font.BOLD, 13));
		tennis.addActionListener(this);
		group.add(tennis);
				
		calcetto = new JRadioButton("Un campo da calcetto");
		calcetto.setBounds(260,350,300,25);
		calcetto.setBackground(new Color(0xEAE7DC));
		calcetto.setFont(new Font("Baskerville", Font.BOLD, 13));
		calcetto.addActionListener(this);
		group.add(calcetto);
				
		basket = new JRadioButton("Un campo da basket");
		basket.setBounds(260,380,300,25);
		basket.setBackground(new Color(0xEAE7DC));
		basket.setFont(new Font("Baskerville", Font.BOLD, 13));
		basket.addActionListener(this);
		group.add(basket);
		
		spogliatoio = new JRadioButton("Uno spogliatoio");
		spogliatoio.setBounds(260,410,300,25);
		spogliatoio.setBackground(new Color(0xEAE7DC));
		spogliatoio.setFont(new Font("Baskerville", Font.BOLD, 13));
		spogliatoio.addActionListener(this);
		group.add(spogliatoio);
		
		submit = new JButton("Submit");
		submit.setFont(new Font("Baskerville", Font.BOLD, 10));
		submit.setBounds(490,500,100,30);
		submit.setBackground(new Color(0xD8C3A5));
		submit.setBorder(BorderFactory.createLineBorder(new Color(0xE98074),1));
		submit.addActionListener(this);
		
		this.add(titolo);
		this.add(titolo1);
		this.add(descrizione1);
		this.add(descrizione2);
		this.add(titolo2);
		this.add(tennis);
		this.add(calcetto);
		this.add(basket);
		this.add(spogliatoio);
		this.add(submit);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		
		if(e.getSource() == tennis) {
			valorerisposta = 0;
		}
		else if(e.getSource() == calcetto) {
			valorerisposta = 1;
		}
		else if(e.getSource() == basket) {
			valorerisposta = 2;
		}
		else if(e.getSource() == spogliatoio) {
			valorerisposta = 3;
		}
		else if(e.getSource() == submit){
			//caso in cui non abbia selezionato nulla allora messaggio di errore
			if(valorerisposta == -1) {
				JOptionPane.showMessageDialog(null, "Devi scegliere cosa aggiungere prima di premere submit", "Errore Aggiunta", JOptionPane.ERROR_MESSAGE);
			}
			//caso invece in cui abbia selezionato o ci sia già qualcosa di selezionato
			else {
				int ans = JOptionPane.showConfirmDialog(null, "Confermi la tua aggiunta? Una volta confermata non potrai più eliminarla", "Conferma Aggiunta", JOptionPane.WARNING_MESSAGE);
				
				if(ans == 0) {
					//sarà da andare a modificare i campetti della struttura nel vero codice
					
					//ricreiamo il pannello del menu con i campi aggionati, da fare in futuro
					
					cl.show(container,"S_2");
				}
			}
		}
	}
}
