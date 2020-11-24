package blueduck.morejellyfish.morejellyfishmod.misc;

import blueduck.jellyfishing.jellyfishingmod.biomes.JellyfishingBiome;
import blueduck.jellyfishing.jellyfishingmod.registry.JellyfishingBlocks;
import blueduck.jellyfishing.jellyfishingmod.registry.JellyfishingEntities;
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
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.placement.*;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class KelpForest extends JellyfishingBiome {

    static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = Registry.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, "more_jellyfish:kelp_forest", new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig((MoreJellyfishBlocks.DEEP_ALGAE_GRASS.get()).getDefaultState(), (MoreJellyfishBlocks.DEEP_CORALSTONE.get()).getDefaultState(), (MoreJellyfishBlocks.DEEP_ALGAE_GRASS.get()).getDefaultState())));;
    static final Biome.Climate CLIMATE = new Biome.Climate(Biome.RainType.RAIN, 0.8F,Biome.TemperatureModifier.NONE, 0.4F);;
    static final MobSpawnInfo.Builder SPAWN_SETTINGS = (new MobSpawnInfo.Builder()).isValidSpawnBiomeForPlayer();
    static final net.minecraft.world.biome.BiomeGenerationSettings.Builder GENERATION_SETTINGS = (new net.minecraft.world.biome.BiomeGenerationSettings.Builder()).withSurfaceBuilder(SURFACE_BUILDER);

    public KelpForest() {
        super(CLIMATE, Biome.Category.OCEAN, -1.4F, .05F, (new net.minecraft.world.biome.BiomeAmbience.Builder()).setWaterColor(4159204).setWaterFogColor(329011).setFogColor(12638463).withSkyColor(3448555).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build(), GENERATION_SETTINGS.build(), SPAWN_SETTINGS.copy());
        //super(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(MoreJellyfishBlocks.DEEP_ALGAE_GRASS.get().getDefaultState(), MoreJellyfishBlocks.DEEP_CORALSTONE.get().getDefaultState(), MoreJellyfishBlocks.DEEP_ALGAE_GRASS.get().getDefaultState())).precipitation(Biome.RainType.RAIN).category(Biome.Category.OCEAN).depth(-1.3F).scale(0.0F).temperature(0.5F).downfall(0.5F).waterColor(692136).waterFogColor(666690).parent((String)null));

//        addCarver(GenerationStage.Carving.LIQUID, Biome.createCarver(WorldCarver.UNDERWATER_CAVE, new ProbabilityConfig(0.2F)));
//        addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.KELP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP.configure(new FrequencyConfig(100))));

    }

    static {
        DefaultBiomeFeatures.withOverworldOres(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withColdKelp(GENERATION_SETTINGS);

        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.SPONGE_JELLYFISH.get(), 2, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.GLOWSTONE_JELLYFISH.get(), 8, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.RED_FUNGAL_JELLYFISH.get(), 3, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.BROWN_FUNGAL_JELLYFISH.get(), 3, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.CRIMSON_FUNGAL_JELLYFISH.get(), 1, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.WARPED_FUNGAL_JELLYFISH.get(), 1, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.SLIME_JELLYFISH.get(), 3, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.HONEY_JELLYFISH.get(), 3, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.COW_JELLYFISH.get(), 1, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.GUARDIAN_JELLYFISH.get(), 1, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.CREEPER_JELLYFISH.get(), 3, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.CLAY_JELLYFISH.get(), 3, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners((EntityType) MoreJellyfishEntities.SKELLYFISH.get(), 3, 1, 1));


    }


}
