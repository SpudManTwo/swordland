/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland;

import java.util.ArrayList;


public class Inn extends Location 
{
    private Town outsideTown;
    private int costPerNight;
    private String name;
    private NPC proprietorNpc;
    private ArrayList<Player> currentResidents;

    public Inn(Town outsideTown, int costPerNight, String name, NPC proprietorNpc, ArrayList<Player> currentResidents, String flavourText)
    {
        super(flavourText);
        this.outsideTown = outsideTown;
        this.costPerNight = costPerNight;
        this.name = name;
        this.proprietorNpc = proprietorNpc;
        this.currentResidents = currentResidents;
    }

    public Town getOutsideTown()
    {
        return outsideTown;
    }

    public int getCostPerNight()
    {
        return costPerNight;
    }

    public String getName()
    {
        return name;
    }

    public NPC getProprietorNpc()
    {
        return proprietorNpc;
    }

    public ArrayList<Player> getCurrentResidents()
    {
        return currentResidents;
    }

    public boolean addResident(Player newResident)
    {
        return currentResidents.add(newResident);
    }

    public boolean removeResident(Player oldResident)
    {
        return currentResidents.remove(oldResident);
    }

    public void setCostPerNight(int costPerNight)
    {
        this.costPerNight = costPerNight;
    }

    public void setProprietorNpc(NPC proprietorNpc)
    {
        this.proprietorNpc = proprietorNpc;
    }
    
    
}
