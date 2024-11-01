package com.kyfstore.fabricmc;

import com.kyfstore.fabricmc.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllInOneStoneTools implements ModInitializer {
	public static final String MOD_ID = "all-in-one-stone-tools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}