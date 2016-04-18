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

package net.swordland.database;

import java.util.TreeMap;
import net.swordland.Player;

/**
 *
 * @author Kazumi
 */
public class Players 
{
    private static TreeMap<Long,Player> players;
    
    public Players()
    {
        Players.players = new TreeMap<>();
    }
    
    public static TreeMap<Long,Player> getPlayers()
    {
        return players;
    }
    
    public static Player getPlayers(Long playerID)
    {
        return players.get(playerID);
    }
    
    public static boolean addPlayer(Player p)
    {
        if (players.containsKey(p.getID()) || players.containsValue(p))
        {
            return false;
        }
        players.put(p.getID(), p);
        return true;
    }
    
    public static boolean removePlayer(Player p)
    {
        if (!players.containsKey(p.getID()) || !players.containsValue(p))
        {
            return false;
        }
        players.remove(p.getID());
        return true;
    }
}
