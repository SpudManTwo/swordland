/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland;

import java.awt.Color;
import java.util.TreeMap;

/**
 *
 * @author Kazumi
 */
public class Mob extends Living 
{

    private boolean boss;
    private TreeMap<DropClass, Item> dropMap;

    public Mob
        (
            Color cursor, 
            int currHP, 
            int maxHP, 
            TreeMap<Effect.EffectArcheType,Effect> status, 
            Location currentLocation, 
            Item leftHand, 
            Item rightHand,
            Armour wornArmor,
            int level, 
            boolean visible, 
            String name,
            boolean isBoss,
            TreeMap<DropClass, Item> dropMap
        )
    {
        super(cursor, currHP, maxHP, status, currentLocation, leftHand, rightHand, wornArmor, level, visible, name);
        this.boss = isBoss;
        this.dropMap = dropMap;
    }

    public boolean isBoss()
    {
        return boss;
    }

    public TreeMap<DropClass, Item> getDropMap()
    {
        return dropMap;
    }
    
    public static enum DropClass
    {
        ULTRA_RARE (0),
        SUPER_RARE (4),
	    RARE (9),
	    SEMI_RARE (14),
        UNCOMMON (19),
        OCCASIONAL (24),
        COMMON (32),
        REDUNDANT (49),
        SUPER_COMMON (65),
        ULTRA_COMMON (74),
        GUARANTEED (99);
        
        private int rarity;

        DropClass( int rarity )
        {
            this.rarity = rarity;
        }
        
        public int Rarity()
        {
            return rarity;
        }
        
    }
}
