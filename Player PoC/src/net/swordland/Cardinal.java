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

import java.util.ArrayList;
import java.util.TreeMap;
import net.swordland.database.Locations;
import net.swordland.database.Players;

/**
 *
 * @author Kazumi
 */
public class Cardinal 
{
    private static World world;
    
    private static ArrayList<Player> inGamePlayers;
    private static TreeMap<Player,Integer> endedPlayers;
    
    public static void main(String[] args)
    {
        Cardinal.world = Cardinal.initWorld();
        Player p = new Player("Fretzio",Players.getPlayers().size());
        Cardinal.inGamePlayers.add(p);
        Players.addPlayer(p);
    }
    
    /*
        FIXME: WE OBVIOUSLY SHOULD NOT CREATE THE WORLD VIA HARD-CODING!
        ME NO LIKE THAT CODE!
    */
    private static World initWorld()
    {
        return new World
        (
            new Floor[]
            {
                new Floor
                (
                    new Space[][]
                    {
                        new Space[]
                        {
                            new Wall(""),
                            new Wall(""),
                            new Wall(""),
                            new Wall(""),
                            new Wall("")
                        },
                        new Space[]
                        {
                            new Wall(""),
                            new Wall(""),
                            Locations.ToBSouth(),
                            new Wall(""),
                            new Wall("")
                        },
                        new Space[]
                        {
                            new Wall(""),
                            Locations.ToBWest(),
                            Locations.ToBCentral(),
                            Locations.ToBEast(),
                            new Wall("")
                        },
                        new Space[]
                        {
                            new Wall(""),
                            new Wall(""),
                            Locations.ToBNorth(),
                            new Wall(""),
                            new Wall("")
                        },
                        new Space[]
                        {
                            new Wall(""),
                            new Wall(""),
                            new Wall(""),
                            new Wall(""),
                            new Wall("")
                        }
                    }
                )
            }
        );
    }
    
    public static World getWorldInstance()
    {
        return world;
    }
    
    public static void endGame(Player p, int endGameStatus)
    {
        Cardinal.endedPlayers.put(p, endGameStatus);
    }
}
