package org.tp211.integrated_industry;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.tp211.integrated_industry.item.ItemRegister;

public class IntegratedIndustry implements ModInitializer {
	public static final String MOD_ID = "integrated_industry";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		new ItemRegister();

	}
}