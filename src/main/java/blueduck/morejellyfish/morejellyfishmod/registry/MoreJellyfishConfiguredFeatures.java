package blueduck.morejellyfish.morejellyfishmod.registry;

import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class MoreJellyfishConfiguredFeatures {

    public static final ConfiguredFeature<?, ?> CONFIGURED_DEEP_CORALSTONE_REPLACEMENT = (ConfiguredFeature)((ConfiguredFeature)((ConfiguredFeature) Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ((Block)MoreJellyfishBlocks.DEEP_CORALSTONE.get()).getDefaultState(), 100)).range(300)).square()).func_242731_b(250);


}
