package de.uni_hamburg.informatik.swt.se2.kino.beobachter;


/**
 * Stellt das Interface für die beobachtenden Klassen im Beobachtermuster bereit
 * @author Svetoslav
 * @version 2021
 *
 */
public interface Beobachter
{
    /**
     * Reagiert auf die Aenderungen, die beobachtete Klassen melden
     * @param wirdBeobachtet Referenz des beobachteten Objekts
     * @require wirdBeobachtet != null
     */
    public void beachteAenderung(Object wirdBeobachtet);
  
}
