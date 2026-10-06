package com.vycraft.aletheia;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

/**
 * Entry point for Aletheia Core, the pack's core mod. It handles what KubeJS
 * and datapacks cannot (see docs/07-core-mod.md in the pack repository).
 */
@Mod(Aletheia.MODID)
public final class Aletheia {
    public static final String MODID = "aletheia";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Aletheia(IEventBus modEventBus, ModContainer modContainer) {
    }
}
