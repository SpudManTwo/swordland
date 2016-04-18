/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland.database;

import java.util.ArrayList;
import java.util.TreeMap;
import net.swordland.Effect;
import net.swordland.Skill;
import net.swordland.Weapon;

/**
 *
 * @author Kazumi
 */
public final class Skills 
{
    private Skills() {    }
    
    private static TreeMap<Integer, Skill> AllSkills;
    private static ArrayList<Skill> StartingSkills;
    
    public static void setSkillDatabase()
    {
        AllSkills = new TreeMap<>();
        StartingSkills = new ArrayList<>();
        SetOHSSkills();
    }
    
    public static void SetOHSSkills()
    {
        Skill s;
        TreeMap<Effect, Integer> t;
        
        /**
         * Nova Ascension
         */
        s = new Skill(Weapon.WeaponArcheType.OHS, 9, 5.25d, null, true, 9.75d);
        AllSkills.put(s.getHash(), s);
        
        /**
         * Howling Octave
         */
        s = new Skill(Weapon.WeaponArcheType.OHS, 8, 3d, null);
        AllSkills.put(s.getHash(), s);
        
        /**
         * Deadly Sins
         */
        s = new Skill(Weapon.WeaponArcheType.OHS, 7, 1.9d, null);
        AllSkills.put(s.getHash(), s);
        
        /**
         * Star Quint Prominence
         */ 
        s = new Skill(Weapon.WeaponArcheType.OHS, 5, 1.3d, null);
        AllSkills.put(s.getHash(), s);
        
        /**
         * Savage Fulcrum
         */
        s = new Skill(Weapon.WeaponArcheType.OHS, 4, 1d, null);
        AllSkills.put(s.getHash(), s);
        
        /**
         * Lightning Fall
         */
        t = new TreeMap<>();
        t.put(new Effect(1, Effect.EffectArcheType.AREA_OF_EFFECT), 1);
        s = new Skill(Weapon.WeaponArcheType.OHS, 1, 0.5d, t);
        AllSkills.put(s.getHash(), s);
        
        /**
         * Serration Wave
         */
        t = new TreeMap<>();
        t.put(new Effect(1, Effect.EffectArcheType.AREA_OF_EFFECT), 1);
        s = new Skill(Weapon.WeaponArcheType.OHS, 1, 0.25d, t);
        AllSkills.put(s.getHash(), s);
        
        /**
         * Sharp Nail
         */
        s = new Skill(Weapon.WeaponArcheType.OHS, 3, 3d, null);
        AllSkills.put(s.getHash(), s);
        
        /**
         * Vorpal Strike
         */
        s = new Skill(Weapon.WeaponArcheType.OHS, 1, 3d, null);
        AllSkills.put(s.getHash(), s);
    }
    
    public static void SetSimpleSkills()
    {
        Skill s;
        TreeMap<Effect, Integer> t;
        
        /**
         * Snake Bite
         */
        t = new TreeMap<>();
        t.put(new Effect(1, Effect.EffectArcheType.WEAPON_HALVE), 1);
        t.put(new Effect(1, Effect.EffectArcheType.WEAPON_HALVE), 1);
        s = new Skill(Weapon.WeaponArcheType.ANY, 2, 0d, t);
        AllSkills.put(s.getHash(), s);
        
        /**
         * Horizontal Arc
         */
        s = new Skill(Weapon.WeaponArcheType.ANY, 2, 1d, null);
        AllSkills.put(s.getHash(), s);
    }

    public static ArrayList<Skill> getStartingSkills()
    {
        return Skills.StartingSkills;
    }
}
