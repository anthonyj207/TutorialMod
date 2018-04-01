package com.anthony.tutorialmod;

import com.anthony.tutorialmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Main.MODID, version = Main.VERSION, name = Main.NAME)
public class Main {
	public static final String NAME = "Tutorial Mod";
	public static final String MODID = "tutorialmod";
	public static final String VERSION = "1.0";
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide="com.anthony.tutorialmod.proxy.ClientProxy", serverSide="com.anthony.tutorialmod.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {}
	@EventHandler
	public static void init(FMLInitializationEvent event) {}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
	
}
