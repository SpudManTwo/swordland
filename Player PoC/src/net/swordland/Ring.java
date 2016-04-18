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
public class Ring extends Item
{
    
    public Ring(int ID, int weight, String name, String flavourText) 
    {
        super(ID, weight, name, flavourText);
    }
    
    public void doEffect(Player owner)
    {
        switch (name)
        {
            case "RING_TEARSTONE_RED":
            {
                if (owner.getCurrHP()<=(owner.getMaxHP()/2))
                {
                    owner.addStatus(new Effect(1, Effect.EffectArcheType.ATTACK_UP));
                }
                break;
            }
            case "RING_TEARSTONE_BLUE":
            {
                if (owner.getCurrHP()<=(owner.getMaxHP()/2))
                {
                    owner.addStatus(new Effect(1, Effect.EffectArcheType.DEFENCE_UP));
                }
                break;
            }
            default:
                throw new IllegalArgumentException(name + ": is not an implemented ring");
        }
    }
    
}
