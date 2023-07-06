package com.charlesgamedev.moremusic;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreMusicMod implements ModInitializer {
	public static final String MOD_ID = "moremusic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("MoreMusic init");
	}
}