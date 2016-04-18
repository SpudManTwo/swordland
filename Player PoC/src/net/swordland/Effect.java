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
public class Effect 
{
    private int durationRemaining;
    private EffectArcheType effectArcheType;

    public Effect(int durationRemaining, EffectArcheType effectArcheType)
    {
        this.durationRemaining = durationRemaining;
        this.effectArcheType = effectArcheType;
    }

    public int getDurationRemaining()
    {
        return durationRemaining;
    }

    public void setDurationRemaining(int durationRemaining)
    {
        this.durationRemaining = durationRemaining;
    }
    
    public EffectArcheType getEffectArcheType()
    {
        return effectArcheType;
    }
    
    public static enum EffectArcheType
    {
        STUN,
        ARMOR_HALVE,
        ATTACK_HALVE,
        WEAPON_HALVE,
        ROOT,
        BIND,
        AREA_OF_EFFECT,
        TAKE_DAMAGE_COUNTER,
        NO_DAMAGE_COUNTER,
        KNOCK_UP,
        ATTACK_UP,
        HEAL_OVER_TIME,
        STATUS_CURE,
        COOLDOWN_DOWN,
        DEFENCE_UP
    }
}
