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
public class Skill {

    private String ID;
    private String type;
    private String name;
    private String description;
    private int tier;
    private int maxCooldown;
    private int currCooldown;
    private String[] childs;
    private String parent;
    private int numHits;
    private float range;
    private Attack[] attacks;

    /**
     *
     * @param ID
     * @param type
     * @param name
     * @param description
     * @param tier
     * @param maxCooldown
     * @param childs
     * @param parent
     * @param numHits
     * @param range
     * @param attacks
     */
    public Skill(String ID, String type, String name, String description, int tier, int maxCooldown, String[] childs, String parent, int numHits, float range, Attack[] attacks) {
        this.ID = ID;
        this.type = type;
        this.name = name;
        this.description = description;
        this.tier = tier;
        this.maxCooldown = maxCooldown;
        this.currCooldown = 0;
        this.childs = childs;
        this.parent = parent;
        this.numHits = numHits;
        this.range = range;
        this.attacks = attacks;
    }

    /**
     *
     */
    public void coolDown() {
        if (currCooldown != 0) {
            currCooldown--;
        }
    }
}
