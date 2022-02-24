/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package piattaforma;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF+h+SsyALiE3I= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF+h+SsyALiE3I= >>
// ----------- >>
public class Struttura {
    // ----------- << attribute.annotations@AAAAAAF+h+SsyALmvyA= >>
    // ----------- >>
    private String Nome;

    // ----------- << attribute.annotations@AAAAAAF+h+SsyALnspQ= >>
    // ----------- >>
    private String Indirizzo;

    // ----------- << attribute.annotations@AAAAAAF+h+SsyALo/5s= >>
    // ----------- >>
    private String Citta;

    // ----------- << attribute.annotations@AAAAAAF+h+SsyALp7xQ= >>
    // ----------- >>
    private String IDstruttura;

    // ----------- << attribute.annotations@AAAAAAF/G/HPwGbFGOw= >>
    // ----------- >>
    private HashMap<Cliente, Integer> ConteggioPrenotazioni;

    // ----------- << attribute.annotations@AAAAAAF+h+SsyALlXF8= >>
    // ----------- >>
    private Set<Cliente> ListaClientiBan = new HashSet<>();

    // ----------- << attribute.annotations@AAAAAAF+h+SsyALvLyc= >>
    // ----------- >>
    private Set<Campo> ListaCampi = new HashSet<>();

    // ----------- << attribute.annotations@AAAAAAF+h+SsyAL4npc= >>
    // ----------- >>
    private Set<Spogliatoio> ListaSpogliatoi = new HashSet<>();

    /*
     * serie dei metodi per ottenere gli attributi della classe
     */
    public String getNome() {
        return Nome;
    }

    public String getIndirizzo() {
        return Indirizzo;
    }

    public String getCitta() {
        return Citta;
    }

    private String getIDstruttura() {
        return IDstruttura;
    }

    private HashMap<Cliente, Integer> getConteggioPrenotazioni() {
        return ConteggioPrenotazioni;
    }

    public Set<Cliente> getListaClientiBan() {
        return ListaClientiBan;
    }

    public Set<Campo> getListaCampi() {
        return ListaCampi;
    }

    public Set<Spogliatoio> getListaSpogliatoi() {
        return ListaSpogliatoi;
    }

    /*
     * serie di metodi per settare gli attributi della classe
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setIndirizzo(String Indirizzo) {
        this.Indirizzo = Indirizzo;
    }

    public void setCitta(String Citta) {
        this.Citta = Citta;
    }

    private void setIDstruttura(String IDstruttura) {
        this.IDstruttura = IDstruttura;
    }

    /*
     * aggiunge un nuovo cliente alla ListaBan
     */
    public void linkListaClientiBan(Cliente cliente) {
        if (cliente != null) {
            getListaClientiBan().add(cliente);
        }
    }

    /*
     * aggiunge un campo alla struttura e setta al campo il parametro StrutturaProprietaria
     */
    public void linkListaCampi(Campo campo) {
        if (campo != null) {
        	campo.setStrutturaProprietaria(this);
            getListaCampi().add(campo);
        }
    }

    /*
     * aggiunge uno spogliatoio alla struttura e setta allo spogliatoio il parametro StrutturaProprietaria
     */
    public void linkListaSpogliatoi(Spogliatoio spogliatoio) {
        if (spogliatoio != null) {
        	spogliatoio.setStrutturaProprietaria(this);
            getListaSpogliatoi().add(spogliatoio);
        }
    }

    /*
     * rimuove un cliente dalla ListaBan
     */
    public void unlinkListaClientiBan(Cliente cliente) {
        if (cliente != null) {
            getListaClientiBan().remove(cliente);
        }
    }

    /*
     * rimuove un campo dalla lista della struttura e setta l'attributo StrutturaProrpietaria di campo = null
     */
    public void unlinkListaCampi(Campo campo) {
        if (campo != null) {
        	campo.setStrutturaProprietaria(null);
            getListaCampi().remove(campo);
        }
    }

    /*
     * rimuove uno spogliatoio dalla lista della struttura e setta l'attributo StrutturaProrpietaria di spogliatoio = null
     */
    public void unlinkListaSpogliatoi(Spogliatoio spogliatoio) {
        if (spogliatoio != null) {
        	spogliatoio.setStrutturaProprietaria(null);
            getListaSpogliatoi().remove(spogliatoio);
        }
    }

    // ----------- << method.annotations@AAAAAAF+h+SsyALqHG8= >>
    // ----------- >>
    protected void aggiungiBan() {
    // ----------- << method.body@AAAAAAF+h+SsyALqHG8= >>
    // ----------- >>
    }
    // ----------- << method.annotations@AAAAAAF+h+SsyALrFSc= >>
    // ----------- >>
    protected void aggiungiCampo() {
    // ----------- << method.body@AAAAAAF+h+SsyALrFSc= >>
    // ----------- >>
    }
    // ----------- << method.annotations@AAAAAAF+h+SsyALsdgk= >>
    // ----------- >>
    protected void aggiungiSpogliatoio() {
    // ----------- << method.body@AAAAAAF+h+SsyALsdgk= >>
    // ----------- >>
    }
    // ----------- << method.annotations@AAAAAAF/AeFs0EnWX1E= >>
    // ----------- >>
    public void stampaPrenotazioni() {
    // ----------- << method.body@AAAAAAF/AeFs0EnWX1E= >>
    // ----------- >>
    }
    // ----------- << method.annotations@AAAAAAF/Aept5Ez0NzU= >>
    // ----------- >>
    protected void controllaBan() {
    // ----------- << method.body@AAAAAAF/Aept5Ez0NzU= >>
    // ----------- >>
    }
    // ----------- << method.annotations@AAAAAAF/G/L4AWjwnek= >>
    // ----------- >>
    protected void aggiornaConteggioPrenotazioni() {
    // ----------- << method.body@AAAAAAF/G/L4AWjwnek= >>
    // ----------- >>
    }
// ----------- << class.extras@AAAAAAF+h+SsyALiE3I= >>
// ----------- >>
}