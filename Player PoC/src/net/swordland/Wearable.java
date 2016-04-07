/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland;

import net.swordland.enums.Material;

/**
 *
 * @author Kazumi
 */
class Wearable extends Item
{
    private int maxDurability;
    private int currDurability;
    private Material material;
    
    /**
     * Creates a wearable item with a specified weight, name, flavour text, maximum durability, current durability and its material.
     *
     * @param ID The unique identifier.
     * @param weight Weight in units.
     * @param name The name of the wearable item.
     * @param flavourText A description of the wearable item. It's an MMO after all. 
     * @param maxDurability The maximum durability of the item. 
     * @param currDurability The current durability of the item.
     * @param material The material the item is made of.
     */
    public Wearable(int ID, int weight, String name, String flavourText, int maxDurability, int currDurability, Material material) 
    {
        super(ID, weight, name, flavourText);
        this.maxDurability = maxDurability;
        this.currDurability = currDurability;
    }

    /**
     * Get the value of maxDurability
     *
     * @return the value of maxDurability
     */
    public int getMaxDurability() 
    {
        return maxDurability;
    }

    /**
     * Set the value of maxDurability
     *
     * @param maxDurability new value of maxDurability
     */
    public void setMaxDurability(int maxDurability) 
    {
        this.maxDurability = maxDurability;
    }

    /**
     * Get the value of currDurability
     *
     * @return the value of currDurability
     */
    public int getCurrDurability() 
    {
        return currDurability;
    }

    /**
     * Set the value of currDurability
     *
     * @param currDurability new value of currDurability
     */
    public void setCurrDurability(int currDurability) 
    {
        this.currDurability = currDurability;
    }

    /**
     * Get the value of material
     *
     * @return the value of material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Set the value of material
     *
     * @param material new value of material
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

}
