package piattaforma;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.*;

/**
 * Questo è uno dei pannelli delle attività fruibili nella area privata della struttura. Da qui l'utente può scegliere
 * se bannare un utente andando a specificare il suo codice fiscale nell'apposito TextField e inoltre può fare tutte 
 * le azioni implementate da PannelloGeneraleStruttura
 * @author Torros
 *
 */
public class Pannello_S_4 extends PannelloGeneraleStruttura{

	JTextField field;
	JButton submit;
	
	
	public Pannello_S_4() {
		super();
		
		this.setLayout(null);
		
		/*
		 * Da questo punto inzia la customizzazione vera e propria del pannello
		 */
		JLabel titolo = new JLabel();
		titolo.setText("Ban per un utente");
		titolo.setForeground(new Color(0xE98074));
		titolo.setHorizontalTextPosition(JLabel.RIGHT);
		titolo.setFont(new Font("Baskerville", Font.PLAIN, 35));
		titolo.setBounds(240,90,700,50);
		
		JLabel titolo1 = new JLabel();
		titolo1.setText("In questa area puoi mettere un ban a un specifico utente per impedigli di poter prenotare");
		titolo1.setForeground(new Color(0x8E8D8A));
		titolo1.setHorizontalTextPosition(JLabel.RIGHT);
		titolo1.setFont(new Font("Baskerville", Font.PLAIN, 20));
		titolo1.setBounds(240,150,800,25);
		
		JLabel titolo2 = new JLabel();
		titolo2.setText("presso la tua struttura");
		titolo2.setForeground(new Color(0x8E8D8A));
		titolo2.setHorizontalTextPosition(JLabel.RIGHT);
		titolo2.setFont(new Font("Baskerville", Font.PLAIN, 20));
		titolo2.setBounds(240,180,800,25);
		
		JLabel descrizione1 = new JLabel();
		descrizione1.setText("Il Ban è un'azione forte, si prega quindi di usarlo con cautela e solo in situazioni giustificate");
		descrizione1.setForeground(new Color(0x8E8D8A));
		descrizione1.setHorizontalTextPosition(JLabel.RIGHT);
		descrizione1.setFont(new Font("Baskerville", Font.PLAIN, 17));
		descrizione1.setBounds(240,210,900,25);
		
		JLabel titolo3 = new JLabel();
		titolo3.setText("Inserire il codice fiscale della persona da bannare");
		titolo3.setForeground(new Color(0x8E8D8A));
		titolo3.setHorizontalTextPosition(JLabel.RIGHT);
		titolo3.setFont(new Font("Baskerville", Font.PLAIN, 20));
		titolo3.setBounds(240,300,800,25);
		
		JLabel descrizione2 = new JLabel();
		descrizione2.setText("Codice Fiscale:");
		descrizione2.setForeground(new Color(0x8E8D8A));
		descrizione2.setHorizontalTextPosition(JLabel.RIGHT);
		descrizione2.setFont(new Font("Baskerville", Font.PLAIN, 17));
		descrizione2.setBounds(240,350,200,25);
		
		field = new JTextField("");
		field.setFont(new Font("Baskerville", Font.PLAIN, 17));
		field.setBounds(390,350,300,30);
		
		submit = new JButton("Submit");
		submit.setFont(new Font("Baskerville", Font.BOLD, 10));
		submit.setBounds(490,500,100,30);
		submit.setBackground(new Color(0xD8C3A5));
		submit.setBorder(BorderFactory.createLineBorder(new Color(0xE98074),1));
		submit.addActionListener(this);
		
		this.add(titolo);
		this.add(titolo1);
		this.add(titolo2);
		this.add(titolo3);
		this.add(descrizione1);
		this.add(descrizione2);
		this.add(field);
		this.add(submit);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		
		
		if(e.getSource() == submit) {
			String cf = field.getText();
			
			//caso in cui l'utente non abbia scritto un codice
			if(cf.length() == 0) {
				JOptionPane.showMessageDialog(null, "Devi inserire un Codice Fiscale prima di premere submit", "Errore Creazione Ban", JOptionPane.ERROR_MESSAGE);
			}
			//else if (cf non è corretto come codice fiscale) non so se implementeremo questo controllo
			//in questo caso faremmo un display di un messaggio di errore
			else {
				int ans = JOptionPane.showConfirmDialog(null, "Confermi il ban? Una volta aggiunto non sarà più possibile eliminarlo", "Conferma Creazione Ban", JOptionPane.WARNING_MESSAGE);
				
				if(ans == 0) {
					//implementare il metodo per aggiungere il cf alla lista dei ban di questa struttura
					field.setText("");
					//ricreiamo il pannello del menu con i campi aggionati, da fare in futuro
					cl.show(container, "S_2");
				}
			}
		}
	}
}
