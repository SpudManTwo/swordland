/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;


public class Spawn extends Space 
{
    private Mob daySpawn;
    private Mob nightSpawn;
    private long spawnTimer;
    private Instant lastSpawned;
    private double spawnPenalty;
    private int numberSpawned;

    public Spawn(String flavourText, Mob daySpawn, Mob nightSpawn, long spawnTimer, Instant lastSpawned, int numberSpawned)
    {
        super(flavourText);
        this.daySpawn = daySpawn;
        this.nightSpawn = nightSpawn;
        this.spawnTimer = spawnTimer;
        this.lastSpawned = lastSpawned;
        this.numberSpawned = numberSpawned;
        
        this.spawnPenalty = 1;
    }

    public Spawn(String flavourText, Mob daySpawn, Mob nightSpawn, long spawnTimer, Instant lastSpawned, double spawnPenalty, int numberSpawned)
    {
        super(flavourText);
        this.daySpawn = daySpawn;
        this.nightSpawn = nightSpawn;
        this.spawnTimer = spawnTimer;
        this.lastSpawned = lastSpawned;
        this.spawnPenalty = spawnPenalty;
        this.numberSpawned = numberSpawned;
    }
    
    public boolean testPenalty()
    {
        return lastSpawned.until(Instant.now(), ChronoUnit.SECONDS) < spawnTimer * (spawnPenalty + 0.2);
    }
    
    public boolean isSpawnUp()
    {
        return lastSpawned.until(Instant.now(), ChronoUnit.SECONDS) > spawnTimer * spawnPenalty;
    }
    
    public Mob Spawn()
    {
        if (testPenalty())
        {
            this.spawnPenalty += 0.2d;
        } 
        else
        {
            this.spawnPenalty -= 0.2d;
        }
        long currTime = (AincradCalendar.now().get(Calendar.HOUR_OF_DAY) * 3600000) + (AincradCalendar.now().get(Calendar.MINUTE) * 60000) + (AincradCalendar.now().get(Calendar.SECOND) * 1000) + AincradCalendar.now().get(Calendar.MILLISECOND);

        if ( currTime < (6 * 3600000) || currTime >= (18 * 3600000))
        {
            return nightSpawn;
        }
        return daySpawn;
    }
}
