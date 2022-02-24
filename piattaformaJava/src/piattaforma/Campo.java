/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package piattaforma;

import java.util.*;
import java.time.*;


//ciaoooooooooooooooo

// ----------- << imports@AAAAAAF+h+SsyALtH+M= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF+h+SsyALtH+M= >>
// ----------- >>
public abstract class Campo {
    // ----------- << attribute.annotations@AAAAAAF+h+SsyALxJrs= >>
    // ----------- >>
    private String IDcampo;

    // ----------- << attribute.annotations@AAAAAAF+h+SsyALyBig= >>
    // ----------- >>
    private String Sport;

    // ----------- << attribute.annotations@AAAAAAF+h+SsyALz0Ew= >>
    // ----------- >>
    private float Prezzo;

    // ----------- << attribute.annotations@AAAAAAF+h+SsyAL0Eoo= >>
    // ----------- >>
    private int nroMaxPersone;

    // ----------- << attribute.annotations@AAAAAAF+h+SsyALRqvo= >>
    // ----------- >>
    private Set<Prenotazione> ListaPrenotazioni = new HashSet<>();

    // ----------- << attribute.annotations@AAAAAAF+h+SsyALw6xI= >>
    // ----------- >>
    private Struttura StrutturaProprietaria;

    /*
     * serie di metodi per restituire gli attributi fondamentali della classe
     */  
    private String getIDcampo() {
        return IDcampo;
    }

    public String getSport() {
        return Sport;
    }

    public float getPrezzo() {
        return Prezzo;
    }

    public int getNroMaxPersone() {
        return nroMaxPersone;
    }

    public Set<Prenotazione> getListaPrenotazioni() {
        return ListaPrenotazioni;
    }

    public Struttura getStrutturaProprietaria() {
        return StrutturaProprietaria;
    }

    /*
     * serie di metodi per settare singolarmente gli attributi della classe
     */ 
    private void setIDcampo(String IDcampo) {
        this.IDcampo = IDcampo;
    }

    public void setSport(String Sport) {
        this.Sport = Sport;
    }

    public void setNroMaxPersone(int nroMaxPersone) {
        this.nroMaxPersone = nroMaxPersone;
    }

    protected void setStrutturaProprietaria(Struttura StrutturaProprietaria) {
        this.StrutturaProprietaria = StrutturaProprietaria;
    }

    /*
     * aggiunge una nuova prenotazione alla ListaPrenotazioni del Campo
     */
    public void linkListaPrenotazioni(Prenotazione prenotazione) {
        if (prenotazione != null) {
        	prenotazione.setCampoAssociato(this);
            getListaPrenotazioni().add(prenotazione);
        }
    }

    /*
     * serve per aggiornare la struttura proprietaria e aggiungere il campo alla sua lista
     */
    public void linkStrutturaProprietaria(Struttura _StrutturaProprietaria) {
        if (_StrutturaProprietaria != null) {
            _StrutturaProprietaria.getListaCampi().add(this);
        }
        //aggiorno la StrutturaProprietaria per il campo
        setStrutturaProprietaria(_StrutturaProprietaria);
    }
    
    /*
     * serve per togliere una prenotazione dalla ListaPrenotazioni e togliere alla prenotazione questo campo
     */
    public void unlinkListaPrenotazioni(Prenotazione prenotazione) {
        if (prenotazione != null) {
        	prenotazione.setCampoAssociato(null);
            getListaPrenotazioni().remove(prenotazione);
        }
    }



    // ----------- << method.annotations@AAAAAAF+h+SsyAL1hOw= >>
    // ----------- >>
    protected void aggiungiPrenotazione() {
    // ----------- << method.body@AAAAAAF+h+SsyAL1hOw= >>
    // ----------- >>
    }
    // ----------- << method.annotations@AAAAAAF/G83rC8T6iE4= >>
    // ----------- >>
    public void stampaPrenotazione() {
    // ----------- << method.body@AAAAAAF/G83rC8T6iE4= >>
    // ----------- >>
    }
// ----------- << class.extras@AAAAAAF+h+SsyALtH+M= >>
// ----------- >>
}