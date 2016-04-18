/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland;

import java.util.ArrayList;


public class PlayerHouse extends Location 
{
    private Player owner;
    private Town outsideTown;
    private ArrayList<Player> playerWhiteList;

    public PlayerHouse(String flavourText, Player owner, Town outsideTown)
    {
        super(flavourText);
        
        this.playerWhiteList = new ArrayList<>();
        
        this.owner = owner;
        this.outsideTown = outsideTown;
        
        playerWhiteList.add(owner);
    }

    public Player getOwner()
    {
        return owner;
    }

    public Town getOutsideTown()
    {
        return outsideTown;
    }

    public ArrayList<Player> getPlayerWhiteList()
    {
        return playerWhiteList;
    }

    public boolean addToPlayerWhitelist(Player p)
    {
        if (playerWhiteList.contains(p))
        {
            return false;
        } 
        return this.playerWhiteList.add(p);
    }

    public boolean removeFromPlayerWhitelist(Player p)
    {
        return this.playerWhiteList.remove(p);
    }
    
}
