package blueduck.morejellyfish.morejellyfishmod.misc;

import blueduck.jellyfishing.jellyfishingmod.registry.JellyfishingBlocks;
import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishBlocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class RockBottom extends Biome {

    public RockBottom() {
        super((new Biome.Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(MoreJellyfishBlocks.DEEP_CORALSTONE.get().getDefaultState(), MoreJellyfishBlocks.DEEP_CORALSTONE.get().getDefaultState(), MoreJellyfishBlocks.DEEP_CORALSTONE.get().getDefaultState())).precipitation(Biome.RainType.RAIN).category(Biome.Category.OCEAN).depth(-1.8F).scale(0.4F).temperature(0.5F).downfall(0.5F).waterColor(4566523).waterFogColor(604792).parent((String)null));

        DefaultBiomeFeatures.addOceanCarvers(this);


    }

    public void addCreatureSpawn(EntityClassification classification, Biome.SpawnListEntry entry) {
        this.addSpawn(classification, entry);
    }

}
