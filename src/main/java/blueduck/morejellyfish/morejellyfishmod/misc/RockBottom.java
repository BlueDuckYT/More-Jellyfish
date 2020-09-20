package blueduck.morejellyfish.morejellyfishmod.misc;

import blueduck.jellyfishing.jellyfishingmod.registry.JellyfishingBlocks;
import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishBlocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class RockBottom extends Biome {

    public RockBottom() {
        super((new Biome.Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(MoreJellyfishBlocks.DEEP_CORALSTONE.get().getDefaultState(), MoreJellyfishBlocks.DEEP_CORALSTONE.get().getDefaultState(), MoreJellyfishBlocks.DEEP_CORALSTONE.get().getDefaultState())).precipitation(Biome.RainType.RAIN).category(Biome.Category.OCEAN).depth(-1.8F).scale(0.4F).temperature(0.5F).downfall(0.5F).waterColor(5478856).waterFogColor(727711).parent((String)null));

        addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.25F)));
        addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CANYON, new ProbabilityConfig(0.08F)));
        addCarver(GenerationStage.Carving.LIQUID, Biome.createCarver(WorldCarver.UNDERWATER_CANYON, new ProbabilityConfig(0.04F)));
        addCarver(GenerationStage.Carving.LIQUID, Biome.createCarver(WorldCarver.UNDERWATER_CAVE, new ProbabilityConfig(0.1F)));

        DefaultBiomeFeatures.addStructures(this);


    }

    public void addCreatureSpawn(EntityClassification classification, Biome.SpawnListEntry entry) {
        this.addSpawn(classification, entry);
    }

}
