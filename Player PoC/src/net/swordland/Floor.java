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
public class Floor 
{
    private Space[][] map;

    public Floor(Space[][] map)
    {
        this.map = map;
    }
    
    public void doSpecialSpace(Player p)
    {
        //TODO: DAMN, YOU JUST TRIGGERED MY TRAPCARD, BITCH!
    }

    public Space[][] getMap()
    {
        return map;
    }
    
}
