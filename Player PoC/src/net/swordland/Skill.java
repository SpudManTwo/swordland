/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland;

import java.util.TreeMap;

/**
 *
 * @author Kazumi
 */
public class Skill 
{
    private Weapon.WeaponArcheType weaponRequired;
    private int numHits;
    private double damageMod[];
    private TreeMap<Effect, Integer> effects;
    private boolean finalAttack;

    public Skill(Weapon.WeaponArcheType weaponRequired, int numHits, double normalDamageMod, TreeMap<Effect, Integer> effects, boolean finalAttack, double finalAttackDamageMod)
    {
        this.damageMod = new double[2];
        
        this.weaponRequired = weaponRequired;
        this.numHits = numHits;
        this.damageMod[0] = normalDamageMod;
        this.damageMod[1] = finalAttackDamageMod;
        this.effects = effects;
        this.finalAttack = finalAttack;
    }
    
    public Skill(Weapon.WeaponArcheType weaponRequired, int numHits, double normalDamageMod, TreeMap<Effect, Integer> effects)
    {
        this.damageMod = new double[1];
        
        this.weaponRequired = weaponRequired;
        this.numHits = numHits;
        this.damageMod[0] = normalDamageMod;
        this.effects = effects;
        this.finalAttack = false;
    }
    
    public double getNormalDamageMod()
    {
        return damageMod[0];
    }

    public int getNumHits()
    {
        return numHits;
    }

    public TreeMap<Effect, Integer> getEffects()
    {
        return effects;
    }

    public Weapon.WeaponArcheType getWeaponRequired()
    {
        return weaponRequired;
    }

    public boolean hasFinalAttack()
    {
        return finalAttack;
    }
    
    //FIXME: Custom hashing algorithm?
    public int getHash()
    {
        return this.hashCode();
    }

    public double getFinalAttackDamageMod()
    {
        return damageMod[1];
    }
    
    
}
