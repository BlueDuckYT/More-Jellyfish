package blueduck.morejellyfish.morejellyfishmod.misc;

import blueduck.jellyfishing.jellyfishingmod.biomes.JellyfishingBiome;
import blueduck.jellyfishing.jellyfishingmod.registry.JellyfishingBlocks;
import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishBlocks;
import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishEntities;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import org.lwjgl.system.CallbackI;

import static blueduck.morejellyfish.morejellyfishmod.MoreJellyfishMod.CONFIG;

public class RockBottom extends JellyfishingBiome {

    static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = (ConfiguredSurfaceBuilder) Registry.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, "more_jellyfish:rock_bottom", new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(((Block) MoreJellyfishBlocks.DEEP_CORALSTONE.get()).getDefaultState(), ((Block)MoreJellyfishBlocks.DEEP_CORALSTONE.get()).getDefaultState(), ((Block)MoreJellyfishBlocks.DEEP_CORALSTONE.get()).getDefaultState())));;
    static final Biome.Climate CLIMATE = new Biome.Climate(Biome.RainType.RAIN, 0.8F,Biome.TemperatureModifier.NONE, 0.4F);;
    static final MobSpawnInfo.Builder SPAWN_SETTINGS = (new MobSpawnInfo.Builder()).isValidSpawnBiomeForPlayer();
    static final net.minecraft.world.biome.BiomeGenerationSettings.Builder GENERATION_SETTINGS = (new net.minecraft.world.biome.BiomeGenerationSettings.Builder()).withSurfaceBuilder(SURFACE_BUILDER);


    public RockBottom() {
        super(CLIMATE, Biome.Category.OCEAN, -1.8F, .25F, (new net.minecraft.world.biome.BiomeAmbience.Builder()).setWaterColor(4159204).setWaterFogColor(329011).setFogColor(12638463).withSkyColor(3448555).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build(), GENERATION_SETTINGS.build(), SPAWN_SETTINGS.copy());
    }


    static {
        GENERATION_SETTINGS.withStructure(StructureFeatures.RUINED_PORTAL_OCEAN);

        DefaultBiomeFeatures.withOverworldOres(GENERATION_SETTINGS);

        if (CONFIG.DIAMOND_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.DIAMOND_JELLYFISH.get(), 1, 1, 1));
        if (CONFIG.IRON_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.IRON_JELLYFISH.get(), 20, 1, 1));
        if (CONFIG.GOLD_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.GOLD_JELLYFISH.get(), 15, 1, 1));
        if (CONFIG.EMERALD_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.EMERALD_JELLYFISH.get(), 2, 1, 1));
        if (CONFIG.COAL_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.COAL_JELLYFISH.get(), 20, 1, 1));
        if (CONFIG.LAPIS_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.LAPIS_LAZULI_JELLYFISH.get(), 8, 1, 1));
        if (CONFIG.REDSTONE_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.REDSTONE_JELLYFISH.get(), 8, 1, 1));
        if (CONFIG.QUARTZ_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.QUARTZ_JELLYFISH.get(), 4, 1, 1));

    }

}
