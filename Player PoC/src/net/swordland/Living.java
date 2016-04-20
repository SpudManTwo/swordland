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
public class Living 
{
    
    protected Color cursor;    
    protected int currHP;
    protected int maxHP;
    protected TreeMap<Effect.EffectArcheType,Effect> status;
    protected Location currentLocation;
    protected Item leftHand;
    protected Item rightHand;
    protected int level;
    protected boolean visible;
    protected String name;
    protected Armour wornArmour;
    protected int XP;

    public Living
        (
            Color cursor, 
            int currHP, 
            int maxHP, 
            TreeMap<Effect.EffectArcheType,Effect> status, 
            Location currentLocation, 
            Item leftHandItem, 
            Item rightHandItem,
            Armour wornArmour,
            int level, 
            boolean visible, 
            String name
        )
    {
        this.cursor = cursor;
        this.currHP = currHP;
        this.maxHP = maxHP;
        this.status = status;
        this.currentLocation = currentLocation;
        this.leftHand = leftHandItem;
        this.rightHand = rightHandItem;
        this.wornArmour = wornArmour;
        this.level = level;
        this.visible = visible;
        this.name = name;
    }

    public Living
        (
            Color cursor, 
            TreeMap<Effect.EffectArcheType,Effect> status, 
            Location currentLocation, 
            Item leftHand, 
            Item rightHand,
            Armour wornArmor,
            int level, 
            boolean visible, 
            String name
        )
    {
        this.cursor = cursor;
        this.status = status;
        this.currentLocation = currentLocation;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.wornArmour = wornArmor;
        this.level = level;
        this.visible = visible;
        this.name = name;
        
        this.currHP = this.maxHP = 100;
    }

    public Color getCursor()
    {
        return cursor;
    }

    public void setCursor(Color cursor)
    {
        this.cursor = cursor;
    }

    public int getCurrHP()
    {
        return currHP;
    }

    public void setCurrHP(int currHP)
    {
        this.currHP = currHP;
    }

    public int getMaxHP()
    {
        return maxHP;
    }

    public Location getCurrentLocation()
    {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation)
    {
        this.currentLocation = currentLocation;
    }

    public Item getLeftHand()
    {
        return leftHand;
    }

    public void setLeftHand(Item leftHand)
    {
        this.leftHand = leftHand;
    }

    public Item getRightHand()
    {
        return rightHand;
    }

    public void setRightHand(Item rightHand)
    {
        this.rightHand = rightHand;
    }

    public int getLevel()
    {
        return level;
    }

    public boolean isVisible()
    {
        return visible;
    }

    public void setVisibility(boolean b)
    {
        this.visible = b;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Armour getWornArmour()
    {
        return wornArmour;
    }

    public void setWornArmour(Armour wornArmour)
    {
        this.wornArmour = wornArmour;
    }

    public void remHP(int diffHP) 
    {
        this.currHP -= diffHP;
        if (this.currHP <= 0)
        {
            Die();
        }
    }

    public void addHP(int diffHP) 
    {
        this.currHP += diffHP;
        if (this.currHP > this.maxHP)
        {
            this.currHP = this.maxHP;
        }
    }

    public TreeMap<Effect.EffectArcheType,Effect> getStatus()
    {
        return status;
    }

    public void addStatus(Effect status)
    {
        if (this.status.containsKey(status.getEffectArcheType()))
        {
            this.status.get(status.getEffectArcheType()).setDurationRemaining(this.status.get(status.getEffectArcheType()).getDurationRemaining()+status.getDurationRemaining());
            return;
        }
        this.status.put(status.getEffectArcheType(),status);
    }

    public void removeStatus(Effect status)
    {
        if (this.status.containsKey(status.getEffectArcheType()))
        {
            this.status.remove(status.getEffectArcheType());
        }
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    public void addLevel()
    {
        this.XP = 0;
        this.level++;
    }
    
    public void addLevel(int amount)
    {
        this.XP = 0;
        for (int i=0; i<amount; i++)
        {
            this.level++;
        }
    }

    public int getXP()
    {
        return XP;
    }
    
    public void addXP(int amount)
    {
        this.XP += amount;
    }
    
    public void setXP(int amount)
    {
        this.XP = amount;
    }
    
    public void Die()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
