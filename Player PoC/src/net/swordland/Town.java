/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland;

import java.util.ArrayList;


public class Town extends Space 
{
    private ArrayList<Shop> bazaar;
    private String name;
    private boolean hasGate;
    private ArrayList<NPC> people;
    private Inn inn;

    public Town(String flavourText, ArrayList<Shop> bazaar, String name, boolean hasGate, ArrayList<NPC> people, Inn inn)
    {
        super(flavourText);
        this.bazaar = new ArrayList<>();
        this.people = new ArrayList<>();
        
        this.bazaar = bazaar;
        this.name = name;
        this.hasGate = hasGate;
        this.people = people;
        this.inn = inn;
    }

    public ArrayList<Shop> getBazaar()
    {
        return bazaar;
    }

    public String getName()
    {
        return name;
    }

    public boolean hasGate()
    {
        return hasGate;
    }

    public ArrayList<NPC> getPeople()
    {
        return people;
    }

    public Inn getInn()
    {
        return inn;
    }

    protected boolean addShopToBazaar(Shop shop)
    {
        if (this.bazaar.contains(shop))
        {
            return false;
        }
        return this.bazaar.add(shop);
    }

    public void setInn(Inn inn)
    {
        this.inn = inn;
    }
    
}
