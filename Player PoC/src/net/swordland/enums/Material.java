/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.swordland.enums;

//FIXME: Add further materials.

/**
 * All materials usable for crafting and used in weapons and armor.
 *
 * @author Kazumi
 */
public enum Material 
{
    /**
     * 
     */
    BRONZE (0),

    /**
     * 
     */
    BOAR (0),

    /**
     * 
     */
    CRYSTAL (1),
    
    /**
     * 
     */
    BIRDREON (1),

    /**
     *
     */
    IRON (3),
    
    /**
     *
     */
    WYVERN (3),

    /**
     *
     */
    STEEL (7),

    /**
     *
     */
    DIAMOND (9),

    /**
     *
     */
    DIVINE (10);
    
    private final int matmod;
    
    Material(int matmod)
    {
        this.matmod = matmod;
    }
    
    public int MatMod()
    {
        return matmod;
    }
    
}
