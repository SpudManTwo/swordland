/*
 * Copyright (c) 2016, Adrian
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package net.swordland;

import java.awt.Color;


public class Potion extends Consumable 
{

    public Potion(Color colour, int ID, int weight, String name, String flavourText)
    {
        super(colour, ID, weight, name, flavourText);
    }
    
    @Override
    public void use(Object targetObject)
    {
        Player p; 
        Effect[] effects;
        
        if (this.colour.equals(Color.GREEN))
        {
            effects = new Effect[]
            {
                new Effect(1, Effect.EffectArcheType.STATUS_CURE)
            };
        }
        else if (this.colour.equals(Color.RED))
        {
            effects = new Effect[]
            {
                new Effect(3, Effect.EffectArcheType.HEAL_OVER_TIME)
            };
        }
        else if (this.colour.equals(Color.YELLOW))
        {
            effects = new Effect[]
            {
                new Effect(1, Effect.EffectArcheType.STATUS_CURE),
                new Effect(3, Effect.EffectArcheType.HEAL_OVER_TIME)
            };
        }
        else
        {
            throw new IllegalArgumentException("WHY IS THE COLOUR NOT GREEN, RED OR YELLOW!?");
        }
        p = (Player)targetObject;
        for (Effect e : effects)
        {
            p.addStatus(e);
        }
    }

}
