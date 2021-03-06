package com.brand.adapaxels.paxels;


import com.brand.adapaxels.AdaPaxels;
import com.brand.adapaxels.paxels.base.PaxelBase;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.registry.Registry;

public class Paxels {

    public static Item WOOD = register(PaxelsMaterials.WOOD, 1, -2.8f, "wooden", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    public static Item STONE = register(PaxelsMaterials.STONE, 1, -2.8f, "stone", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    public static Item IRON = register(PaxelsMaterials.IRON, 1, -2.8f, "iron", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    public static Item GOLDEN = register(PaxelsMaterials.GOLD, 1, -2.8f, "golden", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    public static Item DIAMOND = register(PaxelsMaterials.DIAMOND, 1, -2.8f, "diamond", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    public static Item NETHERITE = register(PaxelsMaterials.NETHERITE, 1, -2.8f, "netherite", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP).fireproof());
    public static Item VIBRANIUM;
    public static Item ADAMANTIUM;
    public static Item NETHER_BRICK;
    public static Item UNIVITE;
    public static Item COPPER;
    public static Item SILVER;
    public static Item TIN;
	public static Item LEAD;
	public static Item BRONZE;
	public static Item ELECTRUM;
	public static Item ROSE_GOLD;
	public static Item STERLING_SILVER;
	public static Item FOOLS_GOLD;
	public static Item METITE;
	public static Item ASTERITE;
	public static Item STELLUM;
	public static Item GALAXIUM;
    
    public static void init() {
    	
    // Adabranium	
        if(FabricLoader.getInstance().isModLoaded("adabraniummod")) {
        	VIBRANIUM = register(PaxelsMaterials.VIBRANIUM, 1, -2.8f, "vibranium", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
        	ADAMANTIUM = register(PaxelsMaterials.ADAMANTIUM, 1, -2.8f, "adamantium", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
        	NETHER_BRICK = register(PaxelsMaterials.NETHER_BRICK, 1, -2.8f, "nether", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP).fireproof());
            }
    
    // Astromine
    	if(FabricLoader.getInstance().isModLoaded("astromine")) {
    		COPPER = register(PaxelsMaterials.COPPER, 1, -2.8f, "copper", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    		TIN = register(PaxelsMaterials.TIN, 1, -2.8f, "tin", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    		SILVER = register(PaxelsMaterials.SILVER, 1, -2.8f, "silver", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    		LEAD = register(PaxelsMaterials.LEAD, 1, -2.8f, "lead", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    		BRONZE = register(PaxelsMaterials.BRONZE, 1, -2.8f, "bronze", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    		ELECTRUM = register(PaxelsMaterials.ELECTRUM, 1, -2.8f, "electrum", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    		ROSE_GOLD = register(PaxelsMaterials.ROSE_GOLD, 1, -2.8f, "rose_gold", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    		STERLING_SILVER = register(PaxelsMaterials.STERLING_SILVER, 1, -2.8f, "sterling_silver", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    		FOOLS_GOLD = register(PaxelsMaterials.FOOLS_GOLD, 1, -2.8f, "fools_gold", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    		METITE = register(PaxelsMaterials.METITE, 1, -2.8f, "metite", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    		ASTERITE = register(PaxelsMaterials.ASTERITE, 1, -2.8f, "asterite", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    		STELLUM = register(PaxelsMaterials.STELLUM, 1, -2.8f, "stellum", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    		GALAXIUM = register(PaxelsMaterials.GALAXIUM, 1, -2.8f, "galaxium", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
    		UNIVITE = register(PaxelsMaterials.UNIVITE, 1, -2.8f, "univite", (new Item.Settings()).group(AdaPaxels.ADAPAXELS_GROUP));
        	}
    	}


    private static Item register(ToolMaterial material, int attackDamage, float attackSpeed, String materialname, Item.Settings settings) {
        return Registry.register(Registry.ITEM, AdaPaxels.id(materialname + "_paxel"), new PaxelBase(material, attackDamage, attackSpeed, settings));
    }
}
