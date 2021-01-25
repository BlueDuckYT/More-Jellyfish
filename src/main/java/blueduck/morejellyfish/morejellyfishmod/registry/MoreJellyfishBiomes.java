package blueduck.morejellyfish.morejellyfishmod.registry;

import blueduck.jellyfishing.JellyfishingMod;
import blueduck.morejellyfish.morejellyfishmod.MoreJellyfishMod;
import blueduck.morejellyfish.morejellyfishmod.misc.KelpForest;
import blueduck.morejellyfish.morejellyfishmod.misc.RockBottom;
import net.minecraft.block.Block;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MoreJellyfishBiomes {

    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, MoreJellyfishMod.MODID);

    public static final RegistryObject<Biome> ROCK_BOTTOM = BIOMES.register("rock_bottom", () -> new RockBottom().getBiome());
    public static final RegistryObject<Biome> KELP_FOREST = BIOMES.register("kelp_forest", () -> new KelpForest().getBiome());



    public static void init() {
        BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static void registerBiomes() {
        registerBiome(ROCK_BOTTOM.get(), "rock_bottom", BiomeManager.BiomeType.COOL, BiomeDictionary.Type.OCEAN, BiomeDictionary.Type.OVERWORLD);
        registerBiome(KELP_FOREST.get(), "kelp_forest", BiomeManager.BiomeType.COOL, BiomeDictionary.Type.OCEAN, BiomeDictionary.Type.OVERWORLD);
    }
    public static void registerBiome(Biome biome, String name, BiomeManager.BiomeType type, BiomeDictionary.Type... types) {
        BiomeDictionary.addTypes(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, new ResourceLocation("more_jellyfish:" + name)), types);
        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, new ResourceLocation("more_jellyfish:" + name)), (Integer) JellyfishingMod.CONFIG.BIOME_WEIGHT.get()));


    }
}
