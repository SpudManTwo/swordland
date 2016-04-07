/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.swordland;

/**
 * Describes very generally an item.
 * 
 * @author Kazumi
 */
public class Item 
{
    private int ID;
    private int weight;
    private String name;
    private String flavourText;

    /**
     * Creates an item with a specified weight, name and flavour text.
     * @param ID The unique identifier.
     * @param weight Weight in units. 
     * @param name The name of the item.
     * @param flavourText A description of the item. It's an MMO after all.
     */
    public Item(int ID, int weight, String name, String flavourText) {
        this.weight = weight;
        this.name = name;
        this.flavourText = flavourText;
    }

    /**
     * Get the weight of an item
     *
     * @return the value of weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set the weight of an item
     *
     * @param weight new value of weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }


    /**
     * Get the name of an item
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of an item
     *
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the flavour text of an item
     * 
     * @return the lengthy description
     */
    public String getFlavourText() {
        return flavourText;
    }

    /**
     * Set the flavour text of an item
     * 
     * @param flavourText the lengthy description
     */
    public void setFlavourText(String flavourText) {
        this.flavourText = flavourText;
    }

    /**
     * Get the value of ID
     *
     * @return the value of ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Set the value of ID
     *
     * @param ID new value of ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

}
