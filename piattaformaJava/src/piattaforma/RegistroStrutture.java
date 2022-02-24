/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package piattaforma;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF+i5Bd8z8/cWo= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF+i5Bd8z8/cWo= >>
// ----------- >>
public class RegistroStrutture {
    // ----------- << attribute.annotations@AAAAAAF/Ih9yqcv7c7Q= >>
    // ----------- >>
    private static Set<Struttura> ListaStrutture;
    
    
    /*
     * costruttore di RegistroStrutture
     */
    public RegistroStrutture() {
    	ListaStrutture = new HashSet<>();
    }

    
    
    
    
    public static Set<Struttura> getListaStrutture() {
        return ListaStrutture;
    }

    /*
     * per aggiungere una nuova struttura alla lista
     */
    public void linkListaStrutture(Struttura Strutture) {
        if (Strutture != null) {
            getListaStrutture().add(Strutture);
        }
    }

    /*
     * per rimuovere una struttura dalla lista
     */
    public void unlinkListaStrutture(Struttura _ListaStrutture) {
        if (_ListaStrutture != null) {
            getListaStrutture().remove(_ListaStrutture);
        }
    }


    // ----------- << method.annotations@AAAAAAF/Ae3NRlS2ang= >>
    // ----------- >>
    protected void check() {
    // ----------- << method.body@AAAAAAF/Ae3NRlS2ang= >>
    // ----------- >>
    }
// ----------- << class.extras@AAAAAAF+i5Bd8z8/cWo= >>
// ----------- >>
}