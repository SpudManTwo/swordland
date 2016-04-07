/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.swordland;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Describes the inventory of a player.
 * @author Kazumi
 */
public class Inventory 
{
    /**
     * The owner of the inventory.
     */
    private Player player;
    /**
     * The currently equipped weapon of a player.
     */
    private Weapon[] currentWeapon;

    /**
     * The currently equipped armor of a player.
     */
    private Armor currentArmor;

    /**
     * The currently equipped rings of a player.
     */
    private Ring[] currentRings;

    /**
     * The list of every other item currently in a player's inventory.
     */
    private ArrayList<Item> currentItems;
    
    /**
     * Constructs a player's inventory with nothing more than the fact that a player can't have more than 10 rings.
     */
    public Inventory() 
    {
        currentWeapon = new Weapon[2];
        currentRings = new Ring[10];
        currentItems = new ArrayList<>();        
    }

    public Player getPlayer() 
    {
        return player;
    }

    public void setPlayer(Player player) 
    {
        this.player = player;
    }

    public Weapon[] getCurrentWeapon() 
    {
        return currentWeapon;
    }

    public Weapon getCurrentWeapon(int hand) 
    {
        return currentWeapon[hand];
    }

    public boolean equipWeapon(Weapon weapon, int hand) 
    {
        if (currentItems.contains(weapon) == false) 
        {
            return false;
        }  
        if (this.currentWeapon[hand] !=  null)
        {
            this.currentItems.add(this.currentWeapon[hand]);
        }
        this.currentWeapon[hand] = weapon;
        return this.currentItems.remove(weapon);
    }

    public boolean unequipWeapon(int hand) 
    {
        if (this.currentWeapon[hand] ==  null)
        {
            return false;
        }
        Weapon old = this.currentWeapon[hand];
        this.currentWeapon[hand] = null;
        return this.currentItems.add(old);
    }

    public Armor getCurrentArmor() 
    {
        return currentArmor;
    }

    public boolean equipArmor(Armor armor) 
    {
        if (currentItems.contains(armor) == false) 
        {
            return false;
        } 
        if (this.currentArmor !=  null)
        {
            this.currentItems.add(this.currentArmor);
        }
        this.currentArmor = armor;
        return this.currentItems.remove(armor);
    }

    public boolean unequipArmor() 
    {
        if (this.currentArmor ==  null)
        {
            return false;
        }
        Armor old = this.currentArmor;
        this.currentArmor = null;
        return this.currentItems.add(old);
    }

    public Ring[] getRing() 
    {
        return currentRings;
    }

    public Ring getRing(int finger) 
    {
        return currentRings[finger];
    }

    public boolean equipRing(Ring ring, int finger) 
    {
        if (currentItems.contains(ring) == false) 
        { 
            return false; 
        } 
        if (this.currentRings[finger] != null) 
        { 
            this.currentItems.add(this.currentRings[finger]); 
        }
        this.currentRings[finger] = ring;
        return this.currentItems.remove(ring);
    }

    public boolean unequipRing(int finger) 
    {
        if (this.currentRings[finger] ==  null)
        {
            return false;
        }
        Ring old = this.currentRings[finger];
        this.currentRings[finger] = null;
        return this.currentItems.add(old);
    }

    public ArrayList<Item> getCurrentItems() 
    {
        return currentItems;
    }

    public void setCurrentItems(ArrayList<Item> currentItems) 
    {
        this.currentItems = currentItems;
    }

    public void addItems(ArrayList<Item> items) 
    {
        this.currentItems.addAll(items);
    }

    public void addItems(Item[] items) 
    {
        this.currentItems.addAll(Arrays.asList(items));
    }

    public void addItems(Item items) 
    {
        this.currentItems.add(items);
    }

    public boolean removeItems(ArrayList<Item> items) 
    {
        return this.currentItems.removeAll(items);
    }

    public boolean removeItems(Item[] items) 
    {
        return this.currentItems.removeAll(Arrays.asList(items));
    }

    public boolean removeItems(Item items) 
    {
        return this.currentItems.remove(items);
    }
}
