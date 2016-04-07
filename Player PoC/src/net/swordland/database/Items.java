/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.swordland.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import net.swordland.Item;
import net.swordland.Player;

/**
 *
 * @author Kazumi
 */
public class Items 
{
    private static ArrayList<Item> items;
    private static TreeMap<Item, Player> ItemPlayerMap;

    /**
     * Get the value of items
     *
     * @return the value of items
     */
    public static ArrayList<Item> getItems() {
        return items;
    }

    /**
     * Set the value of items
     *
     * @param items new value of items
     */
    public static void setItems(ArrayList<Item> items) {
        Items.items = items;
    }

    /**
     * Adds the given ArrayList of items
     *
     * @param items additional items
     */
    public static void addItems(ArrayList<Item> items) {
        Items.items.addAll(items);
    }

    /**
     * Adds the given Array of items
     *
     * @param items additional items
     */
    public static void addItems(Item[] items) {
        Items.items.addAll(Arrays.asList(items));
    }

    /**
     * Adds the given item
     *
     * @param items additional item
     */
    public static void addItems(Item items) {
        Items.items.add(items);
    }

    /**
     * Get the value of ItemPlayerMap
     *
     * @return the value of ItemPlayerMap
     */
    public static TreeMap<Item, Player> getItemPlayerMap() {
        return ItemPlayerMap;
    }
    
    public static boolean addToItemPlayerMap(Item item, Player player)
    {
        if (item == null || player == null)
        {
            return false;
        }
        ItemPlayerMap.put(item, player);
        return true;
    }

}
