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
public class Armour extends Wearable
{

    private ArmourArcheType armourArcheType;

    private int defenceModifier;
    
    /**
     * Creates an armour with a specified weight, name, flavour text, maximum durability, current durability, material, armour archetype and defenceModifier modifier.
     *
     * @param ID The unique identifier.
     * @param weight Weight in units.
     * @param name The name of the armour.
     * @param flavourText A description of the armour. It's an MMO after all.
     * @param maxDurability The maximum durability of the armour. 
     * @param currDurability The current durability of the armour.
     * @param material The material the armour is made of.
     * @param armourArcheType The armour archetype.
     * @param defenceModifier The defence modifier of the armour.
     */
    public Armour(int ID, int weight, String name, String flavourText, int maxDurability, int currDurability, Material material, ArmourArcheType armourArcheType, int defenceModifier) 
    {
        super(ID, weight, name, flavourText, maxDurability, currDurability, material);
        this.armourArcheType = armourArcheType;
        this.defenceModifier = defenceModifier;
    }

    /**
     * Get the value of armourArcheType
     *
     * @return the value of armourArcheType
     */
    public ArmourArcheType getArmourArcheType() 
    {
        return armourArcheType;
    }

    /**
     * Get the value of defenceModifier
     *
     * @return the value of defenceModifier
     */
    public int getDefenceModifier() 
    {
        return defenceModifier;
    }

    /**
     *
     * @author Kazumi
     */
    public static enum ArmourArcheType 
    {
        /**
         * Light Leather Armour
         */
        LLA, 
        /**
         * Heavy Leather Armour
         */ 
        HLA, 
        /**
         * Light Metal Armour
         */ 
        LMA, 
        /**
         * Heavy Metal Armour
         */ 
        HMA
    }    
}
