/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package piattaforma;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF+h+SsyAL28Vw= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF+h+SsyAL28Vw= >>
// ----------- >>
public class Spogliatoio {
    // ----------- << attribute.annotations@AAAAAAF+h+SsyAL6TAM= >>
    // ----------- >>
    private int Numero;

    // ----------- << attribute.annotations@AAAAAAF+h+SsyAL7r2A= >>
    // ----------- >>
    private float Prezzo;

    // ----------- << attribute.annotations@AAAAAAF+h+SsyALURH0= >>
    // ----------- >>
    private Set<Prenotazione> ListaPrenotazioni = new HashSet<>();

    // ----------- << attribute.annotations@AAAAAAF+h+SsyAL5VLU= >>
    // ----------- >>
    private Struttura StrutturaProprietaria;

    /*
     * serie di metodi per ottenere gli attributi della classe
     */
    public int getNumero() {
        return Numero;
    }

    public float getPrezzo() {
        return Prezzo;
    }

    public Set<Prenotazione> getListaPrenotazioni() {
        return ListaPrenotazioni;
    }

    public Struttura getStrutturaProprietaria() {
        return StrutturaProprietaria;
    }

    /*
     * serie di metodi per settare gli attributi della classe
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setStrutturaProprietaria(Struttura StrutturaProprietaria) {
        this.StrutturaProprietaria = StrutturaProprietaria;
    }

    /*
     * aggiungere una prenotazione alla lista delle prenotazioni dello spogliatoio e per settare il campo spogliatoioassociato della prenotazione
     */
    public void linkListaPrenotazioni(Prenotazione prenotazione) {
        if (prenotazione != null) {
        	prenotazione.unlinkSpogliatoioAssociato();
        	prenotazione.setSpogliatoioAssociato(this);
            getListaPrenotazioni().add(prenotazione);
        }
    }

    /*
     * settare la struttura proprietaria di uno spogliatoio e aggiungere lo spogliatoio alla lista degli spogliatoi della struttura
     */
    public void linkStrutturaProprietaria(Struttura strutturaProprietaria) {
        if (strutturaProprietaria != null) {
            strutturaProprietaria.getListaSpogliatoi().add(this);
        }

        setStrutturaProprietaria(strutturaProprietaria);
    }

    /*
     * per rimuovere dallo spogliatoio una prenotazione e per togliere dalla prenotazione lo spogliatoio associato
     */
    public void unlinkListaPrenotazioni(Prenotazione prenotazione) {
        if (prenotazione != null) {
        	prenotazione.setSpogliatoioAssociato(null);
            getListaPrenotazioni().remove(prenotazione);
        }
    }


    // ----------- << method.annotations@AAAAAAF+h+SsyAL8Se0= >>
    // ----------- >>
    protected void aggiungiPrenotazione() {
    // ----------- << method.body@AAAAAAF+h+SsyAL8Se0= >>
    // ----------- >>
    }
    // ----------- << method.annotations@AAAAAAF/G81mDMH+nV0= >>
    // ----------- >>
    public void stampaPrenotazione() {
    // ----------- << method.body@AAAAAAF/G81mDMH+nV0= >>
    // ----------- >>
    }
// ----------- << class.extras@AAAAAAF+h+SsyAL28Vw= >>
// ----------- >>
}