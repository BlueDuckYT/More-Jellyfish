package blueduck.morejellyfish.morejellyfishmod.misc;

import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishBlocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class KelpForest extends Biome {

    public KelpForest() {
        super((new Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(MoreJellyfishBlocks.DEEP_ALGAE_GRASS.get().getDefaultState(), MoreJellyfishBlocks.DEEP_CORALSTONE.get().getDefaultState(), MoreJellyfishBlocks.DEEP_ALGAE_GRASS.get().getDefaultState())).precipitation(RainType.RAIN).category(Category.OCEAN).depth(-1.8F).scale(0.0F).temperature(0.5F).downfall(0.5F).waterColor(692136).waterFogColor(666690).parent((String)null));

        addCarver(GenerationStage.Carving.LIQUID, Biome.createCarver(WorldCarver.UNDERWATER_CAVE, new ProbabilityConfig(0.2F)));
        DefaultBiomeFeatures.addExtraKelp(this);


    }

    public void addCreatureSpawn(EntityClassification classification, SpawnListEntry entry) {
        this.addSpawn(classification, entry);
    }

}
