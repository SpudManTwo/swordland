/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.swordland.enums;

/**
 * The two hands.
 *
 * @author Kazumi
 */
public enum Hands 
{

    /**
     * The left hand.
     */
    LEFT (0),

    /**
     * The right hand.
     */
    RIGHT (1);
    
    private final int hand;
    
    Hands(int hand)
    {
        this.hand = hand;
    }
    
    /**
     * Get the integer value of the hand for use in Arrays.
     *
     * @return the value of the hand
     */
    public int hands()
    {
        return hand;
    }
}
