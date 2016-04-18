/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland;

import java.awt.Color;
import java.util.TreeMap;


public class NPC extends Living 
{
    
    private Quest quest;
    private TreeMap<String, String> dialogues;
    
    public NPC
        (
            Color cursor, 
            int currHP, 
            int maxHP, 
            TreeMap<Effect.EffectArcheType, Effect> status, 
            Location currentLocation, 
            Item leftHand, 
            Item rightHand, 
            Armour wornArmor, 
            int level, 
            boolean visible, 
            String name,
            Quest quest,
            TreeMap<String, String> dialogues
        )
    {
        super(cursor, currHP, maxHP, status, currentLocation, leftHand, rightHand, wornArmor, level, visible, name);
        
        this.dialogues = new TreeMap<>();
        
        this.quest = quest;
        this.dialogues = dialogues;
    }

    public Quest getQuest()
    {
        return quest;
    }
    
    public String answer(String input)
    {
        return dialogues.get(input);
    }
    
}
