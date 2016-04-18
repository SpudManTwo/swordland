/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland;

/**
 *
 * @author Kazumi
 */
public class Location
{
    protected String flavourText;

    public Location(String flavourText)
    {
        this.flavourText = flavourText;
    }
    
    public String getFlavourText() {
        return flavourText;
    }

    protected void setFlavourText(String flavourText) {
        this.flavourText = flavourText;
    }    
}
