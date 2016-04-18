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

import java.awt.Color;
import java.util.ArrayList;
import java.util.TreeMap;
import net.swordland.Inn;
import net.swordland.NPC;
import net.swordland.Town;

/**
 *
 * @author Kazumi
 */
public class Locations 
{

    public static Town ToBNorth()
    {
        Town t = new Town("Lorem ipsum dolor sit amet, et integre menandri vis. Est in sonet recusabo. Per an utamur propriae. Phaedrum necessitatibus vel ea, et mel velit inciderint, ne qui sapientem scribentur. Mea an libris quidam everti, fugit doctus fabulas ne duo, duo dictas postulant persecuti ut.", new ArrayList<>(), "Town of Beginnings: Northern City", false, new ArrayList<>(), null);
        Inn i = new Inn(t, 100, "Gnomey Mono", null, new ArrayList<>(), "Lorem ipsum dolor sit amet, et integre menandri vis. Est in sonet recusabo. Per an utamur propriae. Phaedrum necessitatibus vel ea, et mel velit inciderint, ne qui sapientem scribentur. Mea an libris quidam everti, fugit doctus fabulas ne duo, duo dictas postulant persecuti ut.");
        i.setProprietorNpc(new NPC(Color.GREEN, 1000, 1000, new TreeMap<>(), i, null, null, null, 10, true, "Will", null, new TreeMap<>()));
        t.setInn(i);
        return t;
    }

    public static Town ToBCentral()
    {
        Town t = new Town("Lorem ipsum dolor sit amet, et integre menandri vis. Est in sonet recusabo. Per an utamur propriae. Phaedrum necessitatibus vel ea, et mel velit inciderint, ne qui sapientem scribentur. Mea an libris quidam everti, fugit doctus fabulas ne duo, duo dictas postulant persecuti ut.", new ArrayList<>(), "Town of Beginnings: Central Plaza", true, new ArrayList<>(), null);
        Inn i = new Inn(t, 100, "The Gelatin Grotto", null, new ArrayList<>(), "Lorem ipsum dolor sit amet, et integre menandri vis. Est in sonet recusabo. Per an utamur propriae. Phaedrum necessitatibus vel ea, et mel velit inciderint, ne qui sapientem scribentur. Mea an libris quidam everti, fugit doctus fabulas ne duo, duo dictas postulant persecuti ut.");
        i.setProprietorNpc(new NPC(Color.GREEN, 1000, 1000, new TreeMap<>(), i, null, null, null, 10, true, "Ivan", null, new TreeMap<>()));
        t.setInn(i);
        return t;
    }

    public static Town ToBWest()
    {
        Town t = new Town("Lorem ipsum dolor sit amet, et integre menandri vis. Est in sonet recusabo. Per an utamur propriae. Phaedrum necessitatibus vel ea, et mel velit inciderint, ne qui sapientem scribentur. Mea an libris quidam everti, fugit doctus fabulas ne duo, duo dictas postulant persecuti ut.", new ArrayList<>(), "Town of Beginnings: Western City", false, new ArrayList<>(), null);
        Inn i = new Inn(t, 100, "The Silver Sword", null, new ArrayList<>(), "Lorem ipsum dolor sit amet, et integre menandri vis. Est in sonet recusabo. Per an utamur propriae. Phaedrum necessitatibus vel ea, et mel velit inciderint, ne qui sapientem scribentur. Mea an libris quidam everti, fugit doctus fabulas ne duo, duo dictas postulant persecuti ut.");
        i.setProprietorNpc(new NPC(Color.GREEN, 1000, 1000, new TreeMap<>(), i, null, null, null, 10, true, "Ben", null, new TreeMap<>()));
        t.setInn(i);
        return t;
    }

    public static Town ToBSouth()
    {
        Town t = new Town("Lorem ipsum dolor sit amet, et integre menandri vis. Est in sonet recusabo. Per an utamur propriae. Phaedrum necessitatibus vel ea, et mel velit inciderint, ne qui sapientem scribentur. Mea an libris quidam everti, fugit doctus fabulas ne duo, duo dictas postulant persecuti ut.", new ArrayList<>(), "Town of Beginnings: Southern City", false, new ArrayList<>(), null);
        Inn i = new Inn(t, 100, "Mansion of Cats", null, new ArrayList<>(), "Lorem ipsum dolor sit amet, et integre menandri vis. Est in sonet recusabo. Per an utamur propriae. Phaedrum necessitatibus vel ea, et mel velit inciderint, ne qui sapientem scribentur. Mea an libris quidam everti, fugit doctus fabulas ne duo, duo dictas postulant persecuti ut.");
        i.setProprietorNpc(new NPC(Color.GREEN, 1000, 1000, new TreeMap<>(), i, null, null, null, 10, true, "Sorcha", null, new TreeMap<>()));
        t.setInn(i);
        return t;
    }

    public static Town ToBEast()
    {
        Town t = new Town("Lorem ipsum dolor sit amet, et integre menandri vis. Est in sonet recusabo. Per an utamur propriae. Phaedrum necessitatibus vel ea, et mel velit inciderint, ne qui sapientem scribentur. Mea an libris quidam everti, fugit doctus fabulas ne duo, duo dictas postulant persecuti ut.", new ArrayList<>(), "Town of Beginnings: Market", false, new ArrayList<>(), null);
        Inn i = new Inn(t, 100, "Merchant's Respite", null, new ArrayList<>(), "Lorem ipsum dolor sit amet, et integre menandri vis. Est in sonet recusabo. Per an utamur propriae. Phaedrum necessitatibus vel ea, et mel velit inciderint, ne qui sapientem scribentur. Mea an libris quidam everti, fugit doctus fabulas ne duo, duo dictas postulant persecuti ut.");
        i.setProprietorNpc(new NPC(Color.GREEN, 1000, 1000, new TreeMap<>(), i, null, null, null, 10, true, "Jacob", null, new TreeMap<>()));
        t.setInn(i);
        return t;
    }

}
