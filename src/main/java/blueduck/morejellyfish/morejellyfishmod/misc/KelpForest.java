package blueduck.morejellyfish.morejellyfishmod.misc;

import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishBlocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.placement.*;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class KelpForest extends Biome {

    public KelpForest() {
        super((new Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(MoreJellyfishBlocks.DEEP_ALGAE_GRASS.get().getDefaultState(), MoreJellyfishBlocks.DEEP_CORALSTONE.get().getDefaultState(), MoreJellyfishBlocks.DEEP_ALGAE_GRASS.get().getDefaultState())).precipitation(RainType.RAIN).category(Category.OCEAN).depth(-1.3F).scale(0.0F).temperature(0.5F).downfall(0.5F).waterColor(692136).waterFogColor(666690).parent((String)null));

        addCarver(GenerationStage.Carving.LIQUID, Biome.createCarver(WorldCarver.UNDERWATER_CAVE, new ProbabilityConfig(0.2F)));
        addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.KELP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP.configure(new FrequencyConfig(100))));


    }

    public void addCreatureSpawn(EntityClassification classification, SpawnListEntry entry) {
        this.addSpawn(classification, entry);
    }

}
