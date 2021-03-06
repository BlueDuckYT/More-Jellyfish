package blueduck.morejellyfish.morejellyfishmod.misc;

import blueduck.jellyfishing.biomes.JellyfishingBiome;
import blueduck.jellyfishing.registry.JellyfishingParticles;
import blueduck.jellyfishing.registry.JellyfishingSounds;
import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishBlocks;
import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishEntities;
import net.minecraft.block.Block;
import net.minecraft.client.audio.BackgroundMusicSelector;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.*;
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
        super(CLIMATE, Biome.Category.OCEAN, -1.8F, .25F, (new net.minecraft.world.biome.BiomeAmbience.Builder()).setWaterColor(4159204).setWaterFogColor(329011).setFogColor(12638463).withSkyColor(7842047).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).setParticle(new ParticleEffectAmbience(JellyfishingParticles.CLOUD_PARTICLE.get(), 0.0000005F)).setMusic(new BackgroundMusicSelector(JellyfishingSounds.BACKGROUND_MUSIC.get(), 200, 4000, false)).build(), GENERATION_SETTINGS.build(), SPAWN_SETTINGS.copy());
    }


    static {
        GENERATION_SETTINGS.withStructure(StructureFeatures.RUINED_PORTAL_OCEAN);

        DefaultBiomeFeatures.withOverworldOres(GENERATION_SETTINGS);

        if (CONFIG.DIAMOND_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.DIAMOND_JELLYFISH.get(), 1, 1, 1));
        if (CONFIG.IRON_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.IRON_JELLYFISH.get(), 100, 1, 1));
        if (CONFIG.GOLD_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.GOLD_JELLYFISH.get(), 75, 1, 1));
        if (CONFIG.EMERALD_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.EMERALD_JELLYFISH.get(), 4, 1, 1));
        if (CONFIG.COAL_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.COAL_JELLYFISH.get(), 100, 1, 1));
        if (CONFIG.LAPIS_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.LAPIS_LAZULI_JELLYFISH.get(), 40, 1, 1));
        if (CONFIG.REDSTONE_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.REDSTONE_JELLYFISH.get(), 40, 1, 1));
        if (CONFIG.QUARTZ_SPAWN.get())
            SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.QUARTZ_JELLYFISH.get(), 20, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.GLOWSTONE_JELLYFISH.get(), 10, 1, 1));

    }

}
