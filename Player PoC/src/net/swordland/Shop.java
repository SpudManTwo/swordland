/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland;

import java.util.TreeMap;


public class Shop extends Location 
{
    protected ShopType shopType;
    protected Town outsideTown;
    protected String name;
    protected NPC vendorNpc;
    protected TreeMap<Item,Integer> stock;
    protected TreeMap<Item,Integer> priceMap;

    public Shop
        (
            String flavourText, 
            ShopType shopType, 
            Town outsideTown, 
            String name, 
            NPC vendorNpc, 
            TreeMap<Item, Integer> stock, 
            TreeMap<Item, Integer> priceMap
        )
    {
        super(flavourText);
        this.shopType = shopType;
        this.outsideTown = outsideTown;
        this.name = name;
        this.vendorNpc = vendorNpc;
        this.stock = stock;
        this.priceMap = priceMap;
    }

    public ShopType getShopType()
    {
        return shopType;
    }

    public Town getOutsideTown()
    {
        return outsideTown;
    }

    public String getName()
    {
        return name;
    }

    public NPC getVendorNpc()
    {
        return vendorNpc;
    }

    public TreeMap<Item, Integer> getStock()
    {
        return stock;
    }

    public TreeMap<Item, Integer> getPriceMap()
    {
        return priceMap;
    }

    public void setVendorNpc(NPC vendorNpc)
    {
        this.vendorNpc = vendorNpc;
    }

    public void setStock(TreeMap<Item, Integer> stock)
    {
        this.stock = stock;
    }

    public void addStock(Item item, int amount, int price)
    {
        if (this.stock.containsKey(item))
        {
            this.changeStockOfItemByAmount(item, amount);
            return;
        }
        this.stock.put(item, amount);
        this.addToPriceMap(item, price);
    }

    public boolean removeStockCompletely(Item item)
    {
        if (!this.stock.containsKey(item))
        {
            return false;
        }
        this.stock.remove(item);
        this.removeFromPriceMap(item);
        return true;
    }

    public boolean changeStockOfItemByAmount(Item item, int amount)
    {
        if (this.stock.containsKey(item))
        {
            return false;
        }
        this.stock.replace(item, this.stock.get(item)+amount);
        return true;
    }

    public boolean changeStockOfItemToAmount(Item item, int amount)
    {
        if (this.stock.containsKey(item))
        {
            return false;
        }
        this.stock.replace(item, amount);
        return true;
    }

    public void setPriceMap(TreeMap<Item, Integer> priceMap)
    {
        this.priceMap = priceMap;
    }

    private void addToPriceMap(Item item, int price)
    {
        if (this.priceMap.containsKey(item))
        {
            this.changePriceOfItem(item, price);
            return;
        }
        this.priceMap.put(item, price);
    }

    public boolean changePriceOfItem(Item item, int price)
    {
        if (this.priceMap.containsKey(item))
        {
            return false;
        }
        this.priceMap.replace(item, price);
        return true;
    }

    private boolean removeFromPriceMap(Item item)
    {
        if (!this.priceMap.containsKey(item))
        {
            return false;
        }
        this.priceMap.remove(item);
        return true;
    }
        
    public static enum ShopType
    {
        BLACKSMITH,
        RETAILER,
        SEAMSTER,
        ALCHEMIST
    }
}
