package de.uni_hamburg.informatik.swt.se2.kino.beobachtermuster;

import java.util.HashSet;
import java.util.Set;

import de.uni_hamburg.informatik.swt.se2.kino.beobachter.Beobachter;

/**
 * Beobachtbar stellt die nötige Implementation für beobachtbare Klassen
 * im Sinne des Beobachtermusters bereit
 * 
 * @author Svetoslav
 * @version 2021
 *
 */
public abstract class Beobachtbar
{
    private Set<Beobachter> _beobachter;

    /*
     * Konstruktor der Abstrakten Klasse Beobachtbar.
     */
    protected Beobachtbar()
    {
        _beobachter = new HashSet<Beobachter>();
    }

    /*
     * Meldet eine Aenderung an alle Beobachter. Dabei wird die Referenz auf das Beobachtbare Object
     * mit übergeben um den Ursprung der Aenderung zu identifizieren. 
     */
    protected void meldeAenderung()
    {
        //Iterator<Beobachter>value = _beobachter.iterator();

        //while (value.hasNext())
        for (Beobachter beobachter : _beobachter)
        {
            //value.next().beachteAenderung(this);
            beobachter.beachteAenderung(this);
        }
    }

    /*
     * Fügt einen Beobachter der menge der Beobachter hinzu. 
     * 
     * @param beobachter der hinzuzufügende Beobachter
     * @require beobachter != null
     */
    public void fuegeBeobachterHinzu(Beobachter beobachter)
    {
        assert beobachter != null : "Vorbedingung verletzt: beobachter != null";
        _beobachter.add(beobachter);
    }

    /*
     * Entfernt einen Beobachter der menge der Beobachter. 
     * 
     * @param beobachter der zu entfernende Beobachter
     * @require beobachter != null
     */
    public void entferneBeobachter(Beobachter beobachter)
    {
        assert beobachter != null : "Vorbedingung verletzt: beobachter != null";
        _beobachter.remove(beobachter);
    }
}
