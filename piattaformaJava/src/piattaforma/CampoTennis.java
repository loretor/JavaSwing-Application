/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package piattaforma;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF+h+SsyAMGpq8= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF+h+SsyAMGpq8= >>
// ----------- >>
public class CampoTennis extends Campo {

	// ----------- << attribute.annotations@AAAAAAF+h+SsyAMIpFY= >>
    // ----------- >>
    private String tipoTerreno;

    // ----------- << attribute.annotations@AAAAAAF+h+SsyAMJ7xY= >>
    // ----------- >>
    private int nroGiocatori;
    
    
    /*
     * costruttore CampoTennis
     */
    public CampoTennis(String sport, float prezzo, int nmaxpersone, Struttura strutturaproprietaria) {
		super(sport, prezzo, nmaxpersone, strutturaproprietaria);
		// TODO Auto-generated constructor stub
	}
    
    

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public int getNroGiocatori() {
        return nroGiocatori;
    }

// ----------- << class.extras@AAAAAAF+h+SsyAMGpq8= >>
// ----------- >>
}