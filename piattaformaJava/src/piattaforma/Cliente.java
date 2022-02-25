/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package piattaforma;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF+h+SsyALA1XA= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF+h+SsyALA1XA= >>
// ----------- >>
public class Cliente {
    // ----------- << attribute.annotations@AAAAAAF+h+SsyALBPyI= >>
    // ----------- >>
    protected String Nome;

    // ----------- << attribute.annotations@AAAAAAF+h+SsyALCu5k= >>
    // ----------- >>
    protected String Cognome;

    // ----------- << attribute.annotations@AAAAAAF+h+SsyALDSJM= >>
    // ----------- >>
    protected String CodiceFiscale;
    
    private RegistroStrutture registro;
    
    
    
    
    /*
     * costruttore di Cliente
     */
    public Cliente(String nome, String cognome, String cf) {
    	this.Nome = nome;
    	this.Cognome = cognome;
    	this.CodiceFiscale = cf;
		//questa variabile riprende l'unica possibile istanza di RegistroStrutture
    	this.registro = RegistroStrutture.registro;
	}
    

    
    /*
     * serie di metodi get per ottenere gli attributi della classe
     */
    protected String getNome() {
        return Nome;
    }

    protected String getCognome() {
        return Cognome;
    }

    protected String getCodiceFiscale() {
        return CodiceFiscale;
    }

    
    
    /*
     * serie di metodi set per settare gli attributi della classe
     */
    private void setNome(String Nome) {
        this.Nome = Nome;
    }

    private void setCognome(String Cognome) {
        this.Cognome = Cognome;
    }

    private void setCodiceFiscale(String CodiceFiscale) {
        this.CodiceFiscale = CodiceFiscale;
    }

    
    
    
    
    // ----------- << method.annotations@AAAAAAF+h+SsyALFTmM= >>
    /**
     * metodo che va a richiamare il metodo del registro associato a cliente, in quanto si vuole che la funzione non svolga nulla ma faccia tutto la classe RegistroStrutture
     * viene quindi implementato il pattern design DELEGATION
     * 
     * @param sport 
     * @param dataora 
     * @param struttura
     * 
     * @return ritorna un oggetto Campo qualora tutte le condizioni indicate rispettino quelle del campo che viene ritornato
     */
    // ----------- >>
    protected Campo controlloDisponibilitaCampo(String sport, Date dataora, Struttura struttura) {
    // ----------- << method.body@AAAAAAF+h+SsyALFTmM= >>
    	return registro.controlloDisponibilitaCampo(sport, dataora, struttura);
    // ----------- >>
    }
    
    
    
    
    
    // ----------- << method.annotations@AAAAAAF+h+SsyALL5Xc= >>
    /**
     * metodo che va a richiamare il metodo del registro associato a cliente, in quanto si vuole che la funzione non svolga nulla ma faccia tutto la classe RegistroStrutture
     * viene quindi implementato il pattern design DELEGATION
     * 
     * @param sport 
     * @param dataora 
     * @param struttura
     * @return 
     * 
     * @return ritorna un oggetto Spogliatoio qualora tutte le condizioni indicate rispettino quelle dello Spogliatoio che viene ritornato
     */
    // ----------- >>
    protected Spogliatoio controlloDisponibilitaSpogliatoio(Date dataora, Struttura struttura) {
    // ----------- << method.body@AAAAAAF+h+SsyALL5Xc= >>
    	return registro.controlloDisponibilitaSpogliatoio(dataora, struttura);
    // ----------- >>
    	
    }

// ----------- << class.extras@AAAAAAF+h+SsyALA1XA= >>
// ----------- >>
}