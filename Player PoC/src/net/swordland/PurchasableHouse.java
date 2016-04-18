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

import net.swordland.database.Items;

/**
 *
 * @author Kazumi
 */
public class PurchasableHouse extends Location
{
    private Town outsideTown;
    private int housePrice;
    private int keyID;

    public PurchasableHouse(Town outsideTown, int shopPrice, int keyID, String flavourText)
    {
        super(flavourText);
        this.outsideTown = outsideTown;
        this.housePrice = shopPrice;
        this.keyID = keyID;
    }

    public Town getOutsideTown()
    {
        return outsideTown;
    }

    /**
     * Get the value of housePrice
     *
     * @return the value of housePrice
     */
    public int getHousePrice()
    {
        return housePrice;
    }

    public PlayerHouse buyHouse(Player p)
    {
        if (!p.deduceCol(housePrice))
        {
            return null;
        }
        if (!p.addItem(Items.getItems().get(keyID)))
        {
            p.addCol(housePrice);
            return null;
        }
        return new PlayerHouse(flavourText, p, outsideTown);
    }
}
