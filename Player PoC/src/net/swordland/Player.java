/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland;

import java.awt.Color;
import java.util.ArrayList;
import java.util.TreeMap;
import net.swordland.database.Items;
import net.swordland.database.Locations;
import net.swordland.database.Skills;

/**
 * Describes a player entity.
 * @author Kazumi
 */
public class Player extends Living
{
    private long playerID;
    private int XP;
    private int STR;
    private int DEX;
    private int CON;
    private int INT;
    private int WIS;
    private int col;
    private ArrayList<Skill> skills;
    private ArrayList<Item> currentItems;
    private Ring[] currentRings;
    private PlayerHouse house;
    private PlayerShop shop;
    
    private int weight;
    
    /**
     * Creates a new player with all necessary parameters.
     * @param cursor
     * @param level the level of the player
     * @param XP the player's amount of XP
     * @param STR the player's strength
     * @param DEX the player's dexterity
     * @param CON the player's constitution
     * @param INT the player's intelligence
     * @param WIS the player's wisdom
     * @param status
     * @param name the name of the player
     * @param visible
     * @param playerID
     * @param col the amount of col in the player's pockets
     * @param skills the player's personal list of unlocked skills
     * @param currentItems
     * @param currentRings
     * @param leftHand
     * @param currentLocation
     * @param rightHand
     * @param wornArmor
     * @param playerHouse
     * @param playerShop
     */
    public Player
        (
            Color cursor, 
            int level, 
            int XP, 
            int STR, 
            int DEX, 
            int CON, 
            int INT, 
            int WIS,  
            TreeMap<Effect.EffectArcheType, Effect> status,
            boolean visible,
            String name, 
            long playerID,
            int col, 
            ArrayList<Skill> skills,
            ArrayList<Item> currentItems,
            Ring[] currentRings,
            Location currentLocation, 
            Item leftHand, 
            Item rightHand,
            Armour wornArmor,
            PlayerHouse playerHouse,
            PlayerShop playerShop
        )
    {
        super(cursor, status, currentLocation, leftHand, rightHand, wornArmor, level, visible, name);
        
        this.skills = new ArrayList<>();
        this.currentItems = new ArrayList<>();
        this.currentRings = new Ring[10];
        
        this.playerID = playerID;
        this.XP = XP;
        this.STR = STR;
        this.DEX = DEX;
        this.CON = CON;
        this.INT = INT;
        this.WIS = WIS;
        this.col = col;
        this.skills = skills;
        this.currentItems = currentItems;
        this.currentRings = currentRings;
        this.house = playerHouse;
        this.shop = playerShop;
        
        this.currHP = this.maxHP = 10*this.CON*this.level;
    }
    
    /**
     * Creates a new player whom is ready to go on their quest to glory. One catch though, they are Level 1, have 100 Col and starting equipment.
     *
     * @param name
     * @param playerID
     */
    public Player(String name, long playerID)
    {
        super(Color.GREEN, new TreeMap<>(), Locations.ToBCentral(), null, null, null, 1, true, name);
        
        this.skills = new ArrayList<>();
        this.currentItems = new ArrayList<>();
        this.currentRings = new Ring[10];
        
        this.playerID = playerID;
        this.XP = 0;
        this.STR = 1;
        this.DEX = 1;
        this.CON = 1;
        this.INT = 1;
        this.WIS = 1;
        this.col = 100;
        this.skills = Skills.getStartingSkills();
        this.house = null;
        this.shop = null;
        
        this.currHP = this.maxHP = 10*this.CON*this.level;
    }
    
    /**
     * Get the value of col
     *
     * @return the value of col
     */
    public int getCol() {
        return col;
    }

    /**
     * Set the value of col
     *
     * @param col new value of col
     */
    public void setCol(int col) {
        this.col = col;
    }
    
    public void addCol(int col) {
        this.col += col;
    }
    
    public boolean deduceCol(int col) {
        if (this.col<col)
        {
            return false;
        }
        this.col -= col;
        return true;
    }

    public int getSTR() 
    {
        return STR;
    }
    
    public int getDEX() 
    {
        return DEX;
    }
    
    public int getCON() 
    {
        return CON;
    }
    
    public int getINT() 
    {
        return INT;
    }
    
    public int getWIS() 
    {
        return WIS;
    }
    
    public void setSTR(int newSTR)
    {
        STR = newSTR;
    }
    
    public void setDEX(int newDEX)
    {
        DEX = newDEX;
    }
    
    public void setCON(int newCON)
    {
        CON = newCON;
    }
    
    public void setINT(int newINT)
    {
        INT = newINT;
    }
    
    public void setWIS(int newWIS)
    {
        WIS = newWIS;
    }
    
    public void addSTR(int amount)
    {
        STR += amount;
    }
    
    public void addDEX(int amount)
    {
        DEX += amount;
    }
    
    public void addCON(int amount)
    {
        CON += amount;
    }
    
    public void addINT(int amount)
    {
        INT += amount;
    }
    
    public void addWIS(int amount)
    {
        WIS += amount;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void addSkills(ArrayList<Skill> skills) {
        this.skills.addAll(skills);
    }

    public void addSkills(Skill skill) {
        this.skills.add(skill);
    }

    public int getWeight() {
        return weight;
    }

    public ArrayList<Item> getCurrentItems()
    {
        return currentItems;
    }

    public Ring[] getCurrentRings()
    {
        return currentRings;
    }
    public boolean addItem(Item newItem)
    {
        if (newItem == null || !Items.addToItemPlayerMap(newItem, this))
        {
            return false;
        }
        return currentItems.add(newItem);        
    }

    public long getID()
    {
        return playerID;
    }
    
    @Override
    public void Die()
    {
        // THE END.
    }
}
