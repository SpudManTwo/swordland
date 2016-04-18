/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.swordland;

import net.swordland.enums.Material;

/**
 * Describes everything about a weapon.
 * @author Kazumi
 */
public class Weapon extends Wearable
{
    
    /**
     * The weapon's respective type. Use NONE in case of no weapon.
     */
    private WeaponArcheType weaponArcheType;
    
    /**
     * The weapon's attack modifier. It adds to your strength to see how much damage you do.
     */
    private int attack;
    
    /**
     * The range of the weapon.
     */
    private float range;
    
    /**
     * Creates a weapon with a specified weight, name, flavour text, maximum durability, current durability, material, weapon class and attack modifier.
     *
     * @param ID The unique identifier.
     * @param weight Weight in units.
     * @param name The name of the weapon.
     * @param flavourText A description of the weapon. It's an MMO after all.
     * @param maxDurability The maximum durability of the weapon. 
     * @param currDurability The current durability of the weapon.
     * @param material The material the weapon is made of.
     * @param weaponArcheType The weapon class.
     * @param attack The damage modifier of the weapon.
     * @param range Multiplicative value to create exceptionally long or short weapons.
     */
    public Weapon(int ID, int weight, String name, String flavourText, int maxDurability, int currDurability, Material material, WeaponArcheType weaponArcheType, int attack, float range) {
        super(ID, weight, name, flavourText, maxDurability, currDurability, material);
        this.weaponArcheType = weaponArcheType;
        this.attack = attack;
        this.range = range;
    }
    
    /**
     * Creates a copy of an already existing weapon.
     * @param other
     */
    public Weapon(Weapon other)
    {
        super(other.getID(),other.getWeight(),other.getName(),other.getFlavourText(),other.getMaxDurability(),other.getCurrDurability(),other.getMaterial());
        this.attack = other.getAttack();
        this.range = other.getRange();
        this.weaponArcheType = other.getWeaponArcheType();
    }

    public WeaponArcheType getWeaponArcheType() {
        return weaponArcheType;
    }

    public int getAttack() {
        return attack;
    }

    public float getRange() {
        return range;
    }

    /**
     *
     * @author Kazumi
     */
    public static enum WeaponArcheType {
        /**
         * Any weapon
         */
        ANY,
        /**
         * No weapon at all
         */
        NONE,
        /**
         * One Handed Sword
         */
        OHS, 
        /**
         * One Handed Rapier
         */ 
        OHR, 
         /**
         * One Handed Curved Blade
         */ 
        OHCB, 
         /**
         * One Handed Dagger
         */ 
        OHD, 
         /**
         * One Handed Trauma
         */ 
        OHT, 
         /**
         * One Handed Axe
         */ 
        OHA, 
         /**
         * Throwing Weapon
         */ 
        TW, 
         /**
         * Two Handed Assault Spear
         */ 
        THAS, 
         /**
         * Two Handed Sword
         */ 
        THS, 
         /**
         * Two Handed Curved Blade
         */ 
        THCB, 
         /**
         * Two Handed Battle Axe
         */ 
        THBA, 
         /**
         * Shield
         */ 
        S, 
         /**
         * Great Shield
         */ 
        GS
    }
    
}
