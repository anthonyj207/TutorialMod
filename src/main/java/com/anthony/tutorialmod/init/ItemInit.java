package com.anthony.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;
import com.anthony.tutorialmod.objects.items.ItemBase;
import net.minecraft.item.Item;

public class ItemInit {
	// All Minecraft Mod Items
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Initialise your new Mod Items Here
	public static final Item COPPER_INGOT = new ItemBase("ingot_copper");
}
