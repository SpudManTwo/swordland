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
public class Armor extends Wearable
{

    private ArmorClass armorClass;

    private int defense;
    
    /**
     * Creates an armor with a specified weight, name, flavour text, maximum durability, current durability, material, armor class and defense modifier.
     *
     * @param ID The unique identifier.
     * @param weight Weight in units.
     * @param name The name of the armor.
     * @param flavourText A description of the armor. It's an MMO after all.
     * @param maxDurability The maximum durability of the armor. 
     * @param currDurability The current durability of the armor.
     * @param material The material the armor is made of.
     * @param armorClass The armor class.
     * @param defense The defense modifier of the armor.
     */
    public Armor(int ID, int weight, String name, String flavourText, int maxDurability, int currDurability, Material material, ArmorClass armorClass, int defense) {
        super(ID, weight, name, flavourText, maxDurability, currDurability, material);
        this.armorClass = armorClass;
        this.defense = defense;
    }

    /**
     * Get the value of armorClass
     *
     * @return the value of armorClass
     */
    public ArmorClass getArmorClass() {
        return armorClass;
    }

    /**
     * Get the value of defense
     *
     * @return the value of defense
     */
    public int getDefense() {
        return defense;
    }

    /**
     *
     * @author Kazumi
     */
    public static enum ArmorClass {
        /**
         * Light Leather Armor
         */
        LLA, 
        /**
         * Heavy Leather Armor
         */ 
        HLA, 
        /**
         * Light Metal Armor
         */ 
        LMA, 
        /**
         * Heavy Metal Armor
         */ 
        HMA
    }    
}
